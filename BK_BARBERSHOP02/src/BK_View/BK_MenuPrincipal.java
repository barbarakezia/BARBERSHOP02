
package BK_View;

import BK_Controller.BK_MenuPrincipalController;

/**
 *
 * @author BK_Brandao
 */
public class BK_MenuPrincipal extends javax.swing.JFrame {

    private final BK_MenuPrincipalController controller;

    public BK_MenuPrincipal() {
        initComponents();
        this.controller = new BK_MenuPrincipalController(this);
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        LabelFundoMenuPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuCadastro = new javax.swing.JMenu();
        MenuItemCliente = new javax.swing.JMenuItem();
        MenuItemServico = new javax.swing.JMenuItem();
        MenuItemUsuario = new javax.swing.JMenuItem();
        MenuOperacao = new javax.swing.JMenu();
        MenuItemAgenda = new javax.swing.JMenuItem();
        MenuRelatorio = new javax.swing.JMenu();
        MenuItemRelatorio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelFundoMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BK_View/imagens/fundo-MenuPrincipal.jpg"))); // NOI18N
        getContentPane().add(LabelFundoMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 1000));

        MenuCadastro.setText("  Cadastro  ");
        MenuCadastro.setActionCommand("Cadastro  ");
        MenuCadastro.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N

        MenuItemCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        MenuItemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BK_View/imagens/icons/cliente32-icon.png"))); // NOI18N
        MenuItemCliente.setText("  Cliente");
        MenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemClienteActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuItemCliente);

        MenuItemServico.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        MenuItemServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BK_View/imagens/icons/tesoura32-icon.png"))); // NOI18N
        MenuItemServico.setText("  Serviço");
        MenuCadastro.add(MenuItemServico);

        MenuItemUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        MenuItemUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BK_View/imagens/icons/usuario32-icon.png"))); // NOI18N
        MenuItemUsuario.setText("  Usuario");
        MenuCadastro.add(MenuItemUsuario);

        jMenuBar1.add(MenuCadastro);

        MenuOperacao.setText("  Operação  ");
        MenuOperacao.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N

        MenuItemAgenda.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        MenuItemAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BK_View/imagens/icons/agenda32-icon.png"))); // NOI18N
        MenuItemAgenda.setText("  Agenda");
        MenuItemAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemAgendaActionPerformed(evt);
            }
        });
        MenuOperacao.add(MenuItemAgenda);

        jMenuBar1.add(MenuOperacao);

        MenuRelatorio.setText("  Relatório  ");
        MenuRelatorio.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N

        MenuItemRelatorio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        MenuItemRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BK_View/imagens/icons/relatorioTrabalho32-icon.png"))); // NOI18N
        MenuItemRelatorio.setText("  Trabalho");
        MenuItemRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemRelatorioActionPerformed(evt);
            }
        });
        MenuRelatorio.add(MenuItemRelatorio);

        jMenuBar1.add(MenuRelatorio);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemClienteActionPerformed

    private void MenuItemRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemRelatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemRelatorioActionPerformed

    private void MenuItemAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemAgendaActionPerformed
        this.controller.navegarParaAgenda();
    }//GEN-LAST:event_MenuItemAgendaActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BK_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BK_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BK_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BK_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BK_MenuPrincipal().setVisible(true);
            }
        });
    }


    private javax.swing.JLabel LabelFundoMenuPrincipal;
    private javax.swing.JMenu MenuCadastro;
    private javax.swing.JMenuItem MenuItemAgenda;
    private javax.swing.JMenuItem MenuItemCliente;
    private javax.swing.JMenuItem MenuItemRelatorio;
    private javax.swing.JMenuItem MenuItemServico;
    private javax.swing.JMenuItem MenuItemUsuario;
    private javax.swing.JMenu MenuOperacao;
    private javax.swing.JMenu MenuRelatorio;
    private javax.swing.JMenuBar jMenuBar1;

}
