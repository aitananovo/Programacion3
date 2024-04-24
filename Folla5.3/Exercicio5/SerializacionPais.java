package Exercicio5;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializacionPais {

    public static void main(String[] args) {
        Pais[] paises = {
            new Pais("Letonia", 22222220),
            new Pais("España", 333330),
            new Pais("Francia", 044444444),
            new Pais("Letonia", 44455550)
        };

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("paises.dat"))) {
            for (Pais pais : paises) {
                oos.writeObject(pais);
            }
        
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("paises.dat"))) {
            Object obj;
            while ((obj = ois.readObject()) != null) {
                System.out.println(obj);
            }
        
        } catch (EOFException e) {
            System.out.println("Fin do ficheiro");
            //e.printStackTrace();

        } catch(IOException e){
            e.printStackTrace();

        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}