/* Java.io
1. Comproba que funciona o primeiro exemplo de lectura/escritura de ficheiros binarios.
2. Modifica a primeira parte do exemplo para que vaia pedindo cadeas por teclado e se vaian
gardando nun ficheiro.
3. Le o ficheiro letra a letra e móstrao por pantalla.*/
    import java.io.File;
    import java.io.FileInputStream;
    import java.io.FileNotFoundException;
    import java.io.FileOutputStream;
    import java.io.IOException;
    import java.util.Scanner;

    public class Exercicio1 {
    public static void main(String[] args) {
        //Obtemos o directorio home do sistema onde se almacenará o ficheiro
        String directory = ".";
        String fileName = "sample.txt";
        String absolutePath = directory + File.separator + fileName;
        // escritura do ficheiro
        try(FileOutputStream fileOutputStream = new FileOutputStream(absolutePath)) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Introduce unha cadea de texto, 'sair' para terminar o programa");
            while (true) {
                String cadea = entrada.nextLine();
                if (cadea.equalsIgnoreCase("sair")) {
                    break;
                }
                
            //almacenamento de bytes
            fileOutputStream.write(cadea.getBytes());
            fileOutputStream.flush(); //Forzamos o gardado
            entrada.close();
            }
            System.out.println("cadeas gardadas");
            

        } catch (FileNotFoundException e) {
            System.err.println("Ficheiro non encontrado");
        } catch (IOException e) {
            System.err.println("Error na E/S");
        }
        
        // lendo o ficheiro
        try(FileInputStream fileInputStream = new FileInputStream(absolutePath)) {
            int ch = fileInputStream.read();
            //ata a fin do stream (ficheiro), imos mostrando letra a letra
            while(ch != -1) {
                System.out.print((char)ch);
                ch = fileInputStream.read();
            }
        } catch (FileNotFoundException e) {
            System.err.println("Ficheiro non encontrado");
        } catch (IOException e) {
            System.err.println("Error na E/S");
        }
        
    }

        
}


    