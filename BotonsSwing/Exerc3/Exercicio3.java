/*Programa que xera números enteiros aleatorios entre 0 e 100. Para xerar un número aleatorio podes empregar o método java.lang.Math.random( ), que devolve un double entre 
0.0 e 1.0. Pon un botón que ao ser premido produza o número aleatorio que se debe mostrar nunha etiqueta. Terás que empregar na etiqueta o método setText(oStringQueSexa). */

package Exerc3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exercicio3 extends JFrame {
    private JLabel etiquetaNumeros;

    public Exercicio3(){
        setTitle("Xerar números aleatorios");
        setSize(300, 200);
        setLayout(new FlowLayout());

        etiquetaNumeros = new JLabel("Número aleatorio: 0");
        JButton btnXerar = new JButton("Xerar un número aleatorio");
        

        btnXerar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e ){
                int numeroAleatorio = (int)(Math.random()*101);
                etiquetaNumeros.setText("Numero aleatorio: " + numeroAleatorio);
            }
        });

        add(etiquetaNumeros);
        add(btnXerar);
    }

    public static void main(String[] args) {
        Exercicio3 frame = new Exercicio3();
        frame.setVisible(true);
    }
    
    private class  OListener extends  WindowAdapter{
        public void windowClosing(WindowEvent e){
            System.out.println("Sain, finalizado");
            System.exit(0);
        }
    }
}