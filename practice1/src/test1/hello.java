package test1;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class hello {
    private JFrame frame;
    
    public hello() {
        frame = new JFrame("helloEx");
        buildGUI();
        
        frame.setSize(200, 80);
        frame.setLocation(500, 300);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void buildGUI() {
        JTextField text = new JTextField();
        JButton button = new JButton("확인");
        JLabel label = new JLabel("Hello world");
        
        frame.add(text, BorderLayout.CENTER);
        frame.add(button, BorderLayout.EAST);
        frame.add(label, BorderLayout.SOUTH);
    }
    
    // 프로그램 시작점 (main 메서드 추가!)
    public static void main(String[] args) {
        new hello();  // 객체를 생성하면서 GUI 띄움
    }
}
