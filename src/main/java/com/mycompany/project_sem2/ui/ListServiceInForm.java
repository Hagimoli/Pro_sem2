/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project_sem2.ui;

import com.mycompany.project_sem2.dao.InputServiceDao;
import com.mycompany.project_sem2.helpers.DatabaseHelper;
import com.mycompany.project_sem2.model.InputService;
import java.awt.Color;
import java.awt.Container;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

import java.util.List;
import javax.swing.JFrame;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Hi-XV
 */
public class ListServiceInForm extends javax.swing.JFrame {

    DefaultTableModel model = null;
    
    /**
     * Creates new form ListSupplier
     */
    public ListServiceInForm() {
        initComponents();
        
       
        model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Id service ", "Name service", 
            "Quantity", "Price","Total price","Description","Import date" ,"Name supplier"});
        tblServiceIn.setModel(model);
        
         try {
             String sql = " select NameSupplier from ServiceSupplier";
            Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery();
                listNameSupplier.removeAllItems();
                while(rs.next()){
                    String name = rs.getString("NameSupplier");
                        listNameSupplier.addItem(name);
                        
        }
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error:" + e.getMessage());
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        mnuDeleteSupplier = new javax.swing.JMenuItem();
        mnuUpdateService = new javax.swing.JMenuItem();
        jPanelUpdate = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtNameService = new javax.swing.JTextField();
        listNameSupplier = new javax.swing.JComboBox<>();
        txtQuantity = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtTotalPrice = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnUpdateServiceIn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jDateServiceIn = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        btnFindByPhone = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtPhoneSupplierF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNameServiceIn = new javax.swing.JTextField();
        btnFindByName = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblServiceIn = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        mnuDeleteSupplier.setText("Delete");
        mnuDeleteSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDeleteSupplierActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mnuDeleteSupplier);

        mnuUpdateService.setText("Update");
        mnuUpdateService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuUpdateServiceActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mnuUpdateService);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setText("Input Service");

        jLabel10.setText("Name service:");

        jLabel11.setText("Quanttity:");

        jLabel12.setText("Price:");

        jLabel13.setText("Total price:");

        jLabel15.setText("Description:");

        jLabel16.setText("Name supplier:");

        txtNameService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameServiceActionPerformed(evt);
            }
        });

        listNameSupplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listNameSupplier.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listNameSupplierItemStateChanged(evt);
            }
        });
        listNameSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listNameSupplierActionPerformed(evt);
            }
        });

        txtQuantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQuantityFocusLost(evt);
            }
        });

        txtPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPriceFocusLost(evt);
            }
        });
        txtPrice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPriceMouseExited(evt);
            }
        });

        txtTotalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPriceActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("VND");

        btnUpdateServiceIn.setText("Update");
        btnUpdateServiceIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateServiceInActionPerformed(evt);
            }
        });

        jLabel1.setText("Import date:");

        jLabel4.setText("jLabel4");

        txtId.setText("jLabel5");

        jButton1.setText("Back");

        javax.swing.GroupLayout jPanelUpdateLayout = new javax.swing.GroupLayout(jPanelUpdate);
        jPanelUpdate.setLayout(jPanelUpdateLayout);
        jPanelUpdateLayout.setHorizontalGroup(
            jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUpdateLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdateServiceIn)
                .addGap(117, 117, 117))
            .addGroup(jPanelUpdateLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUpdateLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(listNameSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUpdateLayout.createSequentialGroup()
                        .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel10)
                            .addComponent(jLabel15)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId)
                            .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtQuantity)
                                .addComponent(txtNameService)
                                .addComponent(jLabel9)
                                .addComponent(txtDescription)
                                .addComponent(txtTotalPrice)
                                .addGroup(jPanelUpdateLayout.createSequentialGroup()
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel17))
                                .addComponent(jDateServiceIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(54, 54, 54))
        );
        jPanelUpdateLayout.setVerticalGroup(
            jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUpdateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(21, 21, 21)
                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtId))
                .addGap(18, 18, 18)
                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtNameService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jDateServiceIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(listNameSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateServiceIn)
                    .addComponent(jButton1))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Find Supplier", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 130));

        btnFindByPhone.setText("Find by phone");
        btnFindByPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindByPhoneActionPerformed(evt);
            }
        });

        jLabel2.setText("Phone supplier:");

        jLabel3.setText("Name supplier:");

        txtNameServiceIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameServiceInActionPerformed(evt);
            }
        });

        btnFindByName.setText("Find by name");
        btnFindByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindByNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPhoneSupplierF)
                    .addComponent(txtNameServiceIn, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFindByPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFindByName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhoneSupplierF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnFindByPhone))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNameServiceIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnFindByName)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        tblServiceIn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblServiceIn.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblServiceInAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tblServiceIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblServiceInMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblServiceInMouseReleased(evt);
            }
        });
        tblServiceIn.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tblServiceInComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(tblServiceIn);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        jLabel7.setText("Input service");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(321, 321, 321)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblServiceInAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblServiceInAncestorAdded
       
    }//GEN-LAST:event_tblServiceInAncestorAdded

    private void tblServiceInComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tblServiceInComponentShown
       
    }//GEN-LAST:event_tblServiceInComponentShown

    private void btnFindByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindByNameActionPerformed
       
        
         try {
            
            InputServiceDao inser = new InputServiceDao();
            
            
            List<InputService> list = inser.findByNameService(txtNameServiceIn.getText());
            model.setRowCount(0);
            if (list.size() > 0) {
                for (InputService item : list) 
                {
                    model.addRow(new Object[]{
                        item.getIdServerIn(),
                        item.getNameService(),
                        item.getQuantity(),
                        item.getPrice(),
                        item.getTotalPrice(),
                        item.getDescription(),
                        item.getImportDate(),
                        
                        item.getNameSupplier()
                    });
                }

              
                model.fireTableDataChanged();
            } else {
                JOptionPane.showMessageDialog(this, "No product found! ");
            }

            
        } catch (Exception ex) {      
             JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnFindByNameActionPerformed

    private void btnFindByPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindByPhoneActionPerformed
       
        
        
    }//GEN-LAST:event_btnFindByPhoneActionPerformed

    private void txtNameServiceInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameServiceInActionPerformed
       
    }//GEN-LAST:event_txtNameServiceInActionPerformed

    private void tblServiceInMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblServiceInMouseReleased
        
         if(evt.isPopupTrigger()){
            jPopupMenu1.show(this, evt.getX(), evt.getY());
        }
        
    }//GEN-LAST:event_tblServiceInMouseReleased

    private void mnuDeleteSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDeleteSupplierActionPerformed
        
        int row = tblServiceIn.getSelectedRow();
         if(row >= 0){
        try {
           
            InputService pro = new InputService();
            pro.setIdServerIn((int) tblServiceIn.getValueAt(row, 0));
             InputServiceDao dao = new InputServiceDao();
            if(dao.deleteServiceIn(pro.getIdServerIn())){
                    JOptionPane.showMessageDialog(this, "Do you want delete!");
                    
                }else{
                    JOptionPane.showMessageDialog(this, "No delete this supplier!");
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error:" + e.getMessage());
        }
            
        }
        
    }//GEN-LAST:event_mnuDeleteSupplierActionPerformed

    private void tblServiceInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblServiceInMouseClicked
        
       
        
    }//GEN-LAST:event_tblServiceInMouseClicked

    private void mnuUpdateServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuUpdateServiceActionPerformed
        // TODO add your handling code here:
        int row = tblServiceIn.getSelectedRow();
        
        if(row >= 0){
          JFrame jf = new JFrame();
            Container pane = jf.getContentPane();
        jf.getContentPane().add(jPanelUpdate);
        jf.setVisible(true);
            
         int i = tblServiceIn.getSelectedRow();
        TableModel tm = tblServiceIn.getModel();
        txtId.setText(tm.getValueAt(i, 0).toString());
        txtNameService.setText(tm.getValueAt(i, 1).toString());
        
        txtQuantity.setText(tm.getValueAt(i, 2).toString());
        txtPrice.setText(tm.getValueAt(i, 3).toString());
        txtTotalPrice.setText(tm.getValueAt(i, 4).toString());
        txtDescription.setText(tm.getValueAt(i, 5).toString());
//        jDateServiceIn.setDateFormatString(tm.getValueAt(i,6).toString()); 
            try {
                int n = tblServiceIn.getSelectedRow();
                 Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String) tm.getValueAt(n,6).toString());
                 jDateServiceIn.setDate(date);
            } catch (Exception e) {
            }    
            listNameSupplier.setSelectedItem(tm.getValueAt(i, 7).toString());
       
        }
        
    }//GEN-LAST:event_mnuUpdateServiceActionPerformed

    private void txtNameServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameServiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameServiceActionPerformed

    private void listNameSupplierItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listNameSupplierItemStateChanged

//                try {
//                         String sql = " select NameSupplier from ServiceSupplier";
//                        Connection con = DatabaseHelper.openConnection();
//                            PreparedStatement pstmt = con.prepareStatement(sql);
//                            ResultSet rs = pstmt.executeQuery(sql);
//                            listNameSupplier.removeAllItems();
//                            while(rs.next()){
//                                String name = rs.getString("NameSupplier");
//                                        listNameSupplier.addItem(name);
//                        }
//            
//                    } catch (Exception e) {
//                        JOptionPane.showMessageDialog(this, "Error:" + e.getMessage());
//                    }
        
    }//GEN-LAST:event_listNameSupplierItemStateChanged

    private void listNameSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listNameSupplierActionPerformed

    }//GEN-LAST:event_listNameSupplierActionPerformed

    private void txtPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPriceFocusLost

        int a = Integer.parseInt(txtQuantity.getText());

        double b = Double.parseDouble(txtPrice.getText());
        double c = a*b;
        txtTotalPrice.setText(String.valueOf(c));
    }//GEN-LAST:event_txtPriceFocusLost

    private void txtPriceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPriceMouseExited

    }//GEN-LAST:event_txtPriceMouseExited

    private void txtTotalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalPriceActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTotalPriceActionPerformed

    private void btnUpdateServiceInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateServiceInActionPerformed
        // TODO add your handling code here:
         try {
            StringBuilder sb = new StringBuilder();
            if (txtNameService.getText().equals("")) {
                sb.append("Name is required? \n");
                txtNameService.setBackground(Color.LIGHT_GRAY);
                txtNameService.requestFocus();

                if(sb.length()>0){
                    JOptionPane.showMessageDialog(this, sb.toString());
                }
            } else {
                txtNameService.setBackground(Color.WHITE);
            }

            InputService inser = new InputService();
            inser.setNameService(txtNameService.getText());
            inser.setQuantity(Integer.parseInt(txtQuantity.getText()));
            inser.setPrice(Double.parseDouble(txtPrice.getText()));
            inser.setTotalPrice(Double.parseDouble(txtTotalPrice.getText()));
            inser.setDescription(txtDescription.getText());
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String date = dateFormat.format(jDateServiceIn.getDate());
            inser.setImportDate(date);          
                String namesupplier =  (String) listNameSupplier.getSelectedItem();
            inser.setNameSupplier(namesupplier);
            inser.setIdServerIn(Integer.parseInt(txtId.getText()));

            InputServiceDao dao = new InputServiceDao();
            if(dao.updateService(inser)){
                JOptionPane.showMessageDialog(this, "Update successful!");

            }else{
                JOptionPane.showMessageDialog(this, "Update failed!");
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error:" + e.getMessage());
        }
        
        
    }//GEN-LAST:event_btnUpdateServiceInActionPerformed

    private void txtQuantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantityFocusLost
        // TODO add your handling code here:
        int a = Integer.parseInt(txtQuantity.getText());

        double b = Double.parseDouble(txtPrice.getText());
        double c = a*b;
        txtTotalPrice.setText(String.valueOf(c));
    }//GEN-LAST:event_txtQuantityFocusLost

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
            java.util.logging.Logger.getLogger(ListServiceInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListServiceInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListServiceInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListServiceInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListServiceInForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFindByName;
    private javax.swing.JButton btnFindByPhone;
    private javax.swing.JButton btnUpdateServiceIn;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateServiceIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelUpdate;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> listNameSupplier;
    private javax.swing.JMenuItem mnuDeleteSupplier;
    private javax.swing.JMenuItem mnuUpdateService;
    private javax.swing.JTable tblServiceIn;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JLabel txtId;
    private javax.swing.JTextField txtNameService;
    private javax.swing.JTextField txtNameServiceIn;
    private javax.swing.JTextField txtPhoneSupplierF;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtTotalPrice;
    // End of variables declaration//GEN-END:variables
}
