public class Cactus extends Plant implements GetInfo {          //Exempel på arv. klassen implementerar interfacet.
    private final Nutrienttype nutrientFluidType = Nutrienttype.MINERALWATER;   //Inkapsling. Använder enum.

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