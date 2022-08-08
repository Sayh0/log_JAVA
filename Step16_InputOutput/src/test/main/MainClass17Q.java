package test.main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainClass17Q extends JFrame implements ActionListener {
   JTextField inputMsg;
   JTextArea outputMsg;
   
   public MainClass17Q(String title) {
      super(title);
      setLayout(new FlowLayout());
      JButton btn1=new JButton("추가");
      inputMsg=new JTextField(10);
      JButton btn2=new JButton("로드");
      outputMsg=new JTextArea();


      add(btn1);
      add(inputMsg);
      add(btn2); 
      add(outputMsg);
      
      btn1.addActionListener(this);
      btn2.addActionListener(this);
   }
   
   public static void main(String[] args) {
         JFrame frame1=new MainClass17Q("Quiz");
         frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame1.setBounds(100,  100, 500, 500);
         frame1.setVisible(true);
   }
   
   @Override
   public void actionPerformed(ActionEvent e) {
      String command=e.getActionCommand();
      File memoFile=new File("c:/acorn202206/myFolder/memo.txt");
      FileReader fr=null;
       BufferedReader br=null;
       
       if(command.equals("추가하기")) {
          String msg=inputMsg.getText();
          try {
            FileWriter fw=new FileWriter(memoFile, true);
            fw.write(msg);
            fw.flush();
            fw.close();
         } catch (IOException ioe) {
            ioe.printStackTrace();
         }
       }else if(command.equals("로드")) {
          try {
               fr=new FileReader(memoFile);
               br=new BufferedReader(fr);
               while(true) {
                  String line=br.readLine();
                  if(line==null) {
                     break;
                  }
                  outputMsg.append(line);
               }
               
            } catch (FileNotFoundException fe) {
               fe.printStackTrace();
            } catch (IOException ioe) {
               ioe.printStackTrace();
            }finally { 
               try {
                  if(br!=null)br.close();
                  if(fr!=null)fr.close();
               } catch (IOException ioe) {
                  ioe.printStackTrace();
               }
            }
         
       }
   }

}