import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSetMetaData;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
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
class SingleHappy {
    private JButton Hb, Hb1, Hb2;
    private JFrame Hframe;
    private JLabel Hlabel;
    private Container H1;
    private JPanel panel, Hpanel, Ppanel;
    private JTable table, Htable, Ptable;
    private JScrollPane scrollPane, HscrollPane, PscrollPane;
    private Cursor cur;

    public SingleHappy() {
        Hframe = new JFrame("MusicForMood");
        Hframe.setSize(1500, 700);
        Hframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Hframe.setLocation(20, 50);
        Hframe.setResizable(false);

        H1 = Hframe.getContentPane();
        H1.setBackground(new Color(229, 209, 250));

        Hlabel = new JLabel("Choose language");
        Hlabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        Hlabel.setBounds(650, 25, 300, 100);

        Hb = new JButton("English");
        Hb.setBounds(140, 110, 100, 100);
        Hb.setBackground(new Color(255, 244, 210));

        Hb1 = new JButton("Hindi");
        Hb1.setBounds(140, 250, 100, 100);
        Hb1.setBackground(new Color(255, 244, 210));

        Hb2 = new JButton("Punjabi");
        Hb2.setBounds(140, 390, 100, 100);
        Hb2.setBackground(new Color(255, 244, 210));

        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBounds(1000,30,280,500);
        panel.setVisible(false); 
        panel.setBackground(new Color(236, 242, 255));
        panel.setFont(new Font("Times New Roman", Font.PLAIN, 20));

        table = new JTable();
        table.setRowHeight(30);
        scrollPane = new JScrollPane(table);
        panel.add(scrollPane, BorderLayout.CENTER);

        Hpanel = new JPanel();
        Hpanel.setLayout(new BorderLayout());
        Hpanel.setBounds(1000,30,280,500);
        Hpanel.setVisible(false); 
        Hpanel.setBackground(new Color(236, 242, 255));
        Hpanel.setFont(new Font("Times New Roman", Font.PLAIN, 20));

        Htable = new JTable();
        Htable.setRowHeight(30);
        HscrollPane = new JScrollPane(Htable);
        Hpanel.add(HscrollPane, BorderLayout.CENTER);

        Ppanel = new JPanel();
        Ppanel.setLayout(new BorderLayout());
        Ppanel.setBounds(1000,30,280,500);
        Ppanel.setVisible(false); 
        Ppanel.setBackground(new Color(236, 242, 255));
        Ppanel.setFont(new Font("Times New Roman", Font.PLAIN, 20));

        Ptable = new JTable();
        Ptable.setRowHeight(30);
        PscrollPane = new JScrollPane(Ptable);
        Ppanel.add(PscrollPane, BorderLayout.CENTER);

        cur = new Cursor(Cursor.HAND_CURSOR);

        H1.setLayout(null);
        H1.add(Hlabel);
        H1.add(Hb);
        H1.add(Hb1);
        H1.add(Hb2);
        H1.add(panel);
        H1.add(Hpanel);
        H1.add(Ppanel);
        Hb.setCursor(cur);
        Hb1.setCursor(cur);
        Hb2.setCursor(cur);

        Hb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    Conn c = new Conn();
                    String query = "SELECT * FROM playlist";
                    ResultSet resultSet = c.stmt.executeQuery(query);
                    DefaultTableModel model = new DefaultTableModel();

                    ResultSetMetaData metaData = resultSet.getMetaData();
                    int columnCount = metaData.getColumnCount();
                    for (int i = 1; i <= columnCount; i++) {
                        model.addColumn(metaData.getColumnName(i));
                    }

                    while (resultSet.next()) {
                        Object[] rowData = new Object[columnCount];
                        for (int i = 0; i < columnCount; i++) {
                            rowData[i] = resultSet.getObject(i + 1);
                        }
                        model.addRow(rowData);
                    }
                    table.setModel(model);
                    panel.setVisible(true); 
                    Hpanel.setVisible(false);
                    Ppanel.setVisible(false);
                    resultSet.close();
                    c.stmt.close(); 
                    c.c.close(); 
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
                }
            }
        });
        Hb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Hin) {
                try {
                    Conn c = new Conn();
                    String Hquery = "SELECT * FROM Hindiplaylist";
                    ResultSet HresultSet = c.stmt.executeQuery(Hquery);
                    DefaultTableModel Hmodel = new DefaultTableModel();

                    ResultSetMetaData HmetaData = HresultSet.getMetaData();
                    int HcolumnCount = HmetaData.getColumnCount();
                    for (int i = 1; i <= HcolumnCount; i++) {
                        Hmodel.addColumn(HmetaData.getColumnName(i));
                    }

                    while (HresultSet.next()) {
                        Object[] HrowData = new Object[HcolumnCount];
                        for (int i = 0; i < HcolumnCount; i++) {
                            HrowData[i] = HresultSet.getObject(i + 1);
                        }
                        Hmodel.addRow(HrowData);
                    }

                    Htable.setModel(Hmodel);
                    panel.setVisible(false);
                    Hpanel.setVisible(true);
                    Ppanel.setVisible(false);
                    
                    HresultSet.close();
                    c.stmt.close(); 
                    c.c.close(); 
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
                }
            }
        });
        Hb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Hin) {
                try {
                    Conn c = new Conn();
                    String Pquery = "SELECT * FROM Punjabiplaylist";
                    ResultSet PresultSet = c.stmt.executeQuery(Pquery);
                    DefaultTableModel Pmodel = new DefaultTableModel();

                    ResultSetMetaData PmetaData = PresultSet.getMetaData();
                    int PcolumnCount = PmetaData.getColumnCount();
                    for (int i = 1; i <= PcolumnCount; i++) {
                        Pmodel.addColumn(PmetaData.getColumnName(i));
                    }

                    while (PresultSet.next()) {
                        Object[] ProwData = new Object[PcolumnCount];
                        for (int i = 0; i < PcolumnCount; i++) {
                            ProwData[i] = PresultSet.getObject(i + 1);
                        }
                        Pmodel.addRow(ProwData);
                    }

                    Ptable.setModel(Pmodel);
                    panel.setVisible(false);
                    Hpanel.setVisible(false);
                    Ppanel.setVisible(true);
 
                    PresultSet.close();
                    c.stmt.close(); 
                    c.c.close(); 
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
                }
            }
        });
        Hframe.setVisible(true);
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
        class MyListener implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent g)
            {
                if(g.getSource() == TMb)
                {
                    new TakenHappy();
                }
            }
        }
        MyListener ml = new MyListener();
        TMb.addActionListener(ml);
    }
}


class TakenHappy {
    private JButton Hb, Hb1, Hb2;
    private JFrame Hframe;
    private JLabel Hlabel;
    private Container H1;
    private JPanel panel, Hpanel, Ppanel;
    private JTable table, Htable, Ptable;
    private JScrollPane scrollPane, HscrollPane, PscrollPane;
    private Cursor cur;
    

    public TakenHappy() {
        Hframe = new JFrame("MusicForMood");
        Hframe.setSize(1500, 700);
        Hframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Hframe.setLocation(20, 50);
        Hframe.setResizable(false);

        H1 = Hframe.getContentPane();
        H1.setBackground(new Color(229, 209, 250));

        Hlabel = new JLabel("Choose language");
        Hlabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        Hlabel.setBounds(650, 25, 300, 100);

        Hb = new JButton("English");
        Hb.setBounds(140, 110, 100, 100);
        Hb.setBackground(new Color(255, 244, 210));

        Hb1 = new JButton("Hindi");
        Hb1.setBounds(140, 250, 100, 100);
        Hb1.setBackground(new Color(255, 244, 210));

        Hb2 = new JButton("Punjabi");
        Hb2.setBounds(140, 390, 100, 100);
        Hb2.setBackground(new Color(255, 244, 210));

        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBounds(1000,30,280,500);
        panel.setVisible(false); 
        panel.setBackground(new Color(236, 242, 255));
        panel.setFont(new Font("Times New Roman", Font.PLAIN, 20));

        table = new JTable();
        table.setRowHeight(30);
        scrollPane = new JScrollPane(table);
        panel.add(scrollPane, BorderLayout.CENTER);

        Hpanel = new JPanel();
        Hpanel.setLayout(new BorderLayout());
        Hpanel.setBounds(1000,30,280,500);
        Hpanel.setVisible(false); 
        Hpanel.setBackground(new Color(236, 242, 255));
        Hpanel.setFont(new Font("Times New Roman", Font.PLAIN, 20));

        Htable = new JTable();
        Htable.setRowHeight(30);
        HscrollPane = new JScrollPane(Htable);
        Hpanel.add(HscrollPane, BorderLayout.CENTER);

        Ppanel = new JPanel();
        Ppanel.setLayout(new BorderLayout());
        Ppanel.setBounds(1000,30,280,500);
        Ppanel.setVisible(false); 
        Ppanel.setBackground(new Color(236, 242, 255));
        Ppanel.setFont(new Font("Times New Roman", Font.PLAIN, 20));

        Ptable = new JTable();
        Ptable.setRowHeight(30);
        PscrollPane = new JScrollPane(Ptable);
        Ppanel.add(PscrollPane, BorderLayout.CENTER);

        H1.setLayout(null);
        H1.add(Hlabel);
        H1.add(Hb);
        H1.add(Hb1);
        H1.add(Hb2);
        H1.add(panel);
        H1.add(Hpanel);
        H1.add(Ppanel);

        cur = new Cursor(Cursor.HAND_CURSOR);
        Hb.setCursor(cur);
        Hb1.setCursor(cur);
        Hb2.setCursor(cur);

        Hb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    Conn c = new Conn();
                    String query = "SELECT * FROM TakenEngplaylist";
                    ResultSet resultSet = c.stmt.executeQuery(query);
                    DefaultTableModel model = new DefaultTableModel();

                    ResultSetMetaData metaData = resultSet.getMetaData();
                    int columnCount = metaData.getColumnCount();
                    for (int i = 1; i <= columnCount; i++) {
                        model.addColumn(metaData.getColumnName(i));
                    }

                    while (resultSet.next()) {
                        Object[] rowData = new Object[columnCount];
                        for (int i = 0; i < columnCount; i++) {
                            rowData[i] = resultSet.getObject(i + 1);
                        }
                        model.addRow(rowData);
                    }
                    table.setModel(model);
                    panel.setVisible(true); 
                    Hpanel.setVisible(false);
                    Ppanel.setVisible(false);
                    resultSet.close();
                    c.stmt.close(); 
                    c.c.close(); 
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
                }
            }
        });
        Hb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Hin) {
                try {
                    Conn c = new Conn();
                    String Hquery = "SELECT * FROM Takenplaylist";
                    ResultSet HresultSet = c.stmt.executeQuery(Hquery);
                    DefaultTableModel Hmodel = new DefaultTableModel();

                    ResultSetMetaData HmetaData = HresultSet.getMetaData();
                    int HcolumnCount = HmetaData.getColumnCount();
                    for (int i = 1; i <= HcolumnCount; i++) {
                        Hmodel.addColumn(HmetaData.getColumnName(i));
                    }

                    while (HresultSet.next()) {
                        Object[] HrowData = new Object[HcolumnCount];
                        for (int i = 0; i < HcolumnCount; i++) {
                            HrowData[i] = HresultSet.getObject(i + 1);
                        }
                        Hmodel.addRow(HrowData);
                    }

                    Htable.setModel(Hmodel);
                    panel.setVisible(false);
                    Hpanel.setVisible(true);
                    Ppanel.setVisible(false);
                    
                    HresultSet.close();
                    c.stmt.close(); 
                    c.c.close(); 
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
                }
            }
        });
        Hb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Hin) {
                try {
                    Conn c = new Conn();
                    String Pquery = "SELECT * FROM PunjabiTakenplaylist";
                    ResultSet PresultSet = c.stmt.executeQuery(Pquery);
                    DefaultTableModel Pmodel = new DefaultTableModel();

                    ResultSetMetaData PmetaData = PresultSet.getMetaData();
                    int PcolumnCount = PmetaData.getColumnCount();
                    for (int i = 1; i <= PcolumnCount; i++) {
                        Pmodel.addColumn(PmetaData.getColumnName(i));
                    }

                    while (PresultSet.next()) {
                        Object[] ProwData = new Object[PcolumnCount];
                        for (int i = 0; i < PcolumnCount; i++) {
                            ProwData[i] = PresultSet.getObject(i + 1);
                        }
                        Pmodel.addRow(ProwData);
                    }

                    Ptable.setModel(Pmodel);
                    panel.setVisible(false);
                    Hpanel.setVisible(false);
                    Ppanel.setVisible(true);
 
                    PresultSet.close();
                    c.stmt.close(); 
                    c.c.close(); 
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
                }
            }
        });
        Hframe.setVisible(true);
    }
}
