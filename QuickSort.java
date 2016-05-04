/**
 * Created by user on 04.05.2016.
 */
public class QuickSort {
    public static void quickSort(String[] x, int st, int dr){
        int i,j;
        String aux,pivot;

        // index for the "left-to-right"
        i=st;
        // index for the "right-to-left"
        j=dr;
        // The pivot point is set to the first element in the array.
        pivot=x[i];

        // Scan between the two indexes, until they meet.
        while(i < j) {
            while (i < j && x[j].compareTo(pivot)>=0)
                j--;
            swap(x, i, j);

            while (i < j && x[i].compareTo(pivot)<=0)
                i++;
            swap(x, j, i);
        }
        aux=x[i];
        x[i]=pivot;
        pivot=aux;
        if(st < i-1)
            // sort left partition
            quickSort(x,st,i-1);
        if(i+1 < dr)
            // sort left partition
            quickSort(x,i+1,dr);
    }
    public static void swap(String[] a, int i, int j) {
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    public static void main(String[] args){
        String[] array = new String[5];
        array[0] = "Zaharia";
        array[1] = "Maria";
        array[2] = "Maria";
        array[3] = "Ana";
        array[4] = "Alina";

        QuickSort.quickSort(array, 0, array.length - 1);
        System.out.println("QuickSort:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t\t");
            System.out.println(array[i]);
        }
    }
}
