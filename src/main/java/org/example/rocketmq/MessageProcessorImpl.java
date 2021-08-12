package org.example.rocketmq;

import com.alibaba.rocketmq.common.message.MessageExt;
import org.springframework.stereotype.Service;

/**
 * @author Mrs Yang
 * @date 2021/3/31 21:02
 */
@Service
public class MessageProcessorImpl implements MessageProcessor{
    @Override
    public boolean handle(MessageExt messageExt) {
        //这里收到的body（也就是消息体）是字节类型，转为String
        String result = new String(messageExt.getBody());
        System.out.println("收到了消息："+ result);
        return true;
    }
}
