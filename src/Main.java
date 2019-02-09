import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Random;


public class Main {

    public static void main(String[] args){
        Random rand =  new Random();
        int numRand;
        try {
            String ruta = "../src/numeros.txt";
            File file = new File(ruta);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i=0;i<2999;i++) {
                numRand = rand.nextInt(5000);
                bw.write(String.valueOf(numRand) + " ");
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    }




