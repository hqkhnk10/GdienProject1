import java.awt.Container;

import javax.swing.GroupLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.JTextField;

import Tuan33.ThiSinh;

import static javax.swing.GroupLayout.Alignment.*;

public class DisplayFrame {
    JFrame frame;
    JLabel l1, l2, l3, l4, l5;
    JTextField t1, t2, t3, t4, t5;

    JTable j;
    ThiSinh ts;
    JScrollPane jScrollPane1;
    Container myPanel;

    DisplayFrame(ThiSinh ts) {

        this.ts = ts;
        Frame();
    }

    void Frame() {
        frame = new JFrame("Thuốc");

        myPanel = frame.getContentPane();

        GroupLayout groupLayout = new GroupLayout(myPanel);
        groupLayout.setAutoCreateGaps(true);
        groupLayout.setAutoCreateContainerGaps(true);
        myPanel.setLayout(groupLayout);

        l1 = new JLabel("Thi Sinh ID");
        l2 = new JLabel("Tên Thi Sinh");
        l3 = new JLabel("Địa chỉ");
        l4 = new JLabel("Ưu tiên");
        t1 = new JTextField("" + ts.getId());
        t2 = new JTextField(ts.getName());
        t3 = new JTextField(ts.getAddress());
        t4 = new JTextField("" + ts.getPriority());
        t1.setEditable(false);
        t2.setEditable(false);
        t3.setEditable(false);
        t4.setEditable(false);
        groupLayout.setHorizontalGroup(groupLayout.createSequentialGroup()
                .addGroup(groupLayout.createParallelGroup(LEADING).addComponent(l1).addComponent(l2).addComponent(l3)
                        .addComponent(l4))
                .addGroup(groupLayout.createParallelGroup(TRAILING).addComponent(t1).addComponent(t2).addComponent(t3)
                        .addComponent(t4)));

        groupLayout.setVerticalGroup(groupLayout.createSequentialGroup()
                .addGroup(groupLayout.createParallelGroup(BASELINE).addComponent(l1).addComponent(t1))
                .addGroup(groupLayout.createParallelGroup(BASELINE).addComponent(l2).addComponent(t2))
                .addGroup(groupLayout.createParallelGroup(BASELINE).addComponent(l3).addComponent(t3))
                .addGroup(groupLayout.createParallelGroup(BASELINE).addComponent(l4).addComponent(t4)));

        frame.setSize(600, 200);
        frame.setVisible(true);
    }

}