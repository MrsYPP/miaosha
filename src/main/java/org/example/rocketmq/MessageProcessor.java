package org.example.rocketmq;

import com.alibaba.rocketmq.common.message.MessageExt;

/**
 * @author Mrs Yang
 * @date 2021/3/31 21:01
 */

public interface MessageProcessor {

   boolean handle(MessageExt messageExt);

}
