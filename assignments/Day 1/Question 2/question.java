import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        int b = sc.nextInt();
        int pc = sc.nextInt();
        if(b>=pc) System.out.println("Recharge Successful");
        else System.out.println("Insufficient Balance"); 
    }
}