
package BK_Model;

/**
 *
 * @author BK_Brandao
 */
public class BK_Cliente extends BK_Pessoa {
    
    private String endereco;
    private String cep;

    public BK_Cliente(int id, String nome, char sexo, String dataNascimento, String telefone, String email, String rg, String endereco, String cep ) {
        super(id, nome, sexo, dataNascimento, telefone, email, rg);
        this.endereco = endereco;
        this.cep = cep;
    }
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    
    
    
    
    
    
    
    
    
    
    
}
