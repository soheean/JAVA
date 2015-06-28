package gridlaysy;
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
import java.awt.event.ActionListener;  
import java.awt.event.ActionEvent;  
  
class Calculator extends JFrame implements ActionListener {  
  
    JTextField jtf=new JTextField(); //便于在actionPerformed成员方法中访问  
      
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
        Container c=this.getContentPane(); //JFrame.getContentPane()的返回值是Container类型的  
        jtf.setHorizontalAlignment(JTextField.RIGHT); //JTextField的方法setHorizontalAlignment(int alignment)设置文本水平对齐方向  
        JPanel jpl=new JPanel();  
        c.add(jtf,BorderLayout.NORTH); //将文本框增加到主框架上  
        c.add(jpl,BorderLayout.CENTER); //将面板增加到主框架上  
        //在JPanel面板上增加16个按钮  
        jpl.setLayout(new GridLayout(4,4)); //设置jpl的布局管理器为GridLayOut，4行4列  
          
        JButton b=null;  
          
        /* 
        for(int i=0;i<16;i++){ 
            b=new JButton(Integer.toString(i)); // Integer.toString(int i)将整数转换成字符串 
            b.addActionListener(this); //因为Calculator实现了ActionListener接口，所以这里可以用this作为监听器对象 
            jpl.add(b); 
            } 
        */  
          
          
          
        b=new JButton("1");  
        b.addActionListener(this); //因为Calculator实现了ActionListener接口，所以这里可以用this作为监听器对象  
        jpl.add(b);  
          
        b=new JButton("2");  
        b.addActionListener(this); //因为Calculator实现了ActionListener接口，所以这里可以用this作为监听器对象  
        jpl.add(b);  
          
        b=new JButton("3");  
        b.addActionListener(this); //因为Calculator实现了ActionListener接口，所以这里可以用this作为监听器对象  
        jpl.add(b);  
          
        b=new JButton("+");  
        b.addActionListener(this); //因为Calculator实现了ActionListener接口，所以这里可以用this作为监听器对象  
        jpl.add(b);  
          
        b=new JButton("4");  
        b.addActionListener(this); //因为Calculator实现了ActionListener接口，所以这里可以用this作为监听器对象  
        jpl.add(b);  
          
        b=new JButton("5");  
        b.addActionListener(this); //因为Calculator实现了ActionListener接口，所以这里可以用this作为监听器对象  
        jpl.add(b);  
          
        b=new JButton("6");  
        b.addActionListener(this); //因为Calculator实现了ActionListener接口，所以这里可以用this作为监听器对象  
        jpl.add(b);  
          
        b=new JButton("-");  
        b.addActionListener(this); //因为Calculator实现了ActionListener接口，所以这里可以用this作为监听器对象  
        jpl.add(b);  
          
        b=new JButton("7");  
        b.addActionListener(this); //因为Calculator实现了ActionListener接口，所以这里可以用this作为监听器对象  
        jpl.add(b);  
          
        b=new JButton("8");  
        b.addActionListener(this); //因为Calculator实现了ActionListener接口，所以这里可以用this作为监听器对象  
        jpl.add(b);  
          
        b=new JButton("9");  
        b.addActionListener(this); //因为Calculator实现了ActionListener接口，所以这里可以用this作为监听器对象  
        jpl.add(b);  
          
        b=new JButton("*");  
        b.addActionListener(this); //因为Calculator实现了ActionListener接口，所以这里可以用this作为监听器对象  
        jpl.add(b);  
          
        b=new JButton("0");  
        b.addActionListener(this); //因为Calculator实现了ActionListener接口，所以这里可以用this作为监听器对象  
        jpl.add(b);  
          
        b=new JButton(".");  
        b.addActionListener(this); //因为Calculator实现了ActionListener接口，所以这里可以用this作为监听器对象  
        jpl.add(b);  
          
        b=new JButton("=");  
        b.addActionListener(this); //因为Calculator实现了ActionListener接口，所以这里可以用this作为监听器对象  
        jpl.add(b);  
          
        b=new JButton("/");  
        b.addActionListener(this); //因为Calculator实现了ActionListener接口，所以这里可以用this作为监听器对象  
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
        jtf.setText(jtf.getText()+e.getActionCommand()); //jtf.setText()设置文本框里的内容。jtf.getText()获取文本框里的内容。e.getActionCommand获取事件组件的名字  
    }  
}  