/*Fai un programa con unha ventá na que se mostran 2 botóns, un que poña “Pechar” e outro “Minimízame”. Cando se pulse “Pechar” a ventá debe pecharse. 
Cando “Minimízame” debe minimizarse. (Mira a axuda do método setExtendedState() de JFrame, herdado de Frame) */


package Exerc2;

import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.*;

public class Exercicio2 extends JFrame{

    public Exercicio2(){
        setTitle("Ventana con botons");
        setSize(300, 200);
        setLayout(new FlowLayout());

        JButton btnPechar = new JButton("Pechar");
        btnPechar.setBounds(10, 20, 20, 40);
        JButton btnMiniminzar = new JButton("Minimizar");
        btnMiniminzar.setBounds(50, 70, 20, 40);

        btnPechar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });

        btnMiniminzar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                setExtendedState(JFrame.ICONIFIED);
            }
        });

        add(btnPechar);
        add(btnMiniminzar);
        
      
    }

    public static void main(String[] args) {
        Exercicio2 frame = new Exercicio2();
        frame.setVisible(true);

    }

    private class OListener extends WindowAdapter{
        public void windowClosing(WindowEvent e){
            System.out.println("Saín. Finalizado");
            System.exit(0);
        }
    }


} 