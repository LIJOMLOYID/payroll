package com.thinkpalm.lijo.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.thinkpalm.lijo.messenger.model.Message;

@Service
public class MessageService {
	public List<Message> getAllMessages(){
		Message m1 = new  Message(1,"Hello World", "Lijo");
		Message m2 = new Message(2,"Hello Messsenger", "Joe");
		Message m3 = new Message(3,"Hello Moto", "Mike");

		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
	}

}
