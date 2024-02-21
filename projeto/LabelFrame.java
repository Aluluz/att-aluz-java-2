package javaapplication1;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class LabelFrame extends JFrame {

    private JLabel label1;
    private JLabel label2;
    private JLabel label3;

    public LabelFrame(){
        super( " " );

        setLayout(new FlowLayout());

        label1 = new JLabel("ATT ALUZ");
        label1.setToolTipText("texto");
        add( label1 );

        Icon bug = new ImageIcon(getClass().getResource("bug.png"));

        label2 = new JLabel("INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DE MATO GROSSO",bug, SwingConstants.LEADING);
        label2.setToolTipText("texto");
        add( label2 );

    }

}
