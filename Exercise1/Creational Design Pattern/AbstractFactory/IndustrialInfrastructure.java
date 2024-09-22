public class IndustrialInfrastructure implements Infrastructure {
    @Override
    public void construct() {
        LoggerUtil.getInstance().log("Constructing Industrial Infrastructure...");
        System.out.println("Industrial infrastructure is being constructed.");
    }
}
