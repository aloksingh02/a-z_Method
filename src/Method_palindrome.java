import java.util.Scanner;
public class Method_palindrome {
    public static boolean isPalindrome(int num){
        int originalNum = num;
        int rev = 0;
        while(num>0){
            rev = rev*10 + num%10;
            num /= 10;
        }
        return originalNum == rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num1 = sc.nextInt();

        if(isPalindrome(num1)){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("Number is not palinfrome");
        }
    }
}


