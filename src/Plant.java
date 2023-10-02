abstract public class Plant implements GetInfo {    //superklass för alla plantor, implementerar interfacet

    private String name;                            //inkapsling av variblerna
    private double plantHeightInMeters;

    public Plant() {
    }

    public Plant(String name, double plantHeightInMeters) { //superkonstruktor
        this.name = name;
        this.plantHeightInMeters = plantHeightInMeters;

    }

    public String getName() {
        return name;
    }

    public double getPlantHeightInMeters() {
        return plantHeightInMeters;
    }
}
