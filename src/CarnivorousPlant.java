public class CarnivorousPlant extends Plant {        //exempel på arv
    private final String nutrientFluidType = "protein drink";    //inkapsling av varibel, final då den inte ska kunna ändras

    public CarnivorousPlant(String name, double plantHeightInMeters) {
        super(name, plantHeightInMeters);
    }

    public double dailyRequiredFluidAmount() {
        return (0.1 + (0.2 * this.getPlantHeightInMeters()));
    }

    public String getNutrientFluidType() {
        return nutrientFluidType;
    }
}