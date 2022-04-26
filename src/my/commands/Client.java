package my.commands;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation(List.of(1, 2, 3, 4).toArray(Integer[]::new));
        Command command = new AddCommand(ao);

        CommandManager commandManager = new CommandManager();
        commandManager.setManager(command);
        commandManager.exec();

        System.out.println(ao.getResult());
    }
}
