import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Plant> plantList = new ArrayList<>();  //Inkapsling
    private String hotelName;
    public Hotel(String name) {
        this.hotelName = name;
    }

    public void addPlant(Plant plant) {
        plantList.add(plant);
    }

    public List<Plant> getPlantList() {
        return plantList;
    }

    public String getHotelName() {
        return hotelName;
    }
}
