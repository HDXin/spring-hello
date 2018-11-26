package top.atstudy.spring.hello;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeansTest {

    @Test
    public void BeansOne(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Person student = context.getBean(Person.class);

        System.out.println(" ===>> student: " + student.toString());


    }

}
