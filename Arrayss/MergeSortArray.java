package Arrayss;

//Quetion for the below Answer : https://leetcode.com/problems/merge-sorted-array/description/
public class MergeSortArray {

    public static int[] mergearray(int[] nums1, int m, int[] nums2, int n) {
        int p = m - 1, q = n - 1, cur = m + n - 1;

        while (p >= 0 && q >= 0) {
            int a = nums1[p], b = nums2[q];
            int greater = -1;
            if (a >= b) {
                nums1[cur] = a;
                p--;
            } else if (a < b) {
                nums1[cur] = b;
                q--;
            }
            cur--;

        }
        while (q >= 0 && cur == q) {
            int b = nums2[q];
            nums1[cur] = b;
            cur--;
            q--;
        }

        return nums1;
    }

    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 0, 0, 0 };
        int[] arr2 = { 2, 5, 6 };
        int m = 3;
        int n = 3;

        int[] sol = mergearray(arr1, m, arr2, n);

        for (int i : sol) {
            System.out.print(i + " ,");
        }

    }

}
