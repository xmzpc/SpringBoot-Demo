package com.xmzpc.demo.config.rabbitmq;

import com.xmzpc.demo.common.constant.RabbitMQConstants;
import com.xmzpc.demo.service.RedisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class RabbitMQReceiver {

		@Autowired
		RedisService redisService;


		@RabbitListener(queues= RabbitMQConstants.Direct_QUEUE)
		public void receive(String message) {
			log.info("receive message:"+message);
		}

		@RabbitListener(queues=RabbitMQConstants.TOPIC_QUEUE1)
		public void receiveTopic1(String message) {
			log.info(" topic  queue1 receive message:"+message);
		}

		@RabbitListener(queues=RabbitMQConstants.TOPIC_QUEUE2)
		public void receiveTopic2(String message) {
			log.info(" topic  queue2 receive message:"+message);
		}

}
