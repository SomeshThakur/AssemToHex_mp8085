/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assemtohex;

import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.BadLocationException;

/**
 *
 * @author Somesh
 */
public class AssemToHex extends javax.swing.JFrame {

    /**
     * Creates new form AssemToHex
     */
    public AssemToHex() {
        initComponents();
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
        hexTxtArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        assemTxtArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Assembly to Machine Code (HEX) 8085MP");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Assembly Code :");

        hexTxtArea.setColumns(20);
        hexTxtArea.setLineWrap(true);
        hexTxtArea.setRows(5);
        jScrollPane1.setViewportView(hexTxtArea);

        assemTxtArea.setColumns(20);
        assemTxtArea.setLineWrap(true);
	assemTxtArea.setRows(5);
	assemTxtArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                assemTxtAreaKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(assemTxtArea);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Hex Code :");

        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButton1))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(201, 201, 201))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(166, 166, 166))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void assemTxtAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_assemTxtAreaKeyTyped
        if ((evt.getID() == KeyEvent.KEY_TYPED)
                && Character.isLowerCase(evt.getKeyChar())) {
            evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));
        }
    }//GEN-LAST:event_assemTxtAreaKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            convertToHex();        // TODO add your handling code here:

        } catch (BadLocationException ex) {
            Logger.getLogger(AssemToHex.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
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
            java.util.logging.Logger.getLogger(AssemToHex.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssemToHex.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssemToHex.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssemToHex.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AssemToHex().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea assemTxtArea;
    private javax.swing.JTextArea hexTxtArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void convertToHex() throws BadLocationException {
        String[] wordsArray = assemTxtArea.getText().split("\\s+");
        for (int i = 0; i < wordsArray.length; i++) {
            switch (wordsArray[i]) {
                case "MOV":
                    if ("B,B".equals(wordsArray[i + 1])) {
                        hexTxtArea.append(" 40\n");
                    }
                    if ("B,C".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("41\n");
                    }
                    if ("B,D".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("42\n");
                    }
                    if ("B,E".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("43\n");
                    }
                    if ("B,H".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("44\n");
                    }
                    if ("B,L".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("45\n");
                    }
                    if ("B,M".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("46\n");
                    }
                    if ("B,A".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("47\n");
                    }
                    if ("C,B".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("48\n");
                    }
                    if ("C,C".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("49\n");
                    }
                    if ("C,D".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("4A\n");
                    }
                    if ("C,E".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("4B\n");
                    }
                    if ("C,H".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("4C\n");
                    }
                    if ("C,L".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("4D\n");
                    }
                    if ("C,M".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("4E\n");
                    }
                    if ("C,A".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("4F\n");
                    }
                    if ("D,B".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("50\n");
                    }
                    if ("D,C".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("51\n");
                    }
                    if ("D,D".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("52\n");
                    }
                    if ("D,E".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("53\n");
                    }
                    if ("D,H".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("54\n");
                    }
                    if ("D,L".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("55\n");
                    }
                    if ("D,M".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("56\n");
                    }
                    if ("D,A".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("57\n");
                    }
                    if ("E,B".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("58\n");
                    }
                    if ("E,C".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("59\n");
                    }
                    if ("E,D".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("5A\n");
                    }
                    if ("E,E".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("5B\n");
                    }
                    if ("E,H".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("5C\n");
                    }
                    if ("E,L".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("5D\n");
                    }
                    if ("E,M".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("5E\n");
                    }
                    if ("E,A".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("5F\n");
                    }
                    if ("H,B".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("60\n");
                    }
                    if ("H,C".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("61\n");
                    }
                    if ("H,D".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("62\n");
                    }
                    if ("H,E".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("63\n");
                    }
                    if ("H,H".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("64\n");
                    }
                    if ("H,L".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("65\n");
                    }
                    if ("H,M".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("66\n");
                    }
                    if ("H,A".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("67\n");
                    }
                    if ("L,B".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("68\n");
                    }
                    if ("L,C".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("69\n");
                    }
                    if ("L,D".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("6A\n");
                    }
                    if ("L,E".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("6B\n");
                    }
                    if ("L,H".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("6C\n");
                    }
                    if ("L,L".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("6D\n");
                    }
                    if ("L,M".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("6E\n");
                    }
                    if ("L,A".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("6F\n");
                    }
                    if ("M,B".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("70\n");
                    }
                    if ("M,C".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("71\n");
                    }
                    if ("M,D".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("72\n");
                    }
                    if ("M,E".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("73\n");
                    }
                    if ("M,H".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("74\n");
                    }
                    if ("M,L".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("75\n");
                    }
                    if ("M,M".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("76\n");
                    }
                    if ("M,A".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("77\n");
                    }
                    if ("A,B".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("78\n");
                    }
                    if ("A,C".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("79\n");
                    }
                    if ("A,D".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("7A\n");
                    }
                    if ("A,E".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("7B\n");
                    }
                    if ("A,F".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("7C\n");
                    }
                    if ("A,H".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("7D\n");
                    }
                    if ("A,L".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("7E\n");
                    }
                    if ("A,M".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("7F\n");
                    }
                    if ("A,A".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("80\n");
                    }
                    break;
            }
        }
    }
}
