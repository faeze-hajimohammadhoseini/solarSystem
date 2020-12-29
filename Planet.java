
import javax.swing.*;
import java.awt.*;

class Planet extends JPanel  {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //color of Background
        this.setBackground(Color.BLACK);

        //name of the planet
        g.setColor(Color.white);
        g.drawString("The Planets", 800, 75);
        g.drawString("Mercury", 870, 130);
        g.drawString("Venus", 870, 160);
        g.drawString("Earth", 870, 192);
        g.drawString("Mars", 870, 225);
        g.drawString("Jupiter", 870, 265);
        g.drawString("Saturn", 870, 320);
        g.drawString("Uranus", 870, 365);
        g.drawString("Neptune", 870, 410);

        //property of the planet
        g.drawString("Mass         -", 800, 480);
        g.drawString("Mean Radius         -", 761, 510);
        g.drawString("Semi-Major Axis         -", 745, 540);
        g.drawString("Orbital period         -", 759, 570);
        g.drawString("Rotation Period         -", 751, 600);
        g.drawString("Number Of Moons         -", 735, 630);

        //cover of space
        g.setColor(Color.getHSBColor(300,100,300));
        g.drawRect(1, 1, 700, 700);


        g.setColor(Color.blue);
        g.drawRect(705, 1, 300, 700);


        //orbit of  the planet
        g.setColor(Color.white);
        g.drawOval(1, 1, 700, 700);
        g.drawOval(50, 50, 600, 600);
        g.drawOval(100, 100, 500, 500);
        g.drawOval(150, 150, 400, 400);
        g.drawOval(200, 200, 300, 300);
        g.drawOval(250, 250, 200, 200);
        g.drawOval(300, 300, 100, 100);
        g.drawOval(325, 325, 50, 50);

        //draw planet and their color
        g.setColor(Color.blue);
        g.fillOval(190, 30, 20, 20);
        g.fillOval(800, 400, 20, 20);

        g.setColor(Color.lightGray);
        g.fillOval(100, 160, 25, 25);
        g.fillOval(796, 350, 25, 25);

        g.setColor(Color.getHSBColor(30, 210, 15));
        g.fillOval(230, 560, 35, 35);
        g.fillOval(791, 300, 35, 35);

        g.setColor(Color.getHSBColor(300, 100, 300));
        g.fillOval(190, 180, 40, 40);
        g.fillOval(789, 245, 40, 40);

        g.setColor(Color.red);
        g.fillOval(474, 275, 16, 16);
        g.fillOval(799, 210, 16, 16);

        g.setColor(Color.cyan);
        g.fillOval(434, 368, 19, 19);
        g.fillOval(797, 175, 19, 19);

        g.setColor(Color.pink);
        g.fillOval(375, 305, 18, 18);
        g.fillOval(796, 142, 18, 18);

        g.setColor(Color.gray);
        g.fillOval(350, 370, 10, 10);
        g.fillOval(800, 120, 10, 10);

        //draw sun
        g.setColor(Color.orange);
        g.fillOval(330, 330, 40, 40);


    }

}
