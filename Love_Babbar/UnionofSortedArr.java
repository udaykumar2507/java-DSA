
import java.util.*;
class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {   
        int i = 0;
        int j = 0;
        int prev = -1;
        ArrayList<Integer> list = new ArrayList<>();

        while (i < n && j < m) {
            if (a[i] < b[j]) {
                if (a[i] != prev) {
                    list.add(a[i]);
                    prev = a[i];
                }
                i++;
            } else if (b[j] < a[i]) {
                if (b[j] != prev) {
                    list.add(b[j]);
                    prev = b[j];
                }
                j++;
            } else {
                // a[i] is equal to b[j]
                if (a[i] != prev) {
                    list.add(a[i]);
                    prev = a[i];
                }
                i++;
                j++;
            }
        }

        // Add remaining elements from both arrays
        while (i < n) {
            if (a[i] != prev) {
                list.add(a[i]);
                prev = a[i];
            }
            i++;
        }

        while (j < m) {
            if (b[j] != prev) {
                list.add(b[j]);
                prev = b[j];
            }
            j++;
        }

        return list.size();
    }
}