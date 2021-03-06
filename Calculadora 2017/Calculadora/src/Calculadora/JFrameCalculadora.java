
package Calculadora;

import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class JFrameCalculadora extends javax.swing.JFrame {

    public JFrameCalculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonLimpar = new javax.swing.JButton();
        jTextFieldDisplay = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButtonSoma = new javax.swing.JButton();
        jButtonSubtrair = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButtonMultiplicar = new javax.swing.JButton();
        jButtonDividir = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonIgual = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButtonLimpar.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButtonLimpar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton8KeyPressed(evt);
            }
        });

        jTextFieldDisplay.setEditable(false);
        jTextFieldDisplay.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldDisplay.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("1");
        jButton1.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton1.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton1.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton8KeyPressed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("2");
        jButton2.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton2.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton2.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton8KeyPressed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("3");
        jButton3.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton3.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton3.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton8KeyPressed(evt);
            }
        });

        jButtonSoma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSoma.setText("+");
        jButtonSoma.setMaximumSize(new java.awt.Dimension(50, 50));
        jButtonSoma.setMinimumSize(new java.awt.Dimension(50, 50));
        jButtonSoma.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButtonSoma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton8KeyPressed(evt);
            }
        });

        jButtonSubtrair.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSubtrair.setText("-");
        jButtonSubtrair.setMaximumSize(new java.awt.Dimension(50, 50));
        jButtonSubtrair.setMinimumSize(new java.awt.Dimension(50, 50));
        jButtonSubtrair.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButtonSubtrair.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton8KeyPressed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("4");
        jButton4.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton4.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton4.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton8KeyPressed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("5");
        jButton5.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton5.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton5.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton8KeyPressed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setText("6");
        jButton6.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton6.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton6.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton8KeyPressed(evt);
            }
        });

        jButtonMultiplicar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonMultiplicar.setText("*");
        jButtonMultiplicar.setToolTipText("");
        jButtonMultiplicar.setMaximumSize(new java.awt.Dimension(50, 50));
        jButtonMultiplicar.setMinimumSize(new java.awt.Dimension(50, 50));
        jButtonMultiplicar.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButtonMultiplicar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton8KeyPressed(evt);
            }
        });

        jButtonDividir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonDividir.setText("/");
        jButtonDividir.setMaximumSize(new java.awt.Dimension(50, 50));
        jButtonDividir.setMinimumSize(new java.awt.Dimension(50, 50));
        jButtonDividir.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButtonDividir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton8KeyPressed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton7.setText("7");
        jButton7.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton7.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton7.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton8KeyPressed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton8.setText("8");
        jButton8.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton8.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton8.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton8KeyPressed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton9.setText("9");
        jButton9.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton9.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton9.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton8KeyPressed(evt);
            }
        });

        jButton0.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton0.setText("0");
        jButton0.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton0.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton0.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton8KeyPressed(evt);
            }
        });

        jButtonIgual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonIgual.setText("=");
        jButtonIgual.setMaximumSize(new java.awt.Dimension(50, 50));
        jButtonIgual.setMinimumSize(new java.awt.Dimension(50, 50));
        jButtonIgual.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButtonIgual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton8KeyPressed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CALCULADORA DO ARIEL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jButtonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldDisplay, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonSoma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton0, jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9, jButtonDividir, jButtonIgual, jButtonLimpar, jButtonMultiplicar, jButtonSoma, jButtonSubtrair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSoma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jButtonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton0, jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9, jButtonDividir, jButtonIgual, jButtonLimpar, jButtonMultiplicar, jButtonSoma, jButtonSubtrair});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Oferece o botão "evt" que foi clicado para calculadora executar a operação
        this.operarComBotaoClicado(evt);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton8KeyPressed
        // Oferece o tecla "evt" que foi digitada para calculadora executar a operação
        this.operarComTeclaDigitada(evt);
    }//GEN-LAST:event_jButton8KeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Inicializa a calculadora logo após a abertura da janela
        this.inicializar();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(JFrameCalculadora.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCalculadora.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCalculadora.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCalculadora.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFrameCalculadora().setVisible(true);
            }
        });
    }

    private double resultado;
    private String modelo = "";
    private String marca = "";

    // Estados da calculadora
    public enum estadosDaCalculadora {

        INICIANDO,
        PRIMEIRA_DIGITACAO,
        EM_OPERACAO,
        NOVA_DIGITACAO,
        TOTALIZANDO
    }

    // Operações da calculadora
    public enum operacoesCalculadora {

        SOMA,
        SUBTRAI,
        MULTIPLICA,
        DIVIDI
    }

    // Propriedades para controle interno
    private estadosDaCalculadora estado = estadosDaCalculadora.INICIANDO;
    private operacoesCalculadora operacao;
    private double acumulador;

    public void inicializar() {
        
    }

    public void operarComTeclaDigitada(java.awt.event.KeyEvent evt) {
        // Se foi digitado uma das teclas a seguir
        if ((evt.getKeyCode() == KeyEvent.VK_0)
                || (evt.getKeyCode() == KeyEvent.VK_1)
                || (evt.getKeyCode() == KeyEvent.VK_2)
                || (evt.getKeyCode() == KeyEvent.VK_3)
                || (evt.getKeyCode() == KeyEvent.VK_4)
                || (evt.getKeyCode() == KeyEvent.VK_5)
                || (evt.getKeyCode() == KeyEvent.VK_6)
                || (evt.getKeyCode() == KeyEvent.VK_7)
                || (evt.getKeyCode() == KeyEvent.VK_8)
                || (evt.getKeyCode() == KeyEvent.VK_9)
                || (evt.getKeyCode() == KeyEvent.VK_ADD)
                || (evt.getKeyCode() == KeyEvent.VK_SUBTRACT)
                || (evt.getKeyCode() == KeyEvent.VK_DIVIDE)
                || (evt.getKeyCode() == KeyEvent.VK_MULTIPLY)
                || (evt.getKeyCode() == KeyEvent.VK_EQUALS)) {

            // Opera com tecla digitada
            this.operarConformeEstado("" + evt.getKeyChar());

            // Caso foi a tecla definida como limpar "L"
        } else if (evt.getKeyCode() == KeyEvent.VK_L) {
            this.operarConformeEstado("CE");
        }
    }

    public void operarComBotaoClicado(java.awt.event.ActionEvent evt) {
        // Descobre o botão que foi clicado e devolve o caractere, nele, na variável texto
        JButton botao = (JButton) evt.getSource(); // Retorna o botão clicado
        String caractereDigitado = botao.getText(); // Retorna o texto do botão que foi clicado
        this.operarConformeEstado(caractereDigitado); // Oferece o texto do botão para calculadora executar a operação
    }

    public void operarConformeEstado(String caractereDigitado) {

        if (this.estado == estadosDaCalculadora.INICIANDO) {

            //Limpa tudo para começar novamente
            this.limpar();

            if (this.eNumero(caractereDigitado)) { // Se digitado algum número
                this.setVisor(caractereDigitado);
                this.estado = estadosDaCalculadora.PRIMEIRA_DIGITACAO;
            } else if (this.eCE(caractereDigitado)) {
                this.limpar();
            } else {
                this.erro("Erro de operação");
            }

        } else if (this.estado == estadosDaCalculadora.EM_OPERACAO) {

            if (this.eNumero(caractereDigitado)) {
                this.setVisor(caractereDigitado);
                this.estado = estadosDaCalculadora.NOVA_DIGITACAO;
            } else if (this.eCE(caractereDigitado)) {
                this.limpar();
                this.acumulador = 0;
                this.estado = estadosDaCalculadora.INICIANDO;
            } else {
                this.erro("Erro de operação");
            }

        } else if (this.estado == estadosDaCalculadora.TOTALIZANDO) {

            if (this.eOperacao(caractereDigitado)) {
                this.setOperacao(caractereDigitado);
                this.estado = estadosDaCalculadora.EM_OPERACAO;
            } else if (this.eNumero(caractereDigitado)) { // Se digitado número
                this.setVisor(caractereDigitado);
                this.estado = estadosDaCalculadora.PRIMEIRA_DIGITACAO;
            } else if (this.eCE(caractereDigitado)) {
                this.limpar();
                this.acumulador = 0;
                this.estado = estadosDaCalculadora.INICIANDO;
            } else {
                this.erro("Erro de operação");
            }

        } else if (this.estado == estadosDaCalculadora.NOVA_DIGITACAO) {

            if (this.eNumero(caractereDigitado)) {
                this.setVisor(this.getVisor() + caractereDigitado);
            } else if (caractereDigitado.equals("CE")) {
                this.jTextFieldDisplay.setText("");
                this.estado = estadosDaCalculadora.EM_OPERACAO;
            } else if ((this.eIgual(caractereDigitado)) || (this.eNumero(caractereDigitado))) {

                this.calcular(); // Aqui é que utilizamos as operações da Calculadora
               
                this.acumulador = this.getResultado();

                this.setVisor(Double.toString(this.acumulador));

                if (this.eIgual(caractereDigitado)) {
                    this.estado = estadosDaCalculadora.TOTALIZANDO;
                } else {
                    this.setOperacao(caractereDigitado);
                    this.estado = estadosDaCalculadora.EM_OPERACAO;
                }

            } else {
                this.erro("Erro de operação");
            }

        } else if (this.estado == estadosDaCalculadora.PRIMEIRA_DIGITACAO) {

            if (this.eNumero(caractereDigitado)) {
                this.setVisor(this.getVisor() + caractereDigitado);
            } else if (caractereDigitado.equals("CE")) {
                this.limpar();
                this.estado = estadosDaCalculadora.INICIANDO;
            } else if (this.eOperacao(caractereDigitado)) {
                this.setOperacao(caractereDigitado);
                this.acumulador = Double.parseDouble(this.jTextFieldDisplay.getText());
                this.estado = estadosDaCalculadora.EM_OPERACAO;
            } else {
                this.erro("Erro de operação");
            }
        }
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setOperacao(String caractere) {
        switch (caractere) {
            case "+":
                this.operacao = operacoesCalculadora.SOMA;
                break;
            case "-":
                this.operacao = operacoesCalculadora.SUBTRAI;
                break;
            case "*":
                this.operacao = operacoesCalculadora.MULTIPLICA;
                break;
            case "/":
                this.operacao = operacoesCalculadora.DIVIDI;
                break;
        }
    }

    public void setVisor(String caractere) {
        this.jTextFieldDisplay.setText(caractere);
    }

    public String getVisor() {
        return this.jTextFieldDisplay.getText();
    }

    public boolean eNumero(String caractere) {
        return "0123456789".indexOf(caractere) != -1;
    }

    public boolean eCE(String cadeiaCaractere) {
        return cadeiaCaractere.equals("CE");
    }

    public boolean eIgual(String cadeiaCaractere) {
        return cadeiaCaractere.equals("=");
    }

    public boolean eOperacao(String caractere) {
        return "+-*/".indexOf(caractere) != -1;
    }

    public void limpar() {
        this.jTextFieldDisplay.setText("");
    }

    public void calcular() {
        switch (this.operacao) {
            case MULTIPLICA:
                this.multiplicar(this.acumulador,
                        Double.parseDouble(this.getVisor()));
                break;
            case SUBTRAI:
                this.subtrair(this.acumulador,
                        Double.parseDouble(this.getVisor()));
                break;
            case SOMA:
                this.somar(this.acumulador,
                        Double.parseDouble(this.getVisor()));
                break;
            case DIVIDI:
                this.dividir(this.acumulador,
                        Double.parseDouble(this.getVisor()));
        }
    }

    public void somar(double a, double b) {
        this.resultado = a + b;
    }

    public void multiplicar(double a, double b) {
        this.resultado = a * b;
    }

    public void dividir(double a, double b) {
        this.resultado = a / b;
    }

    public void subtrair(double a, double b) {
        this.resultado = a - b;

    }

    public void erro(String erro) {
        JOptionPane.showMessageDialog(rootPane, erro);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonDividir;
    private javax.swing.JButton jButtonIgual;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonMultiplicar;
    private javax.swing.JButton jButtonSoma;
    private javax.swing.JButton jButtonSubtrair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldDisplay;
    // End of variables declaration//GEN-END:variables
}
