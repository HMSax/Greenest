import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarnivorousPlantTest {
    CarnivorousPlant tc1 = new CarnivorousPlant("Carni 1", 0.5);
    CarnivorousPlant tc2 = new CarnivorousPlant("Carni 2", 0.7);

    @Test
    void carniFluidAmountTest() {
        assert (tc1.dailyRequiredFluidAmount() == 0.2);
        assert (tc2.dailyRequiredFluidAmount() == 0.24);
        assert (tc2.dailyRequiredFluidAmount() != 0);

    }

}