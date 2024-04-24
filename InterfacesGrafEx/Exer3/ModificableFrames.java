/*Fai un programa que abra 2 JFrames de 300 x 250, de título “Tamaño modificable”.
A túa clase deberá implementar a interface WindowListener. Os 2 frames deberán 
modificar o seu tamaño cada vez que son activadas, incrementando en 50 pixels
tanto o alto como o ancho. O tamaño máximo será 700 x 650. Cando se chegue ao 
tamaño máximo non modificarán máis o tamaño, 
mostrando no seu título unha mensaxe de que xa non o modifican. */

package Exer3;

import java.awt.event.WindowAdapter;
import java.awt.event.*;
import javax.swing.JFrame;

public class ModificableFrames extends JFrame {

    private int contador = 0;

    public ModificableFrames(String titulo){
        setTitle(titulo);
        setSize(300,250);
        addWindowListener(new OListener());
    }

    private class OListener extends WindowAdapter{
        public void windowActivated(WindowEvent e){
            if (contador < 8) {
                setSize(getWidth() + 50, getHeight() + 50);
                contador ++;
            } else {
                setTitle("Titulo non modificable máis veces");
            }
        }

        public void windowClosing(WindowEvent e){
            System.out.println("Saín. Finalizado");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        ModificableFrames frame1 = new ModificableFrames("Clica para modificar o número 1");
        ModificableFrames frame2 = new ModificableFrames("Clica para modificar o número 2");

        frame1.setVisible(true);
        frame2.setVisible(true);


    }
}