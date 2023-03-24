import java.util.Scanner;

public class main {

public static double calculateUpgradeChance(double n) {
                            //item basma oranlari
        double toLevel = n-1; // input is 7 for upgrading an item from +1 to +8
        double plusFour = 0.7;
        double plusFive = 0.22;
        double plusSix = 0.19;
        double plusSeven = 0.03;
        double plusEight = 0.01;

        double cumlChance=1;
        double cost=0;
        double percent=100;

        for(int i = 1; i <= toLevel; i++){
            if(i<=2){
                cumlChance=1;
                cost = 60000;
            }else if(i==3){
                cumlChance=plusFour*cumlChance;
                cost += 75000;
            }else if(i==4){
                cumlChance=plusFive*cumlChance;
                cost += 240000;
            }else if(i==5){
                cumlChance=plusSix*cumlChance;
                cost += 240000;
            }else if(i==6){
                cumlChance=plusSeven*cumlChance;
                cost += 750000;
            }else if(i==7){
                cumlChance=plusEight*cumlChance;
                cost += 1000000;
            } else{
                System.out.println("You can't upgrade, Hence 0%");
                cumlChance=0;
                break;
            }
        }
        return cumlChance*100;
}
public static double calculateCost(double n) {
    //item basma oranlari
double toLevel = n-1; // input is 7 for upgrading an item from +1 to +8
double plusFour = 0.7;
double plusFive = 0.22;
double plusSix = 0.19;
double plusSeven = 0.03;
double plusEight = 0.01;

double cumlChance=1;
double cost=0;
double percent=100;

for(int i = 1; i <= toLevel; i++){
if(i<=2){
cumlChance=1;
cost = 60000;
}else if(i==3){
cumlChance=plusFour*cumlChance;
cost += 75000;
}else if(i==4){
cumlChance=plusFive*cumlChance;
cost += 240000;
}else if(i==5){
cumlChance=plusSix*cumlChance;
cost += 240000;
}else if(i==6){
cumlChance=plusSeven*cumlChance;
cost += 750000;
}else if(i==7){
cumlChance=plusEight*cumlChance;
cost += 1000000;
}
}
return cost;
}
public static double calculateWithTrina(int m, int n ){
//under maintenance
double toLevel = n-1; // input is 7 for upgrading an item from +1 to +8
double useTrinaAt = m-1;
double plusFour = 0.7;
double plusFive = 0.22;
double plusSix = 0.19;
double plusSeven = 0.03;
double plusEight = 0.01;

double plusFourTrina = 1;
double plusFiveTrina = 0.72;
double plusSixTrina = 0.29;
double plusSevenTrina = 0.05;
double plusEightTrina = 0.02;

double cumlChance=1;
double cost=0;
double percent=100;

for(int i = 1; i <= toLevel; i++){
if(i<=2){
cumlChance=1;
cost = 60000;
}else if(i==3){
cumlChance=plusFour*cumlChance;
cost += 75000;
}else if(i==4){
cumlChance=plusFive*cumlChance;
cost += 240000;
}else if(i==5){
cumlChance=plusSix*cumlChance;
cost += 240000;
}else if(i==6){
cumlChance=plusSeven*cumlChance;
cost += 750000;
}else if(i==7){
cumlChance=plusEight*cumlChance;
cost += 1000000;
}
}
return cumlChance*percent;
}
public static double calculate(double n) {
//cost calculation
double toLevel = n-1; // input is 7 for upgrading an item from +1 to +8
double plusFour = 0.7;
double plusFive = 0.22;
double plusSix = 0.19;
double plusSeven = 0.03;
double plusEight = 0.01;
double itemCost = 1500000; // cost of one unit item (preferably +1 md)
double sellPrice;

double cumlChance=1;
double cost=itemCost;
double percent=100;

for(int i = 1; i <= toLevel; i++){
if(i<=2){
cumlChance=1;
cost = itemCost+60000;
}else if(i==3){
cumlChance=plusFour*cumlChance;
cost += 75000;
}else if(i==4){
cumlChance=plusFive*cumlChance;
cost += 240000;
}else if(i==5){
cumlChance=plusSix*cumlChance;
cost += 240000;
}else if(i==6){
cumlChance=plusSeven*cumlChance;
cost += 750000;
}else if(i==7){
cumlChance=plusEight*cumlChance;
cost += 1000000;
}
}
return cost;
}
public static double calculateHowManyItems(double n) {
//the expected amount of items you need
double toLevel = n-1; // input is 7 for upgrading an item from +1 to +8
double plusFour = 0.7;
double plusFive = 0.22;
double plusSix = 0.19;
double plusSeven = 0.03;
double plusEight = 0.01;
double itemCost = 1500000; // cost of one unit item (preferably +1 md)
double sellPrice;

double cumlChance=1;
double cost=itemCost;
double percent=100;

for(int i = 1; i <= toLevel; i++){
if(i<=2){
cumlChance=1;
cost = itemCost+60000;
}else if(i==3){
cumlChance=plusFour*cumlChance;
cost += 75000;
}else if(i==4){
cumlChance=plusFive*cumlChance;
cost += 240000;
}else if(i==5){
cumlChance=plusSix*cumlChance;
cost += 240000;
}else if(i==6){
cumlChance=plusSeven*cumlChance;
cost += 750000;
}else if(i==7){
cumlChance=plusEight*cumlChance;
cost += 1000000;
}
}
return Math.ceil(1/cumlChance);
}
public static double totalCost(double n, double unitCost ,Scanner scanner) {
//expected total cost(anvil included, scroll cost excluded)
double toLevel = n-1; // input is 7 for upgrading an item from +1 to +8
double plusFour = 0.7;
double plusFive = 0.22;
double plusSix = 0.19;
double plusSeven = 0.03;
double plusEight = 0.01;
double sellPrice;

double cumlChance=1;
double cost=unitCost;
double percent=100;

for(int i = 1; i <= toLevel; i++){
if(i<=2){
cumlChance=1;
cost = unitCost+60000;
}else if(i==3){
cumlChance=plusFour*cumlChance;
cost += 75000;
}else if(i==4){
cumlChance=plusFive*cumlChance;
cost += 240000;
}else if(i==5){
cumlChance=plusSix*cumlChance;
cost += 240000;
}else if(i==6){
cumlChance=plusSeven*cumlChance;
cost += 750000;
}else if(i==7){
cumlChance=plusEight*cumlChance;
cost += 1000000;
}
}
return cost*calculateHowManyItems(n);
}
public static double averageScrolls(double n, double unitCost ,Scanner scanner) {
//amount of scrolls you need on average dependent on cumulative success rates
double toLevel = n-1; // 7 iterations for upgrading an item from +1 to +8
double plusFour = 0.7;
double plusFive = 0.22;
double plusSix = 0.19;
double plusSeven = 0.03;
double plusEight = 0.01;

double cumlChance=1;
double avgScroll=0;
double temp=0;

for(int i = 1; i <= toLevel; i++){
if(i<=2){
cumlChance=1;
avgScroll++;
temp++;
}else if(i==3){
cumlChance=plusFour*cumlChance;
avgScroll+=1+avgScroll*(1-cumlChance);
temp = avgScroll;
}else if(i==4){
cumlChance=plusFive*cumlChance;
avgScroll=avgScroll+avgScroll*(1-cumlChance);
}else if(i==5){
cumlChance=plusSix*cumlChance;
avgScroll=avgScroll+avgScroll*(1-cumlChance);
}else if(i==6){
cumlChance=plusSeven*cumlChance;
avgScroll=avgScroll+avgScroll*(1-cumlChance);
}else if(i==7){
cumlChance=plusEight*cumlChance;
avgScroll=avgScroll+avgScroll*(1-cumlChance);
} else{
    break;
}
}
return Math.ceil(avgScroll);
}
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("up until +?");
    int num = scanner.nextInt();
    System.out.println("unit cost?");
    double unitCost = scanner.nextDouble();

    System.out.println("Upgrade target: +"  + num);
    System.out.println("cumulative success chance is " + calculateUpgradeChance(num) + "%");
    //System.out.println("maximum only anvil cost is: " + calculateCost(num));
    //System.out.println("item plus anvil cost is: " + calculate(num));
    System.out.println("You need about "+calculateHowManyItems(num)+" items to gather (rounded up)");
    //System.out.println("You need about " + averageScrolls(num, unitCost, scanner) + " scrolls for this upgrade (rounded up)");
    System.out.println("------------------------------------------------------");
    System.out.print("The expected cost of successfully upgrading one item to +" + num + " is ");
    System.out.printf("%.6f", +totalCost(num, unitCost, scanner));
    System.out.println(" (Anvil costs included, scroll costs excluded)");
    System.out.println("------------------------------------------------------");
    scanner.close();
}
}
