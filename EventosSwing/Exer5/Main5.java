/*Fai un programa que nun frame mostre no título unha mensaxe cando se preme unha tecla co frame como ventá activa, e outro
 diferente cando o rato entra no espacio da ventá. A túas clases Listener deberán ser subclases de WindowAdapter, de KeyAdapter
  e de MouseAdapter. */
package Exer5;

import javax.swing.*;

import java.awt.event.*;

public class Main5 extends JFrame{
    public Main5(){
        setTitle("Ventá inactiva");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

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
        
    }

    private class MouseEnterListener extends MouseAdapter {
        @Override
        public void mouseEntered(MouseEvent e){
            setTitle("Rato na ventá");
        }
        
    }

    public static void main(String[] args) {

        Main5 frame = new Main5();
        frame.setVisible(true);

       
    }
       
    private class OListener extends WindowAdapter{
    public void windowClosing(WindowEvent e){
        System.out.println("Saín. Finalizado");
        System.exit(0);
    }
    }
    
}