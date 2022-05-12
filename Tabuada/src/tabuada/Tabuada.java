
package tabuada;

import javax.swing.JOptionPane;

public class Tabuada {

    public static void main(String[] args) {
        
        int número=Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o número:","AppProduto",3));
        
        NúmerosTabuada objTabuada = new NúmerosTabuada();
       
        objTabuada.setNúmero(número);
        
        JOptionPane.showMessageDialog(null, "Sua tabuada é:\n"+objTabuada.tabuada(),"AppProduto",1);
    }
    
}
