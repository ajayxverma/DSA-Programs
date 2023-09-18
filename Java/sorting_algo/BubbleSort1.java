package sorting_algo;

public class BubbleSort1 {
    public static int[] sort(int ary[]) {

        for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary.length - i - 1; j++) {
                if (ary[j] > ary[j + 1]) {
                    int temp = ary[j];
                    ary[j] = ary[j + 1];
                    ary[j + 1] = temp;
                }
            }
        }
        return ary;
    }

    public static void main(String[] args) {

        int ary[] = { 1, 7, 3, 6, 3, 8, 4, 9, 2 };

        System.out.println();
        int[] sol = sort(ary);
        for (int i : sol) {
            System.out.print(i + " ");

        }

    }
}
