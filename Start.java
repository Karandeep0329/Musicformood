import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Start 
{
public static void main(String [] args)
{
    new First();
}
}
class First 
{
    JButton Fbtn;
    JFrame frame;
    static JTextField t1;
    JTextField text[];
    JLabel Flabel;
    Cursor Fcur;
    ImageIcon Ficon, Fa;
    Container F;
    public First()
    {
        frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500,700);
        frame.setLocation(20,50);
        frame.setTitle("MUSIC FOR MOOD");
        Ficon = new ImageIcon("logo.png");
        frame.setIconImage(Ficon.getImage());
        F = frame.getContentPane();
        F.setBackground(new Color(236,242 ,255 ));
        frame.setResizable(false);
        Fa = new ImageIcon("user.png ");
        Flabel = new JLabel( Fa, JLabel.CENTER);
        Flabel.setBounds(100,50,500,100);
        t1 = new JTextField();
        t1.setBounds(615,410,120,30);
        
        Fbtn = new JButton("GO");
        Fbtn.setSize(100,30);
        Fbtn.setLocation(750,410);
        Fbtn.setBackground(new Color(203, 228, 222));
        
        Fcur = new Cursor(Cursor.HAND_CURSOR);
        Fbtn.setCursor(Fcur);
        F.add(Fbtn);
        F.add(t1);
        F.add(Flabel);
        frame.setVisible(true);
        class MyListener implements ActionListener
        {
        @Override
        public void actionPerformed(ActionEvent g)
        {
            if(t1.getText().isEmpty() || t1.getText().endsWith("1")|| t1.getText().endsWith("2")|| t1.getText().endsWith("3")|| t1.getText().endsWith("4")|| t1.getText().endsWith("5")|| t1.getText().endsWith("6")|| t1.getText().endsWith("7")|| t1.getText().endsWith("8")|| t1.getText().endsWith("9")|| t1.getText().endsWith("0"))
            {
                JOptionPane.showMessageDialog(null,"Please enter a valid name.");
                return;
            }
            if(g.getSource() == Fbtn)
            {
                new Second(t1);
            }
        }
        }
        MyListener ml = new MyListener();
        Fbtn.addActionListener(ml);
    }
}
class Second  
{
    JButton Sbtn, Sbtn2;
    JFrame Sframe;
    JTextField text[];
    JLabel Slabel, SlabelA, SlabelB;
    ImageIcon Sa, Sb;
    Container S;
    Cursor Mcur;

    public Second(JTextField t1)
    {
        Sframe = new JFrame("MusicForMood");
        Sframe.setSize(1500,700);
        Sframe.setLocation(20,50);
        Sframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Sframe.setVisible(true);
        Sframe.setResizable(false);
        Container S = Sframe.getContentPane();
        S.setBackground(new Color(229,209,250 ));
        Slabel = new JLabel();
        Slabel.setForeground(Color.white);
        Slabel.setBounds(150,100,1000,50);
        Sframe.add(Slabel);
        String name = t1.getText().toString();
        Slabel.setText("Hello "+name+ ". Choose your relationship status:-");
        Slabel.setFont(new java.awt.Font("TimesRoman", Font.BOLD | Font.ITALIC,44));
        Sa = new ImageIcon("single.png ");
        SlabelA = new JLabel( Sa, JLabel.CENTER);
        SlabelA.setBounds(100,180,500,300);
        Sb = new ImageIcon("taken.png ");
        SlabelB = new JLabel( Sb, JLabel.CENTER);
        SlabelB.setBounds(0,100,500,100);
        Sbtn = new JButton("SINGLE");
        Sbtn2 = new JButton("TAKEN");
        Sbtn.setSize(100,30);
        Sbtn.setLocation(300,450);
        Sbtn.setBackground(new Color(203, 228, 222));
        Mcur = new Cursor(Cursor.WAIT_CURSOR);

        Sbtn2.setSize(100,30);
        Sbtn2.setLocation(690,450);
        Sbtn2.setBackground(new Color(203, 228, 222));
        Sbtn.setCursor(Mcur);
        Sbtn2.setCursor(Mcur);
        
        S.add(Sbtn);
        S.add(Sbtn2);
        S.add(SlabelA);
        S.add(SlabelB);
        class MyListener implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                    if(e.getSource() == Sbtn)
                    {
                            new Single();
                    }
                    if(e.getSource() == Sbtn2)
                    {
                            new Taken();
                    }
            }
        }
        MyListener ml = new MyListener();
        Sbtn.addActionListener(ml);
        Sbtn2.addActionListener(ml);
    }
}
class Single{

    public Single() 
    {   
        JButton SMb, SMb1, SMb2, SMb3;
        JFrame Sframe1;
        JLabel Slabel1;
        Cursor Scur;
        ImageIcon SM,SM1, SM2, SM3;
        Container S1;
        
        Sframe1 = new JFrame("MusicForMood");
        Sframe1.setSize(1500,700);
        Sframe1.setLocation(20,50);
        Sframe1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Sframe1.setVisible(true);
        Sframe1.setResizable(false);
        S1 = Sframe1.getContentPane();
        S1.setBackground(new Color(229,209,250 ));
        Slabel1 = new JLabel();
        Sframe1.add(Slabel1);
        Slabel1.setText("How's your Mood?");
        Slabel1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        Sframe1.setLayout(null);
        Slabel1.setBounds(650,35,300,100);
        SM = new ImageIcon("happy.png");
        SMb = new JButton(SM);
        SMb.setSize(SM.getIconWidth(),SM.getIconHeight());
        SMb.setLocation(40,180);
        
        SM1 = new ImageIcon("sad.png");
        SMb1 = new JButton(SM1);
        SMb1.setSize(SM1.getIconWidth(),SM1.getIconHeight());
        SMb1.setLocation(400,190);
        SM2 = new ImageIcon("stressed.png");
        SMb2 = new JButton(SM2);
        SMb2.setSize(SM2.getIconWidth(),SM2.getIconHeight());
        SMb2.setLocation(850,180);
        SM3 = new ImageIcon("confused.png");
        SMb3 = new JButton(SM3);
        SMb3.setSize(SM3.getIconWidth(),SM3.getIconHeight());
        SMb3.setLocation(1190,180);
        Scur = new Cursor(Cursor.HAND_CURSOR);
        SMb.setCursor(Scur);
        SMb1.setCursor(Scur);
        SMb2.setCursor(Scur);
        SMb3.setCursor(Scur);
        S1.add(Slabel1);
        S1.add(SMb);
        S1.add(SMb1);
        S1.add(SMb2);
        S1.add(SMb3);
        class MyListener implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent g)
            {
                if(g.getSource() == SMb)
                {
                    new SingleHappy();
                }
            }
        }
        MyListener ml = new MyListener();
        SMb.addActionListener(ml);
    }     
}
class SingleHappy
{
    SingleHappy()
    {
        JButton Hb, Hb1, Hb2, EXIT, EXIT2, EXIT3, EXIT3_A, EXIT_A, EXIT2_A, SHUFFLE, SHUFFLE_A, SHUFFLE2, SHUFFLE2_A, SHUFFLE3, SHUFFLE3_A, Create, Save, Sort;
        JFrame  Hframe;
        JTextField text;
        JLabel Hlabel, Plabel, Plabel2, HPlabel,HPlabel2, PPlabel, PPlabel2;
        JPanel Epanel, Hpanel, Hpanel2, Ppanel, Ppanel2, Epanel2, Cpanel;
        Cursor SHcur;
        Container  H1;
        Hb = new JButton("English");
        Hb1 = new JButton("HINDI");
        Hb2 = new JButton("PUNJABI");
        EXIT = new JButton("EXIT");
        EXIT2 = new JButton("EXIT");
        EXIT2_A = new JButton("EXIT");
        EXIT3 = new JButton("EXIT");
        EXIT3_A = new JButton("EXIT");
        EXIT_A = new JButton("EXIT");
        SHUFFLE = new JButton("SHUFFLE");
        SHUFFLE_A = new JButton("SHUFFLE");
        SHUFFLE2 = new JButton("SHUFFLE");
        SHUFFLE2_A = new JButton("SHUFFLE");
        SHUFFLE3 = new JButton("SHUFFLE");
        SHUFFLE3_A = new JButton("SHUFFLE");
        Create = new JButton("Add Music");
        Save = new JButton("Save");
        Sort = new JButton("Sort");               
        Hframe = new JFrame("MusicForMood");
        Hframe.setSize(1500,700);
        Hframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Hframe.setLocation(20,50);
        Hframe.setVisible(true);
        Hframe.setResizable(false);
        H1 = Hframe.getContentPane();
        H1.setBackground(new Color(229,209,250 ));

        Hlabel = new JLabel();
        Hframe.setLayout(null);
        Hlabel.setText("Choose language");
        Hlabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        Hlabel.setBounds(650,25,300,100);

        Create.setSize(100,100);
        Create.setLocation(1240,510);
        Create.setBackground(new Color(255, 244, 210));

        Hb.setSize(100,100);
        Hb.setLocation(140,110);
        Hb.setBackground(new Color(255, 244, 210));

        Hb1.setSize(100,100);
        Hb1.setLocation(700,110);
        Hb1.setBackground(new Color(255, 244, 210));

        Hb2.setSize(100,100);
        Hb2.setLocation(1250,110);
        Hb2.setBackground(new Color(255, 244, 210));

        EXIT.setSize(90,30); 
        EXIT.setLocation(230,550);
        EXIT.setBackground(new Color(255, 244, 210));

        EXIT2.setSize(90,30); 
        EXIT2.setLocation(230,550);
        EXIT2.setBackground(new Color(255, 244, 210));

        EXIT3.setSize(90,30); 
        EXIT3.setLocation(230,550);
        EXIT3.setBackground(new Color(255, 244, 210));

        EXIT3_A.setSize(90,30); 
        EXIT3_A.setLocation(230,550);
        EXIT3_A.setBackground(new Color(255, 244, 210));

        EXIT_A.setSize(90,30); 
        EXIT_A.setLocation(230,550);
        EXIT_A.setBackground(new Color(255, 244, 210));

        SHUFFLE.setSize(90,30);
        SHUFFLE.setLocation(50,550);
        SHUFFLE.setBackground(new Color(255,244,210));

        SHUFFLE_A.setSize(90,30);
        SHUFFLE_A.setLocation(50,550);
        SHUFFLE_A.setBackground(new Color(255,244,210));

        EXIT2_A.setSize(90,30); 
        EXIT2_A.setLocation(230,550);
        EXIT2_A.setBackground(new Color(255, 244, 210));

        SHUFFLE2.setSize(90,30);
        SHUFFLE2.setLocation(50,550);
        SHUFFLE2.setBackground(new Color(255,244,210));

        SHUFFLE2_A.setSize(90,30);
        SHUFFLE2_A.setLocation(50,550);
        SHUFFLE2_A.setBackground(new Color(255,244,210));

        SHUFFLE3.setSize(90,30);
        SHUFFLE3.setLocation(50,550);
        SHUFFLE3.setBackground(new Color(255,244,210));

        SHUFFLE3_A.setSize(90,30);
        SHUFFLE3_A.setLocation(50,550);
        SHUFFLE3_A.setBackground(new Color(255,244,210));

        text = new JTextField();

        Save.setSize(90,30); 
        Save.setLocation(50,525);
        Save.setBackground(new Color(255, 244, 210));

        Sort.setSize(90,30); 
        Sort.setLocation(50,525);
        Sort.setBackground(new Color(255, 244, 210));

        Epanel = new JPanel();
        Epanel.setBounds(20,30,400,600);
        Epanel.setBackground(new Color(236, 242, 255));
        Epanel.setVisible(false);

        Epanel2 = new JPanel();
        Epanel2.setBounds(20,30,400,600);
        Epanel2.setBackground(new Color(236, 242, 255));
        Epanel2.setVisible(false);

        Plabel = new JLabel();                                          
        Epanel.setLayout(null);
        Plabel.setText("<html>Here you go: <br/> The Nights <br/> Bad Guy <br/> Paradise <br/> Beat it <br/> Starboy <br/> Up&Up <br/> Montero <br/> Beggin' <br/> Feeling Good <br/> Dancin <br/> One Dance <br/></html>");
        Plabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        Plabel.setBounds(85,20,500,500);

        Plabel2 = new JLabel();
        Epanel2.setLayout(null);
        Plabel2.setText("<html>Here you go: <br/> <br/> Blinding Lights <br/> Hymn for the weekend <br/> Summer <br/> Often <br/> 24karet <br/> Happy <br/> The Lazy Song <br/> Makeba <br/> Watermelon Sugar <br/> Levitating <br/></html>");
        Plabel2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        Plabel2.setBounds(85,20,500,500);

        Epanel.add(Plabel);
        Epanel.add(EXIT);
        Epanel.add(SHUFFLE);

        Epanel2.add(Plabel2);
        Epanel2.add(EXIT_A);
        Epanel2.add(SHUFFLE_A);

        Hpanel = new JPanel();
        Hpanel.setBounds(500,30,400,600);
        Hpanel.setBackground(new Color(236, 242, 255));
        Hpanel.setVisible(false);

        Hpanel2 = new JPanel();
        Hpanel2.setBounds(500,30,400,600);
        Hpanel2.setBackground(new Color(236, 242, 255));
        Hpanel2.setVisible(false);

        HPlabel = new JLabel();
        Hpanel.setLayout(null);
        HPlabel.setText("<html>Here you go: <br/> Dil Chahta Hai <br/> Bad Guy <br/> Hairat <br/> Matargasti <br/> Roobaroo <br/> Lift Karadey <br/> Dhan Te Nan <br/> Dus Bahane <br/> Wake Up Sid <br/> Tashan Mein <br/> Behka <br/></html>");
        HPlabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        HPlabel.setBounds(85,20,500,500);

        HPlabel2 = new JLabel();
        Hpanel2.setLayout(null);
        HPlabel2.setText("<html>Here you go: <br/> <br/> Manja <br/> Rock On! <br/> Masakali <br/> Hai Junoon <br/> Ilahi <br/> Safar <br/> Aye Khuda <br/> Kyon <br/> Saansein <br/> Khalbali <br/></html>");
        HPlabel2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        HPlabel2.setBounds(85,20,500,500);

        Hpanel.add(HPlabel);
        Hpanel.add(EXIT2);
        Hpanel.add(SHUFFLE2);

        Hpanel2.add(HPlabel2);
        Hpanel2.add(EXIT2_A);
        Hpanel2.add(SHUFFLE2_A);

        Ppanel = new JPanel();
        Ppanel.setLayout(null);
        Ppanel.setBounds(1000,30,400,600);
        Ppanel.setBackground(new Color(236, 242, 255));
        Ppanel.setVisible(false);

        Ppanel2 = new JPanel();
        Ppanel2.setLayout(null);
        Ppanel2.setBounds(1000,30,400,600);
        Ppanel2.setBackground(new Color(236, 242, 255));
        Ppanel2.setVisible(false);

        PPlabel = new JLabel();
        Ppanel.setLayout(null);
        PPlabel.setText("<html>Here you go: <br/> Born To Shine <br/> Brown Boi <br/> Offshore <br/> Affair <br/> Jawani <br/> Brown Rang <br/> Droptop <br/> We Rollin <br/> Levels <br/> Desires <br/> Peaches <br/></html>");
        PPlabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        PPlabel.setBounds(85,20,500,500);

        PPlabel2 = new JLabel();
        Ppanel2.setLayout(null);
        PPlabel2.setText("<html>Here you go: <br/> Old Skool <br/> Woofer <br/> Clash <br/> Spaceship <br/> Brown Munde <br/> Elevated <br/> Tere te <br/> Insane <br/> Toxic <br/> Daku <br/> Jatt Life <br/></html>");
        PPlabel2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        PPlabel2.setBounds(85,20,500,500);

        Cpanel = new JPanel();
        Cpanel.setLayout(new GridLayout(5, 1));
        Cpanel.setBounds(20,30,400,600);
        Cpanel.setBackground(new Color(236, 242, 255));
        Cpanel.setVisible(false);
        Cpanel.add(text);
        Save.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae)
            {
                String data = text.getText();
                try
                {
                Conn c = new Conn();
                String query = "insert into playlist values('"+data+"')";
                c.stmt.executeUpdate(query);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }    
        });

        SHcur = new Cursor(Cursor.HAND_CURSOR);
        Hb.setCursor(SHcur);Hb1.setCursor(SHcur);Hb2.setCursor(SHcur);EXIT.setCursor(SHcur);EXIT2.setCursor(SHcur);EXIT3.setCursor(SHcur);EXIT2_A.setCursor(SHcur);EXIT3_A.setCursor(SHcur);EXIT_A.setCursor(SHcur);SHUFFLE.setCursor(SHcur);SHUFFLE2.setCursor(SHcur);SHUFFLE3.setCursor(SHcur);SHUFFLE_A.setCursor(SHcur);SHUFFLE2_A.setCursor(SHcur);SHUFFLE3_A.setCursor(SHcur);Create.setCursor(SHcur);Save.setCursor(SHcur);

        Ppanel.add(EXIT3);
        Ppanel.add(PPlabel);
        Ppanel.add(SHUFFLE3);

        Ppanel2.add(EXIT3_A);
        Ppanel2.add(PPlabel2);
        Ppanel2.add(SHUFFLE3_A);

        Cpanel.add(Save);
        Cpanel.add(Sort);

        H1.add(Epanel);
        H1.add(Hpanel);
        H1.add(Ppanel);
        H1.add(Epanel2);
        H1.add(Hpanel2);
        H1.add(Ppanel2);
        H1.add(Cpanel);
        H1.add(Hb);
        H1.add(Hb1);
        H1.add(Hb2);
        H1.add(Hlabel);
        H1.add(Create);

        class MyListener implements ActionListener
        {
        @Override
        public void actionPerformed(ActionEvent e)
        {
                if(e.getSource()==Create)
                {
                    Cpanel.setVisible(true);
                    Hpanel.setVisible(false);
                    Hb1.setVisible(false);
                    Hlabel.setVisible(false);
                    Hb2.setVisible(false);
                    Epanel.setVisible(false);
                    Ppanel.setVisible(false);
                    Hb.setVisible(false);
                    Epanel2.setVisible(false);
                    Ppanel2.setVisible(false);
                    Create.setVisible(false);
                }
                else if(e.getSource()==SHUFFLE)
                {
                    Epanel.setVisible(false);
                    Epanel2.setVisible(true);
                }
                else if(e.getSource()==SHUFFLE_A)
                {
                    Epanel2.setVisible(false);
                    Epanel.setVisible(true);
                }
                else if(e.getSource()==SHUFFLE2)
                {
                    Hpanel.setVisible(false);   
                    Hpanel2.setVisible(true);
                }
                else if(e.getSource()==SHUFFLE2_A)
                {
                    Hpanel2.setVisible(false);
                    Hpanel.setVisible(true);
                }
                else if(e.getSource()==SHUFFLE3)
                {
                    Ppanel.setVisible(false);
                    Ppanel2.setVisible(true);
                }
                else if(e.getSource()==SHUFFLE3_A)
                {
                    Ppanel2.setVisible(false);
                    Ppanel.setVisible(true);
                }
                else if(e.getSource()==EXIT || e.getSource()==EXIT2 || e.getSource()==EXIT3 || e.getSource()==EXIT_A || e.getSource()==EXIT2_A || e.getSource()==EXIT3_A || e.getSource()==Save)
                {
                    Epanel.setVisible(false);
                    Hpanel.setVisible(false);
                    Ppanel.setVisible(false);
                    Ppanel2.setVisible(false);
                    Hb.setVisible(true);
                    Hb1.setVisible(true);
                    Hb2.setVisible(true);
                    Hlabel.setVisible(true);
                    Create.setVisible(true);
                    Epanel2.setVisible(false);
                    Hpanel2.setVisible(false);
                    Cpanel.setVisible(false);
                }
                
                else if(e.getSource()==Hb)
                {
                    Hpanel.setVisible(false);
                    Hb1.setVisible(false);
                    Hlabel.setVisible(false);
                    Hb2.setVisible(false);
                    Epanel.setVisible(true);
                    Ppanel.setVisible(false);
                    Hb.setVisible(false);
                    Epanel2.setVisible(false);
                    Ppanel2.setVisible(false);
                    Create.setVisible(false);
                }
                else if(e.getSource()==Hb1)
                {
                        Hb.setVisible(false);
                        Hpanel.setVisible(true);
                        Hb1.setVisible(false);
                        Hlabel.setVisible(false);
                        Hb2.setVisible(false);
                        Epanel.setVisible(false);
                        Ppanel.setVisible(false);
                        Ppanel2.setVisible(false);
                        Create.setVisible(false);
                
                }
                else if(e.getSource()==Hb2)
                {
                    Hb.setVisible(false);
                    Hb1.setVisible(false);
                    Hlabel.setVisible(false);
                    Hb2.setVisible(false);
                    Epanel.setVisible(false);
                    Ppanel.setVisible(true);
                    Hpanel.setVisible(false);
                    Ppanel2.setVisible(false);
                    Create.setVisible(false);
                }
        }
        }
        MyListener ml = new MyListener();
        Hb.addActionListener(ml);
        Hb2.addActionListener(ml);
        Hb1.addActionListener(ml);
        EXIT.addActionListener(ml);
        EXIT2.addActionListener(ml);
        EXIT3.addActionListener(ml);
        EXIT_A.addActionListener(ml);
        SHUFFLE.addActionListener(ml);
        SHUFFLE_A.addActionListener(ml);
        EXIT2_A.addActionListener(ml);
        SHUFFLE2.addActionListener(ml);
        SHUFFLE2_A.addActionListener(ml);
        EXIT3.addActionListener(ml);
        EXIT3_A.addActionListener(ml);
        SHUFFLE3.addActionListener(ml);
        SHUFFLE3_A.addActionListener(ml);
        Create.addActionListener(ml);
        Save.addActionListener(ml);
    }
}
class Taken 
{
    Taken()
    {
        JButton TMb, TMb1, TMb2, TMb3;
        JFrame Sframe2;
        JLabel Slabel2;
        Cursor Tcur;
        ImageIcon  TM,TM1, TM2, TM3;
        Container S2;

        Sframe2 = new JFrame("MusicForMood");
        Sframe2.setSize(1500,700);
        Sframe2.setLocation(20,50);
        Sframe2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Sframe2.setVisible(true);
        Sframe2.setResizable(false);
        S2 = Sframe2.getContentPane();
        S2.setBackground(new Color(229,209,250 ));
        Slabel2 = new JLabel();
        Sframe2.add(Slabel2);
        Slabel2.setText("How's your Mood?");
        Slabel2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        Sframe2.setLayout(null);
        Slabel2.setBounds(650,35,300,100);
        TM = new ImageIcon("Thappy.png");
        TMb = new JButton(TM);
        TMb.setSize(TM.getIconWidth(),TM.getIconHeight());
        TMb.setLocation(40,180);
        TM1 = new ImageIcon("Tsad.png");
        TMb1 = new JButton(TM1);
        TMb1.setSize(TM1.getIconWidth(),TM1.getIconHeight());
        TMb1.setLocation(400,190);
        TM2 = new ImageIcon("Tstressed.png");
        TMb2 = new JButton(TM2);
        TMb2.setSize(TM2.getIconWidth(),TM2.getIconHeight());
        TMb2.setLocation(850,180);
        TM3 = new ImageIcon("confused.png");
        TMb3 = new JButton(TM3);
        TMb3.setSize(TM3.getIconWidth(),TM3.getIconHeight());
        TMb3.setLocation(1190,180);
        Tcur = new Cursor(Cursor.HAND_CURSOR);
        TMb.setCursor(Tcur);
        TMb1.setCursor(Tcur);
        TMb2.setCursor(Tcur);
        TMb3.setCursor(Tcur);
        S2.add(Slabel2);
        S2.add(TMb);
        S2.add(TMb1);
        S2.add(TMb2);
        S2.add(TMb3);
    }
}
