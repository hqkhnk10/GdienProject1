package src123;

//20198265 Ngo Quang Truong

import javax.swing.JFrame;
import javax.swing.JScrollPane;

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
                code5.setText("Main.java\n\n//Ngo Quang Truong -20198265\n\nimport java.util.Scanner;\n\npublic class Main {\n\npublic static void main(String[] args) {\n\nScanner scanner = new Scanner(System.in);\n\nTuyenSinh managerThiSinh = new TuyenSinh();\n\nwhile (true) {\n\nSystem.out.println(\"Danh sach Thi Sinh\");\n\nSystem.out.println(\"Nhan 1: Them Thi Sinh\");\n\nSystem.out.println(\"Nhan 2: Hien thong tin ThiSinh: \");\n\nSystem.out.println(\"Nhan 3: Tim kiem ThiSinh bang id\");\n\nSystem.out.println(\"Nhan 4: De exit:\");\n\nString line = scanner.nextLine();\n\nswitch (line) {\n\ncase \"1\": {\n\nSystem.out.println(\"Nhan a: Them ThiSinh A\");\n\nSystem.out.println(\"Nhan b: Them ThiSinh B\");\n\nSystem.out.println(\"Nhan c: Them ThiSinh C\");\n\nString type = scanner.nextLine();\n\nswitch (type) {\n\ncase \"a\": {\n\nmanagerThiSinh.add(ThemThiSinh(scanner, \"a\"));\n\nbreak;\n\n}\n\ncase \"b\": {\n\nmanagerThiSinh.add(ThemThiSinh(scanner, \"b\"));\n\nbreak;\n\n}\n\ncase \"c\": {\n\nmanagerThiSinh.add(ThemThiSinh(scanner, \"c\"));\n\nbreak;\n\n}\n\ndefault:\n\nSystem.out.println(\"Invalid\");\n\nbreak;\n\n}\n\nbreak;\n\n}\n\ncase \"2\": {\n\nmanagerThiSinh.showInfor();\n\nbreak;\n\n}\n\ncase \"3\": {\n\nSystem.out.print(\"Nhan ID: \");\n\nString id = scanner.nextLine();\n\nThiSinh ThiSinh = managerThiSinh.searchById(id);\n\nif (ThiSinh == null) {\n\nSystem.out.println(\"Not found\");\n\n} else {\n\nSystem.out.println(ThiSinh.toString());\n\n}\n\nbreak;\n\n}\n\ncase \"4\": {\n\nreturn;\n\n}\n\ndefault:\n\nSystem.out.println(\"Invalid\");\n\ncontinue;\n\n}\n\n}\n\n}\n\npublic static ThiSinh ThemThiSinh(Scanner scanner, String type) {\n\nSystem.out.print(\"Nhan ID: \");\n\nString id = scanner.nextLine();\n\nSystem.out.print(\"Nhan name: \");\n\nString name = scanner.nextLine();\n\nSystem.out.print(\"Nhan address: \");\n\nString address = scanner.nextLine();\n\nSystem.out.print(\"Nhan Priotity: \");\n\nint priority = scanner.nextInt();\n\nscanner.nextLine();\n\nif (type.equals(\"a\")) {\n\nreturn new ThiSinhA(id, name, address, priority);\n\n} else if (type.equals(\"b\")) {\n\nreturn new ThiSinhB(id, name, address, priority);\n\n} else {\n\nreturn new ThiSinhC(id, name, address, priority);\n\n}\n\n}\n\n}\n\nThiSinh.java\n\npublic class ThiSinh {\n\nprotected String id;\n\nprotected String name;\n\nprotected String address;\n\nprotected int priority;\n\npublic ThiSinh(String id, String name, String address, int priority) {\n\nthis.id = id;\n\nthis.name = name;\n\nthis.address = address;\n\nthis.priority = priority;\n\n}\n\npublic String getId() {\n\nreturn id;\n\n}\n\npublic void setId(String id) {\n\nthis.id = id;\n\n}\n\npublic String getName() {\n\nreturn name;\n\n}\n\npublic void setName(String name) {\n\nthis.name = name;\n\n}\n\npublic String getAddress() {\n\nreturn address;\n\n}\n\npublic void setAddress(String address) {\n\nthis.address = address;\n\n}\n\npublic int getPriority() {\n\nreturn priority;\n\n}\n\npublic void setPriority(int priority) {\n\nthis.priority = priority;\n\n}\n\n}\n\npublic class ThiSinh {\n\nprotected String id;\n\nprotected String name;\n\nprotected String address;\n\nprotected int priority;\n\npublic ThiSinh(String id, String name, String address, int priority) {\n\nthis.id = id;\n\nthis.name = name;\n\nthis.address = address;\n\nthis.priority = priority;\n\n}\n\npublic String getId() {\n\nreturn id;\n\n}\n\npublic void setId(String id) {\n\nthis.id = id;\n\n}\n\npublic String getName() {\n\nreturn name;\n\n}\n\npublic void setName(String name) {\n\nthis.name = name;\n\n}\n\npublic String getAddress() {\n\nreturn address;\n\n}\n\npublic void setAddress(String address) {\n\nthis.address = address;\n\n}\n\npublic int getPriority() {\n\nreturn priority;\n\n}\n\npublic void setPriority(int priority) {\n\nthis.priority = priority;\n\n}\n\n}\n\nThiSinhA.java\n\npublic class ThiSinhA extends ThiSinh {\n\npublic static final String MON_TOAN = \"Toan\";\n\npublic static final String MON_LY = \"Ly\";\n\npublic static final String MON_HOA = \"Hoa\";\n\npublic ThiSinhA(String id, String name, String address, int priority) {\n\nsuper(id, name, address, priority);\n\n}\n\n@Override\n\npublic String toString() {\n\nreturn \"ThiSinhA{\" +\n\n\"id='\" + id + '\'' +\n\n\", name='\" + name + '\'' +\n\n\", address='\" + address + '\'' +\n\n\", priority=\" + priority + \", Subject: \" + MON_TOAN + \" - \" + MON_LY + \" - \" + MON_HOA +\n\n'}';\n\n}\n\n}\n\nThiSinhB.java\n\npublic class ThiSinhB extends ThiSinh {\n\npublic static final String MON_TOAN = \"Toan\";\n\npublic static final String MON_HOA = \"Hoa\";\n\npublic static final String MON_SINH = \"Sinh\";\n\npublic ThiSinhB(String id, String name, String address, int priority) {\n\nsuper(id, name, address, priority);\n\n}\n\n@Override\n\npublic String toString() {\n\nreturn \"ThiSinhB{\" +\n\n\"id='\" + id + '\'' +\n\n\", name='\" + name + '\'' +\n\n\", address='\" + address + '\'' +\n\n\", priority=\" + priority + \", Subject: \" + MON_TOAN + \" - \" + MON_SINH + \" - \" + MON_HOA +\n\n'}';\n\n}\n\n}\n\nThiSinhC.java\n\npublic class ThiSinhC extends ThiSinh {\n\npublic static final String MON_VAN = \"Van\";\n\npublic static final String MON_SU = \"Su\";\n\npublic static final String MON_DIA = \"Dia\";\n\npublic ThiSinhC(String id, String name, String address, int priority) {\n\nsuper(id, name, address, priority);\n\n}\n\n@Override\n\npublic String toString() {\n\nreturn \"ThiSinhC{\" +\n\n\"id='\" + id + '\'' +\n\n\", name='\" + name + '\'' +\n\n\", address='\" + address + '\'' +\n\n\", priority=\" + priority + \", Subject: \" + MON_VAN + \" - \" + MON_SU + \" - \" + MON_DIA +\n\n'}';\n\n}\n\n}\n\nTuyenSinh.java\n\nimport java.util.ArrayList;\n\nimport java.util.List;\n\npublic class TuyenSinh {\n\nList<ThiSinh> ThiSinhs;\n\npublic TuyenSinh() {\n\nthis.ThiSinhs = new ArrayList<>();\n\n}\n\npublic void add(ThiSinh ThiSinh) {\n\nthis.ThiSinhs.add(ThiSinh);\n\n}\n\npublic void showInfor() {\n\nthis.ThiSinhs.forEach(ThiSinh -> System.out.println(ThiSinh.toString()));\n\n}\n\npublic ThiSinh searchById(String id) {\n\nreturn this.ThiSinhs.stream().filter(ThiSinh -> ThiSinh.getId().equals(id)).findFirst().orElse(null);\n\n}\n\n}\n");
                result5.setText("Danh sach Thi Sinh\nNhan 1: Them Thi Sinh\nNhan 2: Hien thong tin ThiSinh: \nNhan 3: Tim kiem ThiSinh bang id\nNhan 4: De exit:\n1\nNhan a: Them ThiSinh A\nNhan b: Them ThiSinh B\nNhan c: Them ThiSinh C\na\nNhan ID: 1\nNhan name: Lung Thi Linh\nNhan address: DH Bach Khoa\nNhan Priotity: 1\nDanh sach Thi Sinh\nNhan 1: Them Thi Sinh\nNhan 2: Hien thong tin ThiSinh:\nNhan 3: Tim kiem ThiSinh bang id\nNhan 4: De exit:\n1\nNhan a: Them ThiSinh A\nNhan b: Them ThiSinh B\nNhan c: Them ThiSinh C\na\nNhan ID: 2\nNhan name: Ngo Quang Truong\nNhan address: DH Cong Nghe\nNhan Priotity: 3\nDanh sach Thi Sinh\nNhan 1: Them Thi Sinh\nNhan 2: Hien thong tin ThiSinh:\nNhan 3: Tim kiem ThiSinh bang id\nNhan 4: De exit:\n2\nThiSinhA{id='1', name='Lung Thi Linh', address='DH Bach Khoa', priority=1, Subject: Toan - Ly - Hoa}\nThiSinhA{id='2', name='Ngo Quang Truong', address='DH Cong Nghe', priority=3, Subject: Toan - Ly - Hoa}\nDanh sach Thi Sinh\nNhan 1: Them Thi Sinh\nNhan 2: Hien thong tin ThiSinh:\nNhan 3: Tim kiem ThiSinh bang id\nNhan 4: De exit:\n3\nNhan ID: 2\nThiSinhA{id='2', name='Ngo Quang Truong', address='DH Cong Nghe', priority=3, Subject: Toan - Ly - Hoa}\nDanh sach Thi Sinh\nNhan 1: Them Thi Sinh\nNhan 2: Hien thong tin ThiSinh:\nNhan 3: Tim kiem ThiSinh bang id\nNhan 4: De exit:\n4\n\n");
                code5.setFont(new java.awt.Font("Times New Roman", 1, 14));
                result5.setFont(new java.awt.Font("Times New Roman", 1, 14));
                sp = new JScrollPane(code5);

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

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Qu???n l?? b??i t???p tu???n");
                setExtendedState(JFrame.MAXIMIZED_BOTH);
                setVisible(true);
                setResizable(false);

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
                                                                                                .addComponent(code1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                300,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(40, 40, 40)
                                                                                                .addComponent(result1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(296, Short.MAX_VALUE)));
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
                                                                                .addComponent(code1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                300, Short.MAX_VALUE)

                                                                                .addComponent(result1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(292, Short.MAX_VALUE)));

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
                                                                                                .addComponent(code2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                300,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(40, 40, 40)

                                                                                                .addComponent(result2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(Tuan2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(29, 29, 29)
                                                                                                .addComponent(jLabel3)))
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
                                                                                .addComponent(code2,
                                                                                                500,
                                                                                                500,
                                                                                                500)
                                                                                .addComponent(result2,
                                                                                                500,
                                                                                                500,
                                                                                                500))

                                                                .addContainerGap(340, Short.MAX_VALUE)));

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
                                                                                                .addComponent(code3,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                300,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)

                                                                                                .addComponent(result3,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                                                                .addComponent(code3,
                                                                                                500,
                                                                                                500,
                                                                                                500)

                                                                                .addComponent(result3,
                                                                                                500,
                                                                                                500,
                                                                                                500))
                                                                .addContainerGap(280, Short.MAX_VALUE)));

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
                                                                                                .addComponent(code4,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                300,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)

                                                                                                .addComponent(result4,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                                                                .addComponent(code4,
                                                                                                500,
                                                                                                500,
                                                                                                500)

                                                                                .addComponent(result4,
                                                                                                500,
                                                                                                500,
                                                                                                500))
                                                                .addContainerGap(280, Short.MAX_VALUE)));

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
                                                                                .addComponent(sp,
                                                                                                800,
                                                                                                800,
                                                                                                800)

                                                                                .addComponent(result5,
                                                                                                800,
                                                                                                800,
                                                                                                800))
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

                                                                                                .addComponent(sp,
                                                                                                                500,
                                                                                                                500,
                                                                                                                500)

                                                                                                .addComponent(result5,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
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

                code5.setVisible(true);

                result5.setVisible(true);
                // add panel
                mainPanel.add(Tuan5);
                mainPanel.repaint();
                mainPanel.revalidate();
        }

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed

                code1.setText("code:\n class bai2tuan28 { \n??? ??? public static void main(String[] args) { \n??? ??? ??? ??? int count=0; \n??? ??? ??? ??? for (int i = 2; i < 100; i++) { \n??? ??? ??? ??? ??? ??? if (isPrimeNumber(i)) { \n??? ??? ??? ??? ??? ??? ??? ??? count++; \n??? ??? ??? ??? ??? ??? ??? ??? System.out.print(\" \" + i); \n??? ??? ??? ??? ??? ??? }\n??? ??? ??? ??? ??? ??? if(count==20){break;} \n??? ??? ??? ??? }\n??? ??? }\n??? ??? public static boolean isPrimeNumber(int n) { \n??? ??? ??? ??? // so nguyen n < 2 khong phai la so nguyen to \n??? ??? ??? ??? if (n < 2) { \n??? ??? ??? ??? ??? ??? return false; \n??? ??? ??? ??? } \n??? ??? ??? ??? // check so nguyen to khi n >= 2 \n??? ??? ??? ??? int squareRoot = (int) Math.sqrt(n); \n??? ??? ??? ??? for (int i = 2; i <= squareRoot; i++) { \n??? ??? ??? ??? ??? ??? if (n % i == 0) { \n??? ??? ??? ??? ??? ??? ??? ??? return false; \n??? ??? ??? ??? ??? ??? } \n??? ??? ??? ??? } \n??? ??? ??? ??? return true; \n??? ??? } \n} \n");
                code1.setVisible(true);
                result1.setText("Result:\n20 s??? nguy??n t??? ?????u ti??n\n 2 3 5 7 11 13 17 19 23 29 31\n 37 41 43 47 53 59 61 67 71");
                result1.setVisible(true);
        }

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed

                code1.setText("code:\n class bai4tuan28 { \n??? ??? public static void main(String[] args) { \n??? ??? ??? ??? System.out.println(\"C??c s??? chia h???t cho 3 va 7 l??: \"); \n??? ??? ??? ??? for (int i = 0; i < 100; i++) { \n??? ??? ??? ??? ??? ??? if (i % 3 != 0 || i % 7 != 0) { \n??? ??? ??? ??? ??? ??? ??? ??? continue; \n??? ??? ??? ??? ??? ??? } \n??? ??? ??? ??? ??? ??? System.out.println(i); \n??? ??? ??? ??? } \n??? ??? } \n} \n");
                code1.setVisible(true);
                result1.setText("Result:\nC??c s??? <100 v?? chia h???t cho 3,7 \n0 21 42 63 84");
                result1.setVisible(true);

        }

        private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed

                code1.setText("code:\n class bai1tuan28 {\n ??? ??? public static void main(String[] args) {\n  ??? ??? ??? ??? for (int i = 3; i < 100; i++) {\n  ??? ??? ??? ??? ??? ??? if (!isPrimeNumber(i)) { \n ??? ??? ??? ??? ??? ??? ??? ??? System.out.print(\" \" + i);\n  ??? ??? ??? ??? ??? ??? } \n ??? ??? ??? ??? }\n ??? ??? }\n ??? ??? public static boolean isPrimeNumber(int n) { \n ??? ??? ??? ??? // so nguyen n < 2 khong phai la so nguyen to \n ??? ??? ??? ??? if (n < 2) { \n ??? ??? ??? ??? ??? ??? return false;\n  ??? ??? ??? ??? } \n ??? ??? ??? ??? // check so nguyen to khi n >= 2 \n ??? ??? ??? ??? int squareRoot = (int) Math.sqrt(n); \n ??? ??? ??? ??? for (int i = 2; i <= squareRoot; i++) { \n ??? ??? ??? ??? ??? ??? if (n % i == 0) { \n ??? ??? ??? ??? ??? ??? ??? ??? return false; \n ??? ??? ??? ??? ??? ??? } \n ??? ??? ??? ??? } \n ??? ??? ??? ??? return true; \n ??? ??? }\n  }\n  ");
                code1.setVisible(true);
                result1.setText("Result:\nH???p s??? <100 \n4 6 8 9 10 12 14 15 16 18 20 21\n 22 24 25 26 27 28 30 32 33 34 35 36 38\n 39 40 42 44 45 46 48 49 50\n 51 52 54 55 56 57 58 60 62 63 64 65 66\n 68 69 70 72 74 75 76 77 78 80\n 81 82 84 85 86 87 88 90 91 92 93 94 95 96 98 99");
                result1.setVisible(true);

                // add panel

        }

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed

                code1.setText("code:\n class bai3tuan28 { \n??? ??? public static void main(String[] args) { \n??? ??? ??? ??? for (int i = 1000; i < 2000; i++) { \n??? ??? ??? ??? ??? ??? if (isPrimeNumber(i)) { \n??? ??? ??? ??? ??? ??? ??? ??? System.out.print(\" \" + i); \n??? ??? ??? ??? ??? ??? } \n??? ??? ??? ??? } \n??? ??? } \n??? ??? public static boolean isPrimeNumber(int n) { \n??? ??? ??? ??? // so nguyen n < 2 khong phai la so nguyen to \n??? ??? ??? ??? if (n < 2) { \n??? ??? ??? ??? ??? ??? return false; \n??? ??? ??? ??? } \n??? ??? ??? ??? // check so nguyen to khi n >= 2 \n??? ??? ??? ??? int squareRoot = (int) Math.sqrt(n); \n??? ??? ??? ??? for (int i = 2; i <= squareRoot; i++) { \n??? ??? ??? ??? ??? ??? if (n % i == 0) { \n??? ??? ??? ??? ??? ??? ??? ??? return false; \n??? ??? ??? ??? ??? ??? } \n??? ??? ??? ??? } \n??? ??? ??? ??? return true; \n??? ??? } \n}\n ");
                code1.setVisible(true);
                result1.setText("Result:\nC??c s??? nguy??n t??? t??? 1000 ?????n 2000\n1009 1013 1019 1021 1031 1033 1039\n 1049 1051 1061 1063 1069 1087 1091\n 1093 1097 1103 1109 1117 1123 1129\n 1151 1153 1163 1171 1181 1187 1193 \n1201 1213 1217 1223 1229 1231 1237\n 1249 1259 1277 1279 1283 1289 1291 \n1297 1301 1303 1307 1319 1321 1327\n 1361 1367 1373 1381 1399 1409 1423 \n1427 1429 1433 1439 1447 1451 1453\n 1459 1471 1481 1483 1487 1489 1493 \n1499 1511 1523 1531 1543 1549 1553\n 1559 1567 1571 1579 1583 1597 1601 \n1607 1609 1613 1619 1621 1627 1637\n 1657 1663 1667 1669 1693 1697 1699 \n1709 1721 1723 1733 1741 1747 1753\n 1759 1777 1783 1787 1789 1801 1811\n 1823 1831 1847 1861 1867 1871 1873\n 1877 1879 1889 1901 1907 1913 1931\n 1933 1949 1951 1973 1979 1987 1993\n 1997 1999");
                result1.setVisible(true);

        }

        private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed

                code1.setText("code:\n class bai5tuan28 { \n??? ??? public static void main(String[] args) { \n??? ??? ??? ??? for (int i = 1000; i < 2000; i++) { \n??? ??? ??? ??? ??? ??? if (i % 3 != 0 || i % 5 != 0 || i % 7 != 0) { \n??? ??? ??? ??? ??? ??? ??? ??? continue; \n??? ??? ??? ??? ??? ??? } \n??? ??? ??? ??? ??? ??? System.out.println(i); \n??? ??? ??? ??? } \n??? ??? } \n} \n");
                code1.setVisible(true);
                result1.setText("Result:\nC??c s??? n???m gi???a 1000 v?? 2000 ?????ng th???i chia h???t cho 3,5,7 \n1050\n1155\n1260\n1365\n1470\n1575\n1680\n1785\n1890\n1995\n");

                result1.setVisible(true);

        }

        private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton6ActionPerformed

                code1.setText("code:\n class bai6tuan28 { \n??? ??? public static void main(String[] args) { \n??? ??? ??? ??? int k = 0, j = 0, n, tong; \n??? ??? ??? ??? while (j < 5) { \n??? ??? ??? ??? ??? ??? k++; \n??? ??? ??? ??? ??? ??? tong = 1; \n??? ??? ??? ??? ??? ??? for (n = 2; n < k; n++) { \n??? ??? ??? ??? ??? ??? ??? ??? if (k % n == 0) \n??? ??? ??? ??? ??? ??? ??? ??? ??? ??? tong += n; \n??? ??? ??? ??? ??? ??? } \n??? ??? ??? ??? ??? ??? if (k == tong) { \n??? ??? ??? ??? ??? ??? ??? ??? System.out.print(k + \" \"); \n??? ??? ??? ??? ??? ??? ??? ??? j++; \n??? ??? ??? ??? ??? ??? } \n??? ??? ??? ??? } \n??? ??? } \n}\n ");
                code1.setVisible(true);
                result1.setText("Result:\n5 s??? ho??n h???o ?????u ti??n \n1 6 28 496 8128 ");

                result1.setVisible(true);

        }

        private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton7ActionPerformed
                code1.setText("code:\n public class bai7tuan28 { \n??? ??? public static void main(String[] args) { \n??? ??? ??? ??? int d1 = 0, d2 = 0, d3 = 0, d4 = 0; \n??? ??? ??? ??? for (int i = 0; i <= 100; i++) \n??? ??? ??? ??? ??? ??? switch (i % 7) { \n??? ??? ??? ??? ??? ??? ??? ??? case 0: \n??? ??? ??? ??? ??? ??? ??? ??? ??? ??? d1++; \n??? ??? ??? ??? ??? ??? ??? ??? ??? ??? break; \n??? ??? ??? ??? ??? ??? ??? ??? case 1: \n??? ??? ??? ??? ??? ??? ??? ??? ??? ??? d2++; \n??? ??? ??? ??? ??? ??? ??? ??? ??? ??? break; \n??? ??? ??? ??? ??? ??? ??? ??? case 2: \n??? ??? ??? ??? ??? ??? ??? ??? ??? ??? d3++; \n??? ??? ??? ??? ??? ??? ??? ??? ??? ??? break; \n??? ??? ??? ??? ??? ??? ??? ??? case 3: \n??? ??? ??? ??? ??? ??? ??? ??? ??? ??? d4++; \n??? ??? ??? ??? ??? ??? ??? ??? ??? ??? break; \n??? ??? ??? ??? ??? ??? } \n??? ??? ??? ??? System.out.println(\"Co tat ca \" + d1 + \" so chia het cho 7\"); \n??? ??? ??? ??? System.out.println(\"Co tat ca \" + d2 + \" so chia 7 du 1\"); \n??? ??? ??? ??? System.out.println(\"Co tat ca \" + d3 + \" so chia 7 du 2\"); \n??? ??? ??? ??? System.out.println(\"Co tat ca \" + d4 + \" so chia 7 du 3\"); \n??? ??? } \n} \n");
                code1.setVisible(true);
                result1.setText("Result:\nC??c s??? t??? nhi??n <=100  \nCo tat ca 15 so chia het cho 7\nCo tat ca 15 so chia 7 du 1\nCo tat ca 15 so chia 7 du 2\nCo tat ca 14 so chia 7 du 3 \n");

                result1.setVisible(true);

        }

        private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton8ActionPerformed
                code2.setText("Code:\n import java.util.Scanner;\npublic class bai1tuan30 {\n    public static void main(String[] args) {\n        int n;\n        float sum = 0f;\n        int denominator = 0;\n        Scanner sc;\n        do {\n            System.out.print(\"Input n = \");\n            sc = new Scanner(System.in);\n            n = sc.nextInt();\n        } while (n <= 0);\n        for (int i = 1; i <= n; i++) {\n            denominator += i;\n            sum += 1.0 / denominator;\n        }\n        System.out.println(\"Sum = \" + sum);\n        sc.close();\n    }\n}\n");
                code2.setVisible(true);
                result2.setText("Result:\nT???ng S=1+1/(1+2) + 1/(1+2+3) +???+ 1/(1+2+3+..+N) \nInput n = 15\nSum = 1.8750002\n");
                result2.setVisible(true);

        }

        private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton9ActionPerformed
                code2.setText("Code:\n import java.util.Scanner;\npublic class bai2tuan30 {\n    public static int n;\n    public static double giaithua(int n) {\n        double tmp = 1;\n        if (n > 1) {\n            for (int i = 2; i <= n; i++) {\n                tmp *= i;\n            }\n        }\n        return tmp;\n    }\n    public static void main(String[] args) {\n        float tong = 0.0f;\n        Scanner reader = new Scanner(System.in);\n        System.out.print(\"Nh???p s??? t??? nhi??n N = \");\n        n = reader.nextInt();\n        for (int i = 1; i <= n; i++) {\n            tong += 1 / giaithua(i);\n        }\n        System.out.println(\"tong day so la: \" + tong);\n    }\n}\n");
                code2.setVisible(true);
                result2.setText("Result:\nT??nh t???ng S= 1+ 1/2! + 1/3! + ??? + 1/N! \nNh???p s??? t??? nhi??n N = 11\nT???ng d??y s??? l??: 1.7182816\n");

                result2.setVisible(true);
        }

        private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton10ActionPerformed
                code2.setText("Code:\n import java.util.Scanner;\npublic class bai3tuan30 {\n    public static int n;\n    public static double giaithua(int n) {\n        double tmp = 1;\n        if (n > 1) {\n            for (int i = 2; i <= n; i++) {\n                tmp *= i;\n            }\n        }\n        return tmp;\n    }\n    public static void main(String[] args) {\n        float tong = 0.0f;\n        float denominator = 0;\n        Scanner reader = new Scanner(System.in);\n        System.out.print(\"Nhap so tu nhien N = \");\n        n = reader.nextInt();\n        for (int i = 1; i <= n; i++) {\n            denominator += giaithua(i);\n            tong += 1 / denominator;\n        }\n        System.out.println(\"tong day so la: \" + tong);\n    }\n}\n");
                code2.setVisible(true);
                result2.setText("Result:\n T??nh t???ng S=1+1/(1+2!) + 1/(1+2!+3!)+ ..+ 1/(1+2!+3!+..+N!) \nNhap so tu nhien N = 11\ntong day so la: 1.4826225\n");
                result2.setVisible(true);
        }

        private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton11ActionPerformed
                code2.setText("Code:\n import java.util.Scanner;\npublic class bai4tuan30 {\n    public static void main(String args[]) {\n        int n;\n        Scanner sc = new Scanner(System.in);\n        do {\n            System.out.print(\"n = \");\n            n = sc.nextInt();\n        } while (n <= 0);\n        // print out the Fibonacci\n        System.out.format(\"%dth Fibonacci is: %d\", n, fibo(n));\n    }\n    public static int fibo(int n) {\n        if (n == 1 || n == 2) {\n            return 1;\n        } else {\n            return (fibo(n - 2) + fibo(n - 1));\n        }\n    }\n}\nimport java.util.Scanner;\npublic class bai4tuan30 {\n    public static void main(String args[]) {\n        int n;\n        Scanner sc = new Scanner(System.in);\n        do {\n            System.out.print(\"n = \");\n            n = sc.nextInt();\n        } while (n <= 0);\n        // print out the Fibonacci\n        System.out.format(\"%dth Fibonacci is: %d\", n, fibo(n));\n    }\n    public static int fibo(int n) {\n        if (n == 1 || n == 2) {\n            return 1;\n        } else {\n            return (fibo(n - 2) + fibo(n - 1));\n        }\n    }\n}\n");
                code2.setVisible(true);
                result2.setText("Result:\n T??nh s??? Fibonaxi th??? N.\n n = 11\n11th Fibonacci is: 89");

                result2.setVisible(true);
        }

        private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton12ActionPerformed
                code3.setText("Code:\n import java.util.Scanner;\nclass bai1 {\n    public static void main(String[] args) {\n        int num, i, j, temp;\n        Scanner input = new Scanner(System.in);\n        System.out.println(\"Nhap vao so luong phan tu cua mang:\");\n        num = input.nextInt();\n        int array[] = new int[num];\n        System.out.println(\"Nhap vao cac phan tu cua mang:\");\n        for (i = 0; i < num; i++)\n            array[i] = input.nextInt();\n        for (i = 0; i < (num - 1); i++) {\n            for (j = 0; j < num - i - 1; j++) {\n                if (array[j] < array[j + 1]) {\n                    temp = array[j];\n                    array[j] = array[j + 1];\n                    array[j + 1] = temp;\n                }\n            }\n        }\n        System.out.println(\"Sap xep theo thu tu giam dan la: \");\n        for (i = 0; i < num; i++) {\n            System.out.print(array[i] + \"   \");\n        }\n    }\n}\n");
                code3.setVisible(true);
                result3.setText("Result:\n Nhap vao so luong phan tu cua mang:\n5\nNhap vao cac phan tu cua mang:\n9 4 1 3 5\nSap xep theo thu tu giam dan la: \n9   5   4   3   1\n");
                result3.setVisible(true);
        }

        private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton13ActionPerformed
                code3.setText("Code:\n import java.util.Scanner;\nclass bai2 {\n    public static void main(String[] args) {\n        int num, i;\n        Scanner input = new Scanner(System.in);\n        System.out.println(\"Nhap vao so luong phan tu cua mang:\");\n        num = input.nextInt();\n        int array[] = new int[num];\n        System.out.println(\"Nhap vao cac phan tu cua mang:\");\n        for (i = 0; i < num; i++)\n            array[i] = input.nextInt();\n        System.out.print(\"Cac so nguyen to la: \");\n        for (i = 0; i < num; i++) {\n            if (check(array[i]))\n                System.out.print(array[i] + \" \");\n        }\n        System.out.println(\"\");\n    }\n    public static boolean check(int n) {\n        if (n <= 1)\n            return false;\n        for (int i = 2; i <= Math.sqrt(n); i++)\n            if (n % i == 0)\n                return false;\n        // N???u kh??ng chia h???t th?? tr??? v??? true\n        return true;\n    }\n}\n");
                code3.setVisible(true);
                result3.setText("Result:\n Nhap vao so luong phan tu cua mang:\n5\nNhap vao cac phan tu cua mang:\n9 4 3 1 7\nCac so nguyen to la: 3 7\n");

                result3.setVisible(true);
        }

        private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton16ActionPerformed
                code3.setText("Code:\n import java.util.Scanner;\nclass bai3 {\n    public static void main(String[] args) {\n        int num, i;\n        Scanner input = new Scanner(System.in);\n        System.out.println(\"Nhap vao so luong phan tu cua mang:\");\n        num = input.nextInt();\n        int array[] = new int[num];\n        System.out.println(\"Nhap vao cac phan tu cua mang:\");\n        for (i = 0; i < num; i++)\n            array[i] = input.nextInt();\n        int minArr = min(array, num);\n        String minIdx = \"\";\n        for (i = 0; i < num; i++) {\n            if (array[i] == minArr) {\n                minIdx += (i + 1) + \" \";\n            }\n        }\n        System.out.println(\"Phan tu nho nhat trong mang la: \" + minArr +\n                \"\nCac chi so ung voi gia tri nho nhat la: \" + minIdx);\n    }\n    public static int min(int a[], int n) {\n        int min = a[0];\n        for (int i = 1; i < n; i++) {\n            if (a[i] < min)\n                min = a[i];\n        }\n        return min;\n    }\n}");
                code3.setVisible(true);
                result3.setText("Result:\n Nhap vao so luong phan tu cua mang:\n5\nNhap vao cac phan tu cua mang:\n9 4 1 7 3\nPhan tu nho nhat trong mang la: 1\nCac chi so ung voi gia tri nho nhat la: 3 \n");

                result3.setVisible(true);
        }

        private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton14ActionPerformed
                code3.setText("Code:\n import java.util.Scanner;\nclass bai4 {\n    public static void main(String[] args) {\n        int num, i;\n        Scanner input = new Scanner(System.in);\n        System.out.println(\"Nhap vao so luong phan tu cua mang:\");\n        num = input.nextInt();\n        int array[] = new int[num];\n        System.out.println(\"Nhap vao cac phan tu cua mang:\");\n        for (i = 0; i < num; i++)\n            array[i] = input.nextInt();\n        int maxArr = max(array, num);\n        String maxIdx = \"\";\n        for (i = 0; i < num; i++) {\n            if (array[i] == maxArr) {\n                maxIdx += (i + 1) + \" \";\n            }\n        }\n        System.out.println(\"Phan tu nho nhat trong mang la: \" + maxArr +\n                \"\nCac chi so ung voi gia tri nho nhat la: \" + maxIdx);\n    }\n    public static int max(int a[], int n) {\n        int max = a[0];\n        for (int i = 1; i < n; i++) {\n            if (a[i] > max)\n                max = a[i];\n        }\n        return max;\n    }\n}");
                code3.setVisible(true);
                result3.setText("Result:\n Nhap vao so luong phan tu cua mang:\n5\nNhap vao cac phan tu cua mang:\n9 7 1 3 2 \nPhan tu nho nhat trong mang la: 9\nCac chi so ung voi gia tri nho nhat la: 1 \n");

                result3.setVisible(true);
        }

        private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton17ActionPerformed
                code3.setText("Code:\n import java.util.Scanner;\nclass bai5 {\n    public static void main(String[] args) {\n        int num, i;\n        Scanner input = new Scanner(System.in);\n        System.out.println(\"Nhap vao so luong phan tu cua mang:\");\n        num = input.nextInt();\n        int array[] = new int[num];\n        System.out.println(\"Nhap vao cac phan tu cua mang:\");\n        for (i = 0; i < num; i++)\n            array[i] = input.nextInt();\n        int countSNT = 0;\n        int countHS = 0;\n        for (i = 0; i < num; i++) {\n            if (check(array[i])) {\n                countSNT++;\n            } else {\n                if (array[i] > 3) {\n                    countHS++;\n                }\n            }\n        }\n        System.out.println(\"Co \" + countSNT + \" so nguyen to\");\n        System.out.println(\"Co \" + countHS + \" hop so\");\n    }\n    public static boolean check(int n) {\n        if (n <= 1)\n            return false;\n        for (int i = 2; i <= Math.sqrt(n); i++)\n            if (n % i == 0)\n                return false;\n        // N???u kh??ng chia h???t th?? tr??? v??? true\n        return true;\n    }\n}\n");
                code3.setVisible(true);
                result3.setText("Result:\n Nhap vao so luong phan tu cua mang:\n5\nNhap vao cac phan tu cua mang:\n9 7 1 3 6\nCo 2 so nguyen to\nCo 2 hop so\n");

                result3.setVisible(true);
        }

        private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton15ActionPerformed
                code3.setText("Code:\n import java.util.Scanner;\nclass bai6 {\n    public static void main(String[] args) {\n        int num, i;\n        Scanner input = new Scanner(System.in);\n        System.out.println(\"Nhap vao so luong phan tu cua mang:\");\n        num = input.nextInt();\n        int array[] = new int[num];\n        System.out.println(\"Nhap vao cac phan tu cua mang:\");\n        for (i = 0; i < num; i++)\n            array[i] = input.nextInt();\n        System.out.println(\"Uoc thuc su cua 1 so hang khac trong day tren: \");\n        for (i = 0; i < num; i++) {\n            for (int j = 0; j < num; j++) {\n                try {\n                    if (array[i] % array[j] == 0 && array[j] > 1 && array[j] < array[i]) {\n                        System.out.print(array[j] + \" \");\n                        array[j] = 0;\n                    }\n                } catch (ArithmeticException e) {\n                }\n            }\n        }\n    }\n}\n");
                code3.setVisible(true);
                result3.setText("Result:\n Nhap vao so luong phan tu cua mang:\n5\nNhap vao cac phan tu cua mang:\n9 7 1 6 3\nUoc thuc su cua 1 so hang khac trong day tren: \n3\n");

                result3.setVisible(true);
        }

        private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton18ActionPerformed
                code4.setText("Code:\n //NgoQuangTruong-20198265\nclass bai1 {\n    public static void main(String[] args) {\n        String name = \" Ngo   Quang    Truong\";\n        name = name.trim().toLowerCase();\n        name = name.replaceAll(\"\\s+\", \" \");\n        System.out.print(name);\n    }\n}\n");
                code4.setVisible(true);
                result4.setText("Result:\n ngo quang truong");
                result4.setVisible(true);
        }

        private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton19ActionPerformed
                code4.setText("Code:\n //NgoQuangTruong-20198265\nclass bai2 {\n    public static void main(String[] args) {\n        String myString = \"sdklfjkabc sdfabcasd\";\n        String mySubstring = \"abc\";\n        int count = 0, index = 0;\n        while ((index = myString.indexOf(mySubstring, index)) != -1) {\n            count++;\n            index++;\n        }\n        System.out.print(\"So lan xuat hien xau con \"abc\" trong xau \"\n + myString + \"la: \" + count + \" lan\");\n    }\n}\n");
                code4.setVisible(true);
                result4.setText("Result:\n So lan xuat hien xau con \"abc\"\n trong xau sdklfjkabc sdfabcasdla: 2 lan");
                result4.setVisible(true);
        }

        private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton20ActionPerformed
                code4.setText("Code:\n //NgoQuangTruong-20198265\nclass bai3 {\n    public static void main(String[] args) {\n        String name = \" Ngo   Quang    Truong\";\n        name = name.trim();\n        String[] tmp = name.split(\"\\s+\");\n        System.out.println(\"Ten: \" + tmp[tmp.length - 1].toUpperCase());\n    }\n}\n");
                code4.setVisible(true);
                result4.setText("Result:\n Ten: TRUONG");
                result4.setVisible(true);
        }

        private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton21ActionPerformed
                code4.setText("Code:\n //NgoQuangTruong-20198265\nclass bai4 {\n    public static void main(String[] args) {\n        String name = \" Ngo   Quang    Truong\";\n        name = name.trim();\n        String[] tmp = name.split(\"\\s+\");\n        System.out.println(\"Ho: \" + tmp[0].toUpperCase());\n    }\n}\n");
                code4.setVisible(true);
                result4.setText("Result:\n Ho: NGO");
                result4.setVisible(true);
        }

        private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton22ActionPerformed
                code4.setText("Code:\n //NgoQuangTruong-20198265\nclass bai5 {\n    public static void main(String[] args) {\n        String zeros = \"0 1 0 0 1 1 1 1 0 0 1 0 1 0 1\";\n        int count0 = 0;\n        int count1 = 0;\n        String[] tmp = zeros.split(\" \");\n        for (int i = 0; i < tmp.length; i++) {\n            if (Integer.parseInt(tmp[i]) == 0) {\n                count0++;\n            } else {\n                count1++;\n            }\n        }\n        zeros = \"\";\n        for (int i = 0; i < count0; i++) {\n            zeros += \"0 \";\n        }\n        for (int i = 0; i < count1; i++) {\n            zeros += \"1 \";\n        }\n        System.out.println(\"Theo cach 0 1: \" + zeros);\n        zeros = \"\";\n        while (count1 > 0) {\n            zeros += \"1 \";\n            count1--;\n        }\n        while (count0 > 0) {\n            zeros += \"0 \";\n            count0--;\n        }\n        System.out.println(\"Theo cach 1 0: \" + zeros);\n    }\n}\n");
                code4.setVisible(true);
                result4.setText("Result:\n Theo cach 0 1: 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 \nTheo cach 1 0: 1 1 1 1 1 1 1 1 0 0 0 0 0 0 0 \n");
                result4.setVisible(true);
        }

        private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton23ActionPerformed
                code4.setText("Code:\n //NgoQuangTruong-20198265\nclass bai6 {\n    public static void main(String[] args) {\n        String S = \"Cho truoc xau ky tu S\", S1 = \"\";\n        char ch;\n        System.out.println(\"Xau ban dau: \" + S);\n        for (int i = 0; i < S.length(); i++) {\n            ch = S.charAt(i);\n            S1 = ch + S1;\n        }\n        System.out.println(\"Xau dao nguoc: \" + S1);\n    }\n}\n");
                code4.setVisible(true);
                result4.setText("Result:\n Xau ban dau: Cho truoc xau ky tu S\nXau dao nguoc: S ut yk uax court ohC\n");
                result4.setVisible(true);
        }

        private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton24ActionPerformed
                code4.setText("Code:\n //NgoQuangTruong-20198265\nclass bai7 {\n    public static void main(String[] args) {\n        String[] name = { \" Ngo   Quang    Truong\",\n \"Ngo Quang An\", \"Nguyen Van An\", \"An An Truong\" };\n        System.out.println(\"Danh sach hoc sinh:\");\n        int count = 0, index = 0;\n        for (int i = 0; i < name.length; i++) {\n            name[i] = name[i].trim();\n            name[i] = name[i].replaceAll(\"\\s+\", \" \");\n            System.out.println(name[i]);\n            String[] tmp = name[i].split(\"\\s+\");\n            while ((index = tmp[tmp.length - 1].indexOf(\"An\", index)) != -1) {\n                count++;\n                index++;\n            }\n        }\n        System.out.print(\"Co \" + count + \" ban ten An\");\n    }\n}\n");
                code4.setVisible(true);
                result4.setText("Result:\n Danh sach hoc sinh:\nNgo Quang Truong\nNgo Quang An    \nNguyen Van An   \nAn An Truong    \nCo 2 ban ten An \n");
                result4.setVisible(true);
        }

        private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton25ActionPerformed
                code4.setText("Code:\n //NgoQuangTruong-20198265\nclass bai8 {\n    public static void main(String[] args) {\n        String[] name = { \" Ngo   Thi    Truong\", \"Thi Quang An\",\n \"Nguyen Van Thi\", \"An Thi Truong\" };\n        System.out.println(\"Danh sach hoc sinh:\");\n        int count = 0, index = 0;\n        for (int i = 0; i < name.length; i++) {\n            name[i] = name[i].trim();\n            name[i] = name[i].replaceAll(\"\\s+\", \" \");\n            System.out.println(name[i]);\n            String[] tmp = name[i].split(\"\\s+\");\n            while ((index = tmp[1].indexOf(\"Thi\", index)) != -1) {\n                count++;\n                index++;\n            }\n        }\n        System.out.print(\"Co \" + count + \" ban ten dem la Thi\");\n    }\n}\n");
                code4.setVisible(true);
                result4.setText("Result:\n Danh sach hoc sinh:\nNgo Thi Truong\nThi Quang An\nNguyen Van Thi\nAn Thi Truong\nCo 2 ban ten dem la Thi\n");
                result4.setVisible(true);
        }

        private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton26ActionPerformed
                code4.setText("Code:\n //NgoQuangTruong-20198265\nclass bai9 {\n    public static void main(String[] args) {\n        String[] name = { \" Ngo   Thi    Huong\", \"Hhi Huang Han\",\n \"Nguyen Van Thi\", \"An Hi Truong\" };\n        System.out.println(\"Danh sach hoc sinh:\");\n        int count = 0;\n        for (int i = 0; i < name.length; i++) {\n            name[i] = name[i].trim();\n            name[i] = name[i].replaceAll(\"\\s+\", \" \");\n            System.out.println(name[i]);\n            String[] tmp = name[i].split(\"\\s+\");\n            if (tmp[tmp.length - 1].startsWith(\"H\")) {\n                count++;\n            }\n        }\n        System.out.print(\"Co \" + count + \" bat dau ten bang chu \"H\" \");\n    }}");
                code4.setVisible(true);
                result4.setText("Result:\n Danh sach hoc sinh:\nNgo Thi Huong\nHhi Huang Han\nNguyen Van Thi\nAn Hi Truong\nCo 2 bat dau ten bang chu \"H\" \n");

                result4.setVisible(true);
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
        private JScrollPane sp;
        // End of variables declaration//GEN-END:variables
}
