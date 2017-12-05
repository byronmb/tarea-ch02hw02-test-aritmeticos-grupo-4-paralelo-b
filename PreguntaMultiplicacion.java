
package TestdePreguntasInterface;


public class PreguntaMultiplicacion implements PreguntaEntera{
    private int num1;
    private int num2;
    private String lista;
    
    public String getPregunta(){
      return "Cuanto es "+num1+" * "+num2;
    }
    public int getRespuestaCorrecta(){
      return num1*num2;
    }

    public String compararRespuesta(int respuestaU){
        if (respuestaU==getRespuestaCorrecta()) {
           
            lista=getPregunta()+"="+getRespuestaCorrecta()+ " Correcta";
        }else{
            
            lista=getPregunta()+"="+getRespuestaCorrecta()+ "  Tu respuesta: "+respuestaU+" Incorrecta";
        }
        return lista;
    }
    
    public PreguntaMultiplicacion() {
        this.num1 = (int) (Math.random()*20+1);
        this.num2 = (int) (Math.random()*20);
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
