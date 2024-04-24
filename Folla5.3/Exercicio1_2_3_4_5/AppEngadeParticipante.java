package Exercicio1_2_3_4_5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class AppEngadeParticipante {

    public static void main(String[] args) {
        Participante participante2 = null;
        String nomeParticipante;
        String apelidosParticipante;
        int idadeParticipante;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce o nome do participante");
        nomeParticipante = entrada.nextLine();

        System.out.println("Introduce os apelidos do participante");
        apelidosParticipante = entrada.nextLine();

        System.out.println("Introduce a idade do participante");
        idadeParticipante = entrada.nextInt();
        entrada.nextLine(); //capturar o retorno

        participante2 = new Participante(nomeParticipante, apelidosParticipante, idadeParticipante);
        entrada.close();

        try (ParticipanteObjectOutputStream output = new ParticipanteObjectOutputStream(null)) {
            Files.newOutputStream(Paths.get("participantes.dat"),Stan
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    }
}