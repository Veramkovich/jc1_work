package my.commands;

public class ArrayOperation {

    private Integer[] mass;

    public ArrayOperation(Integer[] mass) {
        this.mass = mass;
    }

    public void product() {
        int res = 1;
        for (int m : mass) {
            res *= m;
        }
        mass = new Integer[1];
        mass[0] = res;
    }

    public void sum() {
        int res = 0;
        for (int m : mass) {
            res += m;
        }
        mass = new Integer[1];
        mass[0] = res;
    }

    public Integer getResult() {
        return mass[0];
    }
}
