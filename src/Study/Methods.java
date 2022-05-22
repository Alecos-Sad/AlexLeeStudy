package Study;

public class Methods {
    public static void main(String[] args) {

        welcome();
        multiply(5, 100);
        multiply(2, 3);
        devide(20, 5);

        int e = 6;
        int f = 8;
        multiply(e, f);
    }

    public static void welcome() {
        System.out.println("Welcome to our calculator!");
    }

    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    public static void devide(int a, int b) {
        System.out.println(a / b);
    }
}
