package azerot;

import org.springframework.context.annotation.*;

@Configuration
public class LessonsConfiguration {

    @Bean
    GreetingService greetingService() {
        return new GreetingServiceImpl().setGreeting("Hey, lv-286.Java!!!");
    }

    @Bean
    InjectRandomIntAnnotationBeanPostProcessor processor(){
        return new InjectRandomIntAnnotationBeanPostProcessor();
    }
//
    @Bean
    ProfilingBeanPostProcessor profilingBeanPostProcessor(){
        return new ProfilingBeanPostProcessor();
    }



//    @Bean
//    CommonAnnotationBeanPostProcessor annotationBeanPostProcessor(){
//        return new CommonAnnotationBeanPostProcessor();
//    }
}