package Exercicio7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class AppProducto {
    private static ArrayList<Producto> productos = new ArrayList<>();
    public static void main(String[] args) {
        cargarProductos();
        Scanner entrada = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("1. ver todos os produtos");
            System.out.println("2. introducir un produto novo");
            System.out.println("3. sair");
            System.out.println("Escolle unha opción");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    verproducto();
                    break;

                case 2:
                    engadirProducto();
                    break;
                
                case 3:
                    System.out.println("Chao!");
                    break;

                default:
                    System.out.println("OPCIÓN NON VÁLIDA");
                    break;
            }
            
        } while (opcion != 3);
    }

    public static void cargarProductos(){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("produtos.dat"))) {
            productos = (ArrayList<Producto>) ois.readObject();
        } catch (FileNotFoundException e) {
           System.out.println("ERROR, NON SE ATOPOU O ARCHIVO");
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void gardarProductos(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("produtos.dat"))) {
            oos.writeObject(productos);
        } catch  (IOException e){
            e.printStackTrace();
        }
    }

    public static void verproducto(){
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public static void engadirProducto(){
        Scanner sc = new Scanner(System.in);

        System.out.println("      NEW PRODUCT");
        System.out.println("--------------------------");
        System.out.println("Introduce o nome do producto");
        String nome = sc.nextLine();

        System.out.println("Introduce a marca");
        String marca = sc.nextLine();

        System.out.println("Introduce o tipo");
        String tipo = sc.nextLine();

        System.out.println("Introduce o prezo");
        int prezo = sc.nextInt();

        Producto producto1 = new Producto(nome, marca, tipo, prezo);
        productos.add(producto1);
        gardarProductos();
        System.out.println("PRODUCTOS GARDADOS CORRECTAMENTE");
    }
}