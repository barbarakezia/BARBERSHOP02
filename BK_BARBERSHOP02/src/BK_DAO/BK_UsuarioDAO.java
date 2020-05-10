
package BK_DAO;

import BK_Model.BK_Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author BK_Brandao
 */
public class BK_UsuarioDAO {
    
public static void adicionar(BK_Usuario Usuario) {

        String sql = "INSERT INTO BK_Usuario (Senha, NivelAcesso) VALUES (?, ?)";

        try {
            Connection conexao = BK_ConexaoDB.retornaBK_Conexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, Usuario.getSenha());
            stmt.setString(2, Usuario.getNivelAcesso());
            stmt.execute();
        } catch (Exception e) {

        }
    }

    public static ArrayList<BK_Usuario> listar() {

        ArrayList<BK_Usuario> Usuario = new ArrayList<>();

        String sql = "SELECT * FROM Usuario";

        try {
            Connection conexao = BK_ConexaoDB.retornaBK_Conexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);

            ResultSet dados = stmt.executeQuery();

            while (dados.next()) {
                BK_Usuario temporario = new BK_Usuario ();
                temporario.setSenha(dados.getString("Senha"));
                temporario.setNivelAcesso(dados.getString("NivelAcesso"));
                Usuario.add(temporario);
            }

        } catch (Exception e) {
        }

        return Usuario;
    }

    public static void excluir() {
    }

    public static void atualizar() {
    }

}