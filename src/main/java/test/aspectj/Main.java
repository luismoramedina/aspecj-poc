package test.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

public class Main {


    public static void main(String[] args) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(AspectConfiguration.class);

        RestOperations restTemplate = (RestOperations) context.getBean("rest1");
        restTemplate.getForEntity(URI.create("aaaa"), Object.class);

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