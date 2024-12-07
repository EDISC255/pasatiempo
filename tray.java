import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.MenuItem;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class tray {

    public static void main(String[] args) {
        try {
            TrayIcon icon = new TrayIcon(new ImageIcon("/home/eduardo/retos/logo_myapp.png").getImage(), "eduardoCM",
                    menu());
            SystemTray.getSystemTray().add(icon);
            Thread.sleep(5000);
            icon.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "hola mundo");
                }
            });
            icon.displayMessage("hola", "soy ISC", TrayIcon.MessageType.INFO);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static PopupMenu menu() {
        PopupMenu menu = new PopupMenu();
        MenuItem item = new MenuItem("salir");
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.exit(0);

            }
        });
        menu.add(item);
        return menu;
    }
}