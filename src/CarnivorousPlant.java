public class CarnivorousPlant extends Plant implements GetInfo {        //exempel på arv
    private final Nutrienttype nutrientFluidType = Nutrienttype.PROTEINDRINK;   //inkapsling, använder enum

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