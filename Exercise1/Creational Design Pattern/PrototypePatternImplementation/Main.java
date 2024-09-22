public class Main {
    public static void main(String[] args) {
        ConcretePrototype original = new ConcretePrototype("Original");
        ConcretePrototype cloned = (ConcretePrototype) original.clone();

        System.out.println("Original: " + original.getName());
        System.out.println("Cloned: " + cloned.getName());
    }
}
