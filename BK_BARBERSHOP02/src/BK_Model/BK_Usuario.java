
package BK_Model;

import java.util.Date;

/**
 *
 * @author BK_Brandao
 */
public class BK_Usuario extends BK_Pessoa {
    

    protected String senha;
    protected String nivelAcesso;

    public BK_Usuario(int id, String nome,String senha) {
        super(id, nome);
        this.senha = senha;
    }

   public BK_Usuario( int id, String nome, char sexo, String dataNascimento, String telefone, String email, String rg, String senha, String nivelAcesso ) {
        super(id, nome, sexo, dataNascimento, telefone, email, rg);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    
    
    

    
    
    
    
    
}
