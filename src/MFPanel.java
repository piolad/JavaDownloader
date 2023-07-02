import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class MFPanel extends JPanel{
    public TopMenu topMenu = new TopMenu();

    public ScrollPane scrollPane = new ScrollPane();

    public JButton addDownloadButton = new JButton("Add Download");
    public MFPanel(){
        super();
        setBackground(ColorConsts.BACKGROUND_COLOR);

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

//        setLayout(new BorderLayout());

        add(topMenu, BorderLayout.PAGE_START);



        scrollPane.setBackground(ColorConsts.BACKGROUND_COLOR);

        add(scrollPane, BorderLayout.CENTER);


        add(addDownloadButton, BorderLayout.PAGE_END);
//        setLayout(new ScrollPaneLayout());
    }
}
