/*Modifica o exercicio anterior para que a mensaxe sexa distinta cando se mantén pulsada e cando
se libere a tecla. */

package Exer6;

import javax.swing.*;

import java.awt.event.*;

public class Main6 extends JFrame{
    public Main6(){

        setTitle("Ventá inactiva");
        setSize(300, 200);


        addWindowListener(new WindowFocusListener());
        addKeyListener(new KeyPressListener());
        addMouseListener(new MouseEnterListener());

    }

    private class WindowFocusListener extends WindowAdapter {
        @Override
        public void windowGainedFocus(WindowEvent e ){
            setTitle("Ventá activa");
        }

        @Override 
        public void windowLostFocus(WindowEvent e ){
            setTitle("Ventá inactiva");
        }
        
    }

    private class KeyPressListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e){
            setTitle("Tecla premida");
        }

        @Override 
        public void keyReleased(KeyEvent e){
            setTitle("Tecla soltada");
        }  
        
    }

    private class MouseEnterListener extends MouseAdapter {
        @Override
        public void mouseEntered(MouseEvent e){
            setTitle("Rato na ventá");
        }
        
    }
    

    public static void main(String[] args) {

        Main6 frame = new Main6();
        frame.setVisible(true);

       
    }

    private class OListener extends WindowAdapter{
        public void windowClosing(WindowEvent e){
            System.out.println("Saín. Finalizado");
            System.exit(0);
        }
        }

}