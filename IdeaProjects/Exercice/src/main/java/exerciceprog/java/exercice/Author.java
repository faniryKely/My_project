package exerciceprog.java.exercice;

public class Author {
    private String name ;
    private String email ;
    private char gender;

    public Author(String name, String email, char sex) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(!email.contains("@")) {
            System.out.println("Miss caracter");
        }
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if( (gender != 'F') || (gender != 'M')){
            System.out.println("erreur");
        }
        this.gender = gender;
    }
   @Override
   public String toString() {
        return "Author{" + "name" + name + "email" + email + "gender" + gender + '}' ;
   }
}
