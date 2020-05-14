
package BK_Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BK_Brandao
 */
public class BK_Agendamento {
    
    private int id;
    private BK_Cliente cliente; 
    private BK_Servico servico;
    private float valor;
    private Date data;
    private String observacao;

    public BK_Agendamento(int id, BK_Cliente cliente, BK_Servico servico, float valor, String data) {
        this.id = id;
        this.cliente = cliente;
        this.servico = servico;
        this.valor = valor;
        try {
            this.data = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data);
                    } catch (ParseException ex) {
            Logger.getLogger(BK_Agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BK_Cliente getCliente() {
        return cliente;
    }

    public void setCliente(BK_Cliente cliente) {
        this.cliente = cliente;
    }

    public BK_Servico getServico() {
        return servico;
    }

    public void setServico(BK_Servico servico) {
        this.servico = servico;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public void setDescricao(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
}
