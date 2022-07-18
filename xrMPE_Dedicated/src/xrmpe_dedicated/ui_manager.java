package xrmpe_dedicated;

// Libraries
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class ui_manager extends javax.swing.JFrame {

    static String app_version = "1.1";
    public ui_manager() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_main = new javax.swing.JPanel();
        lbl_sv_name = new javax.swing.JLabel();
        txt_sv_name = new javax.swing.JTextField();
        lbl_sv_map = new javax.swing.JLabel();
        txt_sv_map = new javax.swing.JTextField();
        box_sv_host = new javax.swing.JComboBox<>();
        lbl_sv_host = new javax.swing.JLabel();
        lbl_sv_players = new javax.swing.JLabel();
        box_sv_players = new javax.swing.JComboBox<>();
        lbl_sv_mode = new javax.swing.JLabel();
        txt_sv_mode = new javax.swing.JTextField();
        lbl_sv_password = new javax.swing.JLabel();
        txt_sv_password = new javax.swing.JTextField();
        lbl_sv_portsv = new javax.swing.JLabel();
        txt_sv_portsv = new javax.swing.JTextField();
        lbl_sv_portcl = new javax.swing.JLabel();
        txt_sv_portcl = new javax.swing.JTextField();
        lbl_sv_players1 = new javax.swing.JLabel();
        lbl_sv_players2 = new javax.swing.JLabel();
        pnl_advanced = new javax.swing.JPanel();
        lbl_sv_bin = new javax.swing.JLabel();
        txt_sv_bin = new javax.swing.JTextField();
        lbl_sv_parameters = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_sv_parameters = new javax.swing.JTextArea();
        lbl_sv_fsgame = new javax.swing.JLabel();
        txt_sv_fsgame = new javax.swing.JTextField();
        btn_generate = new javax.swing.JButton();
        separator1 = new javax.swing.JSeparator();
        btn_clear = new javax.swing.JButton();
        btn_about = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_server_code = new javax.swing.JTextArea();
        lbl_final_code = new javax.swing.JLabel();
        btn_settings = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("xrMPE Dedicated Server Manager");
        setIconImages(null);
        setName("ui_manager"); // NOI18N
        setResizable(false);

        pnl_main.setBorder(javax.swing.BorderFactory.createTitledBorder("Main settings"));
        pnl_main.setToolTipText("Basic and main settings for the dedicated server, this parameters are safe to edit.");

        lbl_sv_name.setText("Server name:");

        txt_sv_name.setToolTipText("Set the name of your dedicated server.");

        lbl_sv_map.setText("Map:");

        txt_sv_map.setToolTipText("Set your dedicated server map.");

        box_sv_host.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1" }));
        box_sv_host.setToolTipText("Set your dedicated server visibility.");

        lbl_sv_host.setText("Host type:");

        lbl_sv_players.setText("Max players:");

        box_sv_players.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        box_sv_players.setToolTipText("Set your dedicated server max amount of players");

        lbl_sv_mode.setText("Game mode:");

        txt_sv_mode.setText("df");
        txt_sv_mode.setToolTipText("Set your dedicated server game mode.");

        lbl_sv_password.setText("Password:");

        txt_sv_password.setToolTipText("Set the password of your dedicated server.");

        lbl_sv_portsv.setText("Port server:");

        txt_sv_portsv.setText("5446");
        txt_sv_portsv.setToolTipText("Set the name of your dedicated server.");

        lbl_sv_portcl.setText("Port client:");

        txt_sv_portcl.setText("5447");
        txt_sv_portcl.setToolTipText("Set the name of your dedicated server.");

        lbl_sv_players1.setText("0 = LAN");

        lbl_sv_players2.setText("1 = Internet");

        javax.swing.GroupLayout pnl_mainLayout = new javax.swing.GroupLayout(pnl_main);
        pnl_main.setLayout(pnl_mainLayout);
        pnl_mainLayout.setHorizontalGroup(
            pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_sv_map, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(txt_sv_name)
                            .addComponent(lbl_sv_map)
                            .addComponent(lbl_sv_name))
                        .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_sv_password, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(lbl_sv_password)))
                    .addGroup(pnl_mainLayout.createSequentialGroup()
                        .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_sv_portsv)
                            .addComponent(lbl_sv_portsv))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_sv_portcl)
                            .addComponent(lbl_sv_portcl))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(box_sv_host, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_sv_mode)
                    .addComponent(txt_sv_mode, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_sv_players, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_mainLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_sv_host)
                            .addComponent(lbl_sv_players)))
                    .addGroup(pnl_mainLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_sv_players1)
                            .addComponent(lbl_sv_players2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_mainLayout.setVerticalGroup(
            pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mainLayout.createSequentialGroup()
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_mainLayout.createSequentialGroup()
                        .addComponent(lbl_sv_name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_sv_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_mainLayout.createSequentialGroup()
                        .addComponent(lbl_sv_host)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box_sv_host, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_mainLayout.createSequentialGroup()
                        .addComponent(lbl_sv_map)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_sv_map, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_mainLayout.createSequentialGroup()
                        .addComponent(lbl_sv_players1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_sv_players2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_mainLayout.createSequentialGroup()
                        .addComponent(lbl_sv_password)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_sv_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_mainLayout.createSequentialGroup()
                                .addComponent(lbl_sv_portsv)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_sv_portsv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_mainLayout.createSequentialGroup()
                                .addComponent(lbl_sv_portcl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_sv_portcl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnl_mainLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_sv_players)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box_sv_players, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_sv_mode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_sv_mode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pnl_advanced.setBorder(javax.swing.BorderFactory.createTitledBorder("Advanced settings"));
        pnl_advanced.setToolTipText("Contains many advanced parameters for the dedicated server.");

        lbl_sv_bin.setText("Exe bin:");

        txt_sv_bin.setText("dedicated\\xrEngine.exe");
        txt_sv_bin.setToolTipText("Set the exe binaries file path for the dedicated server.");

        lbl_sv_parameters.setText("Start parameters:");

        txt_sv_parameters.setColumns(20);
        txt_sv_parameters.setLineWrap(true);
        txt_sv_parameters.setRows(5);
        txt_sv_parameters.setText("-auto_affinity");
        txt_sv_parameters.setToolTipText("Set custom launch parameters for your dedicated server.");
        txt_sv_parameters.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txt_sv_parameters);

        lbl_sv_fsgame.setText("Fsgame ltx file:");

        txt_sv_fsgame.setText("..\\fsgame_s.ltx");
        txt_sv_fsgame.setToolTipText("Set the fsgame.ltx file path for the dedicated server");

        javax.swing.GroupLayout pnl_advancedLayout = new javax.swing.GroupLayout(pnl_advanced);
        pnl_advanced.setLayout(pnl_advancedLayout);
        pnl_advancedLayout.setHorizontalGroup(
            pnl_advancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_advancedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_advancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_advancedLayout.createSequentialGroup()
                        .addGroup(pnl_advancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_sv_bin)
                            .addComponent(lbl_sv_parameters)
                            .addComponent(lbl_sv_fsgame))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnl_advancedLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(pnl_advancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_sv_bin)
                            .addComponent(txt_sv_fsgame))))
                .addContainerGap())
        );
        pnl_advancedLayout.setVerticalGroup(
            pnl_advancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_advancedLayout.createSequentialGroup()
                .addComponent(lbl_sv_bin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_sv_bin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_sv_fsgame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_sv_fsgame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_sv_parameters)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        btn_generate.setText("Generate");
        btn_generate.setToolTipText("Start generation of the final run file code.");
        btn_generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sv_generate(evt);
            }
        });

        btn_clear.setText("Clear");
        btn_clear.setToolTipText("Restore default values to all the options.");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_manager(evt);
            }
        });

        btn_about.setText("About");
        btn_about.setToolTipText("Show misc information about the program");
        btn_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_about(evt);
            }
        });

        txt_server_code.setEditable(false);
        txt_server_code.setBackground(new java.awt.Color(0, 0, 0));
        txt_server_code.setColumns(20);
        txt_server_code.setForeground(new java.awt.Color(255, 255, 255));
        txt_server_code.setLineWrap(true);
        txt_server_code.setRows(5);
        jScrollPane2.setViewportView(txt_server_code);

        lbl_final_code.setText("Final code:");

        btn_settings.setText("Settings");
        btn_settings.setToolTipText("WORK IN PROGRESS...");
        btn_settings.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_clear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_about)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_settings)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(btn_generate, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(pnl_main, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_final_code)
                                .addGap(0, 260, Short.MAX_VALUE))
                            .addComponent(pnl_advanced, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_clear)
                    .addComponent(btn_about)
                    .addComponent(btn_settings))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_advanced, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_final_code)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_generate, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sv_generate(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sv_generate
        // Main  settings var declaration
        String sv_name = txt_sv_name.getText();
        String sv_map = txt_sv_map.getText();
        String sv_host = (String)box_sv_host.getSelectedItem();
        String sv_players = (String)box_sv_players.getSelectedItem();
        String sv_password = txt_sv_password.getText();
        String sv_portsv = txt_sv_portsv.getText();
        String sv_portcl = txt_sv_portcl.getText();
        
        // Advanced settings var declaration
        String sv_mode = txt_sv_mode.getText();
        String sv_bin = txt_sv_bin.getText();
        String sv_parameters = txt_sv_parameters.getText();
        String sv_fsgame = txt_sv_fsgame.getText();
        
        // Final code block
        String server_config = sv_bin + " -i -fsltx " + sv_fsgame + " " + sv_parameters + " -start server(" + sv_map + "/" + sv_mode + "/hname=" + sv_name + "/public=" + sv_host + "/maxplayers=" + sv_players + "/portsv=" + sv_portsv + "/psw=" + sv_password + ") client(localhost/portcl=" + sv_portcl + ")";
        txt_server_code.setText(server_config);
        
        // Generation of batch file
        try {
            FileWriter file_generate = new FileWriter("start_dedicated.bat");
            BufferedWriter bw = new BufferedWriter(file_generate);
            txt_server_code.write(bw);
            bw.close();
            
            getToolkit().beep(); 
            JOptionPane.showMessageDialog(null, "File generated! Check your folder.");
                    } 
        catch (IOException ex) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "An error has occurred, try again.");
        } 
        // Finished
        
    }//GEN-LAST:event_sv_generate

    private void show_about(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_about
        // Shows info dialog
        JOptionPane.showMessageDialog(null, "Unofficial xrMPE Dedicated Server Manager\r\n\r\nMade by Rammaken \r\nDeveloped with Java using NetBeans IDE 13 \r\nVersion: " + app_version + "\r\n\r\n2022");
    }//GEN-LAST:event_show_about

    private void clear_manager(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_manager
        // Clears all the input areas in the main UI
        txt_sv_name.setText("");
        txt_sv_map.setText("");
        txt_sv_password.setText("");
        txt_sv_mode.setText("df");
        txt_sv_bin.setText("dedicated\\xrEngine.exe");        
        txt_sv_parameters.setText("-auto_affinity");
        txt_sv_fsgame.setText("..\\fsgame_s.ltx");
        txt_sv_portsv.setText("5446");
        txt_sv_portcl.setText("5447");
        txt_server_code.setText(""); 
        getToolkit().beep(); 
        
    }//GEN-LAST:event_clear_manager

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set thes Nimbus look and feel */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ui_manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ui_manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ui_manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ui_manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ui_manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_sv_host;
    private javax.swing.JComboBox<String> box_sv_players;
    private javax.swing.JButton btn_about;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_generate;
    private javax.swing.JButton btn_settings;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_final_code;
    private javax.swing.JLabel lbl_sv_bin;
    private javax.swing.JLabel lbl_sv_fsgame;
    private javax.swing.JLabel lbl_sv_host;
    private javax.swing.JLabel lbl_sv_map;
    private javax.swing.JLabel lbl_sv_mode;
    private javax.swing.JLabel lbl_sv_name;
    private javax.swing.JLabel lbl_sv_parameters;
    private javax.swing.JLabel lbl_sv_password;
    private javax.swing.JLabel lbl_sv_players;
    private javax.swing.JLabel lbl_sv_players1;
    private javax.swing.JLabel lbl_sv_players2;
    private javax.swing.JLabel lbl_sv_portcl;
    private javax.swing.JLabel lbl_sv_portsv;
    private javax.swing.JPanel pnl_advanced;
    private javax.swing.JPanel pnl_main;
    private javax.swing.JSeparator separator1;
    private javax.swing.JTextArea txt_server_code;
    private javax.swing.JTextField txt_sv_bin;
    private javax.swing.JTextField txt_sv_fsgame;
    private javax.swing.JTextField txt_sv_map;
    private javax.swing.JTextField txt_sv_mode;
    private javax.swing.JTextField txt_sv_name;
    private javax.swing.JTextArea txt_sv_parameters;
    private javax.swing.JTextField txt_sv_password;
    private javax.swing.JTextField txt_sv_portcl;
    private javax.swing.JTextField txt_sv_portsv;
    // End of variables declaration//GEN-END:variables
}
