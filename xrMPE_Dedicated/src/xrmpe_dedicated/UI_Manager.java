package xrmpe_dedicated;

// Libraries
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class UI_Manager extends javax.swing.JFrame {

    public UI_Manager() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdngrp_host_type = new javax.swing.ButtonGroup();
        ui_tabs = new javax.swing.JTabbedPane();
        ui_main = new javax.swing.JPanel();
        str_server_name = new javax.swing.JLabel();
        input_sv_name = new javax.swing.JTextField();
        str_map = new javax.swing.JLabel();
        input_sv_map = new javax.swing.JTextField();
        str_password = new javax.swing.JLabel();
        input_sv_password = new javax.swing.JTextField();
        rdn_lan = new javax.swing.JRadioButton();
        str_host = new javax.swing.JLabel();
        info_host = new javax.swing.JButton();
        rdn_internet = new javax.swing.JRadioButton();
        rdn_defence = new javax.swing.JRadioButton();
        str_gamemode = new javax.swing.JLabel();
        box_players = new javax.swing.JComboBox<>();
        str_players = new javax.swing.JLabel();
        info_map = new javax.swing.JButton();
        ui_advanced = new javax.swing.JPanel();
        str_exe_bin = new javax.swing.JLabel();
        input_exe_bin = new javax.swing.JTextField();
        input_fsgame = new javax.swing.JTextField();
        str_fsgame = new javax.swing.JLabel();
        str_parameters = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        input_parameters = new javax.swing.JTextArea();
        str_portsv = new javax.swing.JLabel();
        str_portcl = new javax.swing.JLabel();
        input_portsv = new javax.swing.JTextField();
        input_cl = new javax.swing.JTextField();
        info_parameters = new javax.swing.JButton();
        info_fsgame = new javax.swing.JButton();
        info_exe_bin = new javax.swing.JButton();
        btn_start = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_about = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("xrMPE Dedicated Server Manager");
        setLocationByPlatform(true);
        setResizable(false);

        str_server_name.setText("Server name:");

        input_sv_name.setText("xrMPE_server");
        input_sv_name.setToolTipText("Insert the in-game name of your server");

        str_map.setText("Map:");

        input_sv_map.setToolTipText("Select the map you wish to play");

        str_password.setText("Password:");

        input_sv_password.setToolTipText("Set a password for your server (If not, just leave in blank)");
        input_sv_password.setFocusTraversalPolicyProvider(true);

        rdn_lan.setSelected(true);
        rdn_lan.setText("LAN");

        str_host.setText("Host type:");

        info_host.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xrmpe_dedicated/icon_question.png"))); // NOI18N
        info_host.setBorderPainted(false);
        info_host.setContentAreaFilled(false);

        rdn_internet.setText("Internet");

        rdn_defence.setSelected(true);
        rdn_defence.setText("Defence");

        str_gamemode.setText("Game mode:");

        box_players.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "3", "2", "1" }));
        box_players.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_playersActionPerformed(evt);
            }
        });

        str_players.setText("Max players:");

        info_map.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xrmpe_dedicated/icon_question.png"))); // NOI18N
        info_map.setBorderPainted(false);
        info_map.setContentAreaFilled(false);

        javax.swing.GroupLayout ui_mainLayout = new javax.swing.GroupLayout(ui_main);
        ui_main.setLayout(ui_mainLayout);
        ui_mainLayout.setHorizontalGroup(
            ui_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ui_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ui_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ui_mainLayout.createSequentialGroup()
                        .addGroup(ui_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(input_sv_map, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(input_sv_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ui_mainLayout.createSequentialGroup()
                                .addGroup(ui_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(str_server_name, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ui_mainLayout.createSequentialGroup()
                                        .addComponent(str_map)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(info_map)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(36, 36, 36)
                        .addGroup(ui_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(str_players)
                            .addComponent(box_players, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(str_gamemode)
                            .addComponent(rdn_defence))
                        .addGap(33, 33, 33))
                    .addGroup(ui_mainLayout.createSequentialGroup()
                        .addGroup(ui_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(input_sv_password)
                            .addGroup(ui_mainLayout.createSequentialGroup()
                                .addGroup(ui_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(str_password)
                                    .addGroup(ui_mainLayout.createSequentialGroup()
                                        .addComponent(str_host)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(info_host))
                                    .addComponent(rdn_lan)
                                    .addComponent(rdn_internet))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(141, 141, 141))))
        );
        ui_mainLayout.setVerticalGroup(
            ui_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ui_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ui_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ui_mainLayout.createSequentialGroup()
                        .addComponent(str_server_name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input_sv_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ui_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(str_map)
                            .addComponent(info_map, javax.swing.GroupLayout.PREFERRED_SIZE, 18, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input_sv_map, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ui_mainLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(str_players)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box_players, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(str_gamemode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdn_defence)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(str_password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_sv_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ui_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(info_host, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(str_host))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdn_lan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdn_internet)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        ui_tabs.addTab("Main", ui_main);

        str_exe_bin.setText("Executable bin:");

        input_exe_bin.setText("dedicated/xrEngine.exe");
        input_exe_bin.setToolTipText("");

        input_fsgame.setText("dedicated/xrEngine.exe");

        str_fsgame.setText("fsgame file:");

        str_parameters.setText("Start parameters:");

        input_parameters.setColumns(20);
        input_parameters.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        input_parameters.setLineWrap(true);
        input_parameters.setRows(5);
        input_parameters.setText("-auto_affinity\n");
        input_parameters.setWrapStyleWord(true);
        jScrollPane1.setViewportView(input_parameters);

        str_portsv.setText("Port server:");

        str_portcl.setText("Port client:");

        input_portsv.setText("5446");
        input_portsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_portsvActionPerformed(evt);
            }
        });

        input_cl.setText("5447");

        info_parameters.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xrmpe_dedicated/icon_question.png"))); // NOI18N
        info_parameters.setBorderPainted(false);
        info_parameters.setContentAreaFilled(false);

        info_fsgame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xrmpe_dedicated/icon_question.png"))); // NOI18N
        info_fsgame.setBorderPainted(false);
        info_fsgame.setContentAreaFilled(false);

        info_exe_bin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xrmpe_dedicated/icon_question.png"))); // NOI18N
        info_exe_bin.setBorderPainted(false);
        info_exe_bin.setContentAreaFilled(false);

        javax.swing.GroupLayout ui_advancedLayout = new javax.swing.GroupLayout(ui_advanced);
        ui_advanced.setLayout(ui_advancedLayout);
        ui_advancedLayout.setHorizontalGroup(
            ui_advancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ui_advancedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ui_advancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                    .addGroup(ui_advancedLayout.createSequentialGroup()
                        .addGroup(ui_advancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ui_advancedLayout.createSequentialGroup()
                                .addComponent(str_exe_bin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(info_exe_bin))
                            .addGroup(ui_advancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(input_exe_bin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ui_advancedLayout.createSequentialGroup()
                                    .addComponent(str_fsgame)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(info_fsgame))
                                .addComponent(input_fsgame, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(ui_advancedLayout.createSequentialGroup()
                                .addComponent(str_parameters)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(info_parameters))
                            .addGroup(ui_advancedLayout.createSequentialGroup()
                                .addGroup(ui_advancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(input_portsv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(str_portsv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ui_advancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(str_portcl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(input_cl, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                        .addGap(0, 26, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ui_advancedLayout.setVerticalGroup(
            ui_advancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ui_advancedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ui_advancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(str_exe_bin)
                    .addComponent(info_exe_bin, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_exe_bin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ui_advancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(str_fsgame)
                    .addComponent(info_fsgame, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_fsgame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ui_advancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(info_parameters, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(str_parameters))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ui_advancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(str_portsv)
                    .addComponent(str_portcl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ui_advancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_portsv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_cl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        ui_tabs.addTab("Advanced", ui_advanced);

        btn_start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xrmpe_dedicated/icon_start.png"))); // NOI18N
        btn_start.setText("Start server");

        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xrmpe_dedicated/icon_code.png"))); // NOI18N
        btn_edit.setText("Edit/view code");

        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xrmpe_dedicated/icon_clear.png"))); // NOI18N
        btn_clear.setText("Clear");

        btn_about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xrmpe_dedicated/icon_about.png"))); // NOI18N
        btn_about.setText("About");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ui_tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_about, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ui_tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_start, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(btn_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_edit, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(btn_about, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void box_playersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_playersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_playersActionPerformed

    private void input_portsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_portsvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_portsvActionPerformed

    public static void main(String args[]) {
        try {
        UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch(UnsupportedLookAndFeelException e) {
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_Manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_players;
    private javax.swing.JButton btn_about;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_start;
    private javax.swing.JButton info_exe_bin;
    private javax.swing.JButton info_fsgame;
    private javax.swing.JButton info_host;
    private javax.swing.JButton info_map;
    private javax.swing.JButton info_parameters;
    private javax.swing.JTextField input_cl;
    private javax.swing.JTextField input_exe_bin;
    private javax.swing.JTextField input_fsgame;
    private javax.swing.JTextArea input_parameters;
    private javax.swing.JTextField input_portsv;
    private javax.swing.JTextField input_sv_map;
    private javax.swing.JTextField input_sv_name;
    private javax.swing.JTextField input_sv_password;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdn_defence;
    private javax.swing.JRadioButton rdn_internet;
    private javax.swing.JRadioButton rdn_lan;
    private javax.swing.ButtonGroup rdngrp_host_type;
    private javax.swing.JLabel str_exe_bin;
    private javax.swing.JLabel str_fsgame;
    private javax.swing.JLabel str_gamemode;
    private javax.swing.JLabel str_host;
    private javax.swing.JLabel str_map;
    private javax.swing.JLabel str_parameters;
    private javax.swing.JLabel str_password;
    private javax.swing.JLabel str_players;
    private javax.swing.JLabel str_portcl;
    private javax.swing.JLabel str_portsv;
    private javax.swing.JLabel str_server_name;
    private javax.swing.JPanel ui_advanced;
    private javax.swing.JPanel ui_main;
    private javax.swing.JTabbedPane ui_tabs;
    // End of variables declaration//GEN-END:variables
}
