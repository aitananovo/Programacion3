package Exer1;
import javax.swing.*;


import java.awt.event.*;

class Oframe extends JFrame {
    private int contador = 0;

    public Oframe(){
        setTitle("Titulo");
        setSize(300,200);
        addWindowListener(new OListener());
    }

    class OListener extends WindowAdapter{
        public void windowIconified(WindowEvent e){
            contador++;
            setTitle("Minimizada " + contador + " veces");
        }

        public void windowClosing(WindowEvent e){
            System.out.println("SAIN. FINALIZANDO ");
            System.exit(0);
        }
    }
}


public class Main{
    public static void main (String[] args){
        Oframe meuframe = new Oframe();
        meuframe.setVisible(true);
    }
}