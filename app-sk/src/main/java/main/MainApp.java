package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import model.DirectoryLocal;
import model.FileLocal;

public class MainApp{  

	public static void main(String[] args) {  
	 
		JFrame f=new JFrame("SK");  
		
		final JTextField jtxF = new JTextField("path");
		jtxF.setBounds(50,50,300,30);
		f.add(jtxF);
		final JTextField jtxF2 = new JTextField("name");
		jtxF2.setBounds(50,100,300,30);
		f.add(jtxF2);
		
	    JButton b=new JButton("Create dir");  
	    b.setBounds(50,150,95,30);
	    b.addActionListener(new ActionListener(){  
	        public void actionPerformed(ActionEvent e){
	        	String s1 = jtxF.getText(); // D:\\Desktop\\...
	        	String s2 = jtxF2.getText();
	        	DirectoryLocal directoryLocal = new DirectoryLocal();
	        	directoryLocal.create(s1, s2);  
	        }
	    }); 
	    f.add(b);
	    
	    JButton b2=new JButton("Create file");  
	    b2.setBounds(150,150,95,30);  
	    b2.addActionListener(new ActionListener(){  
	        public void actionPerformed(ActionEvent e){
	        	String s1 = jtxF.getText();
	        	String s2 = jtxF2.getText();
	        	FileLocal fileLocal = new FileLocal();
	        	fileLocal.create(s1, s2);  
	        }
	    }); 
	    f.add(b2);  
	    
	    JButton b3=new JButton("Delete");  
	    b3.setBounds(250,150,95,30);    
	    b3.addActionListener(new ActionListener(){  
	        public void actionPerformed(ActionEvent e){  
	        	String s1 = jtxF.getText();
	        	String s2 = jtxF2.getText();
	        	FileLocal fileLocal = new FileLocal();
	        	fileLocal.delete(s1, s2);  
	        }
	    }); 
	    f.add(b3);
	    
	    JButton b4=new JButton("Move");  
	    b4.setBounds(50,150,95,30);    
	    b4.addActionListener(new ActionListener(){  
	        public void actionPerformed(ActionEvent e){  
	        	
	        }
	    }); 
	    f.add(b4);
	   
	    f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true);   
	}  
}  
