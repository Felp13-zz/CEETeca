/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.Banco;
import javax.swing.ImageIcon;
import getSet.livroGetSet;

/**
 *
 * @author Aluno
 */
public class TelaCadastroLivro extends javax.swing.JFrame {



    /**
     * Creates new form TelaLivro
     */
    public TelaCadastroLivro() {
        initComponents();
        
        ImageIcon icone = new ImageIcon(getClass().getResource("/images/ceetecaicon16x16.png"));
        this.setIconImage(icone.getImage());
        
            }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelCadLivro = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cTxtTituloCadLivro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cTxtAutorCadLivro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cTxtEditoraCadLivro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cTxtEdicaoCadLivro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cTxtSubtituloCadLivro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cTxtISBNCadLivro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cTxtCDDCadLivro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cComboBoxIdiomaCadLivro = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cTxtAssuntoCadLivro = new javax.swing.JTextField();
        cGiraExemplarCadLivro = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        cTxtAnoPublicacaoCadLivro = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cTxtSerieCadLivro = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cTxtNumPgCadLivro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btConfirmarCadLivro = new javax.swing.JButton();
        btLimparCadLivro = new javax.swing.JButton();
        btVoltarCadLivro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CEETECA");
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Titulo:");

        cTxtTituloCadLivro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cTxtTituloCadLivroKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Autor:");

        cTxtAutorCadLivro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cTxtAutorCadLivroKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setText("Editora:");

        cTxtEditoraCadLivro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cTxtEditoraCadLivroKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel7.setText("Edição:");

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel8.setText("Subtítulo:");

        cTxtSubtituloCadLivro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cTxtSubtituloCadLivroKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel9.setText("ISBN:");

        jLabel10.setText("CDD:");

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel11.setText("Idioma:");

        cComboBoxIdiomaCadLivro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Português", "Inglês", "Espanhol" }));

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel12.setText("Assunto:");

        cTxtAssuntoCadLivro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cTxtAssuntoCadLivroKeyReleased(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel14.setText("Ano de Publicação:");

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel16.setText("Série:");

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel17.setText("N° de páginas:");

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Quantidade:");

        javax.swing.GroupLayout painelCadLivroLayout = new javax.swing.GroupLayout(painelCadLivro);
        painelCadLivro.setLayout(painelCadLivroLayout);
        painelCadLivroLayout.setHorizontalGroup(
            painelCadLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadLivroLayout.createSequentialGroup()
                .addGroup(painelCadLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadLivroLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4)
                        .addGap(383, 383, 383))
                    .addGroup(painelCadLivroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelCadLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelCadLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel12)
                                .addComponent(jLabel10)
                                .addComponent(jLabel1)
                                .addComponent(jLabel8))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(painelCadLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelCadLivroLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(painelCadLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cTxtSubtituloCadLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cTxtAutorCadLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cTxtISBNCadLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cTxtTituloCadLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadLivroLayout.createSequentialGroup()
                                        .addComponent(cTxtAssuntoCadLivro)
                                        .addGap(121, 121, 121))))
                            .addGroup(painelCadLivroLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelCadLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cTxtCDDCadLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                    .addComponent(cGiraExemplarCadLivro))))
                        .addGap(104, 104, 104)))
                .addGroup(painelCadLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadLivroLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(painelCadLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11)
                            .addComponent(jLabel16))
                        .addGroup(painelCadLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelCadLivroLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(cTxtEditoraCadLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(21, Short.MAX_VALUE))
                            .addGroup(painelCadLivroLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelCadLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cTxtEdicaoCadLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cComboBoxIdiomaCadLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painelCadLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cTxtAnoPublicacaoCadLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cTxtSerieCadLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cTxtNumPgCadLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(painelCadLivroLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(painelCadLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel17))
                        .addContainerGap())))
        );
        painelCadLivroLayout.setVerticalGroup(
            painelCadLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadLivroLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(painelCadLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cTxtTituloCadLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cTxtEditoraCadLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCadLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cTxtSubtituloCadLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cTxtEdicaoCadLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCadLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cTxtAutorCadLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cComboBoxIdiomaCadLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(painelCadLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cTxtAssuntoCadLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel16)
                    .addComponent(cTxtSerieCadLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painelCadLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadLivroLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(painelCadLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(cTxtAnoPublicacaoCadLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(painelCadLivroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cTxtISBNCadLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCadLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(cTxtCDDCadLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cTxtNumPgCadLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(painelCadLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cGiraExemplarCadLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("Informações básicas do  livro");

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel19.setText("CADASTRO DE LIVRO");

        btConfirmarCadLivro.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btConfirmarCadLivro.setText("Confirmar");
        btConfirmarCadLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarCadLivroActionPerformed(evt);
            }
        });

        btLimparCadLivro.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btLimparCadLivro.setText("Limpar");
        btLimparCadLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparCadLivroActionPerformed(evt);
            }
        });

        btVoltarCadLivro.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btVoltarCadLivro.setText("Voltar");
        btVoltarCadLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarCadLivroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(jLabel19))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btConfirmarCadLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(btLimparCadLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114)
                                .addComponent(btVoltarCadLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(painelCadLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelCadLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btVoltarCadLivro)
                        .addComponent(btLimparCadLivro)
                        .addComponent(btConfirmarCadLivro)))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btConfirmarCadLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarCadLivroActionPerformed
        // 
        
        String anoPublicado = cTxtAnoPublicacaoCadLivro.getText();
        String assunto = cTxtAssuntoCadLivro.getText();
        String Autor = cTxtAutorCadLivro.getText();
        String cdd = cTxtCDDCadLivro.getText();
        String edicao = cTxtEdicaoCadLivro.getText();
        String editora = cTxtEditoraCadLivro.getText();
        String isbn = cTxtISBNCadLivro.getText();
        String numPaginas = cTxtNumPgCadLivro.getText();
        String serie = cTxtSerieCadLivro.getText();
        String subTitulo = cTxtSubtituloCadLivro.getText();
        String titulo = cTxtTituloCadLivro.getText();
        String Idioma = String.valueOf(cComboBoxIdiomaCadLivro.getSelectedIndex());
        String qtdExemplar = String.valueOf(cGiraExemplarCadLivro.getValue());
        
        livroGetSet infos = new livroGetSet();
        
        infos.setAnoPublicacao(anoPublicado);
        infos.setAssunto(assunto);
        infos.setAutor(Autor);
        infos.setCdd(cdd);
        infos.setEdicao(edicao);
        infos.setEditora(editora);
        infos.setIdioma(Idioma);
        infos.setIsbn(isbn);
        infos.setNumPaginas(numPaginas);
        infos.setQtdExemplar(qtdExemplar);
        infos.setSerie(serie);
        infos.setSubtitulo(subTitulo);
        infos.setTitulo(titulo);
        
        Banco.livros.add(infos);
        
    }//GEN-LAST:event_btConfirmarCadLivroActionPerformed

    private void btLimparCadLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparCadLivroActionPerformed
        // 
        limpar();


    }//GEN-LAST:event_btLimparCadLivroActionPerformed

    private void btVoltarCadLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarCadLivroActionPerformed
        // 
        
        setVisible(false);
        new TelaGerenciarLivro().setVisible(true);
        
    }//GEN-LAST:event_btVoltarCadLivroActionPerformed

    private void cTxtTituloCadLivroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cTxtTituloCadLivroKeyReleased
        // TODO add your handling code here:
         cTxtTituloCadLivro.setText(cTxtTituloCadLivro.getText().toUpperCase());
        
    }//GEN-LAST:event_cTxtTituloCadLivroKeyReleased

    private void cTxtSubtituloCadLivroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cTxtSubtituloCadLivroKeyReleased
        // TODO add your handling code here:
        
        cTxtSubtituloCadLivro.setText(cTxtSubtituloCadLivro.getText().toUpperCase());
    }//GEN-LAST:event_cTxtSubtituloCadLivroKeyReleased

    private void cTxtAutorCadLivroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cTxtAutorCadLivroKeyReleased
        // TODO add your handling code here:
        
         cTxtAutorCadLivro.setText(cTxtAutorCadLivro.getText().toUpperCase());
    }//GEN-LAST:event_cTxtAutorCadLivroKeyReleased

    private void cTxtAssuntoCadLivroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cTxtAssuntoCadLivroKeyReleased
        // TODO add your handling code here:
        
         cTxtAssuntoCadLivro.setText(cTxtAssuntoCadLivro.getText().toUpperCase());
    }//GEN-LAST:event_cTxtAssuntoCadLivroKeyReleased

    private void cTxtEditoraCadLivroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cTxtEditoraCadLivroKeyReleased
        // TODO add your handling code here:
        cTxtEditoraCadLivro.setText(cTxtEditoraCadLivro.getText().toUpperCase());
    }//GEN-LAST:event_cTxtEditoraCadLivroKeyReleased

    public void limpar() {
        cTxtAnoPublicacaoCadLivro.setText("");
        cTxtAssuntoCadLivro.setText("");
        cTxtAutorCadLivro.setText("");
        cTxtCDDCadLivro.setText("");
        cTxtEdicaoCadLivro.setText("");
        cTxtEditoraCadLivro.setText("");
        cTxtISBNCadLivro.setText("");
        cTxtNumPgCadLivro.setText("");
        cTxtSerieCadLivro.setText("");
        cTxtSubtituloCadLivro.setText("");
        cTxtTituloCadLivro.setText("");
        cComboBoxIdiomaCadLivro.setSelectedIndex(0);
        cGiraExemplarCadLivro.setValue(0);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConfirmarCadLivro;
    private javax.swing.JButton btLimparCadLivro;
    private javax.swing.JButton btVoltarCadLivro;
    private javax.swing.JComboBox<String> cComboBoxIdiomaCadLivro;
    private javax.swing.JSpinner cGiraExemplarCadLivro;
    private javax.swing.JTextField cTxtAnoPublicacaoCadLivro;
    private javax.swing.JTextField cTxtAssuntoCadLivro;
    private javax.swing.JTextField cTxtAutorCadLivro;
    private javax.swing.JTextField cTxtCDDCadLivro;
    private javax.swing.JTextField cTxtEdicaoCadLivro;
    private javax.swing.JTextField cTxtEditoraCadLivro;
    private javax.swing.JTextField cTxtISBNCadLivro;
    private javax.swing.JTextField cTxtNumPgCadLivro;
    private javax.swing.JTextField cTxtSerieCadLivro;
    private javax.swing.JTextField cTxtSubtituloCadLivro;
    private javax.swing.JTextField cTxtTituloCadLivro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel painelCadLivro;
    // End of variables declaration//GEN-END:variables
}
