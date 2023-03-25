import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class App extends JFrame {

    private JLabel label1, label2;
    private JTextField textField1, textField2;
    private JButton button;

    public App() {
        setTitle("Upgrade Chance Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        label1 = new JLabel("Enter desired item level: ");
        textField1 = new JTextField(10);
        label2 = new JLabel("Enter unit item cost: ");
        textField2 = new JTextField(10);
        button = new JButton("Calculate Upgrade Chance and expected cost");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int itemLevel = Integer.parseInt(textField1.getText());
                double unitCost = Double.parseDouble(textField2.getText());
                double upgradeChance = upgradeMethod.calculateUpgradeChance(itemLevel);
                double expectedAmount = upgradeMethod.calculateHowManyItems();
                double number = upgradeMethod.totalCost(itemLevel, unitCost, new Scanner(System.in));
                DecimalFormat formatter = new DecimalFormat("###,###,###.#########");
                String formattedNumber = formatter.format(number);
                JOptionPane.showMessageDialog(null, "Cumulative Upgrade Chance: " + upgradeChance +"%" + 
                        "\nExpected Total Cost: " + formattedNumber +
                        "\nThe amount of expected items: " + expectedAmount);
            }
        });
        

        JPanel panel = new JPanel();
        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(button);
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new App();
    }
}
