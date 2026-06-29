import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt(); 
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }else{
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}