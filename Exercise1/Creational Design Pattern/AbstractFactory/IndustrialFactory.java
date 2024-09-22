public class IndustrialFactory implements DistrictFactory {
    @Override
    public Infrastructure createInfrastructure() {
        return new IndustrialInfrastructure();
    }
}
