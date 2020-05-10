
package BK_Controller;

/**
 *
 * @author BK_Brandao
 */

import BK_Controller.Helper.BK_LoginHelper;
import BK_DAO.BK_UsuarioDAO;
import BK_Model.BK_Usuario;
import BK_View.BK_Login;
import BK_View.BK_MenuPrincipal;


public class BK_LoginController {

    private final BK_Login view;
    private BK_LoginHelper helper;

    public BK_LoginController(BK_Login view) {
        this.view = view;
        this.helper = new BK_LoginHelper(view);
    }
    

    public void entrarNoSistema(){
    
        BK_Usuario usuario = helper.obterModelo();
        
       
       BK_UsuarioDAO usuarioDAO = new BK_UsuarioDAO();
       BK_Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
       
       if(usuarioAutenticado != null){
           BK_MenuPrincipal menu = new BK_MenuPrincipal();
           menu.setVisible(true);
           this.view.dispose();
       }else{
           view.exibeMensagem("Usuario ou senha invalidos");
       }

    }
    
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados");
        
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
    
}
