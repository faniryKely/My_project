package Model;

public class User {
    private int id;
    private String name;
    private String first_name;

    public User(int id, String name, String first_name) {
        this.id = id;
        this.name = name;
        this.first_name = first_name;

    }

    @Override
    public String toString() {
        return "{"+
                "id=" + id +
                ", name='" + name + '\'' +
                ", first_name='" + first_name + '\'' +
                '}';
    }
}
