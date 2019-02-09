/*
 * Roberto Figueroa , Steven Chan
 * SelectionSort class : Ordenamiento de numeros por algoritmo Selection
 * Extraído de : https://www.geeksforgeeks.org/selection-sort/
 * */


class SelectionSort
{
    static void sort(Comparable arr[]) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array 
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j].compareTo(arr[min_idx]) == -1)
                    min_idx = j;

            // Swap the found minimum element with the first 
            // element 
            int temp = (int)arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

    }

}