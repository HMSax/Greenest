public class Palmtree extends Plant {        //exempel på arv
    private final String nutrientFluidType = "tap water";       //inkapsling av varibel, final då den inte ska kunna ändras

    public Palmtree(String name, double plantHeightInMeters) {
        super(name, plantHeightInMeters);
    }

    public double dailyRequiredFluidAmount() {
        return (0.5 * this.getPlantHeightInMeters());
    }

    public String getNutrientFluidType() {
        return nutrientFluidType;
    }
}