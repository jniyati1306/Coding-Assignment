public class ResidentialInfrastructure implements Infrastructure {
    @Override
    public void construct() {
        LoggerUtil.getInstance().log("Constructing Residential Infrastructure...");
        System.out.println("Residential infrastructure is being constructed.");
    }
}
