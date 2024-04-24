/*Java.nio
4. Comproba que funciona o exemplo dos apuntes empregando a librería java.nio
5. Modifica o exemplo para que vaia gardando varios String tecleados por consola ata teclear “fin”.
Debes engadir un carácter separador, para poder ler as cadeas no exercicio seguinte.
6. Le o ficheiro anterior, e mostra os distintos String introducidos. Le todos os bytes dunha tacada e
logo separa os String empregando algunha función da clase String. */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Exercicio2 {
public static void main(String[] args) {
    String directory = ".";
    String fileName = "sample.txt";
    Path path = Paths.get(directory, fileName);
    try {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce unha cadea e 'fin' para sair");
        String cadea;
        
        while (!(cadea = entrada.nextLine()).equalsIgnoreCase("fin")) {

            Files.write(path, cadea.getBytes(), StandardOpenOption.TRUNCATE_EXISTING);
            Files.write(path, cadea.getBytes(), StandardOpenOption.APPEND);
            Files.write(path, ".".getBytes(), StandardOpenOption.APPEND);
        }

        System.out.println("Cadeas gardadas");
        entrada.close();
        
    } catch (IOException e) {
        System.err.println("Error na E/S");
    }
    try { 
        byte[] data = Files.readAllBytes(path);
        System.out.println(new String(data));
        } catch (IOException e) {
        System.err.println("Error na E/S");
        }
}
}