import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Numeros num = new Numeros();
        Scanner sc =  new Scanner(System.in);
        System.out.println("Eleija la cantidad de datos a ordenar : ");
        System.out.println("1.100\n2.500\n3.1000\n4.2000\n5.3000");
        int op = sc.nextInt();
        switch (op){
            //ordenar 100 numeros
            case 1:  num.crearNumeros(100); break;
            case 2:  num.crearNumeros(500); break;
            case 3:  num.crearNumeros(1000); break;
            case 4:  num.crearNumeros(2000); break;
            case 5:  num.crearNumeros(3000); break;
        }
        String[] numbers = num.leerNumeros().split(" ");
        Comparable[] valNumbers = new Comparable[numbers.length];
        for(int i=0;i<numbers.length;i++){
            valNumbers[i] =Integer.parseInt(numbers[i]);

        }
        System.out.println("Gnome Sort");
        GnomeSort.gnomeSort(valNumbers,valNumbers.length-1);
        System.out.println("Merge Sort");
        MergeSort.sort(valNumbers,0,valNumbers.length-1);
        System.out.println("Quick Sort");
        QuickSort.quickSort(valNumbers,0, valNumbers.length-1);
        System.out.println("Radix Sort");
        Radix.radixsort(valNumbers,valNumbers.length);
        System.out.println("Selection Sort");
        //GnomeSort.gnomeSort(valNumbers, valNumbers.length-1);
    }

    }

