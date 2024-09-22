public class Level2Handler extends BaseHandler {
    @Override
    public void handleRequest(String issue) throws InvalidIssueException {
        if (issue == null) {
            throw new InvalidIssueException("Issue cannot be null");
        }

        if (issue.equalsIgnoreCase("complex")) {
            LoggerUtil.log("Level 2 resolved the issue: " + issue);
        } else {
            LoggerUtil.log("Level 2 can't resolve. Escalating...");
            super.handleRequest(issue);
        }
    }
}
