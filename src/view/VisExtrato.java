package view;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import model.HistoricoLancamento;
import model.Pessoa;
import model.lancamentos.Despesa;
import model.lancamentos.Receita;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
/**
 *
 * @author Gamer
 */
public class VisExtrato extends javax.swing.JDialog {

    private Pessoa pessoaExtrato;

    /**
     * Creates new form VisDemonstrativoDespFutura
     */
    public VisExtrato(java.awt.Frame parent, boolean modal, Pessoa pessoa) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        pessoaExtrato = pessoa;
        exibirExtrato();
    }

    public void exibirExtrato() {
        StringBuilder conteudo = new StringBuilder();
        Receita receita;
        Despesa despesa;

        List<Integer> idsLancamentos = new ArrayList<>(pessoaExtrato.getHistorico().keySet());

        for (Integer id : idsLancamentos) {

            HistoricoLancamento hl = pessoaExtrato.getHistorico().get(id);

            conteudo.append("====================================\n");
            conteudo.append("ID: ").append(id).append("\n");
            conteudo.append("Data: ").append(hl.getLancamento().getDataLancamento()).append("\n");
            if (hl.getLancamento() instanceof Receita) {
                conteudo.append("Tipo de Lançamento: ").append("Receita").append("\n");
                receita = (Receita) hl.getLancamento();
                conteudo.append("Tipo de Receita: ").append(receita.getTipoReceita()).append("\n");
                                conteudo.append("Valor: R$").append(formatarNumero(hl.getLancamento().getValor())).append("\n");
            } else if (hl.getLancamento() instanceof Despesa) {
                conteudo.append("Tipo de Lançamento: ").append("Despesa").append("\n");
                despesa = (Despesa) hl.getLancamento();
                conteudo.append("Tipo de Despesa: ").append(despesa.getTipoDespesa()).append("\n");
                conteudo.append("Valor: -R$").append(formatarNumero(hl.getLancamento().getValor())).append("\n");
            }
            conteudo.append("Saldo Anterior: R$").append(formatarNumero(hl.getSaldoAnterior())).append("\n");
            conteudo.append("Saldo Atual: R$").append(formatarNumero(hl.getSaldoPosterior())).append("\n");
        }
        tArea.setEditable(false);
        tArea.setText(conteudo.toString());
        tArea.setCaretPosition(0);
    }
    
    private String formatarNumero(BigDecimal numero) {
        // Verifica se o número é maior ou igual a 1.000.000.000
        if (numero.abs().compareTo(new BigDecimal("1000000000")) >= 0) {
            // Usa notação científica para números maiores ou iguais a 1.000.000.000
            DecimalFormat dfScientific = new DecimalFormat("0.00E0");
            return dfScientific.format(numero);
        } else {
            // Formata com até duas casas decimais para números menores que 1.000.000.000
            DecimalFormat df = new DecimalFormat("#,##0.00");
            return df.format(numero);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Extrato Geral");

        jScrollPane1.setName("spReceitasAtuais"); // NOI18N

        tArea.setEditable(false);
        tArea.setColumns(20);
        tArea.setRows(5);
        jScrollPane1.setViewportView(tArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(294, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGap(9, 9, 9)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(341, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addGap(8, 8, 8)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VisExtrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisExtrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisExtrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisExtrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                Pessoa pessoa;

                try {
                    pessoa = new Pessoa(args[0]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.err.println("Erro: Argumentos de linha de comando insuficientes.");
                    return;
                }

                PessoaGUI pessoaGUI = new PessoaGUI(args[0], Integer.parseInt(args[1]));
                pessoaGUI.setVisible(true);

                VisExtrato dialog = new VisExtrato(new javax.swing.JFrame(), true, pessoa);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tArea;
    // End of variables declaration//GEN-END:variables
}
