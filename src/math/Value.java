package math;

import java.util.Objects;

public class Value {

    private int value1;
    private int value2;

    public Value(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Value value = (Value) o;
        return value1 == value.value2 && value2 == value.value1;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value1 * value2, value1 + value2);
    }

    @Override
    public String toString() {
        return "\n" + value1 + "*" + value2;
    }
}
