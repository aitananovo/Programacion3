import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exercicio12 {
      public static void main(String[] args) {
          lerDorsalETempo();
    }

    public static void lerDorsalETempo(){
        FileInputStream fis = null;
        DataInputStream entrada = null;
        int dorsal;
        double tempo;

        try {

            fis = new FileInputStream("carreira.bin");
            entrada = new DataInputStream(fis);
            
            while (true) {   
                dorsal = entrada.readInt();                                           
                System.out.println("Dorsal: " + dorsal); 
   
                tempo = entrada.readDouble();                                           
                System.out.println("Tempo: " + tempo);  
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (EOFException e) {
            System.out.println("Fin de fichero");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());                                                               
            }
        }
    }}