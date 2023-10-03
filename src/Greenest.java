import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Greenest {
    List<Plant> plantList = new ArrayList<>();

    Greenest() {
        Plant igge = new Cactus("Igge", 0.2);       //polymorfism
        Plant laura = new Palmtree(" Laura", 5);
        Plant olof = new Palmtree("Olof", 1);
        Plant meatloaf = new CarnivorousPlant("Meatloaf", 0.7);

        plantList.add(igge);
        plantList.add(laura);
        plantList.add(olof);
        plantList.add(meatloaf);

        userQuestion();
    }

    private void userQuestion() throws NullPointerException {    //allt användaren ser finns i denna metod
        boolean repeat = true;
        try {
            while (repeat) {    //upprepar frågan tills input matchar namnet på en planta i plantList
                boolean notInList = true;
                String plantName = JOptionPane.showInputDialog(null, "Which plant would you like info about?",
                        "Greenest Plant Hotel", JOptionPane.INFORMATION_MESSAGE);
                plantName = plantName.toLowerCase().trim();
                for (Plant plant : plantList) { //vid namnmatchning hämtas info om önskad vätska/vätskemängd via interface
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
                                "Greenest Plant Hotel", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, plantName + " is not a resident of this hotel.",
                                "Greenest Plant Hotel", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        } catch (Exception ignored) {
        }
        JOptionPane.showMessageDialog(null, "Goodbye!",
                "Greenest Plant Hotel", JOptionPane.INFORMATION_MESSAGE);
    }

    public String nutrientFluidType(GetInfo any) {  //metod hämtar önskad vätsketyp via interfacet GetInfo
        return any.getNutrientFluidType();
    }

    public double dailyRequiredFluid(GetInfo any) { //metod hämtar önskad daglig vätskemängd via interfacet GetInfo
        return any.dailyRequiredFluidAmount();
    }

    public static void main(String[] args) {     //bryter den statiska kontexten
        Greenest greenest = new Greenest();
    }
}
