package nhoanggiang.ui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class HocJComboboxJListUI extends JFrame{
	JComboBox comboSo;
	JList listSo;
	JButton btnOK;
	public HocJComboboxJListUI(String title){
		super(title);
		addControls();
		addEvents();
	}
	public void addControls(){
		Container con = getContentPane();
		con.setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));
		JPanel pnCombo = new JPanel();
		pnCombo.setLayout(new FlowLayout());
		JLabel lblChonSo = new JLabel("Chon So: ");
		pnCombo.add(lblChonSo);
		comboSo = new JComboBox();
		Random rd = new Random();
		for (int i = 0; i < 100; i++){
			int x = rd.nextInt(500);
			comboSo.addItem(x);
		}
		pnCombo.add(comboSo);
		con.add(pnCombo);
		
		JPanel pnList = new JPanel();
		pnList.setLayout(new FlowLayout());
		JLabel lblList = new JLabel("Chon so: ");
		listSo = new JList();
		Vector<Integer> vec = new Vector();
		for (int i = 0; i < 100; i++){
			int x = rd.nextInt(500);
			vec.add(x);
			
		}
		listSo.setListData(vec);
		JScrollPane scList = new JScrollPane(listSo, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnList.add(lblList);
		pnList.add(scList);
		con.add(pnList);
		
		JPanel pnOK = new JPanel();
		pnOK.setLayout(new FlowLayout());
		btnOK = new JButton("OK");
		pnOK.add(btnOK);
		con.add(pnOK);
		
	}
	public void addEvents(){
		comboSo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int vt = comboSo.getSelectedIndex();
				int gt = (int)comboSo.getSelectedItem();
				if (gt != -1){
					JOptionPane.showMessageDialog(null, "Vi tri: " + vt + "\n" + "Gia tri: " + gt);
				}
			}
		});
		btnOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				xuLyGiaTriList();
			}
		});
	}
	protected void xuLyGiaTriList() {
		int vt = listSo.getSelectedIndex();
		Object obj = listSo.getSelectedValue();
		JOptionPane.showMessageDialog(null, "Vi tri: " + vt + "\n" + "Gia tri: " + obj);
	}
	public void showWindow(){
		this.setSize(100, 250);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
