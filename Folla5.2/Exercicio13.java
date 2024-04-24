/*13. Despois de ler o ficheiro carreira.bin nun ArrayList, o programa deberá preguntar se queremos
gardar máis tempos, e se é así, gardar todos (os que xa había e os novos) no ficheiro.
Comproba co código do exercicio anterior que os novos tempos están gardados no ficheiro */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Exercicio13 {

    public static void main(String[] args) {
        lerDorsalETempo();
    }

    public static void lerDorsalETempo() {
        FileInputStream fis = null;
        DataInputStream entrada = null;

        List <Integer> dorsais = new ArrayList<>();
        List <Double> tempos = new ArrayList<>();

        try {

            fis = new FileInputStream("carreira.bin");
            entrada = new DataInputStream(fis);

            while (true) {
                int dorsal = entrada.readInt();
                System.out.println("Dorsal: " + dorsal);
                dorsais.add(dorsal);

                double tempo = entrada.readDouble();
                System.out.println("Tempo: " + tempo);
                tempos.add(tempo);

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

        Scanner sc = new Scanner(System.in);
        System.out.println("Desexa garadar máis tempos? (si/no)");
        String resposta = sc.nextLine();

        if (resposta.equals("si")) {
            System.out.println("Ingresa o tempo: ");
            double novoTempo = sc.nextDouble();
            tempos.add(novoTempo);
            gardarDatosEnArchivo(tempos, dorsais);
        }
        sc.close();
    }

    public static void gardarDatosEnArchivo(List<Double> tempos, List<Integer> dorsais){
        try (DataOutputStream saida = new DataOutputStream(new FileOutputStream("carreira.bin"))){
            for (int i = 0; i < dorsais.size(); i++) {
                saida.writeInt(dorsais.get(i));
                saida.writeDouble(tempos.get(i));
            }
            System.out.println("Datos gardados");

        } catch(IOException e){
            System.out.println("ERROR AO GARDAR" + e.getMessage());
        }
    }
}