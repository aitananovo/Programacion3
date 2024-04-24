package Exercicio6;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AppBicicleta {

    public static void main(String[] args) {
        Bicicleta bicicleta1 = new Bicicleta("Yamaaa", "azul");
        Bicicleta bicicleta2 = new Bicicleta("BMW", "rojo");

        Ciclista ciclista1 = new Ciclista("Pedro", bicicleta1);
        Ciclista ciclista2 = new Ciclista("Sandra", bicicleta2);

        Ciclista[] ciclistas = {ciclista1, ciclista2};

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ciclistas.dat"))) {
            for (Ciclista ciclista : ciclistas) {
                oos.writeObject(ciclista);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ciclistas.dat"))) {
            Object obj;
            while ((obj = ois.readObject()) != null) {
                System.out.println(obj);
            }
        } catch (EOFException e) {
            System.out.println("Fin do ficheiro");

        } catch(IOException e){
            e.printStackTrace();

        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}