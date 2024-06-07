package com.example.demo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {
	
    @GetMapping("/chat")
    public String chat() {
        return "chat";
    }

	@MessageMapping("/sendMessage")
	@SendTo("/topic/messages")
	public String sendMessage(String message) throws Exception {
		return message;
	}
	
}
