/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * UI.java
 *
 * Created on Mar 19, 2011, 7:25:08 PM
 */
package sendfile;

import java.awt.Color;

/**
 *
 * @author anolis
 */
public class UI extends javax.swing.JFrame {

    /** Creates new form UI */
    public UI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileSelectorFrame = new javax.swing.JFrame();
        fileChooser = new javax.swing.JFileChooser();
        browseButton = new javax.swing.JButton();
        uploadButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        hostnameInput = new javax.swing.JTextField();

        fileSelectorFrame.setMinimumSize(new java.awt.Dimension(590, 420));
        fileSelectorFrame.setPreferredSize(new java.awt.Dimension(590, 420));

        fileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileChooserActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout fileSelectorFrameLayout = new org.jdesktop.layout.GroupLayout(fileSelectorFrame.getContentPane());
        fileSelectorFrame.getContentPane().setLayout(fileSelectorFrameLayout);
        fileSelectorFrameLayout.setHorizontalGroup(
            fileSelectorFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, fileSelectorFrameLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(fileChooser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        fileSelectorFrameLayout.setVerticalGroup(
            fileSelectorFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(fileSelectorFrameLayout.createSequentialGroup()
                .add(fileChooser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        browseButton.setText("Browse...");
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        uploadButton.setText("Upload");

        jLabel1.setText("Hostname: ");

        hostnameInput.setForeground(new java.awt.Color(204, 204, 204));
        hostnameInput.setText("<hostname>");
        hostnameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostnameInputActionPerformed(evt);
            }
        });
        hostnameInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                hostnameInputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                hostnameInputFocusLost(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .add(browseButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(uploadButton))
                    .add(layout.createSequentialGroup()
                        .add(jLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(hostnameInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 142, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(hostnameInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(browseButton)
                    .add(uploadButton))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hostnameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hostnameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hostnameInputActionPerformed

    private void hostnameInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hostnameInputFocusGained
        // TODO add input validation
        if (hostnameInput.getText().equals("<hostname>")) {
            hostnameInput.setForeground(Color.black);
            hostnameInput.setText("");
        }
    }//GEN-LAST:event_hostnameInputFocusGained

    private void hostnameInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hostnameInputFocusLost
        if (hostnameInput.getText().equals("")) {
            hostnameInput.setForeground(Color.lightGray);
            hostnameInput.setText("<hostname>");
        }
    }//GEN-LAST:event_hostnameInputFocusLost

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
        fileSelectorFrame.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_browseButtonActionPerformed

    private void fileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileChooserActionPerformed
        fileSelectorFrame.setVisible(false);
    }//GEN-LAST:event_fileChooserActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new UI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseButton;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JFrame fileSelectorFrame;
    private javax.swing.JTextField hostnameInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton uploadButton;
    // End of variables declaration//GEN-END:variables
}
