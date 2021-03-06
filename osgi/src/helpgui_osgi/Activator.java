package helpgui_osgi;

import java.net.URL;

import javax.swing.SwingUtilities;

import net.sourceforge.helpgui.gui.MainFrame;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		SwingUtilities.invokeLater(new Runnable(){

			@Override
			public void run() {
				MainFrame mainFrame = new MainFrame("/docs/help/", "plastic");
				mainFrame.setVisible(true);
//				mainFrame.
			}});
		
		URL u = bundleContext.getBundle().getEntry("helpgui_osgi/favicon_1.jpg");
		System.err.println("u: "+u);
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}
