package sort;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
public class SortHelper {
    private static final ThreadLocalRandom random = ThreadLocalRandom.current();
    public static int[] generateRandomArray(int n,int left,int right){
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(left,right);
        }
        return arr;
    }
    public static int[] generateSortedArray(int n,int times){
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
           arr[i] = i;
        }
        for (int i = 0; i < times; i++) {
            int a = random.nextInt(n);
            int b = random.nextInt(n);
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
        return arr;
    }
    public static void testSort(String sortName,int[] arr){
        Class<SevenSort> cls = SevenSort.class;
        try {
            Method method = cls.getDeclaredMethod(sortName,int[].class);
            long start = System.nanoTime();
            try {
                method.invoke(null,arr);
                Long end = System.nanoTime();
                if(isSorted(arr)){
                    System.out.println(sortName+"排序结束,共耗时"+(end-start)/1000000.0+"ms");
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
    public static int[] arrCopy(int[] arr){
        return Arrays.copyOf(arr,arr.length);
    }
    public static boolean isSorted(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                System.out.println("sort error");
                return false;
            }
        }
        return true;
    }
}
