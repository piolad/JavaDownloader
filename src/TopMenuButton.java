import javax.swing.*;

public class TopMenuButton extends JButton {
    public TopMenuButton(String text){
        super(text);
        this.setBackground(ColorConsts.FOREGROUND_COLOR);
        this.setForeground(ColorConsts.BACKGROUND_COLOR);
        this.setBorderPainted(false);
//        this.setFocusPainted(false);

        this.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setBackground(ColorConsts.BUTTON_HOVER_COLOR);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                setBackground(ColorConsts.FOREGROUND_COLOR);
            }
        });

    }
}
