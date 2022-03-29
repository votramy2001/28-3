package MergeSort;

import java.util.Arrays;

class mergeSort {

    public mergeSort() {

    }

    public int[] merge(int[] a1, int[] a2) {
        int n = a1.length + a2.length;
        int[] result = new int[n];

        int i = 0, i1 = 0, i2 = 0;
        while (i < n) {
            if (i1 < a1.length && i2 < a2.length) {
                if (a1[i1] <= a2[i2]) {
                    result[i] = a1[i1];
                    i++;
                    i1++;
                }
                else {
                    result[i] = a2[i2];
                    i++;
                    i2++;

                }
            }
            else {
                if (i1 < a1.length) {
                    result[i] = a1[i1];
                    i++;
                    i1++;
                } else {
                    result[i] = a2[i2];
                    i++;
                    i2++;

                }

            }
        }
        return result;
    }
    public int[] mergeSort(int a[], int Left , int Right){
        if (Left > Right)
            return new int[0];
        if ( Left == Right) {
            int[] singleE = {a[Left]};
            return singleE;
        }


        int k = (Left+Right)/2;
        int a1[]= mergeSort(a, Left , k);
        int a2[]= mergeSort(a, k+1 , Right);


        int[] result = merge(a1, a2);
        return result;

    }
    public int[] sortArray(int[] numbers){
        return mergeSort(numbers, 0 , numbers.length-1);
    }
    public static void main(String[] args){
        mergeSort S = new mergeSort();
        int[] c ={4,8,7,9,2};
        System.out.println(Arrays.toString(S.mergeSort(c,0, c.length-1)));

    }

}
