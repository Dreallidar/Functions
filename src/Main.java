public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("~~~~Task 1~~~~");
        result(4, 12);
        result(6, 8);
        //  System.out.println(9.8596);
        System.out.println("~~~~ Task 2~~~~~");
        System.out.println(PISq());
        double resDobel = PISq();
        System.out.println(resDobel);
        System.out.println("~~~Task 3~~~~~~~");
        System.out.println(daugyba(15, 16));
        System.out.println("~~~~~~  Task 4~~~~~~");
        int[] arr = {1, 1, 1, 1, 1, 1, 1};
        printArr(arr);
        System.out.println("~~~~~~~ Task 5~~~~~~~~~");
        System.out.println(rngInt(50, 300));

    }

    public static void result(int a, int b) {

        System.out.println(a + b);

    }

    public static double PISq() {
        return 9.8596;
    }


    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


    }

    public static int daugyba(int a, int b) {

        return a * b;
    }


    public static int rngInt(int min, int max) {
        int generate = (int) (min + (Math.random() * (max - min)));
        return generate;
    }
    public static int[] rngArr (int min, int max,int length) {
        printArr(); = rngInt(min, max))
        ;

        return 0;


    }


}