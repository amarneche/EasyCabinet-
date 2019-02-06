/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easycabinet;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListCellRenderer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Amar
 */
public class MainFrame extends javax.swing.JFrame {
     Patient patients [];
     PatientNameCellRender cellRender ;
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        
        cellRender =new PatientNameCellRender();
        patientList.setCellRenderer(cellRender);
        
        patients =new Patient[10];
        for(Patient p :patients){
            p=new Patient("Amar1","Neche ","0673377481","Homme",1996);
            
        }
        
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
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

        leftSidePanel = new javax.swing.JPanel();
        patientListPanel = new javax.swing.JPanel();
        patientScrollPane = new javax.swing.JScrollPane();
        patientList = new javax.swing.JList<Patient>(patients);
        newPatientButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        searchPanel = new javax.swing.JPanel();
        searchField = new javax.swing.JTextField();
        searchLabel = new javax.swing.JLabel();
        rightSidePanel = new javax.swing.JPanel();
        userInfoPanel = new javax.swing.JPanel();
        sexePhoto = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        mobileLabel = new javax.swing.JLabel();
        ConsultationListPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        patientScrollPane.setBackground(new java.awt.Color(255, 255, 255));
        patientScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        patientScrollPane.setAutoscrolls(true);
        patientScrollPane.setHorizontalScrollBar(null);

        patientList.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        patientList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        patientList.setToolTipText("");
        patientScrollPane.setViewportView(patientList);

        javax.swing.GroupLayout patientListPanelLayout = new javax.swing.GroupLayout(patientListPanel);
        patientListPanel.setLayout(patientListPanelLayout);
        patientListPanelLayout.setHorizontalGroup(
            patientListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(patientScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        patientListPanelLayout.setVerticalGroup(
            patientListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(patientScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        newPatientButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        newPatientButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easycabinet/Photos/Plus Math_24px.png"))); // NOI18N
        newPatientButton.setText("Nouveau patient");
        newPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPatientButtonActionPerformed(evt);
            }
        });

        searchPanel.setBackground(new java.awt.Color(255, 255, 255));

        searchField.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        searchField.setText("Rechecher patients");
        searchField.setToolTipText("");
        searchField.setBorder(null);
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        searchLabel.setBackground(new java.awt.Color(204, 204, 204));
        searchLabel.setForeground(new java.awt.Color(255, 255, 255));
        searchLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easycabinet/Photos/Search_24px.png"))); // NOI18N

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(searchLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout leftSidePanelLayout = new javax.swing.GroupLayout(leftSidePanel);
        leftSidePanel.setLayout(leftSidePanelLayout);
        leftSidePanelLayout.setHorizontalGroup(
            leftSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newPatientButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leftSidePanelLayout.setVerticalGroup(
            leftSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSidePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patientListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        rightSidePanel.setBackground(new java.awt.Color(255, 255, 255));

        sexePhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easycabinet/Photos/female64.png"))); // NOI18N

        nameLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        nameLabel.setText("Amar Neche");

        ageLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ageLabel.setText("22 ans");

        mobileLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        mobileLabel.setText("0673377481");

        javax.swing.GroupLayout userInfoPanelLayout = new javax.swing.GroupLayout(userInfoPanel);
        userInfoPanel.setLayout(userInfoPanelLayout);
        userInfoPanelLayout.setHorizontalGroup(
            userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sexePhoto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(398, Short.MAX_VALUE))
        );
        userInfoPanelLayout.setVerticalGroup(
            userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userInfoPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userInfoPanelLayout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ageLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mobileLabel))
                    .addComponent(sexePhoto))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel7.setText("Date :");

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setText("28 Janvier 2018 ");

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel8.setText("Remarque :");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout ConsultationListPanelLayout = new javax.swing.GroupLayout(ConsultationListPanel);
        ConsultationListPanel.setLayout(ConsultationListPanelLayout);
        ConsultationListPanelLayout.setHorizontalGroup(
            ConsultationListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultationListPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(ConsultationListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConsultationListPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9))
                    .addGroup(ConsultationListPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ConsultationListPanelLayout.setVerticalGroup(
            ConsultationListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultationListPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(ConsultationListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ConsultationListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(191, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setText("Consultations recente");

        javax.swing.GroupLayout rightSidePanelLayout = new javax.swing.GroupLayout(rightSidePanel);
        rightSidePanel.setLayout(rightSidePanelLayout);
        rightSidePanelLayout.setHorizontalGroup(
            rightSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightSidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rightSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightSidePanelLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(rightSidePanelLayout.createSequentialGroup()
                        .addComponent(userInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addComponent(ConsultationListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        rightSidePanelLayout.setVerticalGroup(
            rightSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightSidePanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(userInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConsultationListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftSidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rightSidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftSidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightSidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void newPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPatientButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newPatientButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         try {
            /* Create and display the form */
            DatabaseConnection databaseConnection = new DatabaseConnection();
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
         }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ConsultationListPanel;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel leftSidePanel;
    private javax.swing.JLabel mobileLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton newPatientButton;
    private javax.swing.JList<Patient> patientList;
    private javax.swing.JPanel patientListPanel;
    private javax.swing.JScrollPane patientScrollPane;
    private javax.swing.JPanel rightSidePanel;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JLabel sexePhoto;
    private javax.swing.JPanel userInfoPanel;
    // End of variables declaration//GEN-END:variables
}