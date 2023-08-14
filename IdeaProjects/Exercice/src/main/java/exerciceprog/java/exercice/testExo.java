package exerciceprog.java.exercice;

public class testExo {
    public static void main(String[] args) {
        Employee Borys = new Employee(1, "Borys", "LE ROI", 1_000_000) ;
        System.out.println(Borys.raise(40));
    }
}
