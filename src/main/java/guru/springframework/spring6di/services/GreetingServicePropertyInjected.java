package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;


@Service("propertyGreetingsService")
public class GreetingServicePropertyInjected implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Friends don't let friend to property injection!";
    }
}
