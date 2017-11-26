
package exerccartao;

public abstract class CartaoWeb {
    protected String destinatario;
    protected String remetente;
    
    public CartaoWeb(){}
    
    public abstract void retornarMensagem (String remetente);

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    
    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String destinatario) {
        this.remetente = destinatario;
    }
}
