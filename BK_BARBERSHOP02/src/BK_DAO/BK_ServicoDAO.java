
package BK_DAO;

import BK_Model.BK_Servico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author BK_Brandao
 */
public class BK_ServicoDAO {


    public static void adicionar(BK_Servico Servico) {

        String sql = "INSERT INTO Servico (Id, Descricao, Valor) VALUES (?, ?, ?)";

        try {
            Connection conexao = BK_ConexaoDB.retornaBK_Conexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, Servico.getId());
            stmt.setString(2, Servico.getDescricao());
            stmt.setFloat(3, Servico.getValor());
            stmt.execute();
        } catch (Exception e) {

        }
    }

    public static ArrayList<BK_Servico> listar() {

        ArrayList<BK_Servico> Servico = new ArrayList<>();

        String sql = "SELECT * FROM Servico";

        try {
            Connection conexao = BK_ConexaoDB.retornaBK_Conexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);

            ResultSet dados = stmt.executeQuery();

            while (dados.next()) {
                BK_Servico temporario = new BK_Servico ();
                temporario.setId(dados.getInt("id"));
                temporario.setDescricao(dados.getString("Descricao"));
                temporario.setValor(dados.getFloat("Valor"));

                Servico.add(temporario);
            }

        } catch (Exception e) {
        }

        return Servico;
    }

    public static void excluir() {
    }

    public static void atualizar() {
    }

}
