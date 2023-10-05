import javax.swing.*;

public class Greenest {

    Greenest() throws NullPointerException {
        Hotel greenest = new Hotel("Greenest Plant Hotel");

        Plant igge = new Cactus("Igge", 0.2);       //polymorfism
        Plant laura = new Palmtree(" Laura", 5);
        Plant olof = new Palmtree("Olof", 1);
        Plant meatloaf = new CarnivorousPlant("Meatloaf", 0.7);

        greenest.addPlant(igge);
        greenest.addPlant(laura);
        greenest.addPlant(olof);
        greenest.addPlant(meatloaf);

        boolean repeat = true;
        try {
            while (repeat) {    //upprepar frågan tills input matchar namnet på en planta i plantList
                boolean notInList = true;
                String plantName = JOptionPane.showInputDialog(
                        null, "Which plant would you like info about?",
                        greenest.getHotelName(), JOptionPane.INFORMATION_MESSAGE).toLowerCase().trim();
                for (Plant plant : greenest.getPlantList()) { //vid namnmatchning hämtas info om önskad vätska/vätskemängd via interface
                    if (plant.getName().toLowerCase().trim().equals(plantName)) {
                        int repeatChoice = JOptionPane.showConfirmDialog(null,
                                plant.getName() + " wants " + dailyRequiredFluid(plant)
                                        + " litres of " + nutrientFluidType(plant) + ".\n"
                                        + "Would you like info about another plant?",
                                plant.getName().toUpperCase() + " INFORMATION", JOptionPane.YES_NO_CANCEL_OPTION);
                        notInList = false;
                        repeat = repeatChoice == JOptionPane.YES_OPTION;    //om användaren klickar på "Yes" upprepas loopen.
                    }
                }
                if (notInList) {    //meddelanden vid felaktig input
                    if (plantName.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please write the name of a plant.",
                                greenest.getHotelName(), JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, plantName + " is not a resident of this hotel.",
                                greenest.getHotelName(), JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        } catch (Exception ignored) {
        }
        JOptionPane.showMessageDialog(null, "Goodbye!",
                greenest.getHotelName(), JOptionPane.INFORMATION_MESSAGE);
    }

    public String nutrientFluidType(GetInfo any) {  //hämtar önskad vätsketyp via interfacet GetInfo
        return any.getNutrientFluidType();
    }

    public double dailyRequiredFluid(GetInfo any) { //hämtar önskad daglig vätskemängd via interfacet GetInfo
        return any.dailyRequiredFluidAmount();
    }

    public static void main(String[] args) {     //bryter den statiska kontexten
        Greenest greenest = new Greenest();
    }
}
