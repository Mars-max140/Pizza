
package pizza;


public class form extends javax.swing.JFrame {
    
    private int i = 1;
    public static double total = 0;
    public form() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        cmoFlavor = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        chkSmallSize = new javax.swing.JRadioButton();
        chkMidSize = new javax.swing.JRadioButton();
        chkLargeSize = new javax.swing.JRadioButton();
        chkExtraCheese = new javax.swing.JCheckBox();
        chkExtraBBQ = new javax.swing.JCheckBox();
        chkOnion = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        chkMushroom = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        increaseQuntity = new javax.swing.JButton();
        decreaseQuantity = new javax.swing.JButton();
        quantity = new javax.swing.JLabel();
        addToOrderBtn = new javax.swing.JButton();
        confirmOrderBtn = new javax.swing.JButton();
        lblSmallSize = new javax.swing.JLabel();
        lblMidSize = new javax.swing.JLabel();
        lblLargeSize = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderList = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmoFlavor.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        cmoFlavor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cheese pizza", "Pepproni pizza", "Mushroom pizza", "Margarita pizza", "Chicken pizza " }));
        cmoFlavor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmoFlavorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Pizza flavour");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Pizza size");

        chkSmallSize.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        chkSmallSize.setSelected(true);
        chkSmallSize.setText("Small");
        chkSmallSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSmallSizeActionPerformed(evt);
            }
        });

        chkMidSize.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        chkMidSize.setText("Medium");
        chkMidSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMidSizeActionPerformed(evt);
            }
        });

        chkLargeSize.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        chkLargeSize.setText("Large");
        chkLargeSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLargeSizeActionPerformed(evt);
            }
        });

        chkExtraCheese.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        chkExtraCheese.setText("Extra Cheese");

        chkExtraBBQ.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        chkExtraBBQ.setText("Extra BBQ");

        chkOnion.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        chkOnion.setText("Onion");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("More : ");

        chkMushroom.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        chkMushroom.setText("Mushroom ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Quantity :");

        increaseQuntity.setBackground(new java.awt.Color(51, 255, 51));
        increaseQuntity.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        increaseQuntity.setText("+");
        increaseQuntity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                increaseQuntityActionPerformed(evt);
            }
        });

        decreaseQuantity.setBackground(new java.awt.Color(255, 102, 102));
        decreaseQuantity.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        decreaseQuantity.setText("-");
        decreaseQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decreaseQuantityActionPerformed(evt);
            }
        });

        quantity.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        quantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantity.setText("1");

        addToOrderBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        addToOrderBtn.setText("Add to order");
        addToOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToOrderBtnActionPerformed(evt);
            }
        });

        confirmOrderBtn.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        confirmOrderBtn.setText("Confirm order");
        confirmOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmOrderBtnActionPerformed(evt);
            }
        });

        lblSmallSize.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSmallSize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSmallSize.setText("30");

        lblMidSize.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMidSize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMidSize.setText("45");

        lblLargeSize.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLargeSize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLargeSize.setText("55");

        orderList.setEditable(false);
        orderList.setColumns(20);
        orderList.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        orderList.setForeground(new java.awt.Color(153, 153, 153));
        orderList.setRows(5);
        jScrollPane1.setViewportView(orderList);

        jButton1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton1.setText("Delete order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        error.setForeground(new java.awt.Color(255, 51, 51));
        error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        error.setText("Please enter your order to confirm");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmoFlavor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkExtraCheese)
                                    .addComponent(chkExtraBBQ))
                                .addGap(40, 40, 40)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkOnion)
                                    .addComponent(chkMushroom)))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(decreaseQuantity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(increaseQuntity))
                            .addComponent(addToOrderBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(chkLargeSize, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(chkSmallSize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(chkMidSize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(75, 75, 75)
                                        .addComponent(lblSmallSize, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblMidSize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblLargeSize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(0, 128, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(confirmOrderBtn))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(cmoFlavor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chkSmallSize)
                            .addComponent(lblSmallSize, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkMidSize)
                            .addComponent(lblMidSize, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkLargeSize)
                            .addComponent(lblLargeSize, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(7, 7, 7)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkExtraCheese)
                            .addComponent(chkOnion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkExtraBBQ)
                            .addComponent(chkMushroom))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(decreaseQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(increaseQuntity, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addToOrderBtn)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(confirmOrderBtn)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(error)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmoFlavorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmoFlavorActionPerformed
        priceChange();
    }//GEN-LAST:event_cmoFlavorActionPerformed

    private void addToOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToOrderBtnActionPerformed
        ShowOrder();
    }//GEN-LAST:event_addToOrderBtnActionPerformed

    private void increaseQuntityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_increaseQuntityActionPerformed
        i++;
        String o= String.valueOf(i);
        quantity.setText(o);
    }//GEN-LAST:event_increaseQuntityActionPerformed

    private void decreaseQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decreaseQuantityActionPerformed
        if (i != 1){
        i--;
        String o= String.valueOf(i);
        quantity.setText(o);}
        
    }//GEN-LAST:event_decreaseQuantityActionPerformed

    private void confirmOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmOrderBtnActionPerformed
        if (orderList.getText().equals("")){
            error.setVisible(true);
        }else {
            new checkOut().setVisible(true);
            checkOut.orderList1.setText(orderList.getText() + "\n\n********************************************************\n\nDelivery\t\t" + "20 L.E" + "\nTotal:\t\t" + (total+20)); 
            error.setVisible(false);
        }    
    }//GEN-LAST:event_confirmOrderBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        total = 0;
        orderList.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void chkSmallSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSmallSizeActionPerformed
        chkMidSize.setSelected(false);
        chkLargeSize.setSelected(false);

    }//GEN-LAST:event_chkSmallSizeActionPerformed

    private void chkMidSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMidSizeActionPerformed
        chkSmallSize.setSelected(false);
        chkLargeSize.setSelected(false);
    }//GEN-LAST:event_chkMidSizeActionPerformed

    private void chkLargeSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkLargeSizeActionPerformed
        chkSmallSize.setSelected(false);
        chkMidSize.setSelected(false);
    }//GEN-LAST:event_chkLargeSizeActionPerformed

    private void priceChange(){
        //cheese pepproni mushroom margirita chicken
        
        if (cmoFlavor.getSelectedIndex() == 0){
            lblSmallSize.setText("30");
            lblMidSize.setText("45");
            lblLargeSize.setText("55");
        }
        else if (cmoFlavor.getSelectedIndex() == 1){
            lblSmallSize.setText("45");
            lblMidSize.setText("55");
            lblLargeSize.setText("60");
        }
        else if (cmoFlavor.getSelectedIndex() == 2){
            lblSmallSize.setText("50");
            lblMidSize.setText("60");
            lblLargeSize.setText("70");
        }
        else if (cmoFlavor.getSelectedIndex() == 3){
            lblSmallSize.setText("30");
            lblMidSize.setText("45");
            lblLargeSize.setText("60");
        }
        else if (cmoFlavor.getSelectedIndex() == 4){
            lblSmallSize.setText("50");
            lblMidSize.setText("55");
            lblLargeSize.setText("65");
        }
    }
    
    private String addMore(){
        String added = "";
        if (chkExtraBBQ.isSelected()){
            total += 10;
            added += "\n\t" + chkExtraBBQ.getText() + "\t\t" + "10.00";
        }if (chkExtraCheese.isSelected()){
            total +=  15;
            added += "\n\t" + chkExtraCheese.getText() + "\t\t" + "15.00";
        }if (chkMushroom.isSelected()){
            total +=  20;
            added += "\n\t" + chkMushroom.getText() + "\t\t" + "20.00";
        }if (chkOnion.isSelected()){
            total +=  10;
            added += "\n\t" + chkOnion.getText() + "\t\t" + "10.00";
        }
        return added;
    }
    private String sizeOfPizza (){
        String size = "";
        
        if (chkSmallSize.isSelected()) size = chkSmallSize.getText();     
        else if (chkMidSize.isSelected()) size = chkMidSize.getText();
        else if (chkLargeSize.isSelected()) size = chkLargeSize.getText();
        
        return size;
    } 
    private double pizzaPrice(){
        double price = 0.00;
        if (chkSmallSize.isSelected()) price = Double.parseDouble(lblSmallSize.getText());
        else if (chkMidSize.isSelected()) price = Double.parseDouble(lblMidSize.getText());
        else if (chkLargeSize.isSelected()) price = Double.parseDouble(lblLargeSize.getText());
        return price;
    }
    
    private void ShowOrder () {
        String flavor = (String)cmoFlavor.getSelectedItem();
        String pizzaSize = (String)sizeOfPizza();
        double price = (double)pizzaPrice();
        String add = (String)addMore();
        int q = i;
        total += price * q;
        orderList.setText(orderList.getText().trim() + "\nFlavor : \t" + flavor + "\n\nSize : \t" + pizzaSize +"\n\nPrice :\t" + price
        + "\n\nAdded : \t" + add + "\n\nQuantity : \t x" + quantity.getText() + "\n\n********************************************************\n\n");
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form().setVisible(true);
                error.setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToOrderBtn;
    private javax.swing.JCheckBox chkExtraBBQ;
    private javax.swing.JCheckBox chkExtraCheese;
    private javax.swing.JRadioButton chkLargeSize;
    private javax.swing.JRadioButton chkMidSize;
    private javax.swing.JCheckBox chkMushroom;
    private javax.swing.JCheckBox chkOnion;
    private javax.swing.JRadioButton chkSmallSize;
    private static javax.swing.JComboBox<String> cmoFlavor;
    private javax.swing.JButton confirmOrderBtn;
    private javax.swing.JButton decreaseQuantity;
    public static javax.swing.JLabel error;
    private javax.swing.JButton increaseQuntity;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLargeSize;
    private javax.swing.JLabel lblMidSize;
    private javax.swing.JLabel lblSmallSize;
    public static javax.swing.JTextArea orderList;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel quantity;
    // End of variables declaration//GEN-END:variables
}
