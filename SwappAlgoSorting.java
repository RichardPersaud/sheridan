package sheridan;
import java.util.*;
public class SwappAlgoSorting{
    
    
    public static void main(String[] args){
        
        int[] a = {9 ,3, 6, -1};
        System.out.print("Before Sorting: ");
        System.out.println(Arrays.toString(a));
        
        boolean swapped; // Swap flag
        do {
            swapped = false;
            for (int i = 1; i < a.length; i++) {
// Check if we need to swap
                if (a[i-1] > a[i]) {
// Swap two array elements
                    int c = a[i];
                    a[i] = a[i-1];
                    a[i-1] = c;
                    swapped = true; // Show that swap occurred
                }
            }
        } while (swapped);
        
        System.out.print("After Sorting: ");
        System.out.print(Arrays.toString(a));
    }
}