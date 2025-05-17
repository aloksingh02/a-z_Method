
public class Method_multipleFunction {
    public static void fun1(){
        fun2();
        for(int i=1; i<=10; i++){
            System.out.print(i);
        }
        System.out.println();
        fun3();
    }

    public static void main(String[] args) {
        System.out.println("darkhorsr");
        fun1();
        System.out.println("what");
        fun3();
        fun2();
    }

    public static void fun2(){
        System.out.println("i am second");
    }

    public static void fun3() {
        System.out.println("I am third");
    }
}
