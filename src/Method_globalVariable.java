public class Method_globalVariable {
    static int i;
    public static void main(String[] args) {
        int i=10;
        fun();
    }
    public static void fun(){
        System.out.println(i);
    }
}
