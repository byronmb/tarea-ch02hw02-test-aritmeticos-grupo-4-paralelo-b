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
public class PreguntaAdicion implements PreguntaEntera{
    private int num1;
    private int num2;
    private String lista;
    
    public String getPregunta (){
      return "Cuanto es "+num1+" + "+num2;    
    }
    
    public int getRespuestaCorrecta(){
       return (num1+num2);
    }

    public String compararRespuesta(int respuestaU){
        if (respuestaU==getRespuestaCorrecta()) {
            //JOptionPane.showMessageDialog(null, getPregunta()+"="+getRespuestaCorrecta()+ " Correcta");
            lista=getPregunta()+"="+getRespuestaCorrecta()+ " Correcta";
        }else{
            //JOptionPane.showMessageDialog(null, getPregunta()+"="+getRespuestaCorrecta()+ " Tu respuesta: "+respuestaU+" Incorrecta");
            lista=getPregunta()+"="+getRespuestaCorrecta()+ "  Tu respuesta: "+respuestaU+" Incorrecta";
        }
        return lista;
    }
    
    public PreguntaAdicion() {
        this.num1 = (int) (Math.random()*50+1);
        this.num2 = (int) (Math.random()*50);
        
    }

    @Override
    public int getRespuestaCOrrecta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String compararRespuesta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
