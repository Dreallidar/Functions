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
        System.out.println("~~~~~~~Task 6~~~~~~~~~~~~");
        int[] arrayRandom = genRndArr(5, 15, 50);
        printArr(arrayRandom);

        System.out.println("~~~~~~~~~~~Task 7~~~~~~~~~~~");
        System.out.println(digestArraySum(arrayRandom));
        //   printArr(digestArraySum(genRndArr(10,20,20)));
        System.out.println("~~~~~~~~~~~Task 8~~~~~~~~~~");
        System.out.println(digestArrayAvg(arrayRandom));
        System.out.println("~~~~~~~~~~~~~Task 9~~~~~~~~~~~~~~");
        printRectangle(5, 4);

        System.out.println("~~~~~~~~~~Task 10~~~~~~~");
        String text = "as tai javai blet kaip deciau is kojos, tai maza nepasirodytu";
        spaceCounterInText(text);
        System.out.println("~~~~~~~~~~~~Task 11~~~~~~~");
        System.out.println(reverseString("Kur ejom mes su knysliuku, neklausinekit mus"));


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
        int generate = (int) (min + (Math.round(Math.random() * (max - min))));
        return generate;
    }

    public static int[] genRndArr(int min, int max, int length) {
        int[] arrayBody = new int[length];
        for (int i = 0; i < length; i++) {
            arrayBody[i] = rngInt(min, max);
        }
        return arrayBody;
    }

    public static int digestArraySum(int[] food) {
        int sum = 0;
        for (int i = 0; i < food.length; i++) {
            sum += food[i];

        }
        return sum;
    }

    public static double digestArrayAvg(int[] food) {
        int arrLength = food.length;
        double sum = digestArraySum(food);
        double avg = sum / arrLength;
        return avg;
    }

    public static void printRectangle(int outer, int inner) {

        for (int i = 0; i < outer; i++) {
            for (int j = 0; j <= inner; j++) {
                System.out.print(" * ");
            }
//            if (i <= 25)
            {
                System.out.println();
            }
        }
    }

    public static void spaceCounterInText(String sakinys) {
        int spaces = (sakinys.replaceAll("[^ ]", "").length());
        int symbols = (sakinys.length() - spaces);
        //  symbols = sakinys.replace(" ","").length();
        //   spaces = sakinys.length() - symbols;
        System.out.println("tarpu " + spaces + " raidziu " + symbols);
    }

    public static String reverseString(String input) {
        char[] inputArray = input.toCharArray();
        char[] reverseArray = new char[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
//            Apsukam masyvo elementus
            reverseArray[i] = inputArray[inputArray.length -1 -i];
        }
        String reversedString = new String(reverseArray);
        return reversedString;

    }






}