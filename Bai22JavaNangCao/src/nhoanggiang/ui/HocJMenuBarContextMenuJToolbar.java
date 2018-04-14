package nhoanggiang.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

import com.sun.jndi.toolkit.dir.ContextEnumerator;

public class HocJMenuBarContextMenuJToolbar extends JFrame {
	JMenuBar mnuBar;// Noi chua cac JMenu
	
	JMenu mnuFile;
	JMenu mnuEdit;
	JMenu mnuHelp;
	
	JMenuItem mnuFileNew;
	JMenuItem mnuFileOpen;
	JMenuItem mnuFileExit;
	
	JMenuItem mnuEditCopy;
	JMenuItem mnuEditPaste;
	JMenuItem mnuEditDelete;
	
	JMenuItem mnuHelpGui;
	JMenuItem mnuHelpAbout;
	
	JButton btn1, btn2;
	JMenuItem mnuPopupMauXanh, mnuPopupMauDo;
	JButton btnLastedChoose = null;
	
	JToolBar toolBar;
	JButton btnLenh1, btnLenh2;
	JCheckBox chk1, chk2;
	
	public HocJMenuBarContextMenuJToolbar(String title){
		super(title);
		addControls();
		addEvents();
		
		
	}
	public void addControls(){
		mnuBar = new JMenuBar();
		setJMenuBar(mnuBar);
		mnuFile = new JMenu("File");
		mnuBar.add(mnuFile);
		mnuEdit = new JMenu("Edit");
		mnuBar.add(mnuEdit);
		mnuHelp = new JMenu("Help");
		mnuBar.add(mnuHelp);
		
		mnuFileNew = new JMenuItem("New");
		mnuFileNew.setAccelerator(KeyStroke.getKeyStroke('F', Toolkit.getDefaultToolkit ().getMenuShortcutKeyMask()));
		mnuFile.add(mnuFileNew);
		mnuFile.addSeparator();
		mnuFileOpen = new JMenuItem("Open");
		mnuFile.add(mnuFileOpen);
		mnuFile.addSeparator();
		mnuFileExit = new JMenuItem("Exit");
		mnuFileExit.setIcon(new ImageIcon("images/exit.png"));
		mnuFile.add(mnuFileExit);
		
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		toolBar = new JToolBar();
		btnLenh1 = new JButton("Lenh 1");
		toolBar.add(btnLenh1);
		btnLenh2 = new JButton("Lenh 2");
		toolBar.add(btnLenh2);
		chk1 = new JCheckBox("Tu dong luu du lieu sau 10 phut");
		toolBar.add(chk1);
		con.add(toolBar, BorderLayout.NORTH);
		JPanel pnMain = new JPanel();
		pnMain.setLayout(new FlowLayout());
		btn1 = new JButton("Button 1");
		pnMain.add(btn1);
		btn2 = new JButton("Button 2");
		pnMain.add(btn2);
		con.add(pnMain, BorderLayout.CENTER);
		
		btn1.addMouseListener(new PopClickListener());
		btn2.addMouseListener(new PopClickListener());

		
	}
	public void addEvents(){
		mnuFileExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnuFileNew.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Ban vua go Ctrl+N");
			}
		});
		btnLenh1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//JOptionPane.showMessageDialog(null, "Ban vua thuc hien lenh 1");
				btn1.setBackground(Color.YELLOW);
				btn2.setBackground(Color.PINK);
			}
		});
	}
	
	class PopUpDemo extends JPopupMenu{
		public PopUpDemo(){
			mnuPopupMauDo = new JMenuItem("To mau do");
			add(mnuPopupMauDo);
			mnuPopupMauXanh = new JMenuItem("To mau xanh");
			add(mnuPopupMauXanh);
			
			mnuPopupMauDo.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if (btnLastedChoose != null)
						btnLastedChoose.setBackground(Color.RED);
				}
			});
			mnuPopupMauXanh.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if (btnLastedChoose != null)
						btnLastedChoose.setBackground(Color.GREEN);
				}
			});
		}
	}
	
	class PopClickListener extends MouseAdapter{
		public void mousePressed(MouseEvent e){
			if (e.isPopupTrigger())
				doPop(e);
		}
		public void mouseReleased(MouseEvent e){
			if (e.isPopupTrigger())
				doPop(e);
		}
		public void doPop(MouseEvent e) {
			PopUpDemo menu = new PopUpDemo();
			btnLastedChoose = (JButton) e.getComponent();
			menu.show(e.getComponent(), e.getX(), e.getY());
		}
	}
	
	public void showWindow(){
		this.setSize(600, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}


}
