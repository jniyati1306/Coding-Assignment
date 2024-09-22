import java.util.ArrayList;
import java.util.List;

public class AirTrafficControl implements AirTrafficControlMediator {
    private List<Plane> planes;

    public AirTrafficControl() {
        planes = new ArrayList<>();
    }

    @Override
    public void registerPlane(Plane plane) {
        planes.add(plane);
        plane.setMediator(this);
    }

    @Override
    public void sendMessage(String message, Plane sender) {
        for (Plane plane : planes) {
            // Don't send the message to the sender
            if (plane != sender) {
                plane.receiveMessage(message);
            }
        }
        LoggerUtil.getInstance().log("Message from " + sender.getName() + ": " + message);
    }
}
