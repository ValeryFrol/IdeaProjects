import java.util.Scanner;

public class WeightCalc {

    public static void main(String[] args) {
        System.out.println("Male or Female? Press 1 for Male, press 2 for Female");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("Enter your height");
        double height = sc.nextInt();
        Weight w = new Weight();

        if (i == 1) {
            System.out.println("Your ideal weight - " + w.idealMan(height));
        } else {
            System.out.println("Your ideal weight - " + w.idealWoman(height));
        }

    }


}
