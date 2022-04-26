package my.commands;

public class MultCommand extends Command {

    private ArrayOperation ao;

    public MultCommand(ArrayOperation ao) {
        this.ao = ao;
    }

    @Override
    void execute() {
        ao.product();
    }
}
