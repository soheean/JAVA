package gridlaysy;
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
import java.awt.event.ActionListener;  
import java.awt.event.ActionEvent;  
  
class Calculator extends JFrame implements ActionListener {  
  
    JTextField jtf=new JTextField(); //������actionPerformed��Ա�����з���  
      
    public Calculator() {  
        /* 
        addWindowListener(new WindowAdapter() { 
            public void windowClosing(WindowEvent e) { 
                dispose(); 
                System.exit(0); 
            } 
        }); 
        */  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        Container c=this.getContentPane(); //JFrame.getContentPane()�ķ���ֵ��Container���͵�  
        jtf.setHorizontalAlignment(JTextField.RIGHT); //JTextField�ķ���setHorizontalAlignment(int alignment)�����ı�ˮƽ���뷽��  
        JPanel jpl=new JPanel();  
        c.add(jtf,BorderLayout.NORTH); //���ı������ӵ��������  
        c.add(jpl,BorderLayout.CENTER); //��������ӵ��������  
        //��JPanel���������16����ť  
        jpl.setLayout(new GridLayout(4,4)); //����jpl�Ĳ��ֹ�����ΪGridLayOut��4��4��  
          
        JButton b=null;  
          
        /* 
        for(int i=0;i<16;i++){ 
            b=new JButton(Integer.toString(i)); // Integer.toString(int i)������ת�����ַ��� 
            b.addActionListener(this); //��ΪCalculatorʵ����ActionListener�ӿڣ��������������this��Ϊ���������� 
            jpl.add(b); 
            } 
        */  
          
          
          
        b=new JButton("1");  
        b.addActionListener(this); //��ΪCalculatorʵ����ActionListener�ӿڣ��������������this��Ϊ����������  
        jpl.add(b);  
          
        b=new JButton("2");  
        b.addActionListener(this); //��ΪCalculatorʵ����ActionListener�ӿڣ��������������this��Ϊ����������  
        jpl.add(b);  
          
        b=new JButton("3");  
        b.addActionListener(this); //��ΪCalculatorʵ����ActionListener�ӿڣ��������������this��Ϊ����������  
        jpl.add(b);  
          
        b=new JButton("+");  
        b.addActionListener(this); //��ΪCalculatorʵ����ActionListener�ӿڣ��������������this��Ϊ����������  
        jpl.add(b);  
          
        b=new JButton("4");  
        b.addActionListener(this); //��ΪCalculatorʵ����ActionListener�ӿڣ��������������this��Ϊ����������  
        jpl.add(b);  
          
        b=new JButton("5");  
        b.addActionListener(this); //��ΪCalculatorʵ����ActionListener�ӿڣ��������������this��Ϊ����������  
        jpl.add(b);  
          
        b=new JButton("6");  
        b.addActionListener(this); //��ΪCalculatorʵ����ActionListener�ӿڣ��������������this��Ϊ����������  
        jpl.add(b);  
          
        b=new JButton("-");  
        b.addActionListener(this); //��ΪCalculatorʵ����ActionListener�ӿڣ��������������this��Ϊ����������  
        jpl.add(b);  
          
        b=new JButton("7");  
        b.addActionListener(this); //��ΪCalculatorʵ����ActionListener�ӿڣ��������������this��Ϊ����������  
        jpl.add(b);  
          
        b=new JButton("8");  
        b.addActionListener(this); //��ΪCalculatorʵ����ActionListener�ӿڣ��������������this��Ϊ����������  
        jpl.add(b);  
          
        b=new JButton("9");  
        b.addActionListener(this); //��ΪCalculatorʵ����ActionListener�ӿڣ��������������this��Ϊ����������  
        jpl.add(b);  
          
        b=new JButton("*");  
        b.addActionListener(this); //��ΪCalculatorʵ����ActionListener�ӿڣ��������������this��Ϊ����������  
        jpl.add(b);  
          
        b=new JButton("0");  
        b.addActionListener(this); //��ΪCalculatorʵ����ActionListener�ӿڣ��������������this��Ϊ����������  
        jpl.add(b);  
          
        b=new JButton(".");  
        b.addActionListener(this); //��ΪCalculatorʵ����ActionListener�ӿڣ��������������this��Ϊ����������  
        jpl.add(b);  
          
        b=new JButton("=");  
        b.addActionListener(this); //��ΪCalculatorʵ����ActionListener�ӿڣ��������������this��Ϊ����������  
        jpl.add(b);  
          
        b=new JButton("/");  
        b.addActionListener(this); //��ΪCalculatorʵ����ActionListener�ӿڣ��������������this��Ϊ����������  
        jpl.add(b);  
          
      
          
    }  
  
    public static void main(String args[]) {  
        System.out.println("Starting Calculator...");  
        Calculator mainFrame = new Calculator();  
        mainFrame.setSize(300, 400);  
        mainFrame.setTitle("Calculator");  
        mainFrame.setVisible(true);  
    }  
  
    public void actionPerformed(ActionEvent e) {  
        // TODO: Add your code here  
        jtf.setText(jtf.getText()+e.getActionCommand()); //jtf.setText()�����ı���������ݡ�jtf.getText()��ȡ�ı���������ݡ�e.getActionCommand��ȡ�¼����������  
    }  
}  