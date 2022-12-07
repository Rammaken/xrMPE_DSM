package xrmpe_dedicated;

// Libraries
<<<<<<< HEAD
import com.formdev.flatlaf.FlatIntelliJLaf;
=======
import java.awt.event.KeyEvent;
>>>>>>> e4d79d89393d520a28d29144255638d91bebb999
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class ui_manager extends javax.swing.JFrame {
    static String app_version = "1.3";
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
<<<<<<< HEAD
        rdn_host_type = new javax.swing.ButtonGroup();
        btn_generate = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_about = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
=======
        group_host_type = new javax.swing.ButtonGroup();
        pnl_main = new javax.swing.JPanel();
>>>>>>> e4d79d89393d520a28d29144255638d91bebb999
        lbl_sv_name = new javax.swing.JLabel();
        txt_sv_name = new javax.swing.JTextField();
        lbl_sv_map = new javax.swing.JLabel();
        txt_sv_map = new javax.swing.JTextField();
<<<<<<< HEAD
        lbl_sv_password = new javax.swing.JLabel();
        txt_sv_password = new javax.swing.JTextField();
=======
>>>>>>> e4d79d89393d520a28d29144255638d91bebb999
        lbl_sv_host = new javax.swing.JLabel();
        rnd_host_lan = new javax.swing.JRadioButton();
        rnd_host_internet = new javax.swing.JRadioButton();
        lbl_sv_players = new javax.swing.JLabel();
        box_sv_players = new javax.swing.JComboBox<>();
        lbl_sv_mode = new javax.swing.JLabel();
<<<<<<< HEAD
        jRadioButton1 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
=======
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
>>>>>>> e4d79d89393d520a28d29144255638d91bebb999
        lbl_sv_bin = new javax.swing.JLabel();
        txt_sv_bin = new javax.swing.JTextField();
        lbl_sv_fsgame = new javax.swing.JLabel();
        txt_sv_fsgame = new javax.swing.JTextField();
        lbl_sv_parameters = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_sv_parameters = new javax.swing.JTextArea();
        lbl_sv_portsv = new javax.swing.JLabel();
        txt_sv_portsv = new javax.swing.JTextField();
        txt_sv_portcl = new javax.swing.JTextField();
        lbl_sv_portcl = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btn_generate1 = new javax.swing.JButton();

        ui_settings.setTitle("Settings");
        ui_settings.setBounds(new java.awt.Rectangle(0, 0, 400, 300));
        ui_settings.setMinimumSize(new java.awt.Dimension(400, 300));
        ui_settings.setName("ui_cfg"); // NOI18N
<<<<<<< HEAD
=======
        ui_settings.setResizable(false);
>>>>>>> e4d79d89393d520a28d29144255638d91bebb999
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

            btn_generate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xrmpe_dedicated/icon_start.png"))); // NOI18N
            btn_generate.setText("Start Server");
            btn_generate.setToolTipText("Start generation of the final run file code.");
            btn_generate.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    sv_generate(evt);
                }
            });

            btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xrmpe_dedicated/icon_clear.png"))); // NOI18N
            btn_clear.setText("Clear");
            btn_clear.setToolTipText("Restore default values to all the options.");
            btn_clear.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    clear_manager(evt);
                }
            });

            btn_about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xrmpe_dedicated/icon_about.png"))); // NOI18N
            btn_about.setText("About");
            btn_about.setToolTipText("Show misc information about the program");
            btn_about.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    show_about(evt);
                }
            });

            lbl_sv_name.setText("Server Name:");

            txt_sv_name.setToolTipText("Set the name of your dedicated server.");

            lbl_sv_map.setText("Map:");

            txt_sv_map.setToolTipText("Set your dedicated server map.");

<<<<<<< HEAD
=======
            lbl_sv_host.setText("Host type:");

            lbl_sv_players.setText("Max players:");

            box_sv_players.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "3", "2", "1" }));
            box_sv_players.setToolTipText("Set your dedicated server max amount of players");

            lbl_sv_mode.setText("Game mode:");

            txt_sv_mode.setText("df");
            txt_sv_mode.setToolTipText("Set your dedicated server game mode.");

>>>>>>> e4d79d89393d520a28d29144255638d91bebb999
            lbl_sv_password.setText("Password:");

            txt_sv_password.setToolTipText("Set the password of your dedicated server.");

            lbl_sv_host.setText("Host type:");

            rdn_host_type.add(rnd_host_lan);
            rnd_host_lan.setSelected(true);
            rnd_host_lan.setText("LAN");

            rdn_host_type.add(rnd_host_internet);
            rnd_host_internet.setText("Internet");

            lbl_sv_players.setText("Max players:");

<<<<<<< HEAD
            box_sv_players.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "3", "2", "1" }));
            box_sv_players.setToolTipText("Set your dedicated server max amount of players");

            lbl_sv_mode.setText("Game mode:");
=======
            group_host_type.add(rdn_host_lan);
            rdn_host_lan.setText("LAN");

            group_host_type.add(rdn_host_internet);
            rdn_host_internet.setText("Internet");
>>>>>>> e4d79d89393d520a28d29144255638d91bebb999

            jRadioButton1.setSelected(true);
            jRadioButton1.setText("Defence");

            jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xrmpe_dedicated/icon_question.png"))); // NOI18N
            jButton2.setBorderPainted(false);
            jButton2.setContentAreaFilled(false);

            jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xrmpe_dedicated/icon_question.png"))); // NOI18N
            jButton3.setBorderPainted(false);
            jButton3.setContentAreaFilled(false);

            jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xrmpe_dedicated/icon_question.png"))); // NOI18N
            jButton4.setBorderPainted(false);
            jButton4.setContentAreaFilled(false);

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
<<<<<<< HEAD
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lbl_sv_host)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton3))
                        .addComponent(rnd_host_lan)
                        .addComponent(rnd_host_internet)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_sv_name, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_sv_name)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_sv_password, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                        .addComponent(lbl_sv_password))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_sv_map)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2)
                                        .addGap(90, 90, 90)))
                                .addComponent(txt_sv_map, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(29, 29, 29)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbl_sv_mode)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(lbl_sv_players))
                                .addComponent(box_sv_players, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jRadioButton1))))
                    .addGap(23, 23, 23))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lbl_sv_name)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_sv_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbl_sv_map, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_sv_map, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
=======
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
                        .addComponent(rdn_host_lan)
                        .addComponent(rdn_host_internet)
                        .addComponent(box_sv_players, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnl_mainLayout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_sv_host)
                                .addComponent(lbl_sv_players))))
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
                            .addComponent(txt_sv_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnl_mainLayout.createSequentialGroup()
>>>>>>> e4d79d89393d520a28d29144255638d91bebb999
                            .addComponent(lbl_sv_players)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(box_sv_players, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_mainLayout.createSequentialGroup()
                            .addComponent(lbl_sv_portsv)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
<<<<<<< HEAD
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbl_sv_mode)
                                    .addGap(28, 28, 28))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGap(8, 8, 8)
                                    .addComponent(jRadioButton1)))))
                    .addGap(4, 4, 4)
                    .addComponent(lbl_sv_password)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txt_sv_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(lbl_sv_host, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(rnd_host_lan)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(rnd_host_internet)
                    .addContainerGap(47, Short.MAX_VALUE))
=======
                            .addComponent(txt_sv_portsv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_mainLayout.createSequentialGroup()
                            .addComponent(lbl_sv_portcl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_sv_portcl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_mainLayout.createSequentialGroup()
                            .addComponent(lbl_sv_mode)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_sv_mode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
>>>>>>> e4d79d89393d520a28d29144255638d91bebb999
            );

            jTabbedPane1.addTab("Main", jPanel1);

            lbl_sv_bin.setText("Executable bin:");

            txt_sv_bin.setText("dedicated\\xrEngine.exe");
            txt_sv_bin.setToolTipText("Set the exe binaries file path for the dedicated server.");

            lbl_sv_fsgame.setText("fsgame:");

            txt_sv_fsgame.setText("..\\fsgame_s.ltx");
            txt_sv_fsgame.setToolTipText("Set the fsgame.ltx file path for the dedicated server");

            lbl_sv_parameters.setText("Start parameters:");

            txt_sv_parameters.setColumns(20);
            txt_sv_parameters.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
            txt_sv_parameters.setLineWrap(true);
            txt_sv_parameters.setRows(5);
            txt_sv_parameters.setText("-auto_affinity");
            txt_sv_parameters.setToolTipText("Set custom launch parameters for your dedicated server.");
            txt_sv_parameters.setWrapStyleWord(true);
            jScrollPane1.setViewportView(txt_sv_parameters);

            lbl_sv_portsv.setText("Port server:");

            txt_sv_portsv.setText("5446");
            txt_sv_portsv.setToolTipText("Set the name of your dedicated server.");

            txt_sv_portcl.setText("5447");
            txt_sv_portcl.setToolTipText("Set the name of your dedicated server.");

            lbl_sv_portcl.setText("Port client:");

            jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xrmpe_dedicated/icon_question.png"))); // NOI18N
            jButton5.setBorderPainted(false);
            jButton5.setContentAreaFilled(false);

            jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xrmpe_dedicated/icon_question.png"))); // NOI18N
            jButton6.setBorderPainted(false);
            jButton6.setContentAreaFilled(false);

            jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xrmpe_dedicated/icon_question.png"))); // NOI18N
            jButton7.setBorderPainted(false);
            jButton7.setContentAreaFilled(false);

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(lbl_sv_bin)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton5))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(lbl_sv_parameters)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton7))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(txt_sv_bin, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(lbl_sv_fsgame)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton6))
                                .addComponent(txt_sv_fsgame, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_sv_portsv)
                                        .addComponent(lbl_sv_portsv))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_sv_portcl)
                                        .addComponent(lbl_sv_portcl))))
                            .addGap(0, 38, Short.MAX_VALUE)))
                    .addContainerGap())
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_sv_bin)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txt_sv_bin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(lbl_sv_fsgame))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txt_sv_fsgame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(lbl_sv_parameters))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lbl_sv_portsv)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_sv_portsv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lbl_sv_portcl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_sv_portcl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(84, 84, 84))
            );

            jTabbedPane1.addTab("Advanced", jPanel2);

            btn_generate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xrmpe_dedicated/icon_code.png"))); // NOI18N
            btn_generate1.setText("View/edit code");
            btn_generate1.setToolTipText("Start generation of the final run file code.");
            btn_generate1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
<<<<<<< HEAD
                    btn_generate1sv_generate(evt);
=======
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
>>>>>>> e4d79d89393d520a28d29144255638d91bebb999
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_generate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_generate1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
                        .addComponent(btn_about, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
=======
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
                                    .addGap(6, 6, 6)
                                    .addComponent(pnl_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(74, 74, 74)
                                    .addComponent(btn_generate, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_final_code)
                                    .addGap(0, 271, Short.MAX_VALUE))
                                .addComponent(pnl_advanced, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2))))
>>>>>>> e4d79d89393d520a28d29144255638d91bebb999
                    .addContainerGap())
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(12, 12, 12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_generate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
<<<<<<< HEAD
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_about, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_generate1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
=======
                    .addComponent(separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pnl_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnl_advanced, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lbl_final_code)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(btn_generate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
>>>>>>> e4d79d89393d520a28d29144255638d91bebb999
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
        JOptionPane.showMessageDialog(null, "Unofficial xrMPE Dedicated Server Manager\r\n\r\nMade by Rammaken \r\nDeveloped with Java using NetBeans IDE 14 \r\nVersion: " + app_version + "\r\n\r\n2022");
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

<<<<<<< HEAD
    private void btn_generate1sv_generate(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generate1sv_generate
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_generate1sv_generate

    /**
     * @param args the command line arguments
     */
=======
>>>>>>> e4d79d89393d520a28d29144255638d91bebb999
    public static void main(String args[]) {
        try {
        UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch(UnsupportedLookAndFeelException e) {
        }
        
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
    private javax.swing.JButton btn_generate1;
    private javax.swing.JButton btn_restore_default;
<<<<<<< HEAD
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
=======
    private javax.swing.JButton btn_settings;
    private javax.swing.ButtonGroup group_host_type;
>>>>>>> e4d79d89393d520a28d29144255638d91bebb999
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_file_ext;
    private javax.swing.JLabel lbl_file_name;
    private javax.swing.JLabel lbl_file_path;
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
<<<<<<< HEAD
    private javax.swing.ButtonGroup rdn_host_type;
    private javax.swing.JRadioButton rnd_host_internet;
    private javax.swing.JRadioButton rnd_host_lan;
=======
    private javax.swing.JPanel pnl_advanced;
    private javax.swing.JPanel pnl_main;
    private javax.swing.JRadioButton rdn_host_internet;
    private javax.swing.JRadioButton rdn_host_lan;
    private javax.swing.JSeparator separator1;
>>>>>>> e4d79d89393d520a28d29144255638d91bebb999
    private javax.swing.JTextField txt_file_name;
    private javax.swing.JTextField txt_file_path;
    private javax.swing.JTextField txt_sv_bin;
    private javax.swing.JTextField txt_sv_fsgame;
    private javax.swing.JTextField txt_sv_map;
    private javax.swing.JTextField txt_sv_name;
    private javax.swing.JTextArea txt_sv_parameters;
    private javax.swing.JTextField txt_sv_password;
    private javax.swing.JTextField txt_sv_portcl;
    private javax.swing.JTextField txt_sv_portsv;
    private javax.swing.JFrame ui_settings;
    // End of variables declaration//GEN-END:variables
}
