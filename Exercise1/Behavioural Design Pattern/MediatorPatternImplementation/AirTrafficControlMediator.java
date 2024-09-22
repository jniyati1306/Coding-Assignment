
public interface AirTrafficControlMediator {
    void registerPlane(Plane plane);
    void sendMessage(String message, Plane sender);
}
