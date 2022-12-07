package xrmpe_dedicated;

// Libraries
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class UI_Manager extends javax.swing.JFrame {
    // Server command line variables
    static String var_sv_name = "xrMPE_server";
    static String var_sv_map = "default";
    static String var_sv_password = "";
    static String var_sv_host = "0";
    static String var_sv_mode = "df";
    static String var_sv_players = "4";
    static String var_sv_bin = "dedicated\\xrEngine.exe";
    static String var_sv_fsgame = "..\\fsgame_s.ltx";
    static String var_sv_parameters = "-auto_affinity";
    
    public UI_Manager() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdngrp_host_type = new javax.swing.ButtonGroup();
        ui_preview = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        input_preview_code = new javax.swing.JTextArea();
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
        info_parameters = new javax.swing.JButton();
        info_fsgame = new javax.swing.JButton();
        info_exe_bin = new javax.swing.JButton();
        btn_start = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_about = new javax.swing.JButton();
        log_console = new javax.swing.JTextField();

        input_preview_code.setEditable(false);
        input_preview_code.setBackground(new java.awt.Color(0, 0, 0));
        input_preview_code.setColumns(20);
        input_preview_code.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        input_preview_code.setForeground(new java.awt.Color(255, 255, 255));
        input_preview_code.setLineWrap(true);
        input_preview_code.setRows(5);
        input_preview_code.setText("NO CODE FOUND, PLEASE GENERATE...\n");
        jScrollPane2.setViewportView(input_preview_code);

        javax.swing.GroupLayout ui_previewLayout = new javax.swing.GroupLayout(ui_preview.getContentPane());
        ui_preview.getContentPane().setLayout(ui_previewLayout);
        ui_previewLayout.setHorizontalGroup(
            ui_previewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        ui_previewLayout.setVerticalGroup(
            ui_previewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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

        rdngrp_host_type.add(rdn_lan);
        rdn_lan.setSelected(true);
        rdn_lan.setText("LAN");

        str_host.setText("Host type:");

        info_host.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xrmpe_dedicated/icon_question.png"))); // NOI18N
        info_host.setBorderPainted(false);
        info_host.setContentAreaFilled(false);
        info_host.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showinfo_host(evt);
            }
        });

        rdngrp_host_type.add(rdn_internet);
        rdn_internet.setText("Internet");

        rdn_defence.setSelected(true);
        rdn_defence.setText("Defence");

        str_gamemode.setText("Game mode:");

        box_players.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "3", "2", "1" }));

        str_players.setText("Max players:");

        info_map.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xrmpe_dedicated/icon_question.png"))); // NOI18N
        info_map.setBorderPainted(false);
        info_map.setContentAreaFilled(false);
        info_map.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showinfo_map(evt);
            }
        });

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
                .addContainerGap(16, Short.MAX_VALUE))
        );

        ui_tabs.addTab("Main", ui_main);

        str_exe_bin.setText("Executable bin:");

        input_exe_bin.setText("dedicated\\xrEngine.exe");
        input_exe_bin.setToolTipText("Set the file dir of your xrEngine.exe");

        input_fsgame.setText("..\\fsgame_s.ltx");
        input_fsgame.setToolTipText("Set the file dir of your fsgame.ltx");

        str_fsgame.setText("fsgame file:");

        str_parameters.setText("Start parameters:");

        input_parameters.setColumns(20);
        input_parameters.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        input_parameters.setLineWrap(true);
        input_parameters.setRows(5);
        input_parameters.setText("-auto_affinity");
        input_parameters.setToolTipText("Set new extra parameters.");
        input_parameters.setWrapStyleWord(true);
        jScrollPane1.setViewportView(input_parameters);

        info_parameters.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xrmpe_dedicated/icon_question.png"))); // NOI18N
        info_parameters.setBorderPainted(false);
        info_parameters.setContentAreaFilled(false);
        info_parameters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showinfo_parameters(evt);
            }
        });

        info_fsgame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xrmpe_dedicated/icon_question.png"))); // NOI18N
        info_fsgame.setBorderPainted(false);
        info_fsgame.setContentAreaFilled(false);
        info_fsgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showinfo_fsgame(evt);
            }
        });

        info_exe_bin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xrmpe_dedicated/icon_question.png"))); // NOI18N
        info_exe_bin.setBorderPainted(false);
        info_exe_bin.setContentAreaFilled(false);
        info_exe_bin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showinfo_exe_bin(evt);
            }
        });

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
                                .addComponent(info_parameters)))
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
                .addGap(94, 94, 94))
        );

        ui_tabs.addTab("Advanced", ui_advanced);

        btn_start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xrmpe_dedicated/icon_start.png"))); // NOI18N
        btn_start.setText("Generate");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_server(evt);
            }
        });

        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xrmpe_dedicated/icon_code.png"))); // NOI18N
        btn_edit.setText("View preview code");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_preview(evt);
            }
        });

        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xrmpe_dedicated/icon_clear.png"))); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear(evt);
            }
        });

        btn_about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xrmpe_dedicated/icon_about.png"))); // NOI18N
        btn_about.setText("About");
        btn_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_about(evt);
            }
        });

        log_console.setBackground(new java.awt.Color(0, 0, 0));
        log_console.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        log_console.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ui_tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(log_console)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_about, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ui_tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_about, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(log_console, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void showinfo_map(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showinfo_map
        JOptionPane.showMessageDialog(this, "This is a field for maps, you can put official released maps or custom ones made by the community.\nYou can download custom maps in official xrMPE Discord server.\nMaps are usually named -df_MAPNAME-, if you don't know what to write, here is a list with official maps names:\n\ndf_derevnya\ndf_prost_anom\ndf_baryer\ndf_zastava", "Information about: Maps", 1);
    }//GEN-LAST:event_showinfo_map

    private void showinfo_host(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showinfo_host
        JOptionPane.showMessageDialog(this, "This is a host type selector, you can select if you want your server just to be visible on a Local Network or in Global internet and xrMPE server list -requires portforwarding-", "Information about: Host types", 1);
    }//GEN-LAST:event_showinfo_host

    private void show_about(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_about
        JOptionPane.showMessageDialog(this, "== Unofficial xrMPE Dedicated Server Manager ==\nAuthor & Coder: Rammaken\nApp made with Java using Netbeans IDE 14\nWrapped using Launch4J", "About", 3);
    }//GEN-LAST:event_show_about

    private void clear(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear
        log_console.setText("Cleaning...");
        input_sv_name.setText("xrMPE_server");
        input_sv_map.setText("");
        input_sv_password.setText("");
        input_exe_bin.setText("dedicated\\xrEngine.exe");
        input_fsgame.setText("..\\fsgame_s.ltx");
        input_parameters.setText("-auto_affinity");
        rdn_lan.setSelected(true);
        rdn_defence.setSelected(true);
        getToolkit().beep();
        log_console.setText("Clean finished!");
        
    }//GEN-LAST:event_clear

    private void start_server(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_server
        log_console.setText("Generating server...");

        // If server is LAN
        if(rdn_lan.isSelected()) {
            var_sv_host = "0";
            }
        // If server is Internet
        if(rdn_internet.isSelected()) {
            var_sv_host = "1";
            }
        
        // If game mode is Defence
        if(rdn_defence.isSelected()) {
            // Main  settings var declaration
            var_sv_name = input_sv_name.getText();
            var_sv_password = input_sv_password.getText();
            var_sv_map = input_sv_map.getText();
            var_sv_players = (String)box_players.getSelectedItem();
            var_sv_mode = "df";
            var_bin =
            

            
        // Final code block
        String server_data = var_sv_bin + " -i -fsltx " + var_sv_fsgame + " " + var_sv_parameters + " -start server(" + var_sv_map + "/" + var_sv_mode + "/hname=" + var_sv_name + "/public=" + var_sv_host + "/maxplayers=" + var_sv_players + "/psw=" + var_sv_password + ") client(localhost)";
        
        // Generating and launching the server
        try {
                
        // Generates run file for server
        FileWriter run_server = new FileWriter(".\\bin\\start_dedicated_" + var_sv_map + ".bat");
        BufferedWriter bw = new BufferedWriter(run_server);
        bw.write(server_data);
        bw.close();
        log_console.setText("Run file generated at: \"bin\\start_dedicated_" + var_sv_map + ".bat\"");
        
        } catch (IOException ex) {
        // Error messages
        JOptionPane.showMessageDialog(this, "Unexpected Error!\nPlease, check your parameters and try again...", "Alert", 0);
        log_console.setText("ERROR!");
        }
            
        } else {
            log_console.setText("ERROR!");
            JOptionPane.showMessageDialog(null, "Error!\nGame mode has not been selected.", "Warning!", 0);
        }

    }//GEN-LAST:event_start_server

    private void showinfo_exe_bin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showinfo_exe_bin
        JOptionPane.showMessageDialog(this, "You can change the executable file dir of your dedicated executable binarie.\nIt is usually located on \"bin\\dedicated\\\" folder.", "Information about: Executable bin", 1);
    }//GEN-LAST:event_showinfo_exe_bin

    private void showinfo_fsgame(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showinfo_fsgame
        JOptionPane.showMessageDialog(this, "You can change the configs file dir of your dedicated server.\nIt is usually located in the root folder of your game.", "Information about: fsgame", 1);
    }//GEN-LAST:event_showinfo_fsgame

    private void showinfo_parameters(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showinfo_parameters
        JOptionPane.showMessageDialog(this, "You can add or remove extra parameters for your dedicated servers before running it.", "Information about: Start parameters", 1);
    }//GEN-LAST:event_showinfo_parameters

    private void show_preview(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_preview
        log_console.setText("Showing preview...");
        // If server is LAN
        if(rdn_lan.isSelected()) {
            var_sv_host = "0";
            }
            // If server is Internet
        if(rdn_internet.isSelected()) {
            var_sv_host = "1";
            }
        
        // If game mode is Defence
        if(rdn_defence.isSelected()) {
            // Main  settings var declaration
            var_sv_name = input_sv_name.getText();
            var_sv_password = input_sv_password.getText();
            var_sv_map = input_sv_map.getText();
            var_sv_players = (String)box_players.getSelectedItem();
            var_sv_mode = "df";
            
        // Final code block
        String server_data = var_sv_bin + " -i -fsltx " + var_sv_fsgame + " " + var_sv_parameters + " -start server(" + var_sv_map + "/" + var_sv_mode + "/hname=" + var_sv_name + "/public=" + var_sv_host + "/maxplayers=" + var_sv_players + "/psw=" + var_sv_password + ") client(localhost)";
        input_preview_code.setText(server_data);
        
        ui_preview.show(true);
        ui_preview.setSize(400, 300);
        }
       
    }//GEN-LAST:event_show_preview

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
    private javax.swing.JTextField input_exe_bin;
    private javax.swing.JTextField input_fsgame;
    private javax.swing.JTextArea input_parameters;
    private javax.swing.JTextArea input_preview_code;
    private javax.swing.JTextField input_sv_map;
    private javax.swing.JTextField input_sv_name;
    private javax.swing.JTextField input_sv_password;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField log_console;
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
    private javax.swing.JLabel str_server_name;
    private javax.swing.JPanel ui_advanced;
    private javax.swing.JPanel ui_main;
    private javax.swing.JDialog ui_preview;
    private javax.swing.JTabbedPane ui_tabs;
    // End of variables declaration//GEN-END:variables

}
