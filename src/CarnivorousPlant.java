public class CarnivorousPlant extends Plant implements GetInfo {    //Exempel på arv. klassen implementerar interfacet.
    private final Nutrienttype nutrientFluidType = Nutrienttype.PROTEINDRINK;   //Inkapsling. Använder enum.

    public CarnivorousPlant(String name, double plantHeightInMeters) {
        super(name, plantHeightInMeters);
    }

    public double dailyRequiredFluidAmount() {
        return (0.1 + (0.2 * this.getPlantHeightInMeters()));
    }

    public String getNutrientFluidType() {
        return nutrientFluidType.getType();
    }
}