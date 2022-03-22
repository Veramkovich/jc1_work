package my.oop;

public abstract class Machine {

    String name;

    public Machine() {
        this("No name");
        System.out.println("No name defined");
    }

    public Machine(String name) {
        System.out.println("Set name " + name);
        this.name = name;
    }

    public abstract void work();

    public void stop() {
        this.stop(0);
    }

    public void stop(int sec){
        System.out.println("Stop in " + sec + " sec");
        // Other method statements
    }
}
