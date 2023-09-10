package Source;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ui_manager extends javax.swing.JFrame {

    public ui_manager() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("app_icon.png")).getImage());
        this.setLocationRelativeTo(null);
        loadMaps();
    }
    
    public void loadMaps() {
        String maps_list_root = ".\\maps_list.txt";
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(maps_list_root));
            String linea;
            ArrayList<String> maps_values = new ArrayList<String>();

            while ((linea = br.readLine()) != null) {
                maps_values.add(linea);
            }

            for (String value : maps_values) {
                combo_sv_map.addItem(value);
            }
        } catch (IOException e) {
            e.printStackTrace();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Error at reading maps, check if 'maps_list.txt' file exists in the installed folder and then restart this program.\n\nLog: " + e.getMessage(), "Error", 0);
            combo_sv_map.addItem("MAPS NOT FOUND!");
        }
    }
    
    public void loadCrashLog() {
        try {
            String temp_user_name = System.getProperty("user.name");
            BufferedReader br = new BufferedReader(new FileReader("..\\_appdata_server\\logs\\xray_" + temp_user_name + ".log"));
            String line;
            boolean found = false;
            
            ArrayList<String> crash_data = new ArrayList<>();

            while ((line = br.readLine()) != null) {
                if (line.contains("FATAL ERROR")) {
                    found = true;
                }

                if (found) {
                    crash_data.add(line);

                    // Verifica si se han almacenado las 11 líneas posteriores
                    if (crash_data.size() >= 11) {
                        break;
                    }
                }
            }
            
            JOptionPane.showMessageDialog(null, crash_data.get(0) + "\n" + crash_data.get(1) + "\n" + crash_data.get(2) + "\n" + crash_data.get(3) +"\n" + crash_data.get(4) +"\n" + crash_data.get(5) +"\n" + crash_data.get(6) +"\n" + crash_data.get(7) +"\n" + crash_data.get(8) +"\n" + crash_data.get(9) +"\n" + crash_data.get(10), "Crash log", 0);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed at trying to automtically retrieve crash log. \nCheck '_appdata_server' folder for full information.");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filter_host = new javax.swing.ButtonGroup();
        filter_gamemode = new javax.swing.ButtonGroup();
        ui_about = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_add_aplicar1 = new javax.swing.JButton();
        tabs = new javax.swing.JTabbedPane();
        pnl_main = new javax.swing.JPanel();
        btn_launch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        input_sv_name = new javax.swing.JTextField();
        btn_generate = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        toolbar = new javax.swing.JToolBar();
        btn_save_profile = new javax.swing.JButton();
        btn_load_profile = new javax.swing.JButton();
        btn_about = new javax.swing.JButton();
        btn_help = new javax.swing.JButton();
        input_sv_password = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rdn_host_lan = new javax.swing.JRadioButton();
        rdn_host_internet = new javax.swing.JRadioButton();
        str_exe_bin = new javax.swing.JLabel();
        input_exe_bin = new javax.swing.JTextField();
        str_fsgame = new javax.swing.JLabel();
        input_fsgame = new javax.swing.JTextField();
        str_parameters = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        input_parameters = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        rdn_game_defence = new javax.swing.JRadioButton();
        rdn_game_coop = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        combo_sv_map = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        alternate_sv_password = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        combo_sv_maxplayers = new javax.swing.JComboBox<>();

        ui_about.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        ui_about.setTitle("About");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Unofficial xrMPE Dedicated Server");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("This program was made for making easir the process of creating and launching custom dedicated servers for xrMPE mod.\n\nThis app was developed in Java and developed by Rammaken.");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/about_logo.png"))); // NOI18N

        btn_add_aplicar1.setBackground(new java.awt.Color(0, 102, 102));
        btn_add_aplicar1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btn_add_aplicar1.setForeground(new java.awt.Color(255, 255, 255));
        btn_add_aplicar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/icon_github.png"))); // NOI18N
        btn_add_aplicar1.setText("GitHub");
        btn_add_aplicar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_add_aplicar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_aplicar1confirmar_adicion_articulo(evt);
            }
        });

        javax.swing.GroupLayout ui_aboutLayout = new javax.swing.GroupLayout(ui_about.getContentPane());
        ui_about.getContentPane().setLayout(ui_aboutLayout);
        ui_aboutLayout.setHorizontalGroup(
            ui_aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ui_aboutLayout.createSequentialGroup()
                .addGroup(ui_aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ui_aboutLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ui_aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ui_aboutLayout.createSequentialGroup()
                        .addContainerGap(26, Short.MAX_VALUE)
                        .addGroup(ui_aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_add_aplicar1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ui_aboutLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(36, 36, 36)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)))
                .addContainerGap())
            .addGroup(ui_aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ui_aboutLayout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(277, Short.MAX_VALUE)))
        );
        ui_aboutLayout.setVerticalGroup(
            ui_aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ui_aboutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ui_aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_add_aplicar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(ui_aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ui_aboutLayout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(jLabel9)
                    .addContainerGap(175, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("xrMPE Dedicated Server Manager v1.4");
        setResizable(false);

        tabs.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        btn_launch.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btn_launch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/icon_launch.png"))); // NOI18N
        btn_launch.setText("Launch server");
        btn_launch.setToolTipText("Launch a dedicated server with all this settings");
        btn_launch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_launch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                launch_server(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/icon_name.png"))); // NOI18N
        jLabel1.setText("Server name:");

        input_sv_name.setText("xrmpe_server");
        input_sv_name.setToolTipText("Set the name of your dedicated server");
        input_sv_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                block_space(evt);
            }
        });

        btn_generate.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btn_generate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/icon_generate.png"))); // NOI18N
        btn_generate.setText("Generate run file");
        btn_generate.setToolTipText("Generates a .bat file in the root folder for running the server in case if you wish doing it the old way.");
        btn_generate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generate_run(evt);
            }
        });

        btn_clear.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/icon_clear.png"))); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.setToolTipText("Clears all the parameters and selected options");
        btn_clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_parameters(evt);
            }
        });

        toolbar.setBackground(new java.awt.Color(255, 255, 255));
        toolbar.setRollover(true);

        btn_save_profile.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btn_save_profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/icon_save_profile.png"))); // NOI18N
        btn_save_profile.setText("Save profile");
        btn_save_profile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_save_profile.setFocusable(false);
        btn_save_profile.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_save_profile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_save_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_profile(evt);
            }
        });
        toolbar.add(btn_save_profile);

        btn_load_profile.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btn_load_profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/icon_load_profile.png"))); // NOI18N
        btn_load_profile.setText("Load profile");
        btn_load_profile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_load_profile.setFocusable(false);
        btn_load_profile.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_load_profile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_load_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                load_profile(evt);
            }
        });
        toolbar.add(btn_load_profile);

        btn_about.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btn_about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/icon_about.png"))); // NOI18N
        btn_about.setText("About");
        btn_about.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_about.setFocusable(false);
        btn_about.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_about.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_about(evt);
            }
        });
        toolbar.add(btn_about);

        btn_help.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btn_help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/icon_help.png"))); // NOI18N
        btn_help.setText("Help");
        btn_help.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_help.setFocusable(false);
        btn_help.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_help.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolbar.add(btn_help);

        input_sv_password.setToolTipText("Set a password for your dedicated server");
        input_sv_password.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/icon_password.png"))); // NOI18N
        jLabel2.setText("Server password:");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/icon_host.png"))); // NOI18N
        jLabel3.setText("Host type:");
        jLabel3.setToolTipText("Set the host type of your dedicated server");

        filter_host.add(rdn_host_lan);
        rdn_host_lan.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rdn_host_lan.setSelected(true);
        rdn_host_lan.setText("LAN");
        rdn_host_lan.setToolTipText("public=0");
        rdn_host_lan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        filter_host.add(rdn_host_internet);
        rdn_host_internet.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rdn_host_internet.setText("Internet");
        rdn_host_internet.setToolTipText("public=1");
        rdn_host_internet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        str_exe_bin.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        str_exe_bin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/icon_exebin.png"))); // NOI18N
        str_exe_bin.setText("Executable bin:");

        input_exe_bin.setForeground(new java.awt.Color(51, 51, 51));
        input_exe_bin.setText("dedicated\\xrEngine.exe");
        input_exe_bin.setToolTipText("(ADVANCED) Set the file dir of your dedicated xrEngine.exe");

        str_fsgame.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        str_fsgame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/icon_fsgame.png"))); // NOI18N
        str_fsgame.setText("fsgame file:");

        input_fsgame.setForeground(new java.awt.Color(51, 51, 51));
        input_fsgame.setText("..\\fsgame_s.ltx");
        input_fsgame.setToolTipText("(ADVANCED) Set the file dir of your fsgame.ltx");

        str_parameters.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        str_parameters.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/icon_parameters.png"))); // NOI18N
        str_parameters.setText("Start parameters:");

        input_parameters.setColumns(20);
        input_parameters.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        input_parameters.setForeground(new java.awt.Color(51, 51, 51));
        input_parameters.setLineWrap(true);
        input_parameters.setRows(5);
        input_parameters.setText("-auto_affinity -no_prefetch");
        input_parameters.setToolTipText("(ADVANCED) Set extra parameters for server launch");
        input_parameters.setWrapStyleWord(true);
        input_parameters.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                block_enter(evt);
            }
        });
        jScrollPane1.setViewportView(input_parameters);

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/icon_gamemode.png"))); // NOI18N
        jLabel4.setText("Gamemode:");
        jLabel4.setToolTipText("Set the gamemode of your dedicated server");

        filter_gamemode.add(rdn_game_defence);
        rdn_game_defence.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rdn_game_defence.setSelected(true);
        rdn_game_defence.setText("Defence");
        rdn_game_defence.setToolTipText("df");
        rdn_game_defence.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        filter_gamemode.add(rdn_game_coop);
        rdn_game_coop.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rdn_game_coop.setText("Coop");
        rdn_game_coop.setToolTipText("coop");
        rdn_game_coop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/icon_map.png"))); // NOI18N
        jLabel5.setText("Map:");

        combo_sv_map.setToolTipText("Select the map for your dedicated server");

        alternate_sv_password.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        alternate_sv_password.setText("Enable");
        alternate_sv_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alternate_password(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/icon_players.png"))); // NOI18N
        jLabel7.setText("Players:");

        combo_sv_maxplayers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        combo_sv_maxplayers.setSelectedIndex(3);
        combo_sv_maxplayers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnl_mainLayout = new javax.swing.GroupLayout(pnl_main);
        pnl_main.setLayout(pnl_mainLayout);
        pnl_mainLayout.setHorizontalGroup(
            pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolbar, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnl_mainLayout.createSequentialGroup()
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl_mainLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_mainLayout.createSequentialGroup()
                                .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btn_generate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_launch, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(str_exe_bin)
                                .addComponent(str_parameters)
                                .addComponent(str_fsgame)
                                .addComponent(input_exe_bin)
                                .addComponent(input_fsgame)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE))))
                    .addGroup(pnl_mainLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_mainLayout.createSequentialGroup()
                                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdn_host_internet)
                                    .addComponent(rdn_host_lan)
                                    .addComponent(jLabel3))
                                .addGap(26, 26, 26)
                                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdn_game_coop)
                                    .addComponent(rdn_game_defence)
                                    .addComponent(jLabel4)))
                            .addGroup(pnl_mainLayout.createSequentialGroup()
                                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_mainLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(alternate_sv_password))
                                    .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(input_sv_password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(input_sv_name, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_mainLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel7))
                                    .addComponent(jLabel5)
                                    .addComponent(combo_sv_maxplayers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo_sv_map, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_mainLayout.setVerticalGroup(
            pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_mainLayout.createSequentialGroup()
                .addComponent(toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_sv_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_sv_map, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(alternate_sv_password)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_sv_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_sv_maxplayers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_mainLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdn_host_lan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdn_host_internet))
                    .addGroup(pnl_mainLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdn_game_defence)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdn_game_coop)))
                .addGap(18, 18, 18)
                .addComponent(str_exe_bin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_exe_bin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(str_fsgame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_fsgame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(str_parameters)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_generate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_launch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        tabs.addTab("Main", new javax.swing.ImageIcon(getClass().getResource("/Source/icon_server.png")), pnl_main); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void launch_server(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_launch_server
        try {
            String sv_name = input_sv_name.getText();
            String sv_password = input_sv_password.getText();
            
            String sv_map = (String)combo_sv_map.getSelectedItem();
            String sv_maxplayers = (String)combo_sv_maxplayers.getSelectedItem();
            String sv_host = "0";
            String sv_game = "df";
            
            if(rdn_host_lan.isSelected()) {
                sv_host = "0";
            } else if(rdn_host_internet.isSelected()) {
                sv_host = "1";
            }
            
            if(rdn_game_defence.isSelected()) {
                sv_game = "df";
            } else if(rdn_game_coop.isSelected()) {
                sv_game = "coop";
            }
            
            String sv_exebin = input_exe_bin.getText();
            String sv_fsgame = input_fsgame.getText();
            String sv_parameters = input_parameters.getText();
           
            ProcessBuilder processBuilder = new ProcessBuilder(sv_exebin, " -i -fsltx " + sv_fsgame + " " + sv_parameters + " -start server(" + sv_map + "/" + sv_game + "/hname=" + sv_name + "/maxplayers=" + sv_maxplayers + "/public=" + sv_host + "/psw=" + sv_password + ") client(localhost)");
            Process process = processBuilder.start();
            int exitCode = process.waitFor();
            
            if(exitCode == 0) {
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Dedicated server has been terminated!", "Alert", 1);
            } else {
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Server process crashed/failed.\n\nOutput code: " + exitCode, "Error", 0);
                loadCrashLog();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 0);
            
        }
    }//GEN-LAST:event_launch_server

    private void alternate_password(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alternate_password
        if(alternate_sv_password.isSelected()) {
            input_sv_password.setEnabled(true);
        } else {
            input_sv_password.setEnabled(false);
            input_sv_password.setText("");
        }
    }//GEN-LAST:event_alternate_password

    private void clear_parameters(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_parameters
        input_sv_name.setText("xrmpe_server");
        combo_sv_map.setSelectedIndex(0);
        combo_sv_maxplayers.setSelectedIndex(0);
        input_sv_password.setText("");
        rdn_host_lan.setSelected(true);
        rdn_game_defence.setSelected(true);
        input_exe_bin.setText("dedicated\\xrEngine.exe");
        input_fsgame.setText("..\\fsgame_s.ltx");
        input_parameters.setText("-auto_affinity -no_prefetch");
    }//GEN-LAST:event_clear_parameters

    private void show_about(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_about
        ui_about.setSize(458, 280);
        ui_about.setLocationRelativeTo(null);
        ui_about.setIconImage(new ImageIcon(getClass().getResource("icon_about.png")).getImage());
        ui_about.setVisible(true);
    }//GEN-LAST:event_show_about

    private void btn_add_aplicar1confirmar_adicion_articulo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_aplicar1confirmar_adicion_articulo
        try {
            Desktop.getDesktop().browse(new URI("https://github.com/Rammaken/xrMPE_DSM"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_add_aplicar1confirmar_adicion_articulo

    private void load_profile(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_load_profile
        // Selects Database file path
        JFileChooser load_profile_choose = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Server profiles (.dat)", "dat");
        load_profile_choose.setFileFilter(filter);
        load_profile_choose.setCurrentDirectory(new java.io.File("."));
        load_profile_choose.showOpenDialog(null);
        File file_load_profile_path = load_profile_choose.getSelectedFile();
        
        String profile_data_root = file_load_profile_path.getAbsolutePath();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(profile_data_root));
            
            // Leer cada línea del archivo
            String linea;

            ArrayList<String> profile_data = new ArrayList<String>();

            while ((linea = br.readLine()) != null) {
                profile_data.add(linea);
            }   
            
            input_sv_name.setText(profile_data.get(0));
            
            if(profile_data.get(1).equals("password_enabled")) {
                alternate_sv_password.setSelected(true);
                input_sv_password.setEnabled(true);
                input_sv_password.setText(profile_data.get(2));
            } else if(profile_data.get(1).equals("password_disabled")) {
                alternate_sv_password.setSelected(false);
                input_sv_password.setEnabled(false);
                input_sv_password.setText("");
            }
            
            String temp_map = String.valueOf(profile_data.get(3));
            combo_sv_map.setSelectedItem(temp_map);
            
            String temp_players = String.valueOf(profile_data.get(4));
            combo_sv_maxplayers.setSelectedItem(temp_players);
            
            if(profile_data.get(5).equals("host_lan")) {
                rdn_host_lan.setSelected(true);
            } else if(profile_data.get(5).equals("host_internet")) {
                rdn_host_internet.setSelected(true);
            }
            
            if(profile_data.get(6).equals("game_df")) {
                rdn_game_defence.setSelected(true);
            } else if(profile_data.get(6).equals("game_coop")) {
                rdn_game_coop.setSelected(true);
            }
                        
            input_exe_bin.setText(profile_data.get(7));
            input_fsgame.setText(profile_data.get(8));
            input_parameters.setText(profile_data.get(9));
            
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Profile loaded successfully!");
        } catch (IOException e) {
            e.printStackTrace();
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Something went wrong when loading the profile data, please try again...", "Error", 0);
        }
    }//GEN-LAST:event_load_profile

    private void save_profile(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_profile
        JFileChooser save_profile_choose = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Server profiles (.dat)", "dat");
        save_profile_choose.setFileFilter(filter);
        save_profile_choose.setCurrentDirectory(new java.io.File("."));
        save_profile_choose.showSaveDialog(null);
        File file_save_profile_path = save_profile_choose.getSelectedFile();
        
        String save_profile_data_root = file_save_profile_path.getAbsolutePath();
        
        

        try {
            ArrayList<String> save_profile_data = new ArrayList<String>();
        
        save_profile_data.add(input_sv_name.getText());
        
        if(alternate_sv_password.isSelected()) {
            save_profile_data.add("password_enabled");
            save_profile_data.add(input_sv_password.getText());
        } else {
            save_profile_data.add("password_disabled");
            save_profile_data.add("");
        }
        
        save_profile_data.add((String)combo_sv_map.getSelectedItem());
        save_profile_data.add((String)combo_sv_maxplayers.getSelectedItem());
        
        if(rdn_host_lan.isSelected()) {
            save_profile_data.add("host_lan");
        } else if(rdn_host_internet.isSelected()) {
            save_profile_data.add("host_internet");
        }
        
        if(rdn_game_defence.isSelected()) {
            save_profile_data.add("game_df");
        } else if(rdn_game_coop.isSelected()) {
            save_profile_data.add("game_coop");
        }

        save_profile_data.add(input_exe_bin.getText());
        save_profile_data.add(input_fsgame.getText());
        save_profile_data.add(input_parameters.getText());
        
            FileWriter profile_file = new FileWriter(save_profile_data_root + ".dat");
            BufferedWriter bw = new BufferedWriter(profile_file);
            bw.write(save_profile_data.get(0) + "\n" + save_profile_data.get(1) + "\n" + save_profile_data.get(2) + "\n" + save_profile_data.get(3) + "\n" + save_profile_data.get(4) + "\n" + save_profile_data.get(5) + "\n" + save_profile_data.get(6) + "\n" + save_profile_data.get(7) + "\n" + save_profile_data.get(8) + "\n" + save_profile_data.get(9));
            bw.close();
            
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Profile saved successfully!");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Something went wrong when saving the profile, please try again...", "Error", 0);
        }
    }//GEN-LAST:event_save_profile

    private void block_enter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block_enter
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            evt.consume();
        }
    }//GEN-LAST:event_block_enter

    private void block_space(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block_space
        if (evt.getKeyCode() == KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_block_space

    private void generate_run(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generate_run
        try {
            String sv_name = input_sv_name.getText();
            String sv_password = input_sv_password.getText();
            
            String sv_map = (String)combo_sv_map.getSelectedItem();
            String sv_maxplayers = (String)combo_sv_maxplayers.getSelectedItem();
            String sv_host = "0";
            String sv_game = "df";
            
            if(rdn_host_lan.isSelected()) {
                sv_host = "0";
            } else if(rdn_host_internet.isSelected()) {
                sv_host = "1";
            }
            
            if(rdn_game_defence.isSelected()) {
                sv_game = "df";
            } else if(rdn_game_coop.isSelected()) {
                sv_game = "coop";
            }
            
            String sv_exebin = input_exe_bin.getText();
            String sv_fsgame = input_fsgame.getText();
            String sv_parameters = input_parameters.getText();
            
            FileWriter profile_file = new FileWriter("startdedicated_" + sv_game + "_map_" + sv_map + ".bat");
            BufferedWriter bw = new BufferedWriter(profile_file);
            bw.write(sv_exebin + " -i -fsltx " + sv_fsgame + " " + sv_parameters + " -start server(" + sv_map + "/" + sv_game + "/hname=" + sv_name + "/maxplayers=" + sv_maxplayers + "/public=" + sv_host + "/psw=" + sv_password + ") client(localhost)");
            bw.close();
            JOptionPane.showMessageDialog(null, "Run file generated successfully. Check your folder.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Something went wrong when generating the dedicated server run file, please try again...", "Error", 0);
        }
    }//GEN-LAST:event_generate_run

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel( new FlatLightLaf() );
        } catch(Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
                
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ui_manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox alternate_sv_password;
    private javax.swing.JButton btn_about;
    private javax.swing.JButton btn_add_aplicar1;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_generate;
    private javax.swing.JButton btn_help;
    private javax.swing.JButton btn_launch;
    private javax.swing.JButton btn_load_profile;
    private javax.swing.JButton btn_save_profile;
    private javax.swing.JComboBox<String> combo_sv_map;
    private javax.swing.JComboBox<String> combo_sv_maxplayers;
    private javax.swing.ButtonGroup filter_gamemode;
    private javax.swing.ButtonGroup filter_host;
    private javax.swing.JTextField input_exe_bin;
    private javax.swing.JTextField input_fsgame;
    private javax.swing.JTextArea input_parameters;
    private javax.swing.JTextField input_sv_name;
    private javax.swing.JTextField input_sv_password;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel pnl_main;
    private javax.swing.JRadioButton rdn_game_coop;
    private javax.swing.JRadioButton rdn_game_defence;
    private javax.swing.JRadioButton rdn_host_internet;
    private javax.swing.JRadioButton rdn_host_lan;
    private javax.swing.JLabel str_exe_bin;
    private javax.swing.JLabel str_fsgame;
    private javax.swing.JLabel str_parameters;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JToolBar toolbar;
    private javax.swing.JDialog ui_about;
    // End of variables declaration//GEN-END:variables
}
