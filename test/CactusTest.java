import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CactusTest {
    Cactus tk1 = new Cactus("Testkaktus 1", 2);
    Cactus tk2 = new Cactus("Testkaktus 2", 5);

    @Test
    void cactusFluidAmountTest() {
        assert (tk1.dailyRequiredFluidAmount() == 0.02);
        assert (tk2.dailyRequiredFluidAmount() == 0.02);
        assert (tk2.dailyRequiredFluidAmount() != -0.02);
    }
}