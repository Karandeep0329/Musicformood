# Musicformood
This program will provide you music playlist according to your mood. Written in JAVA










import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class start
{
    public static void main(String [] args)
    {
        new first();
    }
}

class first implements ActionListener  
{
    JFrame frame, Sframe;
    JTextField t1;
    JLabel Flabel, Slabel, SlabelA, SlabelB;
    Cursor Fcur, Scur;
public first()
    {



        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~FRONT PAGE~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 


        frame = new JFrame();
        frame.setVisible(true);                                               // THIS MAKES YOUR FRAME VISIBLE
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                    //BECAUSE OF THIS YOUR WINODOW CLOSES
        frame.setSize(1500,700);
        frame.setLocation(20,50);                                         //SETBOUNDS CAN ALSO BE USED FIRST LOCATION THEN WIDTH
        frame.setTitle("MUSIC FOR MOOD");
        ImageIcon Ficon = new ImageIcon("logo.png");
        frame.setIconImage(Ficon.getImage());
        Container F = frame.getContentPane();
        F.setBackground(Color.DARK_GRAY);
        frame.setResizable(false);
        


        ImageIcon Fa = new ImageIcon("user.png ");
        Flabel = new JLabel( Fa,  JLabel.CENTER);
        Flabel.setBounds(100,50,500,100);



        t1 = new JTextField();
        t1.setBounds(615,410,120,30);
        t1.setFont(null);



        JButton Fbtn = new JButton("GO");
        Fbtn.setSize(100,30);
        Fbtn.setLocation(750,410);
        Fbtn.setBackground(new Color(203, 228, 222));

        Fcur = new Cursor(Cursor.HAND_CURSOR);                //CREATING CURSOR 
        Fbtn.setCursor(Fcur);


        F.add(Fbtn);
        F.add(t1); 
        F.add(Flabel);
        
        Fbtn.addActionListener(this);
        


        frame.setVisible(true);

   }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
            if(e.getActionCommand().equals("GO"))
            {

    
             Sframe = new JFrame("MusicForMood");
             Sframe.setSize(1500,700);
             Sframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
             Sframe.setLocationRelativeTo(frame);
             Sframe.setVisible(true);
             Sframe.setResizable(false);
            Container S = Sframe.getContentPane();
            S.setBackground(Color.DARK_GRAY);

            Slabel = new JLabel();
            Slabel.setBounds(150,100,500,50);
            Sframe.add(Slabel);
            String name = t1.getText().toString();
            Slabel.setText("Hello "+name);

            
            ImageIcon Sa = new ImageIcon("single.png ");
            SlabelA = new JLabel( Sa,  JLabel.CENTER);
            SlabelA.setBounds(100,180,500,300);    

            ImageIcon Sb = new ImageIcon("taken.png ");
            SlabelB = new JLabel( Sb,  JLabel.CENTER);
            SlabelB.setBounds(0,100,500,100);  

            JButton Sbtn = new JButton("SINGLE");
            Sbtn.setSize(100,30);
            Sbtn.setLocation(300,450);
            Sbtn.setBackground(new Color(203, 228, 222));            

            JButton Sbtn2 = new JButton("TAKEN");
            Sbtn2.setSize(100,30);
            Sbtn2.setLocation(690,450);
            Sbtn2.setBackground(new Color(203, 228, 222));

            Scur = new Cursor(Cursor.HAND_CURSOR);               
            Sbtn.setCursor(Scur);
            Sbtn2.setCursor(Scur);


            S.add(Sbtn);
            S.add(Sbtn2);

            S.add(SlabelA);
            S.add(SlabelB);     
            }
             


    }
}





