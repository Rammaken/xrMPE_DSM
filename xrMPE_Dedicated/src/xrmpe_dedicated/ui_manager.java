package xrmpe_dedicated;

// Libraries
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class ui_manager extends javax.swing.JFrame {
    static String app_version = "1.2";
    static String file_extension = ".bat";
    static String file_path = "..\\";
    static String file_name = "start_dedicated";
    static String sv_host = "0";
    
    public ui_manager() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ui_settings = new javax.swing.JFrame();
        panel_runfile_cfg = new javax.swing.JPanel();
        lbl_file_ext = new javax.swing.JLabel();
        box_file_ext = new javax.swing.JComboBox<>();
        lbl_file_name = new javax.swing.JLabel();
        txt_file_path = new javax.swing.JTextField();
        lbl_file_path = new javax.swing.JLabel();
        txt_file_name = new javax.swing.JTextField();
        btn_restore_default = new javax.swing.JButton();
        btn_apply = new javax.swing.JButton();
        group_host_type = new javax.swing.ButtonGroup();
        pnl_main = new javax.swing.JPanel();
        lbl_sv_name = new javax.swing.JLabel();
        txt_sv_name = new javax.swing.JTextField();
        lbl_sv_map = new javax.swing.JLabel();
        txt_sv_map = new javax.swing.JTextField();
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
        rdn_host_lan = new javax.swing.JRadioButton();
        rdn_host_internet = new javax.swing.JRadioButton();
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

        ui_settings.setTitle("Settings");
        ui_settings.setBounds(new java.awt.Rectangle(0, 0, 400, 300));
        ui_settings.setMinimumSize(new java.awt.Dimension(400, 300));
        ui_settings.setName("ui_cfg"); // NOI18N
        ui_settings.setSize(new java.awt.Dimension(400, 300));

        panel_runfile_cfg.setBorder(javax.swing.BorderFactory.createTitledBorder("Run file settings"));

        lbl_file_ext.setText("File extension:");

        box_file_ext.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".bat", ".cmd", ".txt" }));

        lbl_file_name.setText("File Name:");

        txt_file_path.setText("..\\");

            lbl_file_path.setText("File save path:");

            txt_file_name.setText("start_dedicated");

            javax.swing.GroupLayout panel_runfile_cfgLayout = new javax.swing.GroupLayout(panel_runfile_cfg);
            panel_runfile_cfg.setLayout(panel_runfile_cfgLayout);
            panel_runfile_cfgLayout.setHorizontalGroup(
                panel_runfile_cfgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_runfile_cfgLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panel_runfile_cfgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_file_path)
                        .addGroup(panel_runfile_cfgLayout.createSequentialGroup()
                            .addGroup(panel_runfile_cfgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_file_ext)
                                .addComponent(box_file_ext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_file_name)
                                .addComponent(lbl_file_path)
                                .addComponent(txt_file_name, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 203, Short.MAX_VALUE)))
                    .addContainerGap())
            );
            panel_runfile_cfgLayout.setVerticalGroup(
                panel_runfile_cfgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_runfile_cfgLayout.createSequentialGroup()
                    .addComponent(lbl_file_path, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(2, 2, 2)
                    .addComponent(txt_file_path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lbl_file_name, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txt_file_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_file_ext, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(box_file_ext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(112, 112, 112))
            );

            btn_restore_default.setText("Restore defaults");
            btn_restore_default.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    clear_settings(evt);
                }
            });

            btn_apply.setText("Apply");
            btn_apply.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    apply_settings(evt);
                }
            });

            javax.swing.GroupLayout ui_settingsLayout = new javax.swing.GroupLayout(ui_settings.getContentPane());
            ui_settings.getContentPane().setLayout(ui_settingsLayout);
            ui_settingsLayout.setHorizontalGroup(
                ui_settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ui_settingsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(ui_settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panel_runfile_cfg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ui_settingsLayout.createSequentialGroup()
                            .addComponent(btn_restore_default)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_apply, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
            );
            ui_settingsLayout.setVerticalGroup(
                ui_settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ui_settingsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel_runfile_cfg, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                    .addGroup(ui_settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_restore_default)
                        .addComponent(btn_apply))
                    .addContainerGap())
            );

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

            lbl_sv_host.setText("Host type:");

            lbl_sv_players.setText("Max players:");

            box_sv_players.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "3", "2", "1" }));
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

            group_host_type.add(rdn_host_lan);
            rdn_host_lan.setText("LAN");

            group_host_type.add(rdn_host_internet);
            rdn_host_internet.setText("Internet");

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
                        .addComponent(lbl_sv_mode)
                        .addComponent(txt_sv_mode, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnl_mainLayout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_sv_host)
                                .addComponent(lbl_sv_players)))
                        .addComponent(box_sv_players, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdn_host_lan)
                        .addComponent(rdn_host_internet))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            pnl_mainLayout.setVerticalGroup(
                pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_mainLayout.createSequentialGroup()
                    .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_sv_name, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbl_sv_host, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rdn_host_lan)
                        .addComponent(txt_sv_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rdn_host_internet)
                        .addComponent(lbl_sv_map))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnl_mainLayout.createSequentialGroup()
                            .addComponent(txt_sv_map, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lbl_sv_password)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_sv_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_sv_portsv)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_sv_portsv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnl_mainLayout.createSequentialGroup()
                            .addComponent(lbl_sv_portcl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_sv_portcl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnl_mainLayout.createSequentialGroup()
                            .addComponent(lbl_sv_players)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(box_sv_players, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
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
            txt_sv_parameters.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
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
            btn_settings.setToolTipText("Show the app settings menu.");
            btn_settings.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    show_settings(evt);
                }
            });

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
                            .addComponent(btn_settings)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_about)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(56, 56, 56)
                                    .addComponent(btn_generate, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(pnl_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_final_code)
                                    .addGap(0, 271, Short.MAX_VALUE))
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

        // If server is LAN
        if(rdn_host_lan.isSelected()) {
            sv_host = "0";
        }
        // If server is Internet
        if(rdn_host_internet.isSelected()) {
            sv_host = "1";
        }
            
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
            FileWriter file_generate = new FileWriter(file_path + "\\" + file_name + file_extension);
            BufferedWriter bw = new BufferedWriter(file_generate);
            txt_server_code.write(bw);
            bw.close();
            
            getToolkit().beep(); 
            JOptionPane.showMessageDialog(this, "File generated! Check your folder. \r\n\r\nFile path: " + file_path + "\\" + file_name + file_extension);
                    } 
        catch (IOException ex) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "An error has occurred, check and try again.");
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

    private void show_settings(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_settings
        ui_settings.setSize(400, 300);
        ui_settings.show();
    }//GEN-LAST:event_show_settings

    private void apply_settings(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apply_settings
        file_extension = (String)box_file_ext.getSelectedItem();
        file_path = txt_file_path.getText();
        file_name = txt_file_name.getText();
        getToolkit().beep();
        JOptionPane.showMessageDialog(this, "Settings applied!");
    }//GEN-LAST:event_apply_settings

    private void clear_settings(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_settings
        txt_file_path.setText("..\\");
        txt_file_name.setText("start_dedicated");
        getToolkit().beep();
    }//GEN-LAST:event_clear_settings

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
    private javax.swing.JComboBox<String> box_file_ext;
    private javax.swing.JComboBox<String> box_sv_players;
    private javax.swing.JButton btn_about;
    private javax.swing.JButton btn_apply;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_generate;
    private javax.swing.JButton btn_restore_default;
    private javax.swing.JButton btn_settings;
    private javax.swing.ButtonGroup group_host_type;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_file_ext;
    private javax.swing.JLabel lbl_file_name;
    private javax.swing.JLabel lbl_file_path;
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
    private javax.swing.JLabel lbl_sv_portcl;
    private javax.swing.JLabel lbl_sv_portsv;
    private javax.swing.JPanel panel_runfile_cfg;
    private javax.swing.JPanel pnl_advanced;
    private javax.swing.JPanel pnl_main;
    private javax.swing.JRadioButton rdn_host_internet;
    private javax.swing.JRadioButton rdn_host_lan;
    private javax.swing.JSeparator separator1;
    private javax.swing.JTextField txt_file_name;
    private javax.swing.JTextField txt_file_path;
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
    private javax.swing.JFrame ui_settings;
    // End of variables declaration//GEN-END:variables
}
