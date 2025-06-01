import java.util.Scanner;
public class Leapyear {
    public static boolean isleap(int a){
        return (a%4==0 && a%100!=0) || (a%400==0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();

        if(isleap(year)){
            System.out.println(year +" is a leap year");
        }
        else{
            System.out.println(year+ "is not a leap year");
        }
    }
}
