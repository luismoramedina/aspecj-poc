package test.aspectj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.client.RestTemplate;

/**
 * @author luismoramedina
 */
@Configuration
@EnableAspectJAutoProxy
public class AspectConfiguration {

    @Bean
    public TestAspectJ aspectJ() {
        return new TestAspectJ();
    }

    @Bean
    public AnotherService anotherService() {
        return new AnotherService();
    }

    @Bean
    public RestTemplate rest1() {
        return new RestTemplate();
    }

    @Bean
    public TestService testService() {
        return new TestService();
    }


}
