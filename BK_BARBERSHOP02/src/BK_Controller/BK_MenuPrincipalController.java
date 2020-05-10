
package BK_Controller;

import BK_View.BK_Agenda;
import BK_View.BK_MenuPrincipal;

/**
 *
 * @author BK_Brandao
 */
public class BK_MenuPrincipalController {
    
    private final BK_MenuPrincipal view;

    public BK_MenuPrincipalController(BK_MenuPrincipal view) {
        this.view = view;
    }
    
    
    
    public void navegarParaAgenda(){
    
        BK_Agenda agenda = new BK_Agenda();
        agenda.setVisible(true);
    }
    
    
    
}
