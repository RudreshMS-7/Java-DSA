package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		
		ApplicationContext cntxt = new ClassPathXmlApplicationContext("beans.xml");

	}

}
