/*1.Crea unha clase Participante con nome, apelidos, e idade, que sexa serializable. Fai un programa que pida 3
participantes, e os grave un a un nun ficheiro binario participantes.dat, empregando serialización. */

/*2.Le a continuación o ficheiro creado no exercicio anterior, lendo un a un cada participante e mostrando os datos
gardados no ficheiro. */
package Exercicio1_2_3_4_5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class AppParticipante {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("participantes.dat"))){
            for (int i = 0; i < 3; i++) {

                System.out.println("Introduce o nome do participante nº" + (i+1) + " :");
                String nome = sc.nextLine();
                

                System.out.println("Introduce os apelidos do participante nº" + (i+1) + " :");
                String apelidos = sc.nextLine();

                System.out.println("Introduce a idade do participante nº" + (i+1) + " :");  
                int idade = sc.nextInt();
                sc.nextLine();

                Participante participante = new Participante(nome, apelidos, idade);
                out.writeObject(participante);

            }

        } catch(IOException e){
            e.printStackTrace();
        }

        /*EXERCICIO 2 */

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("participantes.dat"))){
           
            for (int i = 0; i < 3; i++) {
                Participante participante = (Participante)in.readObject();
                System.out.println("participante " + (i+1));
                System.out.println("Nome " + participante.getNome());
                System.out.println("Apelidos " + participante.getApelidos());
                System.out.println("Idade " + participante.getIdade()); 
                System.out.println();
            }
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}