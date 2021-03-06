package com.esucri.financa.view;

import javax.swing.JFrame;

public class Menu extends javax.swing.JFrame {
    
    private static int idUsuarioLogado;
    private static String loginUsuarioLogado;
    
    public Menu() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        menuReceita = new javax.swing.JMenuItem();
        menuTipoReceita = new javax.swing.JMenuItem();
        menuDespesa = new javax.swing.JMenuItem();
        menuTipoDespesa = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu3.setText("Cadastrar");

        menuReceita.setText("Receita");
        menuReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReceitaActionPerformed(evt);
            }
        });
        jMenu3.add(menuReceita);

        menuTipoReceita.setText("Tipo de receita");
        menuTipoReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTipoReceitaActionPerformed(evt);
            }
        });
        jMenu3.add(menuTipoReceita);

        menuDespesa.setText("Despesa");
        jMenu3.add(menuDespesa);

        menuTipoDespesa.setText("Tipo de despesa");
        jMenu3.add(menuTipoDespesa);

        jMenuBar2.add(jMenu3);

        menuSair.setText("Sair");
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
            }
        });
        jMenuBar2.add(menuSair);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static int getIdUsuarioLogado() {
        return  idUsuarioLogado;
    }
    
    public static String getLoginUsuarioLogado() {
        return loginUsuarioLogado;
    }
    
    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_menuSairMouseClicked

    private void menuReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReceitaActionPerformed
        CadastroReceita.create();
    }//GEN-LAST:event_menuReceitaActionPerformed

    private void menuTipoReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTipoReceitaActionPerformed
        CadastroTipoReceita.create();
    }//GEN-LAST:event_menuTipoReceitaActionPerformed

    public static void create(int usuarioLogadoId, String usuarioLogadoLogin) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Menu menu = new Menu();
                idUsuarioLogado = usuarioLogadoId;
                loginUsuarioLogado = usuarioLogadoLogin;
                menu.setTitle("Finanças - Seja bem-vindo: " + loginUsuarioLogado);
                menu.setExtendedState(JFrame.MAXIMIZED_BOTH);
                menu.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem menuDespesa;
    private javax.swing.JMenuItem menuReceita;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenuItem menuTipoDespesa;
    private javax.swing.JMenuItem menuTipoReceita;
    // End of variables declaration//GEN-END:variables
}
