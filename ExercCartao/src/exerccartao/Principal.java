
package exerccartao;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        DiaDosNamorados d = new DiaDosNamorados ();
        Aniversario a = new Aniversario ();
        Natal n = new Natal ();
        
        
        String destinatario = JOptionPane.showInputDialog ("Destinatario: ");
        String remetente = JOptionPane.showInputDialog ("Remetente: "); 
        
        int [] cartaoweb = new int [3];
        int i;
        
        for (i =0; i <= 3; i++){
            if (i ==1){
                d.setDestinatario(destinatario);
                d.retornarMensagem(remetente);
            }
            if (i == 2){
                a.setDestinatario(destinatario);
                a.retornarMensagem(remetente);
            }
            if (i == 3){
                n.setDestinatario(destinatario);
                n.retornarMensagem(remetente);
            }
        }
    }
}
