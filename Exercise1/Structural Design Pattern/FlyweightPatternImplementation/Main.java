public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight flyweight1 = factory.getFlyweight("State1");
        flyweight1.operation("Context1");

        Flyweight flyweight2 = factory.getFlyweight("State1");
        flyweight2.operation("Context2");

        Flyweight flyweight3 = factory.getFlyweight("State2");
        flyweight3.operation("Context3");

        System.out.println("Total Flyweights created: " + factory.getFlyweightCount());
    }
}

