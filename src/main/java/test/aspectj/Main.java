package test.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        TestService testService = (TestService) context.getBean("testService");
        testService.main("valor_parametro");

        AnotherService anotherService = (AnotherService) context.getBean("anotherService");
        anotherService.main();

//        Sin el contexto Spring no funcionan las anotaciones
//        TestService service = new TestService();
//        service.main("valor_parametro");

//        AnotherService aService = (AnotherService) context.getBean("anotherService");
//        aService.main();
    }

}