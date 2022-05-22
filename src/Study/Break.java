package Study;

public class Break {

    public static void main(String[] args) {

        int count = 0;

        while (count < 3){
            System.out.println("Hi");
            count++;
            break;
        }
        System.out.println("==============");

        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == 30){
                break;
            }
            System.out.println(numbers[i]);
        }

        System.out.println("==============");

        int i = 1;

        switch (i){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One!");
                break;
            default:
                System.out.println("WTF man?");
                break;
        }

        System.out.println("===============");

        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 3; k++) {
                System.out.println(j + " , " + k );
                break;
            }
        }
    }


}
