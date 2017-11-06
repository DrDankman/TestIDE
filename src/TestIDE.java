import javax.swing.*;

/*
    Gissa tal mellan 0 och 100 spel
    Daniel Carlsson
    2017-11-06
*/
public class TestIDE {
    public static void main(String[] args) {

        double random = Math.random();
        int number = (int) (random * 100) + 1;
        int ggr = 1;
        while(ggr<11){
        int forsta = Integer.parseInt(JOptionPane.showInputDialog(null, "Jag tänker på ett tal mellan 0 och 100, gissa vilket.\nFörsök " + ggr));
        if (forsta == number) {
            JOptionPane.showMessageDialog(null, "Grattis! Du fick rätt! \nDet tog " + ggr + " försök");
            System.exit(0);
        } else if (forsta > number) {
            JOptionPane.showMessageDialog(null, "Talet är mindre, gissa igen");
        } else if (forsta < number) {
            JOptionPane.showMessageDialog(null, "Talet är större, gissa igen");
        }
        ggr++;
    }
    }
}
