/* Como ves non é preciso que o rato estea dentro da ventá para que se executen os eventos de teclado. 
Fai un programa que para un frame altere o seu tamaño cando se pulse unha tecla, cambiando o tamaño entre
300 x 200 e 500 x 300, só cando o rato estea dentro da ventá. Podes empregar un atributo booleano “ratoDentro”
que vale true ou false dependendo se o rato está dentro da ventá, empregando ese valor no Listener do evento
das teclas.*/

package Exer7;

import javax.swing.*;

import java.awt.event.*;

public class Main7 extends JFrame{
    private boolean ratoDentro = false;
    
    public Main7(){
        setTitle("Ventá interactiva");
        setSize(300, 200);
        
        addKeyListener(new KeyPressListener());
        addMouseListener(new MouseEnterListener());
    }


    private class MouseEnterListener extends MouseAdapter {
        @Override 
        public void mouseEntered(MouseEvent e){
            ratoDentro = true;
        }

        @Override
        public void mouseExited(MouseEvent e){
            ratoDentro = false;
        }
    }

    private class KeyPressListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e){
            if (ratoDentro) {
                if (getWidth() == 300 && getHeight() == 200) {
                    setSize(500, 300);
                } else {
                    setSize(300, 200);
                }
            }
        }
        
    }

    public static void main(String[] args) {
        Main7 frame = new Main7();
        frame.setVisible(true);

    }

    private class OListener extends WindowAdapter{
        public void windowClosing(WindowEvent e){
            System.out.println("Saín. Finalizado");
            System.exit(0);
        }
    }
}