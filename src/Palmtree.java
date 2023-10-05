public class Palmtree extends Plant implements GetInfo {        //Exempel på arv. Klassen implementerar interfacet.
    private final Nutrienttype nutrientFluidType = Nutrienttype.TAPWATER;   //Inkapsling. Använder enum.

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