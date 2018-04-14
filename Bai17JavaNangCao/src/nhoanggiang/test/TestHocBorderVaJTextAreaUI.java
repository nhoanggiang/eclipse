package nhoanggiang.test;

import nhoanggiang.ui.HocBorderVaJTextAreaCheckboxRadioUI;
import nhoanggiang.ui.HocBorderVaJTextAreaUI;

public class TestHocBorderVaJTextAreaUI {

	public static void main(String[] args) {
		HocBorderVaJTextAreaUI ui = new HocBorderVaJTextAreaUI("Hoc Border and JTextArea");
		ui.showWindow();
		
		HocBorderVaJTextAreaCheckboxRadioUI ui2 = new HocBorderVaJTextAreaCheckboxRadioUI("Hoc Border, JTextArea, JCheckBox and JRadioButton");
		ui2.showWindow();
	}

}
