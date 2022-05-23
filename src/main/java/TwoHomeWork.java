public class TwoHomeWork {
    public static void main(String[] args) {
        sumOfTwoNumbers(20,10);
        positivOrNegativeNamber(-20);
        positivOrNegativeBoolean(20);
        printStringAndNumber(10,3);
    }

    private static boolean sumOfTwoNumbers(int a, int b) {
        int result = a + b;
        if (result < 10){
            System.out.println("false"); // самопроверка
            return false;
        } else if (result > 20){
            System.out.println("false"); // самопроверка
            return false;
        }else {
            System.out.println("true"); // самопроверка
            return true;
        }
    }

    private static void positivOrNegativeNamber(int num) {
        String strPattern = "Number" + num + ":";
        if (num >= 0){
            strPattern += "positive";
        }else {
            strPattern += "negative";
        }
        System.out.println(strPattern);
    }

    private static boolean positivOrNegativeBoolean(int num) {
        if (num > 0){
            System.out.println("false");
            return false;
        }else {
            System.out.println("true");
            return true;
        }
    }

    private static void printStringAndNumber(int str, int n) {
        for (int i = 0; i < n; i++){
            System.out.println(str);
        }
        System.out.println();
    }
}
}
