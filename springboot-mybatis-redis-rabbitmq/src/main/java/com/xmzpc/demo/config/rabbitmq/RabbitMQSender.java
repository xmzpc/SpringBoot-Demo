package com.xmzpc.demo.config.rabbitmq;

import com.xmzpc.demo.common.constant.RabbitMQConstants;
import com.xmzpc.demo.common.util.BeanUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RabbitMQSender {


	@Autowired
	AmqpTemplate amqpTemplate ;

	
	public void sendDirect(Object message) {
		String msg = BeanUtils.beanToString(message);
		log.info("send direct message:"+msg);
		amqpTemplate.convertAndSend(RabbitMQConstants.Direct_QUEUE, msg);
	}


	public void sendTopic(Object message) {
		String msg = BeanUtils.beanToString(message);
		log.info("send topic message:"+msg);
		amqpTemplate.convertAndSend(RabbitMQConstants.TOPIC_EXCHANGE, RabbitMQConstants.TOPIC_ROUTING_KEY1, msg+"1");
		// 用于演示通配符 topic.#
		amqpTemplate.convertAndSend(RabbitMQConstants.TOPIC_EXCHANGE, "topic.key2", msg+"2");
	}



	
	
}
