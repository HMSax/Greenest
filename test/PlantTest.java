import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class PlantTest {

    Plant testPlant = new Cactus("Testplantan", 8);

    @Test
    void getNameTest() {
        assert (testPlant.getName().equals("Testplantan"));
        assert (!testPlant.getName().equals("testplantan"));

    }

    @Test
    void getPlantHeightInMetersTest() {
        assert (testPlant.getPlantHeightInMeters() == 8);
        assert (testPlant.getPlantHeightInMeters() != 0);
    }
}