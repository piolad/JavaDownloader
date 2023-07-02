import javax.swing.*;
import java.awt.*;

public class TopMenu extends JPanel{
    public TopMenuButton fileButton = new TopMenuButton("File");
    public TopMenuButton editButton = new TopMenuButton("Edit");
    public TopMenuButton helpButton = new TopMenuButton("Help");
    public TopMenuButton pauseButton = new TopMenuButton("||"); //todo: change to icon
    public TopMenuButton resumeButton = new TopMenuButton("->"); //todo: change to icon
    public TopMenuButton stopButton = new TopMenuButton("[]"); //todo: change to icon
    public TopMenuButton pauseAllButton = new TopMenuButton("||a"); //todo: change to icon
    public TopMenuButton resumeAllButton = new TopMenuButton("->a"); //todo: change to icon
    public TopMenuButton stopAllButton = new TopMenuButton("[]a"); //todo: change to icon



    TopMenu(){
        super();
        this.setBackground(ColorConsts.FOREGROUND_COLOR);
//        this.setBackground(Color.yellow);

        this.setLayout(new FlowLayout(FlowLayout.LEFT));

        


        this.add(fileButton);
        this.add(editButton);
        this.add(helpButton);
        this.add(pauseButton);
        this.add(resumeButton);
        this.add(stopButton);
        this.add(pauseAllButton);
        this.add(resumeAllButton);
        this.add(stopAllButton);

    }
}
