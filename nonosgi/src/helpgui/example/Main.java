package helpgui.example;

import javax.swing.SwingUtilities;

import net.sourceforge.helpgui.gui.MainFrame;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){

			@Override
			public void run() {
				MainFrame mainFrame = new MainFrame("/docs/help/", "plastic");
				mainFrame.setVisible(true);
			}});
	}

}
