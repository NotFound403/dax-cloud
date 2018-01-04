package cn.felord.security;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SecurityApplicationTests {

	@Test
	public void contextLoads() {

		PasswordEncoder passwordEncoder=new StandardPasswordEncoder("JLOSJNIA12AD3K");
		   String  encode=passwordEncoder.encode("afddfff");
		     System.out.println(encode);

		    System.out.println(  passwordEncoder.matches("afddfff",encode) );
	}

}
