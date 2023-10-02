public interface GetInfo {
    default double dailyRequiredFluidAmount() {      //metod som returnerar önskad daglig vätskemängd i liter.
        return this.dailyRequiredFluidAmount();
    }

    default String getNutrientFluidType() {          //metod som returnerar önskad vätsketyp.
        return this.getNutrientFluidType();
    }
}
