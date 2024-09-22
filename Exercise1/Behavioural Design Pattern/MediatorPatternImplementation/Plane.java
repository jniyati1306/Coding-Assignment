public class Plane {
    private String name;
    private AirTrafficControlMediator mediator;

    public Plane(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMediator(AirTrafficControlMediator mediator) {
        this.mediator = mediator;
    }

    public void sendMessage(String message) {
        if (mediator != null) {
            mediator.sendMessage(message, this);
        }
    }

    public void receiveMessage(String message) {
        LoggerUtil.getInstance().log(name + " received: " + message);
        System.out.println(name + " received: " + message);
    }
}
