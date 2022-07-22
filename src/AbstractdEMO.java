
abstract class Bike{
    abstract void run();
}

public class AbstractdEMO extends Bike {


    @Override
    void run() {
        System.out.println("Hello");

    }

    public static void main(String[] args) {
        Bike bj = new AbstractdEMO();
        bj.run();
    }
}
