import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        int Classes  = sc.nextInt();
        int attClasses = sc.nextInt();
        double att = (attClasses*100.0)/Classes;
        if(att>=75) System.out.println("Eligible");
        else System.out.println("Not Eligible");
    }
}