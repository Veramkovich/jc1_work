package my.nested;

public class Matreshka {

    private Matreshka matreshka;

    public Matreshka(Matreshka matreshka) {
        this.matreshka = matreshka;
        System.out.println("Hello from Matreshka");
    }

    public static void main(String[] args) {
        Matreshka matreshka = new Matreshka(new Matreshka(null));
    }
}
