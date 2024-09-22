public class CommercialFactory implements DistrictFactory {
    @Override
    public Infrastructure createInfrastructure() {
        return new CommercialInfrastructure();
    }
}
