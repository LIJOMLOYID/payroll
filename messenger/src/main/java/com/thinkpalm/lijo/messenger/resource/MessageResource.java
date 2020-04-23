package com.thinkpalm.lijo.messenger.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.thinkpalm.lijo.messenger.model.Message;
import com.thinkpalm.lijo.messenger.service.MessageService;

@Controller("/messages")
public class MessageResource {
	
	@Autowired
	MessageService messageService;
	
	@GetMapping
	public List<Message> getMessages(){
		return messageService.getAllMessages();
	}

}
