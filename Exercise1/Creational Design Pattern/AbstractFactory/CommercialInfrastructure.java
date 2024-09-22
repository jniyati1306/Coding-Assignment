public class CommercialInfrastructure implements Infrastructure {
    @Override
    public void construct() {
        LoggerUtil.getInstance().log("Constructing Commercial Infrastructure...");
        System.out.println("Commercial infrastructure is being constructed.");
    }
}
