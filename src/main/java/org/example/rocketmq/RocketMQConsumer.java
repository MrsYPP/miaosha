package org.example.rocketmq;

import com.alibaba.rocketmq.client.consumer.DefaultMQPushConsumer;
import com.alibaba.rocketmq.client.exception.MQClientException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author Mrs Yang
 * @date 2021/3/31 21:19
 */
@Component
@Slf4j
public class RocketMQConsumer {

    @Autowired
    private MessageProcessor messageProcessor;


    @Value("${rocketmq.consumer.namesrvAddr}")
    private String namesrvAddr;
    @Value("${rocketmq.consumer.groupName}")
    private String groupName;
    @Value("${rocketmq.consumer.topic}")
    private String topic;
    @Value("${rocketmq.consumer.tag}")
    private String tag;
    @Value("${rocketmq.consumer.consumeThreadMin}")
    private int consumeThreadMin;
    @Value("${rocketmq.consumer.consumeThreadMax}")
    private int consumeThreadMax;


    @Bean
    public DefaultMQPushConsumer getRocketMQPullConsumer() {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer(groupName);
        consumer.setNamesrvAddr(namesrvAddr);
        consumer.setConsumeThreadMin(consumeThreadMin);
        consumer.setConsumeThreadMax(consumeThreadMax);
        consumer.setVipChannelEnabled(false);
        MessageListen messageListen = new MessageListen();
        messageListen.setMessageProcessor(messageProcessor);
        consumer.registerMessageListener(messageListen);

        try {
            consumer.subscribe(topic, tag);
            consumer.start();
            log.info("consume is start ,groupName:{},topic:{}", groupName, topic);

        } catch (MQClientException e) {
            log.error("consume start error");
        }

        return consumer;
    }


}
