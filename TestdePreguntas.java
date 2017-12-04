/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestdePreguntasInterface;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class TestdePreguntas {
    public static void main(String[] args) {

        
         int puntuacion=0;
        //Arreglo para guardar las respuestas correctas
        int []arregloRC = new int [10];
        //Arreglo para guardar las respuestas del usuario
        int []arregloRU = new int [10];
        String lista="";
        //Mediante el for se generaran 3 preguntas de resta, se guardan en los arreglos RC y RU las respuestas correctas y las 
        //proporcionadas por el usuario respectivamente y el string (lista) guarda la comparación;
        for (int i = 0; i < 3; i++) {
             PreguntaResta resta=new PreguntaResta();
             int a=Integer.parseInt(JOptionPane.showInputDialog(null,resta.getPregunta()));
             resta.compararRespuesta(a);
             arregloRU[i]=a;
             arregloRC[i]=resta.getRespuestaCorrecta();
             lista=lista+resta.compararRespuesta(a)+"\n";
        }
        
        for (int i = 3; i < 6; i++) {
             PreguntaAdicion suma=new PreguntaAdicion();
             int a=Integer.parseInt(JOptionPane.showInputDialog(null,suma.getPregunta()));
             suma.compararRespuesta(a);
             arregloRU[i]=a;
             arregloRC[i]=suma.getRespuestaCorrecta();
             lista=lista+suma.compararRespuesta(a)+"\n";
        }
        
        for (int i = 6; i < 10; i++) {
             PreguntaMultiplicacion multi=new PreguntaMultiplicacion();
             int a=Integer.parseInt(JOptionPane.showInputDialog(null,multi.getPregunta()));
             multi.compararRespuesta(a);
             arregloRU[i]=a;
             arregloRC[i]=multi.getRespuestaCorrecta();
             lista=lista+multi.compararRespuesta(a)+"\n";
        }
        //Revisa las respuestas del usuario una por una para comprobar que sean correctas
        for (int i = 0; i < 10; i++) {
            if (arregloRC[i]==arregloRU[i]){
                puntuacion+=10;
            }
        }
        
      JOptionPane.showMessageDialog(null, "Lista de preguntas:\n"+lista+"\n\nPuntuacion: "+puntuacion+"/100");
     
        
    }
}
