/* -Busca todas as palabras que comezan por “cas”
-Pide unha palabra por teclado e comproba se está no lemario
-Pide unha palabra por teclado e comproba se está no lemario
-Pide unha terminación por teclado e mostra as palabras do lemario con esa terminación.
-Pide unha letra e indica (non mostra) o número de palabras do lemario que empeza por esa letra */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class LerFilter {        
    public static void main(String[] args) throws IOException {      
        Scanner entrada = new Scanner(System.in);
        //Exemplos do uso do filter     
        try (List<String> lemario = Files.readAllLines(Paths.get("LemarioCast.txt")) )   {
           List<String> palabrasConCas = lemario.stream().filter(palabra -> palabra.startsWith("cas")).collect(Collectors.toList());
    
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("Introduce unha palabra");
        String palabra = entrada.nextLine();

        if ((Path.of("LemarioCast.txt")).contains(palabra)) {
            
        } else {
            
        }
                   
    
            

         
}}