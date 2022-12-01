package math;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Multiplication {

    private final Set<Value> multiply = new HashSet();

    public void tasks() {
        Random random = new Random();
        while (multiply.size() < 15) {
            multiply.add(new Value(2 + random.nextInt(7), 2 + random.nextInt(7)));
        }
    }

    public Set<Value> getMultiply() {
        return multiply;
    }

    @Override
    public String toString() {
        return "Multiplication{" +
                "multiply=" + multiply +
                '}';
    }
}
