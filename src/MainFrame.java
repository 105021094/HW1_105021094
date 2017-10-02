

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;


public class MainFrame extends Frame{

    private Button btnL = new Button("<<");
    private Button Fire = new Button("Fire");
    private Button btnR = new Button(">>");
    private Label labline = new Label();
    private Label labFire = new Label();
    private Label labsun = new Label();
    private Label labF = new Label();
    private Label Hit = new Label("0");
    private int labX = 450,labY = 310,labj = 480,labi = 310,sunx,suny;
    private Timer t1;
    private Random rand = new Random();


    public MainFrame () {
        initcomp();
    }

    private void initcomp(){

        this.setBounds(500,300,1000,500);

        this.setLayout(null);


        btnL.setBounds(500,400,80,50);
        btnL.setBackground(Color.pink);
        btnL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labX -= 10;
                labj -= 10;
                labFire.setLocation(labX,labY);
                labF.setLocation(labj,labi);
            }
        });
        this.add(btnL);

        Fire.setBounds(600,400,80,50);
        Fire.setBackground(Color.pink);
        Fire.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.start();
            }

        });
        this.add(Fire);

        btnR.setBounds(700,400,80,50);
        btnR.setBackground(Color.pink);
        btnR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labX += 10;
                labj += 10;
                labFire.setLocation(labX,labY);
                labF.setLocation(labj,labi);
            }
        });
        this.add(btnR);

        labline.setBounds(0,380,1000,8);
        labline.setBackground(new Color(255, 222, 232));
        this.add(labline);

        labFire.setBounds(450,310,65,65);
        labFire.setBackground(new Color(78,226,255));
        this.add(labFire);

        labF.setBounds(460,310,8,12);
        labF.setBackground(Color.RED);
        this.add(labF);

        sunx = rand.nextInt(this.getWidth()-100);
        suny = 100;
        labsun.setBounds(sunx,suny,50,50);
        labsun.setBackground(Color.YELLOW);
        this.add(labsun);

        Hit.setBounds(50,400,100,50);
        this.add(Hit);

        t1 = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labi -=10;
                labF.setLocation(labj,labi);
            }
        });

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }




}
