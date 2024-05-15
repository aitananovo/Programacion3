/*Fai un programa con 2 botóns: un “Medra” e outro “Reduce” que aumenten o tamaño da ventá en 50 x 50 pixels, 
ou a reduza na mesma variación. */
package Exerc1;

import javax.swing.*;
import java.awt.event.*;

public class Exercicio1 extends JFrame{
    int contador = 0;
    JButton botonMedra = new JButton("Medra");
    JButton botonReduce = new JButton("Reduce");
    JLabel aetiqueta = new JLabel("");
    JPanel opanel = new JPanel();

    public Exercicio1(){
        defineCaracteristicasObxectos ( );
        colocaObxectos( );
        addEscoitadoresObxectos( ); 
    }

    public static void main(String[] args) {
        Exercicio1 oframe = new Exercicio1();
        oframe.setSize(300,300);
        oframe.setVisible(true); 
        oframe.setTitle("Ventá que cambia de tamaño");
    }

    public void defineCaracteristicasObxectos(){
        botonMedra.setBounds(50,40,150,40); 
        botonReduce.setBounds(50,100,150,40);   	// pos X, pos Y, ANCHO E ALTO.
        aetiqueta.setBounds(50, 180,200, 40); 
        opanel.setLayout(null); 	// NECESARIO PARA QUE OS OBXECTOS NON SE MOVAN CANDO OS COLOQUEMOS
    }

    public void colocaObxectos( ) { 
        opanel.add(botonMedra);
        opanel.add(botonReduce);
        opanel.add(aetiqueta);
        // FACEMOS QUE O PANEL DO FRAME SEXA O PANEL QUE DEFINIMOS NOS.
        getContentPane().add(opanel); 
    }

    public void addEscoitadoresObxectos( ) {
        addWindowListener(new VentaListener( ) );
        botonMedra.addActionListener(new BotonMedraListener( ) );
        botonReduce.addActionListener(new BotonReduceListener( ) );
    }

    private class VentaListener extends WindowAdapter{
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }


    private class BotonMedraListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            setSize(getWidth() + 50, getHeight() + 50);
            aetiqueta.setText("Tamaño actual: " + getWidth() + " X " + getHeight());
        }
    }

    private class BotonReduceListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            setSize(getWidth() - 50, getHeight() - 50);
            aetiqueta.setText("Tamaño actual: " + getWidth() + " X " + getHeight());
        }
    }
}