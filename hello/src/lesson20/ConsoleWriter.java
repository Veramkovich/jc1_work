package lesson20;

import java.util.Scanner;

public class ConsoleWriter {

    private final Scanner scanner;
    private final StringBuffer stringBuffer;
    private final FileSaver fileSaver;

    public ConsoleWriter() {
        scanner = new Scanner(System.in);
        stringBuffer = new StringBuffer();
        fileSaver = new FileSaver();
    }

    public void run() {
        while (true) {
            final String line = scanner.nextLine();
            if ("exit".equalsIgnoreCase(line)) {
                break;
            } else if ("save".equalsIgnoreCase(line)) {
                fileSaver.saveToFile(stringBuffer.toString());
            } else {
                stringBuffer.append(line);
            }
        }
    }

}
