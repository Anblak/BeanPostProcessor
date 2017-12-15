package azerot;



import javax.annotation.PostConstruct;
import java.util.Random;

@Profiling
public class GreetingServiceImpl implements GreetingService {

    @InjectRandomInt(min = 2, max =7)
    private int randomNumber;

    private String greeting;

    public GreetingServiceImpl setGreeting(String greeting) {
        this.greeting = greeting;
        return this;
    }

    public void sayGreeting() {
        for (int i = 0; i < randomNumber; i++) {
            System.out.println(greeting);
        }
    }

    public void random() {
        System.out.println("dupa");
    }
//



    @PostConstruct
    public void babah(){
        System.out.println("phase 2");
        System.out.println(randomNumber);

    }

    @PostConstruct
    public void lol(){
        System.out.println("LOL");
        System.out.println(randomNumber);

    }



    public GreetingServiceImpl() {
        System.out.println("phase 1");
        System.out.println(randomNumber);
    }
}