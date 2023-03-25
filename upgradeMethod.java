import java.util.Scanner;

public class upgradeMethod {
    
    // change item upgrade chance here (eg. plusFour means +3 to +4)
    static double plusFour = 0.7;
    static double plusFive = 0.22;
    static double plusSix = 0.19;
    static double plusSeven = 0.03;
    static double plusEight = 0.01;
    //

    static double cumlChance = 1;
    static double cost = 0;
    static double percent = 100;
    //static String cumlString = "";

    public static double calculateUpgradeChance(int num) {
        

        //double toLevel = Double.parseDouble(n)-1; // input is 7 for upgrading an item from +1 to +8
        int toLevel = num-1;

        for (int i = 1; i <= toLevel; i++) {
            if (i <= 2) {
                cumlChance = 1;
            } else if (i == 3) {
                cumlChance = plusFour * cumlChance;
            } else if (i == 4) {
                cumlChance = plusFive * cumlChance;
            } else if (i == 5) {
                cumlChance = plusSix * cumlChance;
            } else if (i == 6) {
                cumlChance = plusSeven * cumlChance;
            } else if (i == 7) {
                cumlChance = plusEight * cumlChance;
            } else {
                System.out.println("You can't upgrade, Hence 0%");
                cumlChance = 0;
                break;
            }
        }
        return cumlChance * 100;
        
    } 

    public static double calculateHowManyItems() {
        return Math.ceil(1 / cumlChance);
    }

    public static double totalCost(double n, double unitCost, Scanner scanner) {
        // expected total cost(anvil included, scroll cost excluded)
        double toLevel = n - 1; // input is 7 for upgrading an item from +1 to +8
        double cost = unitCost;

        for (int i = 1; i <= toLevel; i++) {
            if (i <= 2) {
                cost = unitCost + 60000;
            } else if (i == 3) {
                cost += 75000;
            } else if (i == 4) {
                cost += 240000;
            } else if (i == 5) {
                cost += 240000;
            } else if (i == 6) {
                cost += 750000;
            } else if (i == 7) {
                cost += 1000000;
            }
        }
        return cost * calculateHowManyItems();
    }


    //test case within this method
    /*public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);
        System.out.println("up until +?");
        int num = scanner.nextInt();
        System.out.println("unit cost?");
        double unitCost = scanner.nextDouble();

        System.out.println("Upgrade target: +" + num);
        System.out.println("cumulative success chance is " + calculateUpgradeChance(num) + "%");
        System.out.println("You need about " + calculateHowManyItems() + " items to gather (rounded up)");
        System.out.println("------------------------------------------------------");
        System.out.print("The expected cost of successfully upgrading one item to +" + num + " is ");
        System.out.printf("%.6f", +totalCost(num, unitCost, scanner));
        System.out.println(" (Anvil costs included, scroll costs excluded)");
        System.out.println("------------------------------------------------------");
        scanner.close();
    }*/

}
