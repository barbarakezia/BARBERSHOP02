
package BK_Controller.Helper;

import BK_Model.BK_Usuario;
import BK_View.BK_Login;

/**
 *
 * @author BK_Brandao
 */
public class BK_LoginHelper {
    
    private final BK_Login view;

    public BK_LoginHelper(BK_Login view) {
        this.view = view;
    }
    
    public BK_Usuario obterModelo(){
        String nome = view.getTextUsuario().getText();
        String senha = view.getTextSenha().getText();       
        BK_Usuario modelo = new BK_Usuario(0, nome, senha);
        return modelo;
    }
    
    public void setarModelo(BK_Usuario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        view.getTextUsuario().setText(nome);
        view.getTextSenha().setText(senha);
    }
    
    public void limparTela(){
        view.getTextUsuario().setText("");
        view.getTextSenha().setText("");
    }
    
}
