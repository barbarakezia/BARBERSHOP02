
package BK_DAO;

import BK_Model.BK_Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author BK_Brandao
 */
public class BK_ClienteDAO {
    
    
    public static void adicionar(BK_Cliente cliente) {

        String sql = "INSERT INTO cliente (Endereco, Cep) VALUES (?, ?)";

        try {
            Connection conexao = BK_ConexaoDB.retornaBK_Conexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, cliente.getEndereco());
            stmt.setString(2, cliente.getCep());
            stmt.execute();
        } catch (Exception e) {

        }
    }
    
    public static ArrayList<BK_Cliente> listar() {

        ArrayList<BK_Cliente> Cliente = new ArrayList<>();

        String sql = "SELECT * FROM clientes";

        try {
            Connection conexao = BK_ConexaoDB.retornaBK_Conexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);

            ResultSet dados = stmt.executeQuery();

            while (dados.next()) {
                BK_Cliente temporario = new BK_Cliente();
                temporario.setEndereco(dados.getString("Endereco"));
                temporario.setCep(dados.getString("Cep"));

                Cliente.add(temporario);
            }

        } catch (Exception e) {
        }

        return Cliente;
    }

    public static void excluir() {
    }

    public static void atualizar() {
    }

}
