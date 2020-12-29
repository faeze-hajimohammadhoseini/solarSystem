
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Frame extends JFrame implements ActionListener {

    public JFrame app = new JFrame();
//button name of the planets
    public JButton b = new JButton();
    public JButton c = new JButton();
    public JButton d = new JButton();
    public JButton e1 = new JButton();
    public JButton f = new JButton();
    public JButton g = new JButton();
    public JButton h = new JButton();
    public JButton i = new JButton();

//button name of the properties of planet
    public JTextArea Mass = new JTextArea();
    public JTextArea MeanRadius = new JTextArea();
    public JTextArea SemiMajorAxis = new JTextArea();
    public JTextArea OrbitalPeriod = new JTextArea();
    public JTextArea RotationPeriod = new JTextArea();
    public JTextArea NumberOfMoons = new JTextArea();

    public void Frame() {
       Planet panel = new Planet();


        app.setBounds(410, 170, 1030, 750);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setTitle("                                                                                               solar System");

        b.setBounds(870, 115, 95, 17);
        b.addActionListener(this);
        b.setContentAreaFilled(false);
        b.setFocusPainted(false);
        b.setBorderPainted(false);
        app.add(b);

        c.setBounds(870, 145, 95, 17);
        c.addActionListener(this);
        c.setContentAreaFilled(false);
        c.setFocusPainted(false);
        c.setBorderPainted(false);
        app.add(c);

        d.setBounds(870, 175, 95, 17);
        d.addActionListener(this);
        d.setContentAreaFilled(false);
        d.setFocusPainted(false);
        d.setBorderPainted(false);
        app.add(d);

        e1.setBounds(870, 210, 95, 17);
        e1.addActionListener(this);
        e1.setContentAreaFilled(false);
        e1.setFocusPainted(false);
        e1.setBorderPainted(false);
        app.add(e1);

        f.setBounds(870, 255, 95, 17);
        f.addActionListener(this);
        f.setContentAreaFilled(false);
        f.setFocusPainted(false);
        f.setBorderPainted(false);
        app.add(f);

        g.setBounds(870, 310, 95, 17);
        g.addActionListener(this);
        g.setContentAreaFilled(false);
        g.setFocusPainted(false);
        g.setBorderPainted(false);
        app.add(g);

        h.setBounds(870, 355, 95, 17);
        h.addActionListener(this);
        h.setContentAreaFilled(false);
        h.setFocusPainted(false);
        h.setBorderPainted(false);
        app.add(h);

        i.setBounds(870, 400, 95, 17);
        i.addActionListener(this);
        i.setContentAreaFilled(false);
        i.setFocusPainted(false);
        i.setBorderPainted(false);
        app.add(i);



        Mass.setBounds(850, 467, 80, 15);
        Mass.setEditable(false);
        Mass.setBackground(Color.black);
        app.add(Mass);

        MeanRadius.setBounds(850, 501, 80, 15);
        MeanRadius.setEditable(false);
        MeanRadius.setBackground(Color.black);
        app.add(MeanRadius);

        SemiMajorAxis.setBounds(850, 530, 80, 15);
        SemiMajorAxis.setEditable(false);
        SemiMajorAxis.setBackground(Color.black);
        app.add(SemiMajorAxis);

        OrbitalPeriod.setBounds(850, 560, 80, 15);
        OrbitalPeriod.setEditable(false);
        OrbitalPeriod.setBackground(Color.black);
        app.add(OrbitalPeriod);

        RotationPeriod.setBounds(850, 590, 80, 15);
        RotationPeriod.setEditable(false);
        RotationPeriod.setBackground(Color.black);
        app.add(RotationPeriod);

        NumberOfMoons.setBounds(850, 620, 80, 15);
        NumberOfMoons.setEditable(false);
        NumberOfMoons.setBackground(Color.black);
        app.add(NumberOfMoons);

        //frame of the solar system
        app.add(panel);
        app.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(b)) {

            Mass.setText("0.055 Earths");
            MeanRadius.setText("2 440 km");
            SemiMajorAxis.setText("57.9 million km");
            OrbitalPeriod.setText("88.0 days");
            RotationPeriod.setText("58.6 days");
            NumberOfMoons.setText("0");

        }
        if (e.getSource().equals(c)) {
            Mass.setText("0.815 Earths");
            MeanRadius.setText("6 050 km");
            SemiMajorAxis.setText("108 million km");
            OrbitalPeriod.setText("225 days");
            RotationPeriod.setText("243 days");
            NumberOfMoons.setText("0");
        }
        if (e.getSource().equals(d)) {
            Mass.setText("1 Earth");
            MeanRadius.setText("6 370 km");
            SemiMajorAxis.setText("150 million km");
            OrbitalPeriod.setText("1 year");
            RotationPeriod.setText("1 day");
            NumberOfMoons.setText("1");
        }
        if (e.getSource().equals(e1)) {
            Mass.setText("0.107 Earths");
            MeanRadius.setText("3 390 km");
            SemiMajorAxis.setText("228 million km");
            OrbitalPeriod.setText("1.88 years");
            RotationPeriod.setText("24h 37m 22s");
            NumberOfMoons.setText("2");

        }
        if (e.getSource().equals(f)) {
            Mass.setText("318 Earths");
            MeanRadius.setText("69 900 km");
            SemiMajorAxis.setText("779 million km");
            OrbitalPeriod.setText("11.9 years");
            RotationPeriod.setText("9h 55m 30s");
            NumberOfMoons.setText(" 67");
        }
        if (e.getSource().equals(g)) {
            Mass.setText("95.2 Earths");
            MeanRadius.setText("58 200 km");
            SemiMajorAxis.setText("1.43 billion km");
            OrbitalPeriod.setText("29.5 years");
            RotationPeriod.setText("10h 33m");
            NumberOfMoons.setText(" 62");
        }
        if (e.getSource().equals(h)) {
            Mass.setText("14.5 Earths");
            MeanRadius.setText("25 400 km");
            SemiMajorAxis.setText("2.87 billion km");
            OrbitalPeriod.setText("84.0 years");
            RotationPeriod.setText("17h 14m 24s");
            NumberOfMoons.setText("27");
        }
        if (e.getSource().equals(i)) {
            Mass.setText("17.1 Earths");
            MeanRadius.setText("24 600 km");
            SemiMajorAxis.setText("4.50 billion km");
            OrbitalPeriod.setText("165 years");
            RotationPeriod.setText("16h 6m 36s");
            NumberOfMoons.setText("14");
        }
    }
}
