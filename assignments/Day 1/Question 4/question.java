import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        String uname = sc.next();
        if(uname.length()<=8){
            System.out.println("Invalid");
            return;
        }
        boolean hasL=false;
        boolean hasD=false;
        boolean hasS=false;
        for(char ch : uname.toCharArray()){
            if(Character.isLetter(ch)) hasL=true;
            if(Character.isDigit(ch)) hasD=true;
            if(ch==' ') hasS=true;
        }
        if(uname.length()>=8 && hasL && hasD && !hasS) System.out.println("Valid");
        else System.out.println("Invalid");

    }
}