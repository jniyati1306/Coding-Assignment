// Handler.java
public interface Handler {
    void handleRequest(String issue) throws InvalidIssueException; // Ensure this line is present
    void setNextHandler(Handler nextHandler);
}
