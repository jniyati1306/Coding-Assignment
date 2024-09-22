// BaseHandler.java
public abstract class BaseHandler implements Handler {
    protected Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String issue) throws InvalidIssueException {
        if (nextHandler != null) {
            nextHandler.handleRequest(issue); // This should also declare the exception
        }
    }
}
