/*11. Queremos gardar nun ficheiro carreira.bin unha serie de resultado dunha carreira, formado
por dorsal (int) e tempo (double). Pide por teclado o dorsal e tempo de 5 corredores e gárdao
nun ficheiro binario. */

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio11 {   
 public static void main(String[] args) {
        escribirDorsalETempo();
    }
    //Uso de recursos e excepcións clásica sen try with resources
    private static void escribirDorsalETempo() {
        Scanner sc = new Scanner(System.in);                                                                      
        FileOutputStream fos = null;
        DataOutputStream salida = null;
        int dorsal;
        double tempo;

        try {
             
            fos = new FileOutputStream("carreira.bin");
            salida = new DataOutputStream(fos);
            
            for (int i = 0; i < 5; i++) {
  
                System.out.print("Introduce o número do dorsal (enteiro): ");
                dorsal = sc.nextInt();
                salida.writeInt(dorsal);                               

                System.out.print("Introduce o número do tempo (decimal): ");
                tempo = sc.nextDouble();
                salida.writeDouble(tempo);   
            
            }           
            sc.close();                   

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (salida != null) {
                    salida.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());                                                               
            }
       }}
}