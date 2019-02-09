/*
 * Extraido de: https://www.geeksforgeeks.org/bubble-sort/
 * */

public class GnomeSort {
    static Comparable[] gnomeSort(Comparable arr[], int n)
    {
        int index = 0;

        while (index < n) {
            if (index == 0)
                index++;

            if (arr[index].compareTo(arr[index-1]) == 1 || arr[index].compareTo(arr[index-1]) == 0 )
                index++;
            else {
                int temp = 0;
                temp = (int)arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
        }
        return arr;
    }
}
