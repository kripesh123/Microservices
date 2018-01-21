package demo;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Producer implements CommandLineRunner{
	
	private final RabbitMessagingTemplate template;
	
	public Producer(RabbitMessagingTemplate template) {
		this.template= template;
	}

	@Override
	public void run(String... arg0) throws Exception {
		Notification noti = new Notification(UUID.randomUUID().toString(), 
				"Hello Kripesh, This is your first notification", new Date());
		
		Map<String,Object> header = new HashMap<>();
		header.put("notification-id", noti.getId());
		
		this.template.convertAndSend(MessagingApplication.NOTIFICATIONS,
				noti,header, message ->{
					System.out.println("sending" + message.getPayload().toString());
					return message;
				});
		
	}

}
