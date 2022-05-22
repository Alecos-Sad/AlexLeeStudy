package Study;

import java.util.Scanner;

public class TryCatchEx {
    public static void main(String[] args) {

//        try {
//            int[] a = {4, 5, 1};
//            System.out.println(a[3]);
//        } catch (Exception e){
//            System.out.println("An exception happened!");
//        }

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Wat's your fav number?");

//        try {
//            int n = scan.nextInt();
//            System.out.println(n);
//        } catch (Exception e){
//            System.out.println("Sorry, please enter a number");
//        }

        try {
            int[] a = {4};
            System.out.println(a[1]);
        } catch (java.lang.NullPointerException e){
            System.out.println("Your array is null!");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Your index is out of bounds");
        } catch (Exception e){
            System.out.println("Something else went wrong!");
        }



    }
}
