public class Cactus extends Plant {          //exempel på arv
    private final String nutrientFluidType = "mineral water";   //inkapsling av varibel, final då den inte ska kunna ändras

    public Cactus(String name, double plantHeightInMeters) {
        super(name, plantHeightInMeters);
    }

    public double dailyRequiredFluidAmount() {
        return 0.02;
    }

    public String getNutrientFluidType() {
        return nutrientFluidType;
    }
}