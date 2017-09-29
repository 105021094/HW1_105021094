import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame{

    private Button btnL = new Button("<<");
    private Button Fire = new Button("Fire");
    private Button btnR = new Button(">>");


    public MainFrame () {
        initcomp();
    }

    private void initcomp(){
        this.setBounds(500,300,1000,500);

        this.setLayout(null);

        btnL.setBounds(500,400,80,50);
        this.add(btnL);

        Fire.setBounds(600,400,80,50);
        this.add(Fire);


        btnR.setBounds(700,400,80,50);
        this.add(btnR);



        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }


}
