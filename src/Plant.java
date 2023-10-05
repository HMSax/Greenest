abstract public class Plant implements GetInfo {    //Superklass för alla plantor.

    private String name;                            //Inkapsling av varibler
    private double plantHeightInMeters;

    public Plant() {
    }

    public Plant(String name, double plantHeightInMeters) { //Superkonstruktor
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
