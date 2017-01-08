/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assemtohex;

import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Assembly to Machine Code (HEX) 8085MP");
        setResizable(false);

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
        jLabel2.setText("Machine Code (HEX) :");

        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("About");

        jMenuItem1.setText("AssemToHex");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(145, 145, 145))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(165, 165, 165))))
        );

        pack();
        setLocationRelativeTo(null);
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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(null, "Assembly to Machine code convertor\n"
                + "Developed by Somesh Thakur.\n"
                + "Contact : Someshthakur33@gmail.com\n"
                + "Version : 0.1 (beta)", "About", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssemToHex.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        //</editor-fold>

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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void convertToHex() throws BadLocationException {
        hexTxtArea.setText("");
        String[] wordsArray = assemTxtArea.getText().split("\\s+");
        boolean correctFormatInstruction;
        for (int i = 0; i < wordsArray.length; i += 2) {
            correctFormatInstruction = false;
            switch (wordsArray[i]) {
                case "MOV":
                    if ("B,B".equals(wordsArray[i + 1])) {
                        hexTxtArea.append(" 40\n");
                        correctFormatInstruction = true;
                    }
                    if ("B,C".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("41\n");
                        correctFormatInstruction = true;
                    }
                    if ("B,D".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("42\n");
                        correctFormatInstruction = true;
                    }
                    if ("B,E".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("43\n");
                        correctFormatInstruction = true;
                    }
                    if ("B,H".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("44\n");
                        correctFormatInstruction = true;
                    }
                    if ("B,L".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("45\n");
                        correctFormatInstruction = true;
                    }
                    if ("B,M".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("46\n");
                        correctFormatInstruction = true;
                    }
                    if ("B,A".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("47\n");
                        correctFormatInstruction = true;
                    }
                    if ("C,B".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("48\n");
                        correctFormatInstruction = true;
                    }
                    if ("C,C".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("49\n");
                        correctFormatInstruction = true;
                    }
                    if ("C,D".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("4A\n");
                        correctFormatInstruction = true;
                    }
                    if ("C,E".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("4B\n");
                        correctFormatInstruction = true;
                    }
                    if ("C,H".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("4C\n");
                        correctFormatInstruction = true;
                    }
                    if ("C,L".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("4D\n");
                        correctFormatInstruction = true;
                    }
                    if ("C,M".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("4E\n");
                        correctFormatInstruction = true;
                    }
                    if ("C,A".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("4F\n");
                        correctFormatInstruction = true;
                    }
                    if ("D,B".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("50\n");
                        correctFormatInstruction = true;
                    }
                    if ("D,C".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("51\n");
                        correctFormatInstruction = true;
                    }
                    if ("D,D".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("52\n");
                        correctFormatInstruction = true;
                    }
                    if ("D,E".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("53\n");
                        correctFormatInstruction = true;
                    }
                    if ("D,H".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("54\n");
                        correctFormatInstruction = true;
                    }
                    if ("D,L".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("55\n");
                        correctFormatInstruction = true;
                    }
                    if ("D,M".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("56\n");
                        correctFormatInstruction = true;
                    }
                    if ("D,A".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("57\n");
                        correctFormatInstruction = true;
                    }
                    if ("E,B".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("58\n");
                        correctFormatInstruction = true;
                    }
                    if ("E,C".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("59\n");
                        correctFormatInstruction = true;
                    }
                    if ("E,D".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("5A\n");
                        correctFormatInstruction = true;
                    }
                    if ("E,E".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("5B\n");
                        correctFormatInstruction = true;
                    }
                    if ("E,H".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("5C\n");
                        correctFormatInstruction = true;
                    }
                    if ("E,L".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("5D\n");
                        correctFormatInstruction = true;
                    }
                    if ("E,M".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("5E\n");
                        correctFormatInstruction = true;
                    }
                    if ("E,A".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("5F\n");
                        correctFormatInstruction = true;
                    }
                    if ("H,B".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("60\n");
                        correctFormatInstruction = true;
                    }
                    if ("H,C".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("61\n");
                        correctFormatInstruction = true;
                    }
                    if ("H,D".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("62\n");
                        correctFormatInstruction = true;
                    }
                    if ("H,E".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("63\n");
                        correctFormatInstruction = true;
                    }
                    if ("H,H".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("64\n");
                        correctFormatInstruction = true;
                    }
                    if ("H,L".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("65\n");
                        correctFormatInstruction = true;
                    }
                    if ("H,M".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("66\n");
                        correctFormatInstruction = true;
                    }
                    if ("H,A".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("67\n");
                        correctFormatInstruction = true;
                    }
                    if ("L,B".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("68\n");
                        correctFormatInstruction = true;
                    }
                    if ("L,C".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("69\n");
                        correctFormatInstruction = true;
                    }
                    if ("L,D".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("6A\n");
                        correctFormatInstruction = true;
                    }
                    if ("L,E".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("6B\n");
                        correctFormatInstruction = true;
                    }
                    if ("L,H".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("6C\n");
                        correctFormatInstruction = true;
                    }
                    if ("L,L".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("6D\n");
                        correctFormatInstruction = true;
                    }
                    if ("L,M".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("6E\n");
                        correctFormatInstruction = true;
                    }
                    if ("L,A".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("6F\n");
                        correctFormatInstruction = true;
                    }
                    if ("M,B".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("70\n");
                        correctFormatInstruction = true;
                    }
                    if ("M,C".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("71\n");
                        correctFormatInstruction = true;
                    }
                    if ("M,D".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("72\n");
                        correctFormatInstruction = true;
                    }
                    if ("M,E".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("73\n");
                        correctFormatInstruction = true;
                    }
                    if ("M,H".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("74\n");
                        correctFormatInstruction = true;
                    }
                    if ("M,L".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("75\n");
                        correctFormatInstruction = true;
                    }
                    if ("M,M".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("76\n");
                        correctFormatInstruction = true;
                    }
                    if ("M,A".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("77\n");
                        correctFormatInstruction = true;
                    }
                    if ("A,B".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("78\n");
                        correctFormatInstruction = true;
                    }
                    if ("A,C".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("79\n");
                        correctFormatInstruction = true;
                    }
                    if ("A,D".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("7A\n");
                        correctFormatInstruction = true;
                    }
                    if ("A,E".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("7B\n");
                        correctFormatInstruction = true;
                    }
                    if ("A,H".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("7C\n");
                        correctFormatInstruction = true;
                    }
                    if ("A,L".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("7D\n");
                        correctFormatInstruction = true;
                    }
                    if ("A,M".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("7E\n");
                        correctFormatInstruction = true;
                    }
                    if ("A,A".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("7F\n");
                        correctFormatInstruction = true;
                    }
                    break;

                case "ADD":
                    if ("B".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("80\n");
                        correctFormatInstruction = true;
                    }
                    if ("C".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("81\n");
                        correctFormatInstruction = true;
                    }
                    if ("D".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("82\n");
                        correctFormatInstruction = true;
                    }
                    if ("E".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("83\n");
                        correctFormatInstruction = true;
                    }
                    if ("H".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("84\n");
                        correctFormatInstruction = true;
                    }
                    if ("L".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("85\n");
                        correctFormatInstruction = true;
                    }
                    if ("M".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("86\n");
                        correctFormatInstruction = true;
                    }
                    if ("A".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("87\n");
                        correctFormatInstruction = true;
                    }

                    break;

                case "ADC":
                    if ("B".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("88\n");
                        correctFormatInstruction = true;
                    }
                    if ("C".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("89\n");
                        correctFormatInstruction = true;
                    }
                    if ("D".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("8A\n");
                        correctFormatInstruction = true;
                    }
                    if ("E".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("8B\n");
                        correctFormatInstruction = true;
                    }
                    if ("H".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("8C\n");
                        correctFormatInstruction = true;
                    }
                    if ("L".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("8D\n");
                        correctFormatInstruction = true;
                    }
                    if ("M".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("8E\n");
                        correctFormatInstruction = true;
                    }
                    if ("A".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("8F\n");
                        correctFormatInstruction = true;
                    }

                    break;

                case "SUB":
                    if ("B".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("90\n");
                        correctFormatInstruction = true;
                    }
                    if ("C".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("91\n");
                        correctFormatInstruction = true;
                    }
                    if ("D".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("92\n");
                        correctFormatInstruction = true;
                    }
                    if ("E".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("93\n");
                        correctFormatInstruction = true;
                    }
                    if ("H".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("94\n");
                        correctFormatInstruction = true;
                    }
                    if ("L".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("95\n");
                        correctFormatInstruction = true;
                    }
                    if ("M".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("96\n");
                        correctFormatInstruction = true;
                    }
                    if ("A".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("97\n");
                        correctFormatInstruction = true;
                    }

                    break;

                case "SBB":
                    if ("B".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("98\n");
                        correctFormatInstruction = true;
                    }
                    if ("C".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("99\n");
                        correctFormatInstruction = true;
                    }
                    if ("D".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("9A\n");
                        correctFormatInstruction = true;
                    }
                    if ("E".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("9B\n");
                        correctFormatInstruction = true;
                    }
                    if ("H".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("9C\n");
                        correctFormatInstruction = true;
                    }
                    if ("L".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("9D\n");
                        correctFormatInstruction = true;
                    }
                    if ("M".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("9E\n");
                        correctFormatInstruction = true;
                    }
                    if ("A".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("9F\n");
                        correctFormatInstruction = true;
                    }

                    break;

                case "LXI":
                    boolean lxiaddr = Pattern.matches("\\d*", wordsArray[i + 1].substring(2, wordsArray[i + 1].length() - 1));
                    if (lxiaddr) {
                        if (wordsArray[i + 1].startsWith("B,")) {
                            hexTxtArea.append("01 " + wordsArray[i + 1].substring(4, 6) + " " + wordsArray[i + 1].substring(2, 4) + "\n");
                            correctFormatInstruction = true;
                        }
                        if (wordsArray[i + 1].startsWith("D,")) {
                            hexTxtArea.append("11 " + wordsArray[i + 1].substring(4, 6) + " " + wordsArray[i + 1].substring(2, 4) + "\n");
                            correctFormatInstruction = true;
                        }
                        if (wordsArray[i + 1].startsWith("H,")) {
                            hexTxtArea.append("21 " + wordsArray[i + 1].substring(4, 6) + " " + wordsArray[i + 1].substring(2, 4) + "\n");
                            correctFormatInstruction = true;
                        }
                        if (wordsArray[i + 1].startsWith("SP,")) {
                            hexTxtArea.append("31 " + wordsArray[i + 1].substring(4, 6) + " " + wordsArray[i + 1].substring(2, 4) + "\n");
                            correctFormatInstruction = true;
                        }
                    } else {
                        hexTxtArea.append("Invalid Address\n");
                        correctFormatInstruction = true;
                        lxiaddr = true;
                    }
                    break;

                case "LDA":
                    boolean ldaaddr = Pattern.matches("\\d*", wordsArray[i + 1].substring(0, wordsArray[i + 1].length() - 1));
                    if (ldaaddr) {
                        hexTxtArea.append("3A " + wordsArray[i + 1].substring(2, 4) + " " + wordsArray[i + 1].substring(0, 2) + "\n");
                    } else {
                        hexTxtArea.append("Invalid Address\n");
                        ldaaddr = true;
                    }
                    correctFormatInstruction = true;

                    break;

                case "HLT":
                    hexTxtArea.append("CF/EF (Depends on kit VI/ESA)\n");
                    correctFormatInstruction = true;
                    i--;

                    break;

                case "NOP":
                    hexTxtArea.append("00\n");
                    correctFormatInstruction = true;
                    i--;

                    break;

                case "STA":
                    boolean staaddr = Pattern.matches("\\d*", wordsArray[i + 1].substring(0, wordsArray[i + 1].length() - 1));
                    if (staaddr) {
                        hexTxtArea.append("32 " + wordsArray[i + 1].substring(2, 4) + " " + wordsArray[i + 1].substring(0, 2) + "\n");
                    } else {
                        hexTxtArea.append("Invalid Address\n");
                        staaddr = true;
                    }
                    correctFormatInstruction = true;

                    break;

                case "INX":
                    if ("B".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("03\n");
                        correctFormatInstruction = true;
                    }
                    if ("D".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("13\n");
                        correctFormatInstruction = true;
                    }
                    if ("H".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("23\n");
                        correctFormatInstruction = true;
                    }
                    if ("SP".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("33\n");
                        correctFormatInstruction = true;
                    }

                    break;

                case "ANA":
                    if ("B".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("A0\n");
                        correctFormatInstruction = true;
                    }
                    if ("C".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("A1\n");
                        correctFormatInstruction = true;
                    }
                    if ("D".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("A2\n");
                        correctFormatInstruction = true;
                    }
                    if ("E".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("A3\n");
                        correctFormatInstruction = true;
                    }
                    if ("H".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("A4\n");
                        correctFormatInstruction = true;
                    }
                    if ("L".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("A5\n");
                        correctFormatInstruction = true;
                    }
                    if ("M".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("A6\n");
                        correctFormatInstruction = true;
                    }
                    if ("A".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("A7\n");
                        correctFormatInstruction = true;
                    }

                    break;

                case "XRA":
                    if ("B".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("A8\n");
                        correctFormatInstruction = true;
                    }
                    if ("C".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("A9\n");
                        correctFormatInstruction = true;
                    }
                    if ("D".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("AA\n");
                        correctFormatInstruction = true;
                    }
                    if ("E".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("AB\n");
                        correctFormatInstruction = true;
                    }
                    if ("H".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("AC\n");
                        correctFormatInstruction = true;
                    }
                    if ("L".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("AD\n");
                        correctFormatInstruction = true;
                    }
                    if ("M".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("AE\n");
                        correctFormatInstruction = true;
                    }
                    if ("A".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("AF\n");
                        correctFormatInstruction = true;
                    }

                    break;

                case "ORA":
                    if ("B".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("B0\n");
                        correctFormatInstruction = true;
                    }
                    if ("C".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("B1\n");
                        correctFormatInstruction = true;
                    }
                    if ("D".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("B2\n");
                        correctFormatInstruction = true;
                    }
                    if ("E".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("B3\n");
                        correctFormatInstruction = true;
                    }
                    if ("H".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("B4\n");
                        correctFormatInstruction = true;
                    }
                    if ("L".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("B5\n");
                        correctFormatInstruction = true;
                    }
                    if ("M".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("B6\n");
                        correctFormatInstruction = true;
                    }
                    if ("A".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("B7\n");
                        correctFormatInstruction = true;
                    }

                    break;

                case "CMP":
                    if ("B".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("B8\n");
                        correctFormatInstruction = true;
                    }
                    if ("C".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("B9\n");
                        correctFormatInstruction = true;
                    }
                    if ("D".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("BA\n");
                        correctFormatInstruction = true;
                    }
                    if ("E".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("BB\n");
                        correctFormatInstruction = true;
                    }
                    if ("H".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("BC\n");
                        correctFormatInstruction = true;
                    }
                    if ("L".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("BD\n");
                        correctFormatInstruction = true;
                    }
                    if ("M".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("BE\n");
                        correctFormatInstruction = true;
                    }
                    if ("A".equals(wordsArray[i + 1])) {
                        hexTxtArea.append("BF\n");
                        correctFormatInstruction = true;
                    }

                    break;

                case "JNC":
                    boolean jncaddr = Pattern.matches("\\d*", wordsArray[i + 1].substring(0, wordsArray[i + 1].length() - 1));
                    if (jncaddr) {
                        hexTxtArea.append("D2 " + wordsArray[i + 1].substring(2, 4) + " " + wordsArray[i + 1].substring(0, 2) + "\n");
                    } else {
                        hexTxtArea.append("Invalid Address\n");
                        jncaddr = true;
                    }
                    correctFormatInstruction = true;

                    break;

                case "JNZ":
                    boolean jnzaddr = Pattern.matches("\\d*", wordsArray[i + 1].substring(0, wordsArray[i + 1].length() - 1));
                    if (jnzaddr) {
                        hexTxtArea.append("C2 " + wordsArray[i + 1].substring(2, 4) + " " + wordsArray[i + 1].substring(0, 2) + "\n");
                    } else {
                        hexTxtArea.append("Invalid Address\n");
                        jnzaddr = true;
                    }
                    correctFormatInstruction = true;

                    break;

                default:
                    i--;
                    hexTxtArea.append("Unknown Instruction!\n");
                    correctFormatInstruction = true;
            }
            if (!correctFormatInstruction) {
                hexTxtArea.append("Instruction Format is wrong!\n");
            }
        }
    }
}
