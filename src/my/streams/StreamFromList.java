package my.streams;

import java.util.Arrays;
import java.util.List;

public class StreamFromList {

    public static void main(String[] args) {
        List.of(new MyBean("1", 1), new MyBean("2", 2), new MyBean("10", 10))
                .stream()
                .filter(bean -> bean.getI1() > 1)
                .forEach(System.out::println);

        System.out.println();

        MyBean[] myBeans = {new MyBean("3s", 3), new MyBean("5", 5)};
        Arrays.stream(myBeans)
                .peek(myBean -> myBean.setI1(myBean.getI1() * 2))
                .map(StreamFromList::calculateSum)
                .forEach(System.out::println);
    }

    private static YourBean calculateSum(MyBean myBean) {
        int i2 = 0;
        try {
            i2 = Integer.parseInt(myBean.getS1());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return new YourBean(myBean.getI1() + i2);
    }


}

class MyBean {
    private String s1;
    private Integer i1;

    public MyBean(String s1, Integer i1) {
        this.s1 = s1;
        this.i1 = i1;
    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public Integer getI1() {
        return i1;
    }

    public void setI1(Integer i1) {
        this.i1 = i1;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "s1='" + s1 + '\'' +
                ", i1=" + i1 +
                '}';
    }
}

class YourBean {
    private int sum;

    public YourBean(int sum) {
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "YourBean{" +
                "sum=" + sum +
                '}';
    }
}