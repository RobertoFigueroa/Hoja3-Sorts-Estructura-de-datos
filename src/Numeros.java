import java.io.*;
import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class Numeros {

    public void crearNumeros(int cantidad) {
        Random rand = new Random();
        int numRand;
        // en esta sección se crea un nuevo archivo .txt con 3000 numero ranfom
        try {
            String ruta = "../src/numeros.txt";
            File file = new File(ruta);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < cantidad; i++) {
                numRand = rand.nextInt(5000);
                bw.write(String.valueOf(numRand) + " ");
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String leerNumeros() {
        String line = "";
        try {

            Scanner input = new Scanner(new File("C:\\Users\\rober\\OneDrive\\Documentos\\GitHub\\Hoja3-Sorts-Estructura-de-datos\\src\\numeros.txt"));
            while (input.hasNextLine()) {
                line = input.nextLine();
                System.out.println(line);
            }
            input.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return line;
    }
}