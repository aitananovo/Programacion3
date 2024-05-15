/*Programa que pregunte cál é a suma de dous números menores que 4, xerados aleatoriamente. O usuario deberá dar a resposta pulsando botóns con números do 0 ao 6. 
O que pulsa o usuario deberase ver nunha etiqueta. O programa deberá mostrar noutra etiqueta se o resultado é correcto ou incorrecto. */
package Exerc4;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Exercicio4 extends JFrame {

    private int numero1, numero2, respostaCorrecta;
    private JLabel etiquetaPregunta, etiquetaResposta, etiquetaResultado;
    private String respostaUsuario = "";

    public Exercicio4(){
        setTitle("Xogo números");
        setSize(500, 800);
        setLayout(new FlowLayout());

        numero1 = (int)(Math.random()*4);
        numero2 = (int)(Math.random()*4);
        respostaCorrecta = numero1 + numero2;

        etiquetaPregunta = new JLabel("Cal é a suma de " + numero1 + " + " + numero2 + " ? ");
        etiquetaResposta = new JLabel(respostaUsuario);
        etiquetaResultado = new JLabel("");

        add(etiquetaPregunta);
        add(etiquetaResposta);
        add(etiquetaResultado);

        for (int i = 0; i <= 6; i++) {
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    respostaUsuario =  e.getActionCommand();
                    comprobarResposta();
                }
            });
            add(btn);
        }
    }

    private void comprobarResposta(){
        if(respostaUsuario.equals(String.valueOf(respostaCorrecta))){
            JOptionPane.showMessageDialog(null, "Resultado " + respostaUsuario);
            JOptionPane.showMessageDialog(etiquetaResultado, "Correcto!");
        } else{
            JOptionPane.showMessageDialog(null,"Resultado " + respostaUsuario);
            JOptionPane.showMessageDialog(etiquetaResultado, "Incorrecto!");
        }
    }

    public static void main(String[] args) {
        Exercicio4 frame = new Exercicio4();
        frame.setVisible(true);
    }

    private class  OListener extends  WindowAdapter{
        public void windowClosing(WindowEvent e){
            System.out.println("Sain, finalizado");
            System.exit(0);
        }
    }
    
    
}