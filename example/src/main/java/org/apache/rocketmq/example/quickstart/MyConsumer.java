/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.rocketmq.example.quickstart;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.exception.MQClientException;

/**
 * This example shows how to subscribe and consume messages using providing {@link DefaultMQPushConsumer}.
 */
public class MyConsumer {

    public static void main(String[] args) throws InterruptedException, MQClientException {

        long start = 1598084573364l;

        System.err.println(  (((System.currentTimeMillis() - start)/1000))  );



//        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("demo_consumer_group");
//        consumer.setNamesrvAddr("127.0.0.1:9876");
////        consumer.setInstanceName("test");
//        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_LAST_OFFSET);
//        consumer.subscribe("t_t_lecture", "*");
//        consumer.registerMessageListener((MessageListenerConcurrently) (msgs, context) -> {
//            System.out.printf("%s Receive New Messages: %s %n", Thread.currentThread().getName(), msgs);
//            return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
//        });
//        consumer.start();
//        System.out.printf("Consumer Started.%n");
    }
}
