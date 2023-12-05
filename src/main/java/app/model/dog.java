package app.model;

import org.springframework.stereotype.Component;

@Component
public class dog extends Animal {

    @Override
    public String toString() {
        return "I`m a dog";
    }
}
