
import azerot.GreetingService;
import azerot.LessonsConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Starter {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(LessonsConfiguration.class);

        GreetingService greetingService = context.getBean(GreetingService.class);

        greetingService.sayGreeting();
        greetingService.random();
    }
}