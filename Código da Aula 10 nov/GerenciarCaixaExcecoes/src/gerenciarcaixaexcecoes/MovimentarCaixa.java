/*
 * Aulas professor Maromo.
 */
package gerenciarcaixaexcecoes;

import javax.swing.JOptionPane;

/**
 *
 * @author maromo
 */
public class MovimentarCaixa extends javax.swing.JFrame {
    Caixa cx;
    /**
     * Creates new form MovimentarCaixa
     */
    public MovimentarCaixa() {
        initComponents();
        cx = new Caixa();
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
        jLabel2 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        txtSaldo = new javax.swing.JTextField();
        cmdDepositar = new javax.swing.JButton();
        cmdSacar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Valor");

        jLabel2.setText("Saldo");

        cmdDepositar.setText("Depositar");
        cmdDepositar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdDepositarMouseClicked(evt);
            }
        });

        cmdSacar.setText("Sacar");
        cmdSacar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdSacarMouseClicked(evt);
            }
        });
        cmdSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSacarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmdDepositar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(cmdSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtValor, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(txtSaldo))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdDepositar)
                    .addComponent(cmdSacar))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdSacarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdSacarMouseClicked
        // TODO add your handling code here:
        try {
            double valor = Double.parseDouble(txtValor.getText());
            cx.sacar(valor);
            txtSaldo.setText(String.valueOf(cx.getSaldo()));
            txtValor.setText("");
            txtValor.requestFocus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Aconteceu o erro: " + e.getMessage());
        }
    }//GEN-LAST:event_cmdSacarMouseClicked

    private void cmdDepositarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdDepositarMouseClicked
        // TODO add your handling code here:
        try {
            double valor = Double.parseDouble(txtValor.getText());
            cx.depositar(valor);
            txtSaldo.setText(String.valueOf(cx.getSaldo()));
            txtValor.setText("");
            txtValor.requestFocus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, 
                    "Aconteceu o erro: " + e.getMessage());
            JOptionPane.showMessageDialog(null,"Erro" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_cmdDepositarMouseClicked

    private void cmdSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSacarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdSacarActionPerformed

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdDepositar;
    private javax.swing.JButton cmdSacar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
