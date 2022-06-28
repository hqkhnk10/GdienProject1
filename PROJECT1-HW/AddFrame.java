import java.awt.Container;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.JTextField;

import Tuan33.ThiSinh;
import Tuan33.TuyenSinh;

import static javax.swing.GroupLayout.Alignment.*;
import java.awt.event.ActionEvent;

public class AddFrame implements ActionListener {
    JFrame frame;
    JLabel l1, l2, l3, l4;
    JTextField t1, t2, t3, t4;
    JButton b1;
    JTable j;
    TuyenSinh tsList;
    JScrollPane jScrollPane1;
    Container myPanel;

    AddFrame(TuyenSinh tsList) {

        this.tsList = tsList;
        Frame();
    }

    void Frame() {
        frame = new JFrame("Thêm Thi Sinh");
        myPanel = frame.getContentPane();
        b1 = new JButton("Tạo");
        b1.addActionListener(this);
        GroupLayout groupLayout = new GroupLayout(myPanel);
        groupLayout.setAutoCreateGaps(true);
        groupLayout.setAutoCreateContainerGaps(true);
        myPanel.setLayout(groupLayout);

        l1 = new JLabel("Tên");
        l2 = new JLabel("Dia Chỉ ");
        l4 = new JLabel("Ưu tiên");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();

        groupLayout.setHorizontalGroup(groupLayout.createSequentialGroup()
                .addGroup(groupLayout.createParallelGroup(LEADING).addComponent(l1).addComponent(l2)
                        .addComponent(l4))
                .addGroup(groupLayout.createParallelGroup(TRAILING).addComponent(t1).addComponent(t2)
                        .addComponent(t4).addComponent(b1)));

        groupLayout.setVerticalGroup(groupLayout.createSequentialGroup()
                .addGroup(groupLayout.createParallelGroup(BASELINE).addComponent(l1).addComponent(t1))
                .addGroup(groupLayout.createParallelGroup(BASELINE).addComponent(l2).addComponent(t2))
                .addGroup(groupLayout.createParallelGroup(BASELINE).addComponent(l4).addComponent(t4))
                .addComponent(b1));

        frame.setSize(600, 200);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            ThiSinh ts1 = new ThiSinh();
            ts1.setName(t1.getText());
            ts1.setAddress(t2.getText());
            int price = Integer.parseInt(t4.getText());
            ts1.setPriority(price);
            tsList.add(ts1);
            frame.dispose();
        }
    }
}