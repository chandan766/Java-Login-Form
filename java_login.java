import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class java_login{
	public static void main(String[] args){
		java_login jl = new java_login();
		jl.login();
	}
		
	public void login(){
        JFrame f1= new JFrame();
        JLabel l = new JLabel("      Login");
        l.setFont(new Font("Arial", Font.BOLD, 40)); 
        l.setBounds(120,20,250,50);
        l.setForeground(new Color(97, 3, 3));
        l.setBackground(new Color(255, 247, 0));
		l.addMouseListener(new MouseAdapter(){
			@Override
            public void mouseClicked(MouseEvent e)
            {
				JOptionPane jop = new JOptionPane();
				jop.showMessageDialog(f1,"Hi,\nMy name is Chandan Maurya.I am a student of B.Tech(Cs).\nCurrently I working on Java gui and many projects on it.\nIf you have interest to do some projects with me.\n Email on cr3992@gmail.com");

            }
        });

        JSeparator js = new JSeparator();
        js.setOrientation(SwingConstants.HORIZONTAL);
        js.setBounds(100,80,300,10);
        js.setForeground(Color.white);

        JLabel l1 = new JLabel("User Id");
        l1.setBounds(100,105,180,30); // x, y, width, height
        l1. setForeground(new Color (255,0,0));
        l1.setFont(new Font("Arial", Font.BOLD, 18));
        JSeparator js1 = new JSeparator();
        js1.setOrientation(SwingConstants.HORIZONTAL);
        js1.setBounds(100,170,300,5);
        js1.setForeground(Color.white);
        JTextField t1 = new JTextField();
        t1.setBounds(100,130,300,40);
        t1.setBackground(new Color(254, 180, 73));
        t1.setForeground(Color.black);
        t1.setFont(new Font("Arial", Font.BOLD, 15));
        t1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        t1.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                js1.setForeground(Color.black);
            }
            public void focusLost(FocusEvent e) {
                js1.setForeground(Color.white);
            }
        });
        
        JLabel l2 = new JLabel("Password");
        l2.setBounds(100,195,100,30);
        l2. setForeground(new Color (255,0,0));
        l2.setFont(new Font("Arial", Font.BOLD, 18));
        JSeparator js2 = new JSeparator();
        js2.setOrientation(SwingConstants.HORIZONTAL);
        js2.setBounds(100,260,300,5);
        js2.setForeground(Color.white);
        JPasswordField tp = new JPasswordField();
        tp.setBounds(100, 220, 300,40);
        tp.setEchoChar('*');
        tp.setBackground(new Color(254, 180, 73));
        tp.setForeground(Color.black);
        tp.setFont(new Font("Arial", Font.BOLD, 15));
        tp.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        tp.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                js2.setForeground(Color.black);
            }
            public void focusLost(FocusEvent e) {
                js2.setForeground(Color.white);
            }
        });

        JCheckBox checkbox = new JCheckBox("Show Password");
        checkbox.setBounds(100,290,120,30);
        checkbox.setBackground(new Color (254, 180, 73));
        checkbox.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {                  
               if (e.getStateChange()==1){
                tp.setEchoChar((char)0);
               }   
               else{
                tp.setEchoChar('*');
               }
            }    
         }); 
        
        JButton b3 = new JButton("Forget Password?");
        b3.setBounds(270,290,150,30);
        b3.setBackground(new Color(254, 180, 73));
        b3.setBorder(null);
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                //f1.dispose();
				//your forget password gui function
            }
        });
        b3.setFocusPainted(false);

        JButton b1 = new JButton("Login");
        b1.setBounds(120,360,250,35);
        b1.setBackground(new Color(130, 5, 240));
        b1.setForeground(Color.white);
        b1.setFont(new Font("Arial", Font.BOLD, 15));
        b1.setFocusPainted(false);

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
        {
        String name = t1.getText();
        char[] ch = tp.getPassword();
        String pass = new String(ch);
        System.out.println("User Id: "+name+"\nPassword: "+pass);
        }
        });
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b1.setBackground(new Color(10, 14, 245));
                b1.setBounds(100,360,300,35);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
				b1.setBackground(new Color(130, 5, 240));
                b1.setBounds(120,360,250,35);
            }
        });


        f1.add(l);
        f1.add(js);
        f1.add(l1);
        f1.add(t1);
        f1.add(js1);
        f1.add(l2);
        f1.add(tp);
        f1.add(js2);
        f1.add(checkbox);
        f1.add(b3);
        f1.add(b1);

        f1.setSize(500,500);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.getContentPane().setBackground(new Color(254, 180, 73));
        f1.setLocationRelativeTo(null);
        f1.setResizable(false);
        f1.setVisible(true);
    }
}