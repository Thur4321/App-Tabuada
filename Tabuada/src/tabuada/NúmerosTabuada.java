
package tabuada;

public class NúmerosTabuada {
    
    private int número;
    
    public int getNúmero(){
        return número;
    }
    
    public void setNúmero(int número1){
        número=número1;
    
    }
    
    public String tabuada(){
        String resultado = "";
        for (int cont = 1; cont <= 10; cont++){
            resultado = resultado + número + "x" + cont + "=" + número*cont + "\n";
        }
        return resultado;
    }
    public String tabuadaWhile (){
        String resultado = "";
        int cont=1;
        while (cont <= 10){
            resultado = resultado + número + "x" + "=" + número*cont + "\n";
            cont = cont + 1;
        }
        return resultado;    
    }
    public String tabuadaDoWhile (){
        String resultado = "";
        int cont=1;
        do { 
        resultado = número + "x" + resultado + "=" + número*cont + "\n";
            cont = cont + 1;
        } while (cont <= 10);
        return resultado;
    }
    
}
