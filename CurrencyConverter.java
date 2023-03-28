import java.awt.Color;
import java.awt.*;
import javax.swing.*;

public class CurrencyConverter extends javax.swing.JFrame 
{
    private javax.swing.JComboBox<String> firstCountry;
    private javax.swing.JLabel firstCurrencyUnit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> secondCountry;
    private javax.swing.JLabel secondCurrencyUnit;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    JFrame frame = new JFrame();

    double US_Dollar = 1.31;
    double Brazilian_Real = 5.47;
    double Canadian_Dollar = 1.71;
    double Indian_Rupee = 95.21;
    double Pakistani_Rupee = 162.74;

    String[] currencyUnits = {
            "Units",
            "US Dollar",
            "Brazilian Real",
            "Canadian Dollar",
            "Indian Rupee",
            "Paskistani Rupee"
    };

    public CurrencyConverter() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() 
    {
        new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        firstCountry = new javax.swing.JComboBox<>();
        secondCountry = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        secondCurrencyUnit = new javax.swing.JLabel();
        firstCurrencyUnit = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(62, 212, 219), 30));
        jPanel1.setBackground(new java.awt.Color(62, 212, 219));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 24));
        jLabel1.setText("Currency Converter");

        firstCountry.setFont(new java.awt.Font("Tahoma", 1, 18));
        firstCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One...", "USA",
                "Brazil", "Canada", "India", "Pakistan" }));
        firstCountry.addItemListener(new java.awt.event.ItemListener() 
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt) 
            {
                firstCountryItemStateChanged(evt);
            }
        });
        firstCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstCountryActionPerformed(evt);
            }
        });

        secondCountry.setFont(new java.awt.Font("Tahoma", 1, 18));

        secondCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One...", "USA",
                "Brazil", "Canada", "India", "Pakistan" }));
        secondCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                secondCountryItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));

        jLabel2.setText("Convert");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));

        jLabel3.setText("To ");

        t1.setFont(new java.awt.Font("Tahoma", 1, 18));

        t2.setFont(new java.awt.Font("Tahoma", 1, 18));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButton1.setText("Convert");
        jButton1.setBackground(new java.awt.Color(214, 4, 0));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButton2.setText("Reset");
        jButton2.setBackground(new java.awt.Color(214, 4, 0));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });


        secondCurrencyUnit.setFont(new java.awt.Font("Tahoma", 1, 14));

        secondCurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        secondCurrencyUnit.setText("units");

        firstCurrencyUnit.setFont(new java.awt.Font("Tahoma", 1, 14));

        firstCurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstCurrencyUnit.setText("units");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);

        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(290, 290, 290))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1)
                                        .addGroup(jPanel1Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(firstCountry, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        Short.MAX_VALUE)
                                                .addComponent(t1)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(firstCurrencyUnit, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        277, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(81, 81, 81)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                .addComponent(jLabel3)
                                                                .addComponent(secondCountry, 0, 272, Short.MAX_VALUE)
                                                                .addComponent(t2))
                                                        .addComponent(secondCurrencyUnit,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 277,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(jButton2)
                                                .addGap(94, 94, 94)
                                               ))
                                .addContainerGap(114, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(firstCountry, javax.swing.GroupLayout.DEFAULT_SIZE, 42,
                                                Short.MAX_VALUE)
                                        .addComponent(secondCountry))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(t1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                                        .addComponent(t2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(secondCurrencyUnit,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 20,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(23, 23, 23))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                .createSequentialGroup()
                                                .addComponent(firstCurrencyUnit, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2))

                                .addContainerGap(57, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        pack();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed

        firstCountry.setSelectedIndex(0);
        secondCountry.setSelectedIndex(0);
        t1.setText("");
        t2.setText("");

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed

        double amountToChange = Double.parseDouble(t1.getText());
        double amountChanged = 0.0;
        double amountInPounds = 0.0;

        switch (firstCountry.getSelectedItem().toString()) {
            case "USA":
                amountInPounds = amountToChange / US_Dollar;
                break;
            case "Brazil":
                amountInPounds = amountToChange / Brazilian_Real;
                break;
            case "Canada":
                amountInPounds = amountToChange / Canadian_Dollar;
                break;
            case "India":
                amountInPounds = amountToChange / Indian_Rupee;
                break;
            case "Pakistan":
                amountInPounds = amountToChange / Pakistani_Rupee;
                break;
            default:
                amountInPounds = 0.0;
        }

        // amount is Changed in pounds

        switch (secondCountry.getSelectedItem().toString()) {
            case "USA":
                amountChanged = amountInPounds * US_Dollar;
                break;
            case "Brazil":
                amountChanged = amountInPounds * Brazilian_Real;
                break;
            case "Canada":
                amountChanged = amountInPounds * Canadian_Dollar;
                break;
            case "India":
                amountChanged = amountInPounds * Indian_Rupee;
                break;
            case "Pakistan":
                amountChanged = amountInPounds * Pakistani_Rupee;
                break;
            default:
                amountChanged = amountInPounds * 0.0;
        }

        String value = String.format("%.2f", amountChanged);

        t2.setText(value);

    }

    private void firstCountryActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_firstCountryActionPerformed

    }

    private void firstCountryItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_firstCountryItemStateChanged
        firstCurrencyUnit.setText(currencyUnits[firstCountry.getSelectedIndex()]);
    }

    private void secondCountryItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_secondCountryItemStateChanged
        secondCurrencyUnit.setText(currencyUnits[secondCountry.getSelectedIndex()]);
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrencyConverter().setVisible(true);
            }
        });
    }

}