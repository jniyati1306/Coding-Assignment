public class Main {
    public static void main(String[] args) {
        AirTrafficControl atc = new AirTrafficControl();
        
        Plane plane1 = new Plane("Plane 1");
        Plane plane2 = new Plane("Plane 2");

        atc.registerPlane(plane1);
        atc.registerPlane(plane2);

        plane1.sendMessage("Hello from Plane 1!");
        plane2.sendMessage("Hello from Plane 2!");
    }
}
