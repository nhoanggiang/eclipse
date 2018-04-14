package nhoanggiang.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;

public class HocJOptionPaneVaJFileChooserUI extends JFrame{
	JMenuBar mnuBar;
	JMenu mnuFile;
	JMenuItem mnuFileSave;
	JMenuItem mnuFileOpen;
	JMenuItem mnuFileExit;

	JTextArea txtData;

	JFileChooser chooser;
	public HocJOptionPaneVaJFileChooserUI(String title){
		super(title);
		addControls();
		addEvents();
	}

	private void addControls() {
		// TODO Auto-generated method stub
		setupMenubar();
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		txtData = new JTextArea(50, 50);
		txtData.setLineWrap(true);
		txtData.setWrapStyleWord(true);
		JScrollPane sc = new JScrollPane(
				txtData, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		con.add(sc, BorderLayout.CENTER);

		chooser = new JFileChooser();
		chooser.setFileFilter(new FileFilter() {

			@Override
			public String getDescription() {
				// TODO Auto-generated method stub
				return "Tap tin .txt";
			}

			@Override
			public boolean accept(File f) {
				// TODO Auto-generated method stub
				return f.getAbsolutePath().endsWith(".txt");
			}
		});
		chooser.setFileFilter(new FileFilter() {

			@Override
			public String getDescription() {
				// TODO Auto-generated method stub
				return "Word";
			}

			@Override
			public boolean accept(File f) {
				// TODO Auto-generated method stub
				return f.getAbsolutePath().endsWith(".doc") || f.getAbsolutePath().endsWith(".docx");
			}
		});
	}

	private void setupMenubar() {
		mnuBar = new JMenuBar();
		setJMenuBar(mnuBar);
		mnuFile = new JMenu("He thong");
		mnuBar.add(mnuFile);
		mnuFileSave = new JMenuItem("Luu tap tin");
		mnuFileOpen = new JMenuItem("Mo tap tin");
		mnuFileExit = new JMenuItem("Thoat chuong trinh");
		mnuFile.add(mnuFileSave);
		mnuFile.addSeparator();
		mnuFile.add(mnuFileOpen);
		mnuFile.addSeparator();
		mnuFile.add(mnuFileExit);
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		mnuFileExit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLyThoatPhanMem();
			}
		});
		mnuFileOpen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				xuLyMoFile();
			}
		});
		mnuFileSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				xuLyLuuFile();
			}
		});
	}
	protected void xuLyLuuFile() {
		// TODO Auto-generated method stub
		if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION){
			String data = txtData.getText();
			try{
				FileOutputStream fos = new FileOutputStream(chooser.getSelectedFile());
				OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
				osw.write(data);
				osw.close();
				fos.close();
				JOptionPane.showMessageDialog(null, "Luu file thanh cong!");
			}
			catch(Exception ex){
				
			}
		}
	}

	protected void xuLyMoFile() {
		// TODO Auto-generated method stub

		if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
			File selectedFile = chooser.getSelectedFile();
			try{
				FileInputStream fis = new FileInputStream(selectedFile);
				InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
				BufferedReader br = new BufferedReader(isr);
				String line = br.readLine();
				StringBuilder builder = new StringBuilder();
				while (line != null){
					builder.append(line);
					line = br.readLine();
				}
				br.close();
				txtData.setText(builder.toString());
			}
			catch(Exception ex){

			}
		}
	}

	protected void xuLyThoatPhanMem() {
		// TODO Auto-generated method stub
		int ret = JOptionPane.showConfirmDialog(null, "Ban co chac chan muon thoat phan men?", 
				"Xac nhan thoat", 
				JOptionPane.YES_NO_OPTION);
		if (ret == JOptionPane.YES_OPTION){
			System.exit(0);
		}

	}

	public void showWindow(){
		this.setSize(600, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
