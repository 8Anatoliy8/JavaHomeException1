//public class Main {
//    public static void main(String[] args) {
//        String [] strings = {"10", "20", "30", "10"};
//        System.out.println(convertAndSum(strings));
//    }
//    public static int convertAndSum (String [] array){
//        int sum = 0;
//        for (String s : array) {
//            try{
//                sum += Integer.parseInt(s);
//            }catch (NumberFormatException e){
//                throw new NumberFormatException("Ошибка преобразования строки в число");
//            }
//        }
//        if (sum > 100){
//            throw new ArithmeticException("Превышен лимит суммы");
//        }
//        return sum;
//    }
//}








//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        int [] arr1 = {1, 2, 3, 4, 5};
//        int [] arr2 = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(mergeAndValidateArrays(arr1, arr2)));
//    }
//    public static int [] mergeAndValidateArrays(int[] arr1, int[] arr2) {
//        if (arr1.length != arr2.length) {
//            throw new IllegalArgumentException("Длины массивов не равны");
//        }
//        int [] result = new int[arr1.length + arr2.length];
//        System.arraycopy(arr1, 0, result, 0, arr1.length);
//        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
//        for (int num : result) {
//            if (num < 0){
//                throw new RuntimeException("Есть отрицательное число");
//            }
//        }
//        return result;
//    }
//}






//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        int [] arr1 = {1,2,3,4,5};
//        int [] arr2 = {0,1,2,3,4};
//        System.out.println(Arrays.toString(subArraysWithExceptionHandling(arr1, arr2)));
//    }
//    public static int [] subArraysWithExceptionHandling (int [] arr1, int [] arr2){
//        if (arr1.length != arr2.length){
//            throw new IllegalArgumentException("Длины массивов не совпадают");
//        }
//        int [] result = new int[arr1.length];
//        for (int i = 0; i < arr1.length; i++){
//            result[i] = arr1[i] - arr2[i];
//            if (result[i] < 0){
//                throw new RuntimeException("Разность отрицательная");
//            }
//        }
//        return result;
//    }
//}






import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "cherry", "date"};
        String target = "banana";
        String replacement = "orange";
        System.out.println(Arrays.toString(findAndReplace(strings, target, replacement)));
    }
    public static String[] findAndReplace(String[] strings, String
            target, String replacement) {
        boolean found = false;
        String[] result = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(target)) {
                result[i] = replacement;
                found = true;
            } else {
                result[i] = strings[i];
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
        return result;
    }
}