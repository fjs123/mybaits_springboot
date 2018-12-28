package com.example.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.email.MailService;

@Component
public class SchedulerTask {

	private int count = 0;
	@Autowired
    private MailService mailService;

	@Scheduled(cron = "*/6 * * * * ?")
	private void process() {
		mailService.sendSimpleMail("894452301@qq.com","我爱Java","端午,约么");
		System.out.println("this is scheduler task runing  " + (count++));
	}

}
