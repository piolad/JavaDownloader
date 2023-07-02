import javax.swing.*;

public class MainFrame extends JFrame{
    private MFPanel mainPanel;

    public MainFrame(){
        super();

        setSize(800, 600);
        setTitle("Download Manager");

        mainPanel = new MFPanel();
        add(mainPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }
}
