import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        int curData = sc.nextInt();
        int newData = sc.nextInt();
        if(curData>2) newData = newData+2;
        else newData = newData+curData;
        System.out.println(newData);
    }
}