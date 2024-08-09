package xml_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContainer
{
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("xml_config.xml");
        HelloWorld obj= (HelloWorld) context.getBean("helloWorld");
        obj.getMsg();
    }
}
