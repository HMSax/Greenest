import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmtreeTest {
    Palmtree tp1 = new Palmtree("Testpalm 1", 3);
    Palmtree tp2 = new Palmtree("Testpalm 2", 2);

    @Test
    void palmFluidAmountTest() {
        assert (tp1.dailyRequiredFluidAmount() == 1.5);
        assert (tp2.dailyRequiredFluidAmount() == 1);
        assert (tp2.dailyRequiredFluidAmount() != 0);
    }
    @Test
    void nutritionTypeTest(){
        assert(tp1.getNutrientFluidType().equals("tap water"));
        assert(!tp1.getNutrientFluidType().equals("Tap water"));
        assert(!tp1.getNutrientFluidType().equals("TAPWATER"));

    }
}