import java.util.Scanner;
public class Method_combination {
    public static int fact(int x){
        int xfact =1;
        for(int i=1; i<=x; i++){
            xfact *= i;
        }
        return xfact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n");
        int n= sc.nextInt();
        System.out.println("Enter the number r");
        int r = sc.nextInt();

        int nfact = fact(n);
        int rfact = fact(r);
        int n_rfact = fact(n-r);
        int ncr = nfact/(rfact*n_rfact);
        System.out.println(ncr);
    }
}
