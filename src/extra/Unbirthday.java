package extra;

import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {
		String birthday;

		birthday = JOptionPane.showInputDialog("When is your birthday");

		if ("01/20".equals(birthday)) {

			JOptionPane.showMessageDialog(null, "Happy birthday");

		} else {
			JOptionPane.showMessageDialog(null, "very merry Unbirthday");
		}

	}

}
