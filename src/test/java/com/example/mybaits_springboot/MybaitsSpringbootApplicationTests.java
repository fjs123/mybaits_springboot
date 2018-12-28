package com.example.mybaits_springboot;

import com.example.MybaitsSpringbootApplication;
import com.example.entity.UserEntity;
import com.example.enums.UserSexEnum;
import com.example.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MybaitsSpringbootApplication.class)
public class MybaitsSpringbootApplicationTests {

		@Autowired
	    private UserMapper UserMapper;    
	    @Test
	    public void testInsert() throws Exception {
	        UserMapper.insert(new UserEntity("aa", "a123456", "man"));
	        UserMapper.insert(new UserEntity("bb", "b123456", "woman"));
	        UserMapper.insert(new UserEntity("cc", "b123456", "man"));

	     //   Assert.assertEquals(3, UserMapper.getAll().size());
	    }   
	   
	    @Test
	    public void testQuery() throws Exception {
	        List<UserEntity> users = UserMapper.getAll();
	        System.out.println(users.toString());
	    }    
	    
	    @Test
	    public void testUpdate() throws Exception {
	        UserEntity user = UserMapper.getOne(31l);
	        System.out.println(user.toString());
	        user.setNickName("neo");
	        UserMapper.update(user);
	       // Assert.assertTrue(("neo".equals(UserMapper.getOne(3l).getNickName())));
	    }

}
