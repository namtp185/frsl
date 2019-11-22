package gui;

import javax.swing.DefaultDesktopManager;
import javax.swing.JInternalFrame;

@SuppressWarnings("serial")
public class ViewManager extends DefaultDesktopManager {

    /**
     * Closes the frame and notifies the view about it.
     */
    public void closeFrame(JInternalFrame f) {
        super.closeFrame(f);
        ((ViewFrame) f).close();
    }
}
