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

import static javax.swing.GroupLayout.Alignment.*;
import java.awt.event.ActionEvent;

public class ModifyNewFrame implements ActionListener {
    JFrame frame;
    JLabel l1, l2, l3, l4;
    JTextField t1, t2, t3, t4;
    JButton b1;
    JTable j;
    ThiSinh ts;
    JScrollPane jScrollPane1;
    Container myPanel;

    ModifyNewFrame(ThiSinh ts) {

        this.ts = ts;
        Frame();
    }

    void Frame() {
        frame = new JFrame("Sửa thuốc");

        myPanel = frame.getContentPane();
        b1 = new JButton("Sửa");
        b1.addActionListener(this);
        GroupLayout groupLayout = new GroupLayout(myPanel);
        groupLayout.setAutoCreateGaps(true);
        groupLayout.setAutoCreateContainerGaps(true);
        myPanel.setLayout(groupLayout);

        l1 = new JLabel("ThiSinh Name");
        l2 = new JLabel("ThiSinh Type");
        l4 = new JLabel("ThiSinh Priority");
        t1 = new JTextField(ts.getName());
        t2 = new JTextField(ts.getAddress());
        t4 = new JTextField("" + ts.getPriority());

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
            ts.setName(t1.getText());
            ts.setAddress(t2.getText());
            int price = Integer.parseInt(t4.getText());
            ts.setPriority(price);

            frame.dispose();
        }
    }
}