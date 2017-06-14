/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tela;

import com.model.*;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author marlon
 */
public class TelaSecundaria extends javax.swing.JFrame {

    Matriz matriz = new Matriz();
    String[][] mat = new String[9][9];
    JTextField array_texto[][] = new JTextField[9][9];

    private String tempo = "";

    private Timer timer;
    private int currentSegundo = 0;
    private int currentMinuto = 0;
    private int currentHora = 0;
    private int velocidade = 1000;

    /**
     * Creates new form TelaSecundaria
     */
    public TelaSecundaria() {
        initComponents();
        ArrayTexto();
        btpara.setVisible(false);
        btresposta.setVisible(false);
    }

//    Metodo para criar os textFilds
    private void ArrayTexto() {
        int posicCol = 10, posicLin = 10, tamanhoLin = 40, alturaLin = 40;

        for (int lin = 0; lin < 9; lin++) {
            for (int col = 0; col < 9; col++) {
                array_texto[lin][col] = new JTextField("");
                array_texto[lin][col].setBounds(posicCol, posicLin, tamanhoLin, alturaLin);
                array_texto[lin][col].setBackground(Color.white);
                getContentPane().add(array_texto[lin][col]);
                if (col == 2 || col == 5 || col == 8) {
                    posicCol = posicCol + 45;
                } else {
                    posicCol = posicCol + 40;
                }
            }
            posicCol = 10;
            if (lin == 2 || lin == 5 || lin == 8) {
                posicLin = posicLin + 45;
            } else {
                posicLin = posicLin + 40;
            }
        }
    }

//    Metodo para preencher os textFild
    private void Mostra() {
        mat = matriz.getMatriz();

        for (int lin = 0; lin < 9; lin++) {
            for (int col = 0; col < 9; col++) {
                array_texto[lin][col].setEditable(true);
                array_texto[lin][col].setText(mat[lin][col]);
                array_texto[lin][col].setBackground(Color.white);

                for (char letra : array_texto[lin][col].getText().toCharArray()) {
                    if ((letra < 1 || letra > 9)) {
                        array_texto[lin][col].setEditable(false);
                        array_texto[lin][col].setBackground(Color.LIGHT_GRAY);
                    }
                }
            }
        }
    }

//    Metodo que dispara o cronometro
    private void IniciarCronometro() {
        ActionListener action = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentSegundo++;

                if (currentSegundo == 60) {
                    currentMinuto++;
                    currentSegundo = 0;
                }

                if (currentMinuto == 60) {
                    currentHora++;
                    currentMinuto = 0;
                }

                String hr = currentHora <= 9 ? "0" + currentHora : currentHora + "";
                String min = currentMinuto <= 9 ? "0" + currentMinuto : currentMinuto + "";
                String seg = currentSegundo <= 9 ? "0" + currentSegundo : currentSegundo + "";

                lbcronometro.setText(hr + ":" + min + ":" + seg);
                tempo = hr + ":" + min + ":" + seg;
            }
        };
        this.timer = new Timer(velocidade, action);
        this.timer.start();
    }

//    Metodo que para o cronometro
    private void StopTime() {
        timer.stop();
        currentHora = 0;
        currentMinuto = 0;
        currentSegundo = 0;
        lbcronometro.setText("00:00:00");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btpara = new javax.swing.JButton();
        lbcronometro = new javax.swing.JLabel();
        btresposta = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnovo = new javax.swing.JButton();
        btnormal = new javax.swing.JButton();
        btdificil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SUDOKU");
        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(390, 520));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 386, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 450, 390);

        btpara.setText("Parar");
        btpara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btparaActionPerformed(evt);
            }
        });
        getContentPane().add(btpara);
        btpara.setBounds(300, 400, 73, 25);

        lbcronometro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbcronometro.setForeground(new java.awt.Color(255, 51, 51));
        lbcronometro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbcronometro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(lbcronometro);
        lbcronometro.setBounds(150, 440, 220, 40);

        btresposta.setText("Resposta");
        btresposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btrespostaActionPerformed(evt);
            }
        });
        getContentPane().add(btresposta);
        btresposta.setBounds(150, 400, 110, 25);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dificuldade", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        btnovo.setText("Fácil");
        btnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnovoActionPerformed(evt);
            }
        });

        btnormal.setText("Normal");
        btnormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnormalActionPerformed(evt);
            }
        });

        btdificil.setText("Difícil");
        btdificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdificilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnovo, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(btnormal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btdificil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnormal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btdificil)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 390, 130, 120);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnovoActionPerformed
        // TODO add your handling code here:
        matriz.setExec(1);
        matriz.CriaNumAleatorio();
        matriz.PreencherMatriz();
        matriz.Difilculdade();
        matriz.ApagarCasas();
        Mostra();
        IniciarCronometro();
        btnovo.setVisible(false);
        btnormal.setVisible(false);
        btdificil.setVisible(false);
        btpara.setVisible(true);
        btresposta.setVisible(true);
    }//GEN-LAST:event_btnovoActionPerformed

    private void btparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btparaActionPerformed
        // TODO add your handling code here:

        for (int lin = 0; lin < 9; lin++) {
            for (int col = 0; col < 9; col++) {
                mat[lin][col] = array_texto[lin][col].getText();
            }
        }

        matriz.setMatriz(mat);
        try {
            matriz.Validar();
            StopTime();
            JOptionPane.showMessageDialog(null, "Meus parabéns!!!\nJogo teminado com " + tempo + ".");
            btpara.setVisible(false);
            btresposta.setVisible(false);
            btnovo.setVisible(true);
            btnormal.setVisible(true);
            btdificil.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btparaActionPerformed

    private void btrespostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrespostaActionPerformed
        // TODO add your handling code here:

        mat = matriz.getRespostaMatriz();

        for (int lin = 0; lin < 9; lin++) {
            for (int col = 0; col < 9; col++) {
                array_texto[lin][col].setEditable(true);
                array_texto[lin][col].setText(mat[lin][col]);
                array_texto[lin][col].setEditable(false);
                array_texto[lin][col].setBackground(Color.LIGHT_GRAY);
            }
        }
        StopTime();
        btpara.setVisible(false);
        btresposta.setVisible(false);
        btnovo.setVisible(true);
        btnormal.setVisible(true);
        btdificil.setVisible(true);
    }//GEN-LAST:event_btrespostaActionPerformed

    private void btnormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnormalActionPerformed
        // TODO add your handling code here:
        matriz.setExec(2);
        matriz.CriaNumAleatorio();
        matriz.PreencherMatriz();
        matriz.Difilculdade();
        matriz.ApagarCasas();
        Mostra();
        IniciarCronometro();
        btnovo.setVisible(false);
        btpara.setVisible(true);
        btnormal.setVisible(false);
        btdificil.setVisible(false);
        btresposta.setVisible(true);
    }//GEN-LAST:event_btnormalActionPerformed

    private void btdificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdificilActionPerformed
        // TODO add your handling code here:
        matriz.setExec(3);
        matriz.CriaNumAleatorio();
        matriz.PreencherMatriz();
        matriz.Difilculdade();
        matriz.ApagarCasas();
        Mostra();
        IniciarCronometro();
        btnovo.setVisible(false);
        btnormal.setVisible(false);
        btdificil.setVisible(false);
        btpara.setVisible(true);
        btresposta.setVisible(true);
    }//GEN-LAST:event_btdificilActionPerformed

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
            java.util.logging.Logger.getLogger(TelaSecundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSecundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSecundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSecundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSecundaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btdificil;
    private javax.swing.JButton btnormal;
    private javax.swing.JButton btnovo;
    private javax.swing.JButton btpara;
    private javax.swing.JButton btresposta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbcronometro;
    // End of variables declaration//GEN-END:variables
}
