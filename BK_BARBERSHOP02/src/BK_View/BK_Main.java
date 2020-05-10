
package BK_View;

import BK_Model.BK_Agendamento;
import BK_Model.BK_Cliente;
import BK_Model.BK_Pessoa;
import BK_Model.BK_Servico;
import BK_Model.BK_Usuario;

/**
 *
 * @author BK_Brandao
 */
public class BK_Main {
    
    
     public static void main(String[] args){
     
         String nome = "tiago";
         System.out.println(nome);
         
         BK_Servico servico = new BK_Servico(1, "barba", 30);
         
         System.out.println(servico.getDescricao());
         System.out.println(servico.getValor());
         
         
         BK_Cliente cliente = new BK_Cliente(1, "tiago", "rua teste", "92531214545");
         System.out.println(cliente.getNome());
         
         BK_Usuario usuario = new BK_Usuario(1, "barbeiro", "senha");
         System.out.println(usuario.getNome());
         
         
         BK_Agendamento agendamento = new BK_Agendamento( 1, cliente, servico, 30, "26/07/2018 09:15");
         System.out.println(agendamento.getCliente().getNome());
     }
    
    
    
}
