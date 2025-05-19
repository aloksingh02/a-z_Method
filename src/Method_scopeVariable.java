import java.util.Scanner;
public class Method_scopeVariable {
    public static void main(String[] args) {
        int i=1;
        for(i=1; i<=5; i++){
            System.out.print(i);
        }
        System.out.println(i);
    }
}
