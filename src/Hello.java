import javax.swing.*;

public class Hello {

    // This is name of the man
    String nameOfTheMan = "122";
    int height = 186;
    int system = 12;

    /*
    This is main method
    of class Hello
     */
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Hello World " + args[0]);

        JFrame jFrame = new JFrame("Hello Java");
        jFrame.setSize(800, 600);

        JTextPane jTextPane = new JTextPane();
        jTextPane.setText("I LOVE JAVA");

        jFrame.add(jTextPane);

        jFrame.setVisible(true);
    }

}