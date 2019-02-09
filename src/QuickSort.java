/*
 * Roberto Figueroa , Steven Chan
 * QuickSort class : Ordenamiento de numeros por algoritmo QuickSort
 * Extraído de : https://es.stackoverflow.com/questions/7836/c%C3%B3mo-funciona-el-algoritmo-de-quicksort
 * */


import java.util.Random;

public class QuickSort{

     static Comparable[] quickSort(Comparable[] vector, int izquierda, int derecha) {
        int pivote = (int)vector[izquierda];
        int i = izquierda;
        int j = derecha;
        int auxIntercambio;
        while (i < j) {
                    //vector[i].compareTo(pivote) == 0 || vector[i].compareTo(pivote) == 1
            while ((vector[i].compareTo(pivote) == 0 || vector[i].compareTo(pivote) == -1) && i < j) {
                i++;
            }
            while (vector[j].compareTo(pivote) == 1) {
                j--;
            }
            if (i < j) {
                auxIntercambio = (int)vector[i];
                vector[i] = vector[j];
                vector[j] = auxIntercambio;
            }
        }
        vector[izquierda] = vector[j];
        vector[j] = pivote;
        if (izquierda < j - 1) {
            quickSort(vector, izquierda, j - 1);
        }
        if (j + 1 < derecha) {
            quickSort(vector, j + 1, derecha);
        }
        return vector;
    }


}