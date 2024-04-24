/*9. Crea un programa que vaia pedindo doubles por teclado e os vaia gardando nun ficheiro. */

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio9 {   
 public static void main(String[] args) {
        escribirDouble();
    }
    //Uso de recursos e excepcións clásica sen try with resources
    private static void escribirDouble() {
            
        Scanner sc = new Scanner(System.in);                                                                      
        FileOutputStream fos = null;
        DataOutputStream salida = null;
        double n;
        try {
            fos = new FileOutputStream("datos.dat");
            salida = new DataOutputStream(fos);
            System.out.print("Introduce número doble. -1 para rematar: ");
            n = sc.nextDouble();
            while (n != -1) {
                salida.writeDouble(n); //Escrébese o número doble no ficheiro                                   
                System.out.print("Introduce número doble. -1 para rematar: ");
                n = sc.nextDouble();
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