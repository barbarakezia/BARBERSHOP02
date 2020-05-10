
package BK_DAO;

import BK_Model.BK_Agendamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author BK_Brandao
 */
public class BK_AgendamentoDAO {
    
    
    public static void adicionar(BK_Agendamento Agendamento) {

        String sql = "INSERT INTO agendamento (Id, Cliente, Servico, Valor) VALUES (?, ?, ?)";

        try {
            Connection conexao = BK_ConexaoDB.retornaBK_Conexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, Agendamento.getId());
            stmt.setFloat(2, Agendamento.getValor());
            stmt.setDate(3, (java.sql.Date) Agendamento.getData());
            stmt.setString(4, Agendamento.getObservacao());
            stmt.execute();
        } catch (Exception e) {

        }
    }
    
    public static ArrayList<BK_Agendamento> listar() {

        ArrayList<BK_Agendamento> Agendamento = new ArrayList<>();

        String sql = "SELECT * FROM clientes";

        try {
            Connection conexao = BK_ConexaoDB.retornaBK_Conexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);

            ResultSet dados = stmt.executeQuery();

            while (dados.next()) {
                BK_Agendamento temporario = new BK_Agendamento ();
                temporario.setId(dados.getInt("id"));
                temporario.setValor(dados.getFloat("Valor"));
                temporario.setData(dados.getDate("Data"));
                temporario.setObservacao(dados.getString("Observacao"));

                Agendamento.add(temporario);
            }

        } catch (Exception e) {
        }

        return Agendamento;
    }

    public static void excluir() {
    }

    public static void atualizar() {
    }

}
