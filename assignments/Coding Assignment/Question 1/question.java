import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        int b = sc.nextInt();
        if(b<20){
            System.out.println("Charge Soon");
        }else{
            System.out.println("Battery OK");
        }
    }
}