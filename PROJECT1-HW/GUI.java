//20198265 Ngo Quang Truong

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Tuan33.ThiSinh;
import Tuan33.TuyenSinh;

public class GUI extends javax.swing.JFrame {

        /**
         * Tao giao dien
         */
        public GUI() {
                initComponents();
        }

        private void initComponents() {
                code1 = new javax.swing.JTextArea();
                code1.setFont(new java.awt.Font("Times New Roman", 1, 14));
                code1.setVisible(false);
                code1.setEditable(false);
                result1 = new javax.swing.JTextArea();
                result1.setEditable(false);
                result1.setVisible(false);
                result1.setFont(new java.awt.Font("Times New Roman", 1, 14));
                code2 = new javax.swing.JTextArea();
                code2.setEditable(false);
                result2 = new javax.swing.JTextArea();
                result2.setEditable(false);
                code2.setVisible(false);
                result2.setVisible(false);
                code2.setFont(new java.awt.Font("Times New Roman", 1, 14));
                result2.setFont(new java.awt.Font("Times New Roman", 1, 14));
                code2.setBackground(new java.awt.Color(0, 255, 255));
                result2.setBackground(new java.awt.Color(0, 255, 255));
                code3 = new javax.swing.JTextArea();
                code3.setText("code1111111111111111111111111111111111111111111111111111111111");
                code3.setEditable(false);
                result3 = new javax.swing.JTextArea();
                result3.setText("result1");
                result3.setEditable(false);
                code3.setVisible(false);
                result3.setVisible(false);
                code3.setFont(new java.awt.Font("Times New Roman", 1, 14));
                result3.setFont(new java.awt.Font("Times New Roman", 1, 14));
                code4 = new javax.swing.JTextArea();
                code4.setText("code1111111111111111111111111111111111111111111111111111111111");
                code4.setEditable(false);
                result4 = new javax.swing.JTextArea();
                result4.setText("result1");
                result4.setEditable(false);
                code4.setVisible(false);
                result4.setVisible(false);
                code4.setFont(new java.awt.Font("Times New Roman", 1, 14));
                result4.setFont(new java.awt.Font("Times New Roman", 1, 14));
                code5 = new javax.swing.JTextArea();
                code5.setEditable(false);
                result5 = new javax.swing.JTextArea();
                result5.setEditable(false);
                code5.setVisible(false);
                result5.setVisible(false);
                code5.setText("Bai3");
                code5.setFont(new java.awt.Font("Times New Roman", 1, 14));
                result5.setFont(new java.awt.Font("Times New Roman", 1, 14));
                table = new JTable();
                listTS = new TuyenSinh();
                jScrollPane1 = new JScrollPane();
                t1 = new JTextField();
                testField2 = new JTextField();
                testField2.setVisible(false);
                testField3 = new JTextField();
                testField3.setVisible(false);
                testField4 = new JTextField();
                testField4.setVisible(false);
                jButton200 = new javax.swing.JButton();
                jButton200.setVisible(false);
                jButton201 = new javax.swing.JButton();
                jButton201.setVisible(false);
                jButton202 = new javax.swing.JButton();
                jButton202.setVisible(false);
                jButton203 = new javax.swing.JButton();
                jButton203.setVisible(false);
                jButton301 = new javax.swing.JButton();
                jButton301.setVisible(false);
                jButton302 = new javax.swing.JButton();
                jButton302.setVisible(false);
                jButton303 = new javax.swing.JButton();
                jButton303.setVisible(false);
                jButton304 = new javax.swing.JButton();
                jButton304.setVisible(false);
                jButton305 = new javax.swing.JButton();
                jButton305.setVisible(false);
                jButton306 = new javax.swing.JButton();
                jButton306.setVisible(false);
                jButton401 = new javax.swing.JButton();
                jButton401.setVisible(false);
                jButton402 = new javax.swing.JButton();
                jButton402.setVisible(false);
                jButton403 = new javax.swing.JButton();
                jButton403.setVisible(false);
                jButton404 = new javax.swing.JButton();
                jButton404.setVisible(false);
                jButton405 = new javax.swing.JButton();
                jButton405.setVisible(false);
                jButton406 = new javax.swing.JButton();
                jButton406.setVisible(false);
                jButton407 = new javax.swing.JButton();
                jButton407.setVisible(false);
                jButton408 = new javax.swing.JButton();
                jButton408.setVisible(false);
                jButton409 = new javax.swing.JButton();
                jButton409.setVisible(false);
                jButton101 = new javax.swing.JButton();
                jButton101.setVisible(false);
                jButton102 = new javax.swing.JButton();
                jButton102.setVisible(false);
                jButton103 = new javax.swing.JButton();
                jButton103.setVisible(false);
                jButton104 = new javax.swing.JButton();
                jButton104.setVisible(false);
                jButton105 = new javax.swing.JButton();
                jButton105.setVisible(false);
                jButton106 = new javax.swing.JButton();
                jButton106.setVisible(false);
                jButton107 = new javax.swing.JButton();
                jButton107.setVisible(false);
                bodyPanel = new javax.swing.JPanel();
                menuPanel = new javax.swing.JPanel();
                btnTuan1 = new javax.swing.JButton();
                btnTuan2 = new javax.swing.JButton();
                btnTuan3 = new javax.swing.JButton();
                btnTuan4 = new javax.swing.JButton();
                btnTuan5 = new javax.swing.JButton();
                mainPanel = new javax.swing.JPanel();
                Tuan1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                jButton3 = new javax.swing.JButton();
                jButton4 = new javax.swing.JButton();
                jButton5 = new javax.swing.JButton();
                jButton6 = new javax.swing.JButton();
                jButton7 = new javax.swing.JButton();
                new javax.swing.JPanel();
                new javax.swing.JPanel();
                jLabel2 = new javax.swing.JLabel();
                new javax.swing.JPanel();
                jLabel7 = new javax.swing.JLabel();
                new javax.swing.JPanel();
                jLabel8 = new javax.swing.JLabel();
                new javax.swing.JPanel();
                jLabel11 = new javax.swing.JLabel();
                new javax.swing.JPanel();
                jLabel9 = new javax.swing.JLabel();
                new javax.swing.JPanel();
                jLabel10 = new javax.swing.JLabel();
                new javax.swing.JPanel();
                jLabel12 = new javax.swing.JLabel();
                Tuan2 = new javax.swing.JPanel();
                jLabel3 = new javax.swing.JLabel();
                jButton8 = new javax.swing.JButton();
                jButton9 = new javax.swing.JButton();
                jButton10 = new javax.swing.JButton();
                jButton11 = new javax.swing.JButton();
                MainTuan2 = new javax.swing.JPanel();
                Bai21 = new javax.swing.JPanel();
                jLabel13 = new javax.swing.JLabel();
                Bai22 = new javax.swing.JPanel();
                jLabel16 = new javax.swing.JLabel();
                Bai23 = new javax.swing.JPanel();
                jLabel14 = new javax.swing.JLabel();
                Bai24 = new javax.swing.JPanel();
                jLabel15 = new javax.swing.JLabel();
                Tuan3 = new javax.swing.JPanel();
                jLabel4 = new javax.swing.JLabel();
                jButton12 = new javax.swing.JButton();
                jButton13 = new javax.swing.JButton();
                jButton14 = new javax.swing.JButton();
                jButton15 = new javax.swing.JButton();
                jButton16 = new javax.swing.JButton();
                jButton17 = new javax.swing.JButton();
                MainTuan3 = new javax.swing.JPanel();
                Bai31 = new javax.swing.JPanel();
                jLabel26 = new javax.swing.JLabel();
                Bai32 = new javax.swing.JPanel();
                jLabel31 = new javax.swing.JLabel();
                Bai33 = new javax.swing.JPanel();
                jLabel27 = new javax.swing.JLabel();
                Bai34 = new javax.swing.JPanel();
                jLabel28 = new javax.swing.JLabel();
                Bai35 = new javax.swing.JPanel();
                jLabel29 = new javax.swing.JLabel();
                Bai36 = new javax.swing.JPanel();
                jLabel30 = new javax.swing.JLabel();
                Tuan4 = new javax.swing.JPanel();
                jLabel5 = new javax.swing.JLabel();
                jButton18 = new javax.swing.JButton();
                jButton19 = new javax.swing.JButton();
                jButton20 = new javax.swing.JButton();
                jButton21 = new javax.swing.JButton();
                jButton22 = new javax.swing.JButton();
                jButton23 = new javax.swing.JButton();
                jButton24 = new javax.swing.JButton();
                jButton25 = new javax.swing.JButton();
                jButton26 = new javax.swing.JButton();
                MainTuan4 = new javax.swing.JPanel();
                Bai41 = new javax.swing.JPanel();
                jLabel25 = new javax.swing.JLabel();
                Bai42 = new javax.swing.JPanel();
                jLabel18 = new javax.swing.JLabel();
                Bai43 = new javax.swing.JPanel();
                Bai44 = new javax.swing.JPanel();
                jLabel19 = new javax.swing.JLabel();
                Bai45 = new javax.swing.JPanel();
                jLabel20 = new javax.swing.JLabel();
                Bai46 = new javax.swing.JPanel();
                jLabel21 = new javax.swing.JLabel();
                Bai47 = new javax.swing.JPanel();
                jLabel24 = new javax.swing.JLabel();
                Bai48 = new javax.swing.JPanel();
                jLabel22 = new javax.swing.JLabel();
                Bai49 = new javax.swing.JPanel();
                jLabel23 = new javax.swing.JLabel();
                jLabel17 = new javax.swing.JLabel();
                Tuan5 = new javax.swing.JPanel();
                jLabel6 = new javax.swing.JLabel();
                b1 = new javax.swing.JButton("Th??m");
                b2 = new javax.swing.JButton("S???a");
                b3 = new javax.swing.JButton("X??a");
                b4 = new javax.swing.JButton("T??m ki???m");
                b5 = new javax.swing.JButton("C???p nh???t");
                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Qu???n l?? b??i t???p tu???n");
                setVisible(true);

                bodyPanel.setBackground(new java.awt.Color(125, 125, 125));
                bodyPanel.setPreferredSize(new java.awt.Dimension(1200, 800));

                menuPanel.setBackground(new java.awt.Color(125, 0, 255));

                btnTuan1.setBackground(new java.awt.Color(255, 255, 255));
                btnTuan1.setFont(new java.awt.Font("Times New Roman", 1, 14));
                btnTuan1.setText("TU???N 1");
                btnTuan1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnTuan1ActionPerformed(evt);
                        }
                });

                btnTuan2.setBackground(new java.awt.Color(255, 255, 255));
                btnTuan2.setFont(new java.awt.Font("Times New Roman", 1, 14));
                btnTuan2.setText("TU???N 2");
                btnTuan2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnTuan2ActionPerformed(evt);
                        }
                });

                btnTuan3.setBackground(new java.awt.Color(255, 255, 255));
                btnTuan3.setFont(new java.awt.Font("Times New Roman", 1, 14));
                btnTuan3.setText("TU???N 3");
                btnTuan3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnTuan3ActionPerformed(evt);
                        }
                });

                btnTuan4.setBackground(new java.awt.Color(255, 255, 255));
                btnTuan4.setFont(new java.awt.Font("Times New Roman", 1, 14));
                btnTuan4.setText("TU???N 4");
                btnTuan4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnTuan4ActionPerformed(evt);
                        }
                });

                btnTuan5.setBackground(new java.awt.Color(255, 255, 255));
                btnTuan5.setFont(new java.awt.Font("Times New Roman", 1, 14));
                btnTuan5.setText("TU???N 5");
                btnTuan5.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnTuan5ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
                menuPanel.setLayout(menuPanelLayout);
                menuPanelLayout.setHorizontalGroup(
                                menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout
                                                                .createSequentialGroup()
                                                                .addGap(0, 18, Short.MAX_VALUE)
                                                                .addGroup(menuPanelLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addComponent(btnTuan1,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                129, Short.MAX_VALUE)
                                                                                .addComponent(btnTuan2,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(btnTuan3,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(btnTuan4,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(btnTuan5,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addContainerGap()));
                menuPanelLayout.setVerticalGroup(
                                menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(menuPanelLayout.createSequentialGroup()
                                                                .addGap(121, 121, 121)
                                                                .addComponent(btnTuan1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                34,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(36, 36, 36)
                                                                .addComponent(btnTuan2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                34,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(32, 32, 32)
                                                                .addComponent(btnTuan3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                36,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(34, 34, 34)
                                                                .addComponent(btnTuan4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                34,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(35, 35, 35)
                                                                .addComponent(btnTuan5,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                34,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                mainPanel.setBackground(new java.awt.Color(0, 255, 255));
                mainPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED,
                                java.awt.Color.white, java.awt.Color.white, java.awt.Color.white,
                                java.awt.Color.white));
                mainPanel.setLayout(new java.awt.CardLayout());

                Tuan1.setBackground(new java.awt.Color(255, 255, 255));

                jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36));
                jLabel1.setForeground(new java.awt.Color(0, 0, 0));
                jLabel1.setText("TU???N 1 C??c b??i t???p java c?? b???n");

                jButton200.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton200.setText("Run");
                jButton200.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton200ActionPerformed(evt);
                        }
                });
                jButton201.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton201.setText("Run");
                jButton201.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton201ActionPerformed(evt);
                        }
                });
                jButton202.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton202.setText("Run");
                jButton202.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton202ActionPerformed(evt);
                        }
                });
                jButton203.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton203.setText("Run");
                jButton203.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton203ActionPerformed(evt);
                        }
                });
                jButton301.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton301.setText("Run");
                jButton301.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton301ActionPerformed(evt);
                        }
                });
                jButton302.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton302.setText("Run");
                jButton302.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton302ActionPerformed(evt);
                        }
                });
                jButton303.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton303.setText("Run");
                jButton303.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton303ActionPerformed(evt);
                        }
                });
                jButton304.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton304.setText("Run");
                jButton304.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton304ActionPerformed(evt);
                        }
                });
                jButton305.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton305.setText("Run");
                jButton305.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton305ActionPerformed(evt);
                        }
                });
                jButton306.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton306.setText("Run");
                jButton306.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton306ActionPerformed(evt);
                        }
                });
                jButton401.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton401.setText("Run");
                jButton401.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton401ActionPerformed(evt);
                        }
                });
                jButton402.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton402.setText("Run");
                jButton402.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton402ActionPerformed(evt);
                        }
                });
                jButton403.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton403.setText("Run");
                jButton403.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton403ActionPerformed(evt);
                        }
                });
                jButton404.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton404.setText("Run");
                jButton404.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton404ActionPerformed(evt);
                        }
                });
                jButton405.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton405.setText("Run");
                jButton405.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton405ActionPerformed(evt);
                        }
                });
                jButton406.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton406.setText("Run");
                jButton406.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton406ActionPerformed(evt);
                        }
                });
                jButton407.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton407.setText("Run");
                jButton407.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton407ActionPerformed(evt);
                        }
                });
                jButton408.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton408.setText("Run");
                jButton408.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton408ActionPerformed(evt);
                        }
                });
                jButton409.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton409.setText("Run");
                jButton409.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton409ActionPerformed(evt);
                        }
                });
                b1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                b1ActionPerformed(evt);
                        }
                });
                b2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                b2ActionPerformed(evt);
                        }
                });
                b3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                b3ActionPerformed(evt);
                        }
                });
                b4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                b4ActionPerformed(evt);
                        }
                });
                b5.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                b5ActionPerformed(evt);
                        }
                });
                jButton101.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton101.setText("Run");
                jButton101.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton101ActionPerformed(evt);
                        }
                });
                jButton102.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton102.setText("Run");
                jButton102.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton102ActionPerformed(evt);
                        }
                });
                jButton103.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton103.setText("Run");
                jButton103.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton103ActionPerformed(evt);
                        }
                });
                jButton104.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton104.setText("Run");
                jButton104.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton104ActionPerformed(evt);
                        }
                });
                jButton105.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton105.setText("Run");
                jButton105.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton105ActionPerformed(evt);
                        }
                });
                jButton106.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton106.setText("Run");
                jButton106.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton106ActionPerformed(evt);
                        }
                });
                jButton107.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton107.setText("Run");
                jButton107.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton107ActionPerformed(evt);
                        }
                });

                jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton1.setText("B??i 2");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton2.setText("B??i 3");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton3.setText("B??i 4");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });

                jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton4.setText("B??i 5");
                jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton4ActionPerformed(evt);
                        }
                });

                jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton5.setText("B??i 1");
                jButton5.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton5ActionPerformed(evt);
                        }
                });

                jButton6.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton6.setText("B??i 6");
                jButton6.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton6ActionPerformed(evt);
                        }
                });

                jButton7.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton7.setText("B??i 7");
                jButton7.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton7ActionPerformed(evt);
                        }
                });

                jLabel2.setText("B??i 1");

                jLabel7.setText("B??i 2");

                jLabel8.setText("B??i 3");

                jLabel11.setText("B??i 4");

                jLabel9.setText("B??i 5");

                jLabel10.setText("B??i 6");

                jLabel12.setText("B??i 7");

                javax.swing.GroupLayout Tuan1Layout = new javax.swing.GroupLayout(Tuan1);
                Tuan1.setLayout(Tuan1Layout);
                Tuan1Layout.setHorizontalGroup(
                                Tuan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(Tuan1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(Tuan1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel1)
                                                                                .addGroup(Tuan1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(Tuan1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(jButton1)
                                                                                                                .addComponent(jButton2)
                                                                                                                .addComponent(jButton3)
                                                                                                                .addComponent(jButton4)
                                                                                                                .addComponent(jButton5)
                                                                                                                .addComponent(jButton6)
                                                                                                                .addComponent(jButton7))
                                                                                                .addGap(40, 40, 40)
                                                                                                .addGroup(Tuan1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(code1)
                                                                                                                .addGap(40, 40, 40)
                                                                                                                .addComponent(jButton101)
                                                                                                                .addComponent(jButton102)
                                                                                                                .addComponent(jButton103)
                                                                                                                .addComponent(jButton104)
                                                                                                                .addComponent(jButton105)
                                                                                                                .addComponent(jButton106)
                                                                                                                .addComponent(jButton107)
                                                                                                                .addGap(40, 40, 40)
                                                                                                                .addGap(40, 40, 40)
                                                                                                                .addComponent(result1))))
                                                                .addContainerGap(379, Short.MAX_VALUE)));
                Tuan1Layout.setVerticalGroup(
                                Tuan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(Tuan1Layout.createSequentialGroup()
                                                                .addGap(40, 40, 40)
                                                                .addComponent(jLabel1)
                                                                .addGap(59, 59, 59)
                                                                .addGroup(Tuan1Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addGroup(Tuan1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jButton5)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jButton1)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jButton2)
                                                                                                .addGap(7, 7, 7)
                                                                                                .addComponent(jButton3)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jButton4)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jButton6)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jButton7))
                                                                                .addGroup(Tuan1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(code1)
                                                                                                .addGap(26, 26, 26)
                                                                                                .addComponent(jButton101)
                                                                                                .addComponent(jButton102)
                                                                                                .addComponent(jButton103)
                                                                                                .addComponent(jButton104)
                                                                                                .addComponent(jButton105)
                                                                                                .addComponent(jButton106)
                                                                                                .addComponent(jButton107)
                                                                                                .addGap(26, 26, 26)
                                                                                                .addGap(26, 26, 26)
                                                                                                .addComponent(result1)))));

                mainPanel.add(Tuan1, "card2");

                Tuan2.setBackground(new java.awt.Color(255, 255, 255));

                jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36));
                jLabel3.setForeground(new java.awt.Color(0, 0, 0));
                jLabel3.setText("TU???N 2 B??i t???p v??? h??m v?? th??? t???c");

                jButton8.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton8.setText("B??i 1");
                jButton8.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton8ActionPerformed(evt);
                        }
                });

                jButton9.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton9.setText("B??i 2");
                jButton9.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton9ActionPerformed(evt);
                        }
                });

                jButton10.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton10.setText("B??i 3");
                jButton10.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton10ActionPerformed(evt);
                        }
                });

                jButton11.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton11.setText("B??i 4");
                jButton11.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton11ActionPerformed(evt);
                        }
                });

                jLabel13.setText("B??i 1");

                jLabel16.setText("B??i 2");

                jLabel14.setText("B??i 3");

                jLabel15.setText("B??i 4");

                javax.swing.GroupLayout MainTuan2Layout = new javax.swing.GroupLayout(MainTuan2);
                MainTuan2.setLayout(MainTuan2Layout);
                MainTuan2Layout.setHorizontalGroup(
                                MainTuan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 286, Short.MAX_VALUE)
                                                .addGroup(MainTuan2Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai21,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(MainTuan2Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai22,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(MainTuan2Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai23,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(MainTuan2Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai24,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                MainTuan2Layout.setVerticalGroup(
                                MainTuan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(MainTuan2Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai21,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(MainTuan2Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai22,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(MainTuan2Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai23,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(MainTuan2Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai24,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                javax.swing.GroupLayout Tuan2Layout = new javax.swing.GroupLayout(Tuan2);

                Tuan2.setLayout(Tuan2Layout);
                Tuan2Layout.setHorizontalGroup(
                                Tuan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(Tuan2Layout.createSequentialGroup()
                                                                .addGroup(Tuan2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel3)
                                                                                .addGroup(Tuan2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(61, 61, 61)

                                                                                                .addGroup(Tuan2Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(jButton9)
                                                                                                                .addComponent(jButton8)
                                                                                                                .addComponent(jButton10)
                                                                                                                .addComponent(jButton11))
                                                                                                .addGap(40, 40, 40)
                                                                                                .addGroup(Tuan2Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(code2)
                                                                                                                .addGap(40, 40, 40)
                                                                                                                .addComponent(jButton200)
                                                                                                                .addComponent(jButton201)
                                                                                                                .addComponent(jButton202)
                                                                                                                .addComponent(jButton203)
                                                                                                                .addGap(40, 40, 40)
                                                                                                                .addComponent(testField2)
                                                                                                                .addGap(40, 40, 40)
                                                                                                                .addComponent(result2))))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                Tuan2Layout.setVerticalGroup(
                                Tuan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(Tuan2Layout.createSequentialGroup()
                                                                .addGap(50, 50, 50)
                                                                .addComponent(jLabel3)
                                                                .addGap(59, 59, 59)
                                                                .addGroup(Tuan2Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addGroup(Tuan2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jButton8)
                                                                                                .addGap(26, 26, 26)
                                                                                                .addComponent(jButton9)
                                                                                                .addGap(22, 22, 22)
                                                                                                .addComponent(jButton10)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jButton11))
                                                                                .addGroup(Tuan2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(code2)
                                                                                                .addGap(26, 26, 26)
                                                                                                .addComponent(jButton200)
                                                                                                .addComponent(jButton201)
                                                                                                .addComponent(jButton202)
                                                                                                .addComponent(jButton203)
                                                                                                .addGap(26, 26, 26)
                                                                                                .addComponent(testField2)
                                                                                                .addGap(26, 26, 26)
                                                                                                .addComponent(result2)))));

                mainPanel.add(Tuan2, "card3");

                Tuan3.setBackground(new java.awt.Color(255, 255, 255));

                jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36));
                jLabel4.setForeground(new java.awt.Color(0, 0, 0));
                jLabel4.setText("TU???N 3 B??i t???p v??? m???ng");

                jButton12.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton12.setText("B??i 1");
                jButton12.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton12ActionPerformed(evt);
                        }
                });

                jButton13.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton13.setText("B??i 2");
                jButton13.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton13ActionPerformed(evt);
                        }
                });

                jButton14.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton14.setText("B??i 4");
                jButton14.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton14ActionPerformed(evt);
                        }
                });

                jButton15.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton15.setText("B??i 6");
                jButton15.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton15ActionPerformed(evt);
                        }
                });

                jButton16.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton16.setText("B??i 3");
                jButton16.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton16ActionPerformed(evt);
                        }
                });

                jButton17.setFont(new java.awt.Font("Times New Roman", 1, 18));
                jButton17.setText("B??i 5");
                jButton17.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton17ActionPerformed(evt);
                        }
                });

                jLabel26.setText("B??i 1");

                jLabel31.setText("B??i 2");

                jLabel27.setText("B??i 3");

                jLabel28.setText("B??i 4");

                jLabel29.setText("B??i 5");

                jLabel30.setText("B??i 6");

                javax.swing.GroupLayout MainTuan3Layout = new javax.swing.GroupLayout(MainTuan3);
                MainTuan3.setLayout(MainTuan3Layout);
                MainTuan3Layout.setHorizontalGroup(
                                MainTuan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 273, Short.MAX_VALUE)
                                                .addGroup(MainTuan3Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai31,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(MainTuan3Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai32,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(MainTuan3Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai33,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(MainTuan3Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai34,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(MainTuan3Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai35,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(MainTuan3Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai36,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                MainTuan3Layout.setVerticalGroup(
                                MainTuan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(MainTuan3Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai31,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(MainTuan3Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai32,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(MainTuan3Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai33,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(MainTuan3Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai34,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(MainTuan3Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai35,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(MainTuan3Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai36,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                javax.swing.GroupLayout Tuan3Layout = new javax.swing.GroupLayout(Tuan3);
                Tuan3.setLayout(Tuan3Layout);
                Tuan3Layout.setHorizontalGroup(
                                Tuan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(Tuan3Layout.createSequentialGroup()
                                                                .addGap(47, 47, 47)
                                                                .addGroup(Tuan3Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel4)
                                                                                .addGroup(Tuan3Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(Tuan3Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jButton15)
                                                                                                                .addComponent(jButton17)
                                                                                                                .addComponent(jButton14)
                                                                                                                .addComponent(jButton16)
                                                                                                                .addComponent(jButton13)
                                                                                                                .addComponent(jButton12))
                                                                                                .addGap(50, 50, 50)
                                                                                                .addGroup(Tuan3Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(code3)
                                                                                                                .addGap(40, 40, 40)
                                                                                                                .addComponent(jButton301)
                                                                                                                .addComponent(jButton302)
                                                                                                                .addComponent(jButton303)
                                                                                                                .addComponent(jButton304)
                                                                                                                .addComponent(jButton305)
                                                                                                                .addComponent(jButton306)
                                                                                                                .addGap(40, 40, 40)
                                                                                                                .addComponent(testField3)
                                                                                                                .addGap(40, 40, 40)
                                                                                                                .addComponent(result3))))
                                                                .addContainerGap(379, Short.MAX_VALUE)));
                Tuan3Layout.setVerticalGroup(
                                Tuan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(Tuan3Layout.createSequentialGroup()
                                                                .addGap(31, 31, 31)
                                                                .addComponent(jLabel4)
                                                                .addGap(56, 56, 56)
                                                                .addGroup(Tuan3Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addGroup(Tuan3Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jButton12)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jButton13)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jButton16)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jButton14)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jButton17)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jButton15))
                                                                                .addGroup(Tuan3Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(code3)
                                                                                                .addGap(26, 26, 26)
                                                                                                .addComponent(jButton301)
                                                                                                .addComponent(jButton302)
                                                                                                .addComponent(jButton303)
                                                                                                .addComponent(jButton304)
                                                                                                .addComponent(jButton305)
                                                                                                .addComponent(jButton306)
                                                                                                .addGap(26, 26, 26)
                                                                                                .addComponent(testField3)
                                                                                                .addGap(26, 26, 26)
                                                                                                .addComponent(result3)))));

                mainPanel.add(Tuan3, "card4");

                Tuan4.setBackground(new java.awt.Color(255, 255, 255));

                jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36));
                jLabel5.setForeground(new java.awt.Color(0, 0, 0));
                jLabel5.setText("TU???N 4 B??i t???p v??? x??u ");

                jButton18.setText("B??i 1");
                jButton18.setFont(new java.awt.Font("Times New Roman", 1, 18));

                jButton18.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton18ActionPerformed(evt);
                        }
                });

                jButton19.setText("B??i 2");
                jButton19.setFont(new java.awt.Font("Times New Roman", 1, 18));

                jButton19.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton19ActionPerformed(evt);
                        }
                });

                jButton20.setText("B??i 3");
                jButton20.setFont(new java.awt.Font("Times New Roman", 1, 18));

                jButton20.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton20ActionPerformed(evt);
                        }
                });

                jButton21.setText("B??i 4");
                jButton21.setFont(new java.awt.Font("Times New Roman", 1, 18));

                jButton21.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton21ActionPerformed(evt);
                        }
                });

                jButton22.setText("B??i 5");
                jButton22.setFont(new java.awt.Font("Times New Roman", 1, 18));

                jButton22.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton22ActionPerformed(evt);
                        }
                });

                jButton23.setText("B??i 6");
                jButton23.setFont(new java.awt.Font("Times New Roman", 1, 18));

                jButton23.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton23ActionPerformed(evt);
                        }
                });

                jButton24.setText("B??i 7");
                jButton24.setFont(new java.awt.Font("Times New Roman", 1, 18));

                jButton24.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton24ActionPerformed(evt);
                        }
                });

                jButton25.setText("B??i 8");
                jButton25.setFont(new java.awt.Font("Times New Roman", 1, 18));

                jButton25.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton25ActionPerformed(evt);
                        }
                });

                jButton26.setText("B??i 9");
                jButton26.setFont(new java.awt.Font("Times New Roman", 1, 18));

                jButton26.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton26ActionPerformed(evt);
                        }
                });

                jLabel25.setText("B??i 1");

                jLabel18.setText("B??i 2");

                jLabel19.setText("B??i 4");

                jLabel20.setText("B??i 5");

                jLabel21.setText("B??i 6");

                jLabel24.setText("B??i 7");

                jLabel22.setText("B??i 8");

                jLabel23.setText("B??i 9");

                javax.swing.GroupLayout MainTuan4Layout = new javax.swing.GroupLayout(MainTuan4);
                MainTuan4.setLayout(MainTuan4Layout);
                MainTuan4Layout.setHorizontalGroup(
                                MainTuan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 324, Short.MAX_VALUE)
                                                .addGroup(MainTuan4Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai41,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(MainTuan4Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai42,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(MainTuan4Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai43,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(MainTuan4Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai44,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(MainTuan4Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai45,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(MainTuan4Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai46,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(MainTuan4Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai47,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(MainTuan4Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai48,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(MainTuan4Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai49,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                MainTuan4Layout.setVerticalGroup(
                                MainTuan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 346, Short.MAX_VALUE)
                                                .addGroup(MainTuan4Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai41,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(MainTuan4Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai42,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(MainTuan4Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai43,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(MainTuan4Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai44,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(MainTuan4Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai45,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(MainTuan4Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai46,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(MainTuan4Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai47,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(MainTuan4Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai48,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(MainTuan4Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Bai49,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                javax.swing.GroupLayout Tuan4Layout = new javax.swing.GroupLayout(Tuan4);
                Tuan4.setLayout(Tuan4Layout);
                Tuan4Layout.setHorizontalGroup(
                                Tuan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(Tuan4Layout.createSequentialGroup()
                                                                .addGap(47, 47, 47)
                                                                .addGroup(Tuan4Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel5)
                                                                                .addGroup(Tuan4Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(Tuan4Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jButton18)
                                                                                                                .addComponent(jButton19)
                                                                                                                .addComponent(jButton20)
                                                                                                                .addComponent(jButton21)
                                                                                                                .addComponent(jButton22)
                                                                                                                .addComponent(jButton23)
                                                                                                                .addComponent(jButton24)
                                                                                                                .addComponent(jButton25)
                                                                                                                .addComponent(jButton26))
                                                                                                .addGap(50, 50, 50)
                                                                                                .addGroup(Tuan4Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(code4)
                                                                                                                .addGap(40, 40, 40)
                                                                                                                .addComponent(jButton401)
                                                                                                                .addComponent(jButton402)
                                                                                                                .addComponent(jButton403)
                                                                                                                .addComponent(jButton404)
                                                                                                                .addComponent(jButton405)
                                                                                                                .addComponent(jButton406)
                                                                                                                .addComponent(jButton407)
                                                                                                                .addComponent(jButton408)
                                                                                                                .addComponent(jButton409)
                                                                                                                .addGap(40, 40, 40)
                                                                                                                .addComponent(testField4)
                                                                                                                .addGap(40, 40, 40)
                                                                                                                .addComponent(result4))))
                                                                .addContainerGap(379, Short.MAX_VALUE)));
                Tuan4Layout.setVerticalGroup(
                                Tuan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(Tuan4Layout.createSequentialGroup()
                                                                .addGap(31, 31, 31)
                                                                .addComponent(jLabel5)
                                                                .addGap(56, 56, 56)
                                                                .addGroup(Tuan4Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addGroup(Tuan4Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jButton18)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jButton19)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jButton20)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jButton21)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jButton22)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jButton23)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jButton24)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jButton25)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jButton26))
                                                                                .addGroup(Tuan4Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(code4)
                                                                                                .addGap(26, 26, 26)
                                                                                                .addComponent(jButton401)
                                                                                                .addComponent(jButton402)
                                                                                                .addComponent(jButton403)
                                                                                                .addComponent(jButton404)
                                                                                                .addComponent(jButton405)
                                                                                                .addComponent(jButton406)
                                                                                                .addComponent(jButton407)
                                                                                                .addComponent(jButton408)
                                                                                                .addComponent(jButton409)
                                                                                                .addGap(26, 26, 26)
                                                                                                .addComponent(testField4)
                                                                                                .addGap(26, 26, 26)
                                                                                                .addComponent(result4)))));

                jLabel17.setText("B??i 1");

                Tuan5.setBackground(new java.awt.Color(255, 255, 255));

                jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36));
                jLabel6.setForeground(new java.awt.Color(0, 0, 0));
                jLabel6.setText("TU???N 5");

                javax.swing.GroupLayout Tuan5Layout = new javax.swing.GroupLayout(Tuan5);
                Tuan5.setLayout(Tuan5Layout);
                Tuan5Layout.setHorizontalGroup(
                                Tuan5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(Tuan5Layout.createSequentialGroup()
                                                                .addGroup(Tuan5Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGap(47, 47, 47)
                                                                                .addComponent(jLabel6)
                                                                                .addComponent(b1)
                                                                                .addComponent(b2)
                                                                                .addComponent(b3)
                                                                                .addComponent(b4)
                                                                                .addComponent(t1)
                                                                                .addComponent(b5)
                                                                                .addComponent(code5)
                                                                                .addGap(47, 47, 47)
                                                                                .addComponent(jScrollPane1, 400, 400,
                                                                                                400)
                                                                                .addGap(47, 47, 47)
                                                                                .addComponent(result5))
                                                                .addContainerGap(647, Short.MAX_VALUE)));
                Tuan5Layout.setVerticalGroup(
                                Tuan5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(Tuan5Layout.createSequentialGroup()
                                                                .addGroup(Tuan5Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addGroup(Tuan5Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel6)
                                                                                                .addComponent(b1)
                                                                                                .addComponent(b2)
                                                                                                .addComponent(b3)
                                                                                                .addComponent(b4)
                                                                                                .addComponent(t1)
                                                                                                .addComponent(b5)
                                                                                                .addGap(47, 47, 47)
                                                                                                .addComponent(code5)
                                                                                                .addGap(47, 47, 47)
                                                                                                .addComponent(jScrollPane1,
                                                                                                                400,
                                                                                                                400,
                                                                                                                400)
                                                                                                .addGap(47, 47, 47)
                                                                                                .addComponent(result5)))
                                                                .addContainerGap(600,
                                                                                Short.MAX_VALUE)));

                mainPanel.add(Tuan5, "card6");

                javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
                bodyPanel.setLayout(bodyPanelLayout);
                bodyPanelLayout.setHorizontalGroup(
                                bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(bodyPanelLayout.createSequentialGroup()
                                                                .addComponent(menuPanel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(mainPanel,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                bodyPanelLayout.setVerticalGroup(
                                bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout
                                                                .createSequentialGroup()
                                                                .addGroup(
                                                                                bodyPanelLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                .addComponent(mainPanel,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(menuPanel,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE))));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1013,
                                                                Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        protected void b5ActionPerformed(ActionEvent evt) {
                populateTable();
        }

        protected void b4ActionPerformed(ActionEvent evt) {
                int count = 0;
                for (ThiSinh ts : listTS.getThiSinh()) {

                        if (Integer.parseInt(t1.getText()) == ts.getId()) {
                                new DisplayFrame(ts);
                                count++;
                        }

                }
                if (count == 0) {
                        JOptionPane.showMessageDialog(null, "Kh??ng c?? thu???c");
                }
        }

        protected void b3ActionPerformed(ActionEvent evt) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow < 0) {
                        JOptionPane.showMessageDialog(null, "Please select a row to view", "Warning",
                                        JOptionPane.WARNING_MESSAGE);
                        return;
                }
                ThiSinh ts = listTS.searchById(Integer.parseInt(table.getValueAt(selectedRow, 0).toString()));
                listTS.removeTS(ts);
        }

        protected void b2ActionPerformed(ActionEvent evt) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow < 0) {
                        JOptionPane.showMessageDialog(null, "Please select a row to view", "Warning",
                                        JOptionPane.WARNING_MESSAGE);
                        return;
                }
                ThiSinh ts = listTS.searchById(Integer.parseInt(table.getValueAt(selectedRow, 0).toString()));
                new ModifyNewFrame(ts);
        }

        protected void b1ActionPerformed(ActionEvent evt) {
                new AddFrame(listTS);
        }

        protected void jButton101ActionPerformed(ActionEvent evt) {
                result1.setVisible(true);
        }

        protected void jButton102ActionPerformed(ActionEvent evt) {
                result1.setVisible(true);
        }

        protected void jButton103ActionPerformed(ActionEvent evt) {
                result1.setVisible(true);
        }

        protected void jButton104ActionPerformed(ActionEvent evt) {
                result1.setVisible(true);
        }

        protected void jButton105ActionPerformed(ActionEvent evt) {
                result1.setVisible(true);
        }

        protected void jButton106ActionPerformed(ActionEvent evt) {
                result1.setVisible(true);
        }

        protected void jButton107ActionPerformed(ActionEvent evt) {
                result1.setVisible(true);
        }

        protected void jButton401ActionPerformed(ActionEvent evt) {
                String getValue = testField4.getText();
                String getResult = Tuan32.bai1.result(getValue);
                result4.setText(String.valueOf(getResult));
                result4.setVisible(true);
        }

        protected void jButton402ActionPerformed(ActionEvent evt) {
                String getValue = testField4.getText();
                String getResult = Tuan32.bai2.result(getValue);
                result4.setText(String.valueOf(getResult));
                result4.setVisible(true);
        }

        protected void jButton403ActionPerformed(ActionEvent evt) {
                String getValue = testField4.getText();
                String getResult = Tuan32.bai3.result(getValue);
                result4.setText(String.valueOf(getResult));
                result4.setVisible(true);
        }

        protected void jButton404ActionPerformed(ActionEvent evt) {
                String getValue = testField4.getText();
                String getResult = Tuan32.bai4.result(getValue);
                result4.setText(String.valueOf(getResult));
                result4.setVisible(true);
        }

        protected void jButton405ActionPerformed(ActionEvent evt) {
                String getValue = testField4.getText();
                String getResult = Tuan32.bai5.result(getValue);
                String[] strArray = null;
                strArray = getResult.split(" ");
                String zero = "";
                String one = "";
                for (int i = 0; i < Integer.parseInt(strArray[0].replaceAll(".*?(\\d+).*", "$1")); i++) {
                        zero += "0 ";
                }
                for (int i = 0; i < Integer.parseInt(strArray[1].replaceAll(".*?(\\d+).*", "$1")); i++) {
                        zero += "1 ";
                        one += "1 ";
                }
                for (int i = 0; i < Integer.parseInt(strArray[0].replaceAll(".*?(\\d+).*", "$1")); i++) {
                        one += "0 ";
                }
                result4.setText("Theo cach 0 1:" + zero);
                result4.append("\n Theo cach 1 0:" + one);
                result4.setVisible(true);
        }

        protected void jButton406ActionPerformed(ActionEvent evt) {
                String getValue = testField4.getText();
                String getResult = Tuan32.bai6.result(getValue);
                result4.setText(String.valueOf(getResult));
                result4.setVisible(true);
        }

        protected void jButton407ActionPerformed(ActionEvent evt) {
                String getValue = testField4.getText();
                String[] str = getValue.split(",");
                String getResult = Tuan32.bai7.result(str);
                result4.setText(String.valueOf(getResult));
                result4.setVisible(true);
        }

        protected void jButton408ActionPerformed(ActionEvent evt) {
                String getValue = testField4.getText();
                String[] str = getValue.split(",");
                String getResult = Tuan32.bai8.result(str);
                result4.setText(String.valueOf(getResult));
                result4.setVisible(true);
        }

        protected void jButton409ActionPerformed(ActionEvent evt) {
                String getValue = testField4.getText();
                String[] str = getValue.split(",");
                String getResult = Tuan32.bai9.result(str);
                result4.setText(String.valueOf(getResult));
                result4.setVisible(true);
        }

        protected void jButton302ActionPerformed(ActionEvent evt) {
                String getValue = testField3.getText();
                String getResult = Tuan31.bai2.result(getValue);
                result3.setText(String.valueOf(getResult));
                result3.setVisible(true);
        }

        protected void jButton303ActionPerformed(ActionEvent evt) {
                String getValue = testField3.getText();
                String getResult = Tuan31.bai3.result(getValue);
                String[] strArray = null;
                strArray = getResult.split(" ");
                int num = strArray.length;
                result3.setText("Phan tu nho nhat trong mang la: " + strArray[0]);
                result3.append("\nCac chi so ung voi gia tri nho nhat la: ");
                for (int i = 1; i < num; i++) {
                        result3.append(strArray[i]);
                }
                result3.setVisible(true);
        }

        protected void jButton304ActionPerformed(ActionEvent evt) {
                String getValue = testField3.getText();
                String getResult = Tuan31.bai4.result(getValue);
                String[] strArray = null;
                strArray = getResult.split(" ");
                int num = strArray.length;
                result3.setText("Phan tu nho nhat trong mang la: " + strArray[0]);
                result3.append("\nCac chi so ung voi gia tri nho nhat la: ");
                for (int i = 1; i < num; i++) {
                        result3.append(strArray[i]);
                }
                result3.setVisible(true);
        }

        protected void jButton305ActionPerformed(ActionEvent evt) {
                String getValue = testField3.getText();
                String getResult = Tuan31.bai5.result(getValue);
                String[] strArray = null;
                strArray = getResult.split(" ");
                result3.setText("C?? : " + strArray[0] + "s??? nguy??n t???");
                result3.append("\nC?? : " + strArray[1] + "h???p s???");
                result3.setVisible(true);
        }

        protected void jButton306ActionPerformed(ActionEvent evt) {
                String getValue = testField3.getText();
                String getResult = Tuan31.bai6.result(getValue);
                result3.setText(String.valueOf(getResult));
                result3.setVisible(true);
        }

        protected void jButton301ActionPerformed(ActionEvent evt) {
                String getValue = testField3.getText();
                String getResult = Tuan31.bai1.result(getValue);
                result3.setText(String.valueOf(getResult));
                result3.setVisible(true);
        }

        protected void jButton203ActionPerformed(ActionEvent evt) {
                String getValue = testField2.getText();
                int getResult = Tuan30.src.bai4tuan30.fibo(Integer.parseInt(getValue));
                result2.setText(String.valueOf(getResult));
                result2.setVisible(true);
        }

        protected void jButton202ActionPerformed(ActionEvent evt) {
                String getValue = testField2.getText();
                float getResult = Tuan30.src.bai3tuan30.result(Float.parseFloat(getValue));
                result2.setText(String.valueOf(getResult));
                result2.setVisible(true);
        }

        protected void jButton200ActionPerformed(ActionEvent evt) {
                String getValue = testField2.getText();
                float getResult = Tuan30.src.bai1tuan30.result(Integer.parseInt(getValue));
                result2.setText(String.valueOf(getResult));
                result2.setVisible(true);

        }

        protected void jButton201ActionPerformed(ActionEvent evt) {
                String getValue = testField2.getText();
                float getResult = Tuan30.src.bai2tuan30.result(Float.parseFloat(getValue));
                result2.setText(String.valueOf(getResult));
                result2.setVisible(true);
        }

        private void btnTuan1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnTuan1ActionPerformed
                // remove panel
                mainPanel.removeAll();
                mainPanel.repaint();
                mainPanel.revalidate();

                // add panel
                mainPanel.add(Tuan1);
                mainPanel.repaint();
                mainPanel.revalidate();
        }

        private void btnTuan2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnTuan2ActionPerformed

                // remove panel
                mainPanel.removeAll();
                mainPanel.repaint();
                mainPanel.revalidate();

                // add panel
                mainPanel.add(Tuan2);
                mainPanel.repaint();
                mainPanel.revalidate();
        }

        private void btnTuan3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnTuan3ActionPerformed

                mainPanel.removeAll();
                mainPanel.repaint();
                mainPanel.revalidate();

                // add panel
                mainPanel.add(Tuan3);
                mainPanel.repaint();
                mainPanel.revalidate();
        }

        private void btnTuan4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnTuan4ActionPerformed

                mainPanel.removeAll();
                mainPanel.repaint();
                mainPanel.revalidate();

                // add panel
                mainPanel.add(Tuan4);
                mainPanel.repaint();
                mainPanel.revalidate();
        }

        private void btnTuan5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnTuan5ActionPerformed

                mainPanel.removeAll();
                mainPanel.repaint();
                mainPanel.revalidate();
                ThiSinh a = new ThiSinh(0, "Ngo Truong", "DHBK", 1);
                listTS.add(a);
                // Column Names
                table.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {
                                                { null, null, null, null },
                                                { null, null, null, null }

                                },
                                new Object[] {
                                                "ID", "T??n", "?????a ch???", "??u ti??n"
                                }) {
                        boolean[] canEdit = new boolean[] {
                                        false, false, false, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit[columnIndex];
                        }
                });
                populateTable();
                jScrollPane1.setViewportView(table);

                code5.setVisible(true);

                result5.setVisible(true);
                // add panel
                mainPanel.add(Tuan5);
                mainPanel.repaint();
                mainPanel.revalidate();
        }

        public void populateTable() {
                DefaultTableModel dtm = (DefaultTableModel) table.getModel();
                dtm.setRowCount(0); // to make row count 0
                // int rowCount = accountJTable.getRowCount();

                for (ThiSinh TS : listTS.getThiSinh()) {
                        Object[] row = new Object[4];
                        row[0] = TS.getId();
                        row[1] = TS.getName();
                        row[2] = TS.getAddress();
                        row[3] = TS.getPriority();
                        dtm.addRow(row);
                }
        }

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed

                code1.setText("B??i 02:In ra m??n h??nh 20 s??? nguy??n t??? ?????u ti??n");

                code1.setVisible(true);
                result1.setText(" 2 3 5 7 11 13 17 19 23 29 31\n 37 41 43 47 53 59 61 67 71");
                HideWeek1();
                result1.setVisible(false);
                jButton101.setVisible(true);
                result1.setVisible(false);
        }

        private void HideWeek1() {
                jButton101.setVisible(false);
                jButton102.setVisible(false);
                jButton103.setVisible(false);
                jButton104.setVisible(false);
                jButton105.setVisible(false);
                jButton106.setVisible(false);
                jButton107.setVisible(false);

        }

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
                code1.setText("B??i 04: In ra m??n h??nh c??c s??? <100 v?? chia h???t cho 3,7");
                code1.setVisible(true);
                result1.setText("Result:\nC??c s??? <100 v?? chia h???t cho 3,7 \n0 21 42 63 84");
                HideWeek1();
                result1.setVisible(false);
                jButton101.setVisible(true);
                result1.setVisible(false);
        }

        private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed
                code1.setText("B??i 01: In ra m??n h??nh t???t c??? c??c h???p s??? <100");
                code1.setVisible(true);
                result1.setText("Result:\nH???p s??? <100 \n4 6 8 9 10 12 14 15 16 18 20 21\n 22 24 25 26 27 28 30 32 33 34 35 36 38\n 39 40 42 44 45 46 48 49 50\n 51 52 54 55 56 57 58 60 62 63 64 65 66\n 68 69 70 72 74 75 76 77 78 80\n 81 82 84 85 86 87 88 90 91 92 93 94 95 96 98 99");
                HideWeek1();
                result1.setVisible(false);
                jButton101.setVisible(true);
                result1.setVisible(false);

                // add panel

        }

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
                code1.setText("B??i 03: In ra m??n h??nh c??c s??? n???m gi???a 1000 v?? 2000");
                code1.setVisible(true);
                result1.setText("Result:\nC??c s??? nguy??n t??? t??? 1000 ?????n 2000\n1009 1013 1019 1021 1031 1033 1039\n 1049 1051 1061 1063 1069 1087 1091\n 1093 1097 1103 1109 1117 1123 1129\n 1151 1153 1163 1171 1181 1187 1193 \n1201 1213 1217 1223 1229 1231 1237\n 1249 1259 1277 1279 1283 1289 1291 \n1297 1301 1303 1307 1319 1321 1327\n 1361 1367 1373 1381 1399 1409 1423 \n1427 1429 1433 1439 1447 1451 1453\n 1459 1471 1481 1483 1487 1489 1493 \n1499 1511 1523 1531 1543 1549 1553\n 1559 1567 1571 1579 1583 1597 1601 \n1607 1609 1613 1619 1621 1627 1637\n 1657 1663 1667 1669 1693 1697 1699 \n1709 1721 1723 1733 1741 1747 1753\n 1759 1777 1783 1787 1789 1801 1811\n 1823 1831 1847 1861 1867 1871 1873\n 1877 1879 1889 1901 1907 1913 1931\n 1933 1949 1951 1973 1979 1987 1993\n 1997 1999");
                HideWeek1();
                result1.setVisible(false);
                jButton101.setVisible(true);
                result1.setVisible(false);

        }

        private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
                code1.setText("B??i 05: In ra m??n h??nh c??c s??? n???m gi???a 1000 v?? 2000 ?????ng th???i chia h???t cho 3,5,7");
                code1.setVisible(true);
                result1.setText("Result:\nC??c s??? n???m gi???a 1000 v?? 2000 ?????ng th???i chia h???t cho 3,5,7 \n1050\n1155\n1260\n1365\n1470\n1575\n1680\n1785\n1890\n1995\n");

                HideWeek1();
                result1.setVisible(false);
                jButton101.setVisible(true);
                result1.setVisible(false);

        }

        private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton6ActionPerformed
                code1.setText("B??i 06: In ra m??n h??nh 5 s??? ho??n h???o ?????u ti??n (S??? ho??n h???o l?? s??? c?? t???ng b???ng c??c ?????c s??? c???a m??nh k??? c??? 1");
                code1.setVisible(true);
                result1.setText("Result:\n5 s??? ho??n h???o ?????u ti??n \n1 6 28 496 8128 ");

                HideWeek1();
                result1.setVisible(false);
                jButton101.setVisible(true);
                result1.setVisible(false);

        }

        private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton7ActionPerformed
                code1.setText("B??i 07: Trong c??c s??? t??? nhi??n <=100 h??y ?????m xem c?? bao nhi??u s???");
                code1.setVisible(true);
                result1.setText("Result:\nC??c s??? t??? nhi??n <=100  \nCo tat ca 15 so chia het cho 7\nCo tat ca 15 so chia 7 du 1\nCo tat ca 15 so chia 7 du 2\nCo tat ca 14 so chia 7 du 3 \n");

                HideWeek1();
                result1.setVisible(false);
                jButton101.setVisible(true);
                result1.setVisible(false);

        }

        private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton8ActionPerformed
                code2.setText("Cho s??? t??? nhi??n N b???t k??? \n T??nh t???ng S=1+1/(1+2) + 1/(1+2+3) +???+ 1/(1+2+3+..+N)");
                code2.setVisible(true);
                testField2.setText("");
                HideWeek2();
                jButton200.setVisible(true);
                result2.setVisible(false);
                testField2.setVisible(true);
        }

        private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton9ActionPerformed
                code2.setText("Cho s??? t??? nhi??n N b???t k???, t??nh t???ng\n S= 1+ 1/2! + 1/3! + ??? + 1/N!");
                code2.setVisible(true);
                testField2.setText("");
                HideWeek2();
                jButton201.setVisible(true);
                result2.setVisible(false);
                testField2.setVisible(true);

        }

        private void HideWeek2() {
                jButton200.setVisible(false);
                jButton201.setVisible(false);
                jButton202.setVisible(false);
                jButton203.setVisible(false);
        }

        private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton10ActionPerformed
                code2.setText("Cho s??? t??? nhi??n N b???t k???,\n t??nh t???ng S=1+1/(1+2!) + 1/(1+2!+3!)+ ..+ 1/(1+2!+3!+..+N!)");
                code2.setVisible(true);
                testField2.setText("");
                HideWeek2();
                jButton202.setVisible(true);
                result2.setVisible(false);
                testField2.setVisible(true);
        }

        private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton11ActionPerformed
                code2.setText("D??y Fibonaxi 1, 2, 3, ??? F(k) = F(k-1) + F(k-2). T??nh s??? Fibonaxi th??? N.");
                code2.setVisible(true);
                testField2.setText("");
                HideWeek2();
                jButton203.setVisible(true);
                result2.setVisible(false);
                testField2.setVisible(true);
        }

        private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton12ActionPerformed
                code3.setText("B??i 01: Cho m???t d??y s??? t??? nhi??n, vi???t ch????ng tr??nh s???p x???p d??y n??y theo th??? t??? gi???m d???n.");
                code3.setVisible(true);
                testField3.setText("");
                HideWeek3();
                jButton301.setVisible(true);
                result3.setVisible(false);
                testField3.setVisible(true);
        }

        private void HideWeek3() {
                jButton301.setVisible(false);
                jButton302.setVisible(false);
                jButton303.setVisible(false);
                jButton304.setVisible(false);
                jButton305.setVisible(false);
                jButton306.setVisible(false);
        }

        private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton13ActionPerformed
                code3.setText("B??i 02: Cho d??y s??? t??? nhi??n, in ra m??n h??nh t???t c??? c??c s??? nguy??n t??? c???a d??y n??y.");
                code3.setVisible(true);
                testField3.setText("");
                HideWeek3();
                jButton302.setVisible(true);
                result3.setVisible(false);
                testField3.setVisible(true);
        }

        private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton16ActionPerformed
                code3.setText("B??i 03: Cho m???t d??y c??c s??? t??? nhi??n, \nt??m v?? in ra 1 gi?? tr??? min c???a d??y n??y v?? t???t c??? c??c ch??? s??? ???ng v???i gi?? tr??? min n??y.");
                code3.setVisible(true);
                testField3.setText("");
                HideWeek3();
                jButton303.setVisible(true);
                result3.setVisible(false);
                testField3.setVisible(true);
        }

        private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton14ActionPerformed
                code3.setText("B??i 04: Cho m???t d??y c??c s??? t??? nhi??n, \nt??m v?? in ra 1 gi?? tr??? max c???a d??y n??y v?? t???t c??? c??c ch??? s??? ???ng v???i gi?? tr??? max n??y.");
                code3.setVisible(true);
                testField3.setText("");
                HideWeek3();
                jButton304.setVisible(true);
                result3.setVisible(false);
                testField3.setVisible(true);
        }

        private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton17ActionPerformed
                code3.setText("B??i 05: Cho m???t d??y s??? t??? nhi??n, \nh??y ?????m xem trong d??y s??? tr??n c?? bao nhi??u s??? nguy??n t???, c?? bao nhi??u h???p s???.");
                code3.setVisible(true);
                testField3.setText("");
                HideWeek3();
                jButton305.setVisible(true);
                result3.setVisible(false);
                testField3.setVisible(true);
        }

        private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton15ActionPerformed
                code3.setText("B??i 06: Cho m???t d??y s??? t??? nhi??n, \nh??y in ra t???t c??? c??c s??? h???ng c???a d??y tr??n th???a m??n: s??? n??y l?? ?????c s??? th???c s??? c???a 1 s??? h???ng kh??c trong d??y tr??n.");
                code3.setVisible(true);
                testField3.setText("");
                HideWeek3();
                jButton306.setVisible(true);
                result3.setVisible(false);
                testField3.setVisible(true);
        }

        private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton18ActionPerformed
                code4.setText("B??i 01: Cho tr?????c 1 x??u k?? t??? l?? h??? t??n ng?????i ?????y ????? nh??ng khi nh???p c?? th??? th???a m???t s??? d???u c??ch. H??y x??a ??i c??c d???u c??ch th???a v?? in ra h??? t??n ch??nh x??c.");
                code4.setVisible(true);
                testField4.setText("");
                HideWeek4();
                jButton401.setVisible(true);
                result4.setVisible(false);
                testField4.setVisible(true);
        }

        private void HideWeek4() {
                jButton401.setVisible(false);
                jButton402.setVisible(false);
                jButton403.setVisible(false);
                jButton404.setVisible(false);
                jButton405.setVisible(false);
                jButton406.setVisible(false);
                jButton407.setVisible(false);
                jButton408.setVisible(false);
                jButton409.setVisible(false);
        }

        private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton19ActionPerformed
                code4.setText("B??i 02: Cho tr?????c x??u k?? t??? b???t k???. H??y ?????m xem trong x??u c?? bao nhi??u l???n xu???t hi???n x??u con ???abc");
                code4.setVisible(true);
                testField4.setText("");
                HideWeek4();
                jButton402.setVisible(true);
                result4.setVisible(false);
                testField4.setVisible(true);
        }

        private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton20ActionPerformed
                code4.setText("B??i 03: Cho tr?????c 1 x??u k?? t??? l?? h??? t??n ng?????i ?????y ?????, h??y t??ch ra ph???n t??n c???a ng?????i n??y");
                code4.setVisible(true);
                testField4.setText("");
                HideWeek4();
                jButton403.setVisible(true);
                result4.setVisible(false);
                testField4.setVisible(true);
        }

        private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton21ActionPerformed
                code4.setText("B??i 04: Cho tr?????c 1 x??u k?? t??? l?? h??? t??n ng?????i ?????y ?????, h??y t??ch ra ph???n h??? c???a ng?????i n??y");
                code4.setVisible(true);
                testField4.setText("");
                HideWeek4();
                jButton404.setVisible(true);
                result4.setVisible(false);
                testField4.setVisible(true);
        }

        private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton22ActionPerformed
                code4.setText("B??i 05: Cho m???t x??u k?? t??? bao g???m to??n c??c k?? t??? 0,1. H??y bi???n ?????i x??u n??y theo c??ch 0????1, 1????0 v?? in ra k???t qu???.");
                code4.setVisible(true);
                testField4.setText("");
                HideWeek4();
                jButton405.setVisible(true);
                result4.setVisible(false);
                testField4.setVisible(true);
        }

        private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton23ActionPerformed
                code4.setText("B??i 06: Cho tr?????c x??u k?? t??? S, in ra x??u S1 ng?????c l???i x??u S.");
                code4.setVisible(true);
                testField4.setText("");
                HideWeek4();
                jButton406.setVisible(true);
                result4.setVisible(false);
                testField4.setVisible(true);
        }

        private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton24ActionPerformed
                code4.setText("B??i 7: Cho danh s??ch h??? t??n ?????y ????? h???c sinh. H??y ?????m xem c?? bao nhi??u b???n t??n ???An???.");
                code4.setVisible(true);
                testField4.setText("");
                HideWeek4();
                jButton407.setVisible(true);
                result4.setVisible(false);
                testField4.setVisible(true);
        }

        private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton25ActionPerformed
                code4.setText("B??i 8: Cho danh s??ch h??? t??n ?????y ????? h???c sinh. H??y ?????m xem c?? bao nhi??u b???n c?? ph???n ?????m l?? ???Th??????.");
                code4.setVisible(true);
                testField4.setText("");
                HideWeek4();
                jButton408.setVisible(true);
                result4.setVisible(false);
                testField4.setVisible(true);
        }

        private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton26ActionPerformed
                code4.setText("B??i 9: Cho danh s??ch h??? t??n ?????y ????? h???c sinh. H??y ?????m xem c?? bao nhi??u b???n c?? t??n b???t ?????u b???ng ch??? ???H???.");
                code4.setVisible(true);
                testField4.setText("");
                HideWeek4();
                jButton409.setVisible(true);
                result4.setVisible(false);
                testField4.setVisible(true);
        }

        private javax.swing.JPanel Bai21;
        private javax.swing.JPanel Bai22;
        private javax.swing.JPanel Bai23;
        private javax.swing.JPanel Bai24;
        private javax.swing.JPanel Bai31;
        private javax.swing.JPanel Bai32;
        private javax.swing.JPanel Bai33;
        private javax.swing.JPanel Bai34;
        private javax.swing.JPanel Bai35;
        private javax.swing.JPanel Bai36;
        private javax.swing.JPanel Bai41;
        private javax.swing.JPanel Bai42;
        private javax.swing.JPanel Bai43;
        private javax.swing.JPanel Bai44;
        private javax.swing.JPanel Bai45;
        private javax.swing.JPanel Bai46;
        private javax.swing.JPanel Bai47;
        private javax.swing.JPanel Bai48;
        private javax.swing.JPanel Bai49;
        private javax.swing.JPanel MainTuan2;
        private javax.swing.JPanel MainTuan3;
        private javax.swing.JPanel MainTuan4;
        private javax.swing.JPanel Tuan1;
        private javax.swing.JPanel Tuan2;
        private javax.swing.JPanel Tuan3;
        private javax.swing.JPanel Tuan4;
        private javax.swing.JPanel Tuan5;
        private javax.swing.JPanel bodyPanel;
        private javax.swing.JButton btnTuan1;
        private javax.swing.JButton btnTuan2;
        private javax.swing.JButton btnTuan3;
        private javax.swing.JButton btnTuan4;
        private javax.swing.JButton btnTuan5;
        private javax.swing.JButton b1;
        private javax.swing.JButton b2;
        private javax.swing.JButton b3;
        private javax.swing.JButton b4;
        private javax.swing.JButton b5;
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton10;
        private javax.swing.JButton jButton11;
        private javax.swing.JButton jButton12;
        private javax.swing.JButton jButton13;
        private javax.swing.JButton jButton14;
        private javax.swing.JButton jButton15;
        private javax.swing.JButton jButton16;
        private javax.swing.JButton jButton17;
        private javax.swing.JButton jButton18;
        private javax.swing.JButton jButton19;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton200;
        private javax.swing.JButton jButton201;
        private javax.swing.JButton jButton202;
        private javax.swing.JButton jButton203;
        private javax.swing.JButton jButton301;
        private javax.swing.JButton jButton302;
        private javax.swing.JButton jButton303;
        private javax.swing.JButton jButton304;
        private javax.swing.JButton jButton305;
        private javax.swing.JButton jButton306;
        private javax.swing.JButton jButton401;
        private javax.swing.JButton jButton402;
        private javax.swing.JButton jButton403;
        private javax.swing.JButton jButton404;
        private javax.swing.JButton jButton405;
        private javax.swing.JButton jButton406;
        private javax.swing.JButton jButton407;
        private javax.swing.JButton jButton408;
        private javax.swing.JButton jButton409;
        private javax.swing.JButton jButton101;
        private javax.swing.JButton jButton102;
        private javax.swing.JButton jButton103;
        private javax.swing.JButton jButton104;
        private javax.swing.JButton jButton105;
        private javax.swing.JButton jButton106;
        private javax.swing.JButton jButton107;
        private javax.swing.JButton jButton20;
        private javax.swing.JButton jButton21;
        private javax.swing.JButton jButton22;
        private javax.swing.JButton jButton23;
        private javax.swing.JButton jButton24;
        private javax.swing.JButton jButton25;
        private javax.swing.JButton jButton26;
        private javax.swing.JButton jButton3;
        private javax.swing.JButton jButton4;
        private javax.swing.JButton jButton5;
        private javax.swing.JButton jButton6;
        private javax.swing.JButton jButton7;
        private javax.swing.JButton jButton8;
        private javax.swing.JButton jButton9;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel15;
        private javax.swing.JLabel jLabel16;
        private javax.swing.JLabel jLabel17;
        private javax.swing.JLabel jLabel18;
        private javax.swing.JLabel jLabel19;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel20;
        private javax.swing.JLabel jLabel21;
        private javax.swing.JLabel jLabel22;
        private javax.swing.JLabel jLabel23;
        private javax.swing.JLabel jLabel24;
        private javax.swing.JLabel jLabel25;
        private javax.swing.JLabel jLabel26;
        private javax.swing.JLabel jLabel27;
        private javax.swing.JLabel jLabel28;
        private javax.swing.JLabel jLabel29;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel30;
        private javax.swing.JLabel jLabel31;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel mainPanel;
        private javax.swing.JPanel menuPanel;
        private javax.swing.JTextArea code1;
        private javax.swing.JTextArea result1;
        private javax.swing.JTextArea code2;
        private javax.swing.JTextArea result2;
        private javax.swing.JTextArea code3;
        private javax.swing.JTextArea result3;
        private javax.swing.JTextArea code4;
        private javax.swing.JTextArea result4;
        private javax.swing.JTextArea code5;
        private javax.swing.JTextArea result5;
        private JTextField t1;
        private JTextField testField2;
        private JTextField testField3;
        private JTextField testField4;
        private JTable table;
        private TuyenSinh listTS;
        private JScrollPane jScrollPane1;
        // End of variables declaration//GEN-END:variables
}
