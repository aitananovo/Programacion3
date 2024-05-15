/*Modifica o exercicio anterior para que as ventás modifiquen o tamaño cada dúas veces que son activadas. 
Cando cheguen a 700 x 650, reduciran o tamaño en 50 pixels tanto para o ancho como para o alto, Só ata o
seu tamaño orixinal de 300 x 250. Despois deberán volver incrementar o seu tamaño, tamén cada dúas veces. */

package Exer4;
import java.awt.event.WindowAdapter;
import java.awt.event.*;
import javax.swing.JFrame;

public class ModificableFrames2 extends JFrame {

    private int contador = 0;
    private boolean incrementando = true;

    public ModificableFrames2(String titulo){
        setTitle(titulo);
        setSize(300,250);
        addWindowListener(new OListener());
    }

    private class OListener extends WindowAdapter{
        public void windowActivated(WindowEvent e){
            if (contador % 2 == 0) {
                if(incrementando){
                    if(getWidth() < 700 && getHeight() < 650){
                        setSize(getWidth() + 50, getHeight() + 50);
                    }else{
                        incrementando = false;
                    } 
                } else {
                    if(getWidth() > 300 && getHeight() > 250){
                        setSize(getWidth() - 50, getHeight() - 50);
                    } else{
                        incrementando = true;
                    }
                } 
            }
        }

        public void windowClosing(WindowEvent e){
            System.out.println("Saín. Finalizado");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        ModificableFrames2 frame1 = new ModificableFrames2("Clica para modificar o frame número 1");
        ModificableFrames2 frame2 = new ModificableFrames2("Clica para modificar o frame número 2");

        frame1.setVisible(true);
        frame2.setVisible(true);


    }
}