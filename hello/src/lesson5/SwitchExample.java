package lesson5;

public class SwitchExample {

    public static void main(String[] args) {
        String command;
        if (args.length != 1) {
            command = "";
        } else {
            command = args[0];
        }
        switch (command) {
            case "start": {
                System.out.println("Starting");
                break;
            }
            case "stop": {
                System.out.println("Stopping");
                break;
            }
            case "pause": {
                System.out.println("Paused");
                break;
            }
            default: {
                System.out.println("Usage: java lesson5.SwitchExample <command>");
                System.out.println("command: start, stop or pause");
                System.exit(1);
            }
        }
        System.exit(0);
    }

}
