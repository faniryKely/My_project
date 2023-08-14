import java.math.BigInteger;

public class Person {
    public BigInteger id;
    private String name;

    public Person(BigInteger id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}