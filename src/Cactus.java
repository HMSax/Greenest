public class Cactus extends Plant implements GetInfo {          //exempel på arv
    private final Nutrienttype nutrientFluidType = Nutrienttype.MINERALWATER;   //inkapsling, använder enum

    public Cactus(String name, double plantHeightInMeters) {
        super(name, plantHeightInMeters);
    }

    public double dailyRequiredFluidAmount() {
        return 0.02;
    }

    public String getNutrientFluidType() {
        return nutrientFluidType.getType();
    }
}