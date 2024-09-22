public class ResidentialFactory implements DistrictFactory {
    @Override
    public Infrastructure createInfrastructure() {
        return new ResidentialInfrastructure();
    }
}
