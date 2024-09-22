public class Level3Handler extends BaseHandler {
    @Override
    public void handleRequest(String issue) throws InvalidIssueException {
        if (issue == null) {
            throw new InvalidIssueException("Issue cannot be null");
        }

        if (issue.equalsIgnoreCase("critical")) {
            LoggerUtil.log("Level 3 resolved the issue: " + issue);
        } else {
            LoggerUtil.log("Level 3 can't resolve the issue. No further escalation possible.");
        }
    }
}
