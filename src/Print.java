public class Print {

    public static <T, X, Y> void printArray(T[] arr, X[] arr2, Y[] arr3){
        for (T i : arr){
            System.out.println(i);
        }
        for (X i : arr2){
            System.out.println(i);
        }
        for (Y i : arr3){
            System.out.println(i);
        }
        }
    }

