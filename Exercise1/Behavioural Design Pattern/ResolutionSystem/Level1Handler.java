public class Level1Handler extends BaseHandler {
    @Override
    public void handleRequest(String issue) throws InvalidIssueException {
        if (issue == null) {
            throw new InvalidIssueException("Issue cannot be null");
        }

        if (issue.equalsIgnoreCase("basic")) {
            LoggerUtil.log("Level 1 resolved the issue: " + issue);
        } else {
            LoggerUtil.log("Level 1 can't resolve. Escalating...");
            super.handleRequest(issue);
        }
    }
}
