public class Palmtree extends Plant {        //exempel på arv
    private final Nutrienttype nutrientFluidType = Nutrienttype.TAPWATER;   //inkapslin, använder enum

    public Palmtree(String name, double plantHeightInMeters) {
        super(name, plantHeightInMeters);
    }

    public double dailyRequiredFluidAmount() {
        return (0.5 * this.getPlantHeightInMeters());
    }

    public String getNutrientFluidType() {
        return nutrientFluidType.getType();
    }
}