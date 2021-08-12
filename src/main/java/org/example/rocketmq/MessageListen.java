package org.example.rocketmq;

import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import com.alibaba.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import com.alibaba.rocketmq.common.message.MessageExt;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Mrs Yang
 * @date 2021/3/31 21:14
 */
public class MessageListen implements MessageListenerConcurrently {

    @Autowired
    private MessageProcessor messageProcessor;

    public void setMessageProcessor(MessageProcessor messageProcessor) {
        this.messageProcessor = messageProcessor;
    }

    @Override
    public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list, ConsumeConcurrentlyContext consumeConcurrentlyContext) {

        MessageExt ext = list.get(0);
        boolean result = messageProcessor.handle(ext);
        if (!result) {
            return ConsumeConcurrentlyStatus.RECONSUME_LATER;
        }
        return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
    }
}
