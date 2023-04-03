

public class Main3_1 {
    public static void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }

    }
    public static void split(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        split(l, mid);
        split(r, n - mid);
        merge(a, l, r, mid, n - mid);
        String res = "";
        for (int t = 0; t < a.length; t++) {
            res = res + Integer.toString(a[t]) + " ";
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        //int len = (int) (Math.random() * 10);
        int[] array = new int[10];
        String sarray = "";
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 12));
            sarray = sarray + Integer.toString(array[i]) + " ";
        }
        System.out.println(sarray);
        split(array, 10);
    }
}
