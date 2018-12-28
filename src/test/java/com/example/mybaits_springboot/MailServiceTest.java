package com.example.mybaits_springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.MybaitsSpringbootApplication;
import com.example.email.MailService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MybaitsSpringbootApplication.class)
public class MailServiceTest {
	
	@Autowired
    private MailService mailService;

	@Test
    public void testSimpleMail() throws Exception {
        mailService.sendSimpleMail("894452301@qq.com","test simple mail"," hello this is simple mail");
    }
}
