import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        int d = sc.nextInt();
        if(d==1){
            System.out.println("Discount available");
        }else {
            System.out.println("no Discount");
        }
    }
}