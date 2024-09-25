package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;


@Service("setterGreetingsService")
public class GreetingServiceSetterInjected implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from Setter Injected Service!";
    }
}
