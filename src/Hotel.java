import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Plant> plantList = new ArrayList<>();

    public Hotel() {
    }

    public void addPlant(Plant plant) {
        plantList.add(plant);
    }

    public List<Plant> getPlantList() {
        return plantList;
    }

}
