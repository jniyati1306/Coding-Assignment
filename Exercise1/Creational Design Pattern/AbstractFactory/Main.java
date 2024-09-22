public class Main {
    public static void main(String[] args) {
        LoggerUtil.getInstance().log("Smart City Simulator starting...");

        DistrictFactory residentialFactory = new ResidentialFactory();
        DistrictFactory commercialFactory = new CommercialFactory();
        DistrictFactory industrialFactory = new IndustrialFactory();

        Infrastructure residentialDistrict = residentialFactory.createInfrastructure();
        Infrastructure commercialDistrict = commercialFactory.createInfrastructure();
        Infrastructure industrialDistrict = industrialFactory.createInfrastructure();

        residentialDistrict.construct();
        commercialDistrict.construct();
        industrialDistrict.construct();

        LoggerUtil.getInstance().log("Smart City Simulation complete.");
    }
}
