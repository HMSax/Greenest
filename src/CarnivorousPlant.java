public class CarnivorousPlant extends Plant {        //exempel på arv
    private final Nutrienttype nutrientFluidType = Nutrienttype.PROTEINDRINK;   //inkapsling av varibel, använder enum

    public CarnivorousPlant(String name, double plantHeightInMeters) {
        super(name, plantHeightInMeters);
    }

    public double dailyRequiredFluidAmount() {
        return (0.1 + (0.2 * this.getPlantHeightInMeters()));
    }

    public String getNutrientFluidType() {
        return nutrientFluidType.type;
    }
}