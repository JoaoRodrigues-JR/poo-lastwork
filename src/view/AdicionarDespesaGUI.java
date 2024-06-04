/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import model.Pessoa;
import model.interfaces.TipoDespesa;
import model.lancamentos.Despesa;

/**
 *
 * @author Gamer
 */
public class AdicionarDespesaGUI extends javax.swing.JDialog {
    Pessoa pessoaAdcDespesa;

    public AdicionarDespesaGUI(java.awt.Frame parent, boolean modal, Pessoa pessoa) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        pessoaAdcDespesa = pessoa;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        tfValorDespesa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btAdicionarDespesa = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rbEntretenimento = new javax.swing.JRadioButton();
        rbResidencia = new javax.swing.JRadioButton();
        rbAlimentacao = new javax.swing.JRadioButton();
        rbOutros = new javax.swing.JRadioButton();
        rbEducacao = new javax.swing.JRadioButton();
        rbTransporte = new javax.swing.JRadioButton();
        rbSaude = new javax.swing.JRadioButton();
        btFecharAdicionarDespesa = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        dcDataDespesa = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor da Despesa"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfValorDespesa)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfValorDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Adicionar Despesa");

        btAdicionarDespesa.setText("Adicionar");
        btAdicionarDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarDespesaActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Despesa"));

        buttonGroup1.add(rbEntretenimento);
        rbEntretenimento.setText("Entretenimento");
        rbEntretenimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEntretenimentoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbResidencia);
        rbResidencia.setText("Residência");

        buttonGroup1.add(rbAlimentacao);
        rbAlimentacao.setText("Alimentação");

        buttonGroup1.add(rbOutros);
        rbOutros.setText("Outros");

        buttonGroup1.add(rbEducacao);
        rbEducacao.setText("Educação");

        buttonGroup1.add(rbTransporte);
        rbTransporte.setText("Transporte");

        buttonGroup1.add(rbSaude);
        rbSaude.setText("Saúde");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbEntretenimento)
                    .addComponent(rbAlimentacao)
                    .addComponent(rbSaude)
                    .addComponent(rbResidencia)
                    .addComponent(rbEducacao)
                    .addComponent(rbTransporte)
                    .addComponent(rbOutros))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbEntretenimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbAlimentacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbResidencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbTransporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbEducacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbSaude)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbOutros)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btFecharAdicionarDespesa.setText("Fechar");
        btFecharAdicionarDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharAdicionarDespesaActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Data da Despesa"));

        dcDataDespesa.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dcDataDespesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dcDataDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btAdicionarDespesa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btFecharAdicionarDespesa)))
                        .addGap(223, 223, 223)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdicionarDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btFecharAdicionarDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAdicionarDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarDespesaActionPerformed

        try {
            
            if(dcDataDespesa.getDate() == null){
                throw new NullPointerException("O campo data deve ser preenchido!");
            }
            Date data = dcDataDespesa.getDate();
            LocalDate dataLancamento = data.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            TipoDespesa tr = null;
            if (buttonGroup1.getSelection() == rbEntretenimento.getModel()) {
                tr = TipoDespesa.ENTRETENIMENTO;
            } else if(buttonGroup1.getSelection() == rbAlimentacao.getModel()){
                tr = TipoDespesa.ALIMENTACAO;
            }  else if (buttonGroup1.getSelection() == rbResidencia.getModel()){
                tr = TipoDespesa.RESIDENCIA;
            } else if (buttonGroup1.getSelection() == rbTransporte.getModel()){
                tr = TipoDespesa.TRANSPORTE;
            } else if(buttonGroup1.getSelection() == rbEducacao.getModel()){
                tr = TipoDespesa.EDUCACAO;
            } else if (buttonGroup1.getSelection() == rbSaude.getModel()){
                tr = TipoDespesa.SAUDE;
            } else if (buttonGroup1.getSelection() == rbOutros.getModel()){
                tr = TipoDespesa.OUTRAS;
            }

            Despesa adcDespesa = new Despesa(dataLancamento, tr, tfValorDespesa.getText());
            pessoaAdcDespesa.adicionarDespesa(adcDespesa);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Valor da Despesa inválido!");
        } catch (NullPointerException | IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (DateTimeParseException ex) {
            JOptionPane.showMessageDialog(this, "Insira uma data válida!");
        } finally {
            limparCampos();
        }
    }//GEN-LAST:event_btAdicionarDespesaActionPerformed

    private void rbEntretenimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEntretenimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbEntretenimentoActionPerformed

    private void btFecharAdicionarDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharAdicionarDespesaActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btFecharAdicionarDespesaActionPerformed

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
            java.util.logging.Logger.getLogger(AdicionarDespesaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarDespesaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarDespesaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarDespesaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Pessoa pessoa = new Pessoa(args[0]);
                PessoaGUI pessoaGUI = new PessoaGUI(args[0], args[1]);
                pessoaGUI.setVisible(true);
                        
                AdicionarDespesaGUI dialog = new AdicionarDespesaGUI(new javax.swing.JFrame(), true, pessoa);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                       
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionarDespesa;
    private javax.swing.JButton btFecharAdicionarDespesa;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser dcDataDespesa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton rbAlimentacao;
    private javax.swing.JRadioButton rbEducacao;
    private javax.swing.JRadioButton rbEntretenimento;
    private javax.swing.JRadioButton rbOutros;
    private javax.swing.JRadioButton rbResidencia;
    private javax.swing.JRadioButton rbSaude;
    private javax.swing.JRadioButton rbTransporte;
    private javax.swing.JTextField tfValorDespesa;
    // End of variables declaration//GEN-END:variables
    public void limparCampos(){
        tfValorDespesa.setText("");
        dcDataDespesa.setDate(null);
        
    }

}