/**
 * Created by earne on 9/17/15.
 */
public class DianPingFoo extends Peo {
    private static final int a = 1;
    Peo fat;

    public DianPingFoo(String name) {
        System.out.print(3);
        this.name = name;
        fat = new Peo(name + ":F");
    }

    public DianPingFoo() {
        System.out.print(4);
    }

    public static void main(String[] args) {
        new DianPingFoo("mike");
    }
}

class Peo {
    String name;

    public Peo() {
        System.out.print(1);
    }

    public Peo(String name) {
        System.out.print(2);
        this.name = name;
    }
}
