package Exer2;
import javax.swing.*;
import java.awt.event.*;

class Oframe extends JFrame {
    private int contador = 0;
    private final String[] numeros = {"unha", "dúas", "tres", "catro", "cinco", "seis", "sete", "oito", "nove", "dez"};

    public Oframe(){
        setTitle("Titulo");
        setSize(300,200);
        addWindowListener(new OListener());
    }

    class OListener extends WindowAdapter{
        public void windowIconified(WindowEvent e){
            if (contador < 10) {
                contador ++;
                setTitle("Modificada " + numeros[contador-1]);
            } 
        }

        public void windowClosing(WindowEvent e){
            System.out.println("SAaaaaaaIN. FINALIZANDO ");
            System.exit(0);
        }
    }
}


public class Main2{
    public static void main (String[] args){
        Oframe meuframe = new Oframe();
        meuframe.setVisible(true);
    }
}