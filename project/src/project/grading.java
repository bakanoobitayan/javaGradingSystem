/**
 * @(#)grading.java
 *
 *
 * @Daniel D. Jamero 
 * @version 1.00 2019/3/9
 */
package project;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Image;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.util.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class grading extends JFrame implements ActionListener {
	datas data = new datas();
	//Login GUI
	public JFrame login;
	public JLabel usernametext,passwordtext,gradingsystemtext, lblcover, lblx;
	public JTextField username;
	public JPasswordField password;
	public JButton loginbutton;
	Icon Pic1 = new ImageIcon("cover.jpg");
	
	//Admin GUI
	public JFrame admin;
	public JLabel admintext;
	public JButton viewrecord,searchstudent,addrecord,addstudent,logout,setitems;
	
	//Search GUI
   	public JFrame search;
   	public JLabel searchBG,searchx,searchtitle,searchcover;
   	public JTextField searchbar;
   	public JButton searchbutton,addrecordbutton;
   	public Icon searchpic = new ImageIcon("cover.jpg");
   	
   	
	//Add Student GUI
	public JFrame addstudents;
	public JLabel asBG,asx,asID,asname,astitle,ascover;
	public JTextField asidnumber,asstudentname;
	public JButton assubmit,ascancel;
	
	//Add Record GUI
	public JFrame arecord;
	public JButton arsubmit,arcancel,setrecord;
	public JTextField arq1,arq2,arq3,arexam,arip,arcs;
	public JLabel arlblBG, arlblx, arlblID, arlblname, arlblQ1, arlblQ2, arlblQ3, arlblexam, arlblIp, arlblcs, arlblTitle, arlblcover,arid,arname;
    public grading() {
    	
    	
    	//Add Record frame
    	arecord = new JFrame("Grading System");
    	arecord.setSize(400,440);
    	arecord.setLayout(null);
    	arecord.setVisible(false);
    	arecord.setResizable(true);	
    	arecord.setLocationRelativeTo(null);
    	
    	arlblTitle = new JLabel("ADD RECORD");
	    arlblTitle.setFont(new Font("Arial",Font.BOLD,20));
	    arlblTitle.setBounds(120,10,150,30);
	    arecord.add(arlblTitle);
	    
	    arlblID = new JLabel("ID");
	    arecord.add(arlblID);
      	arlblID.setBounds(50,90,100,30);
      		
	    arlblname = new JLabel("STUDENT NAME");
	    arecord.add(arlblname);
      	arlblname.setBounds(50,120,100,30);
      	
	    arlblQ1 = new JLabel("Q1/"+data.q1+"");
	    arecord.add(arlblQ1);
      	arlblQ1.setBounds(50,150,100,30);
      	
	    arlblQ2 = new JLabel("Q2/"+data.q2+"");
	    arecord.add(arlblQ2);
	    arlblQ2.setBounds(50,180,100,30);
	    
	    arlblQ3 = new JLabel("Q3/"+data.q3+"");
	    arecord.add(arlblQ3);
      	arlblQ3.setBounds(50,210,100,30);
      	
	    arlblexam = new JLabel("EXAM/"+data.e+"");
	    arecord.add(arlblexam);
      	arlblexam.setBounds(50,240,100,30);
      	
	    arlblIp = new JLabel("IPT/"+data.ipt+"");
	    arecord.add(arlblIp);
      	arlblIp.setBounds(50,270,100,30);
      	
	    arlblcs = new JLabel("Class Standing/"+data.cs+"");
	    arecord.add(arlblcs);
      	arlblcs.setBounds(50,300,120,30);
      	
      	arid = new JLabel("");
		arecord.add(arid);
	    arid.setBounds(205,90,100,30);
	     
		arname = new JLabel("");
		arecord.add(arname);
	   	arname.setBounds(205,120,100,30);
	    		
	    arq1 = new JTextField("");
	    arecord.add(arq1);
	    arq1.setBounds(205,150,100,30);
	    		
	    arq2 = new JTextField("");
	    arecord.add(arq2);
	    arq2.setBounds(205,180,100,30);
	     
		arq3 = new JTextField("");
		arecord.add(arq3);
	    arq3.setBounds(205,210,100,30);
	    		
	    arexam = new JTextField("");
	    arecord.add(arexam);
	    arexam.setBounds(205,240,100,30);
	    		
	    arip = new JTextField("");
	    arecord.add(arip);
	    arip.setBounds(205,270,100,30);
	    		
	    arcs = new JTextField("");
	    arecord.add(arcs);
	    arcs.setBounds(205,300,100,30);
	    
      	arlblcover = new JLabel (Pic1);
		arecord.add(arlblcover);
		arlblcover.setBounds(0,0,400,400);
		
		arsubmit = new JButton("SUBMIT");
	    arecord.add(arsubmit);
	    arsubmit.setBounds(45, 350,100,30);
	    arsubmit.addActionListener(this);
	    
	    setrecord = new JButton("SET");
	    arecord.add(setrecord);
	    setrecord.setBounds(45, 350,100,30);
	    setrecord.addActionListener(this);
	    
	       	
		arcancel = new JButton("CANCEL");
		arecord.add(arcancel);
	    arcancel.setBounds(230, 350,100,30);
	    arcancel.addActionListener(this);
    	
    	
 		
		//Login frame
    	login = new JFrame("Grading System");
    	login.setSize(400,400);
    	login.setLayout(null);
    	login.setVisible(true);
    	login.setResizable(true);
    	login.setLocationRelativeTo(null);
    	
    	gradingsystemtext = new JLabel("Grading System");
     	gradingsystemtext.setBounds(60,-50,250,200);
     	gradingsystemtext.setFont(new Font("Arial",Font.BOLD,30));
     	login.add(gradingsystemtext);
     	
    	usernametext = new JLabel("Username");
    	usernametext.setBounds(50,50,150,100);
    	login.add(usernametext);
    	
    	passwordtext = new JLabel("Password");
    	passwordtext.setBounds(50,100,100,100);
    	login.add(passwordtext);
    	
    	username = new JTextField("");
    	username.setBounds(150,90,100,20);
    	login.add(username);
    	
    	password = new JPasswordField("");
    	password.setBounds(150,140,100,20);
    	login.add(password);
    
    	loginbutton = new JButton("LOGIN");
        loginbutton.setBounds(150,180,100,20);
        login.add(loginbutton);
        loginbutton.addActionListener(this);
        
        lblcover = new JLabel (Pic1);
    	login.add(lblcover);
    	lblcover.setBounds(0,0,400,400);
    	
        
        lblx= new JLabel("");
     	login.add(lblx);
        
        //admin frame
        admin = new JFrame(" Grading System ");
        admin.setSize(350,400);
    	admin.setLayout(null);
    	admin.setVisible(false);
    	admin.setResizable(true);
    	admin.setLocationRelativeTo(null);
    	
    	admintext = new JLabel("Admin");
     	admintext.setBounds(130,-50,200,200);
     	admintext.setFont(new Font("Arial",Font.BOLD,30));
     	admin.add(admintext);
     	
     	
     	addstudent = new JButton("Add Student");
     	addstudent.setBounds(100,100,150,30);
     	admin.add(addstudent);
     	addstudent.addActionListener(this);
     	
     	addrecord = new JButton("Add Record");
     	addrecord.setBounds(100,140,150,30);
     	admin.add(addrecord);
     	addrecord.addActionListener(this);
     	
     	viewrecord = new JButton("View Record");
     	viewrecord.setBounds(100,180,150,30);
     	admin.add(viewrecord);
     	viewrecord.addActionListener(this);
     	
     	searchstudent = new JButton("Search Student");
     	searchstudent.setBounds(100,220,150,30);
     	admin.add(searchstudent);
     	searchstudent.addActionListener(this);
     	
     	setitems = new JButton("Set Items");
     	setitems.setBounds(100,260,150,30);
     	admin.add(setitems);
     	setitems.addActionListener(this);
     	
     	logout = new JButton("Log Out");
     	logout.setBounds(100,300,150,30);
     	admin.add(logout);
     	logout.addActionListener(this);
     	
     	lblcover = new JLabel (Pic1);
    	admin.add(lblcover);
    	lblcover.setBounds(0,0,400,400);
     	
     	
     	
     	//search frame
     	search = new JFrame("Grading System");
     	search.setSize(400,400);
	    search.setLayout(null); 
	    search.setVisible(false);
	    search.setResizable(false);
	    search.setLocationRelativeTo(null);
		
		searchtitle = new JLabel("");
	    searchtitle.setFont(new Font("Arial",Font.BOLD,20));	
      	searchtitle.setBounds(90,10,200,30);
      	search.add(searchtitle);
      	
      	searchbar = new JTextField("");    
	    searchbar.setBounds(30,100,200,30);
	    search.add(searchbar);
	    
	    searchbutton = new JButton("Search");
	    searchbutton.setBounds(250, 100,100,30);
	    search.add(searchbutton);
	    searchbutton.addActionListener(this);
	    
	    addrecordbutton = new JButton("Add Record");
	    addrecordbutton.setBounds(250, 100,120,30);
	    search.add(addrecordbutton);
	    addrecordbutton.addActionListener(this);
	   
	    
	    searchcover = new JLabel(searchpic);
	    searchcover.setBounds(0,0,400,400);
	    search.add(searchcover);
	    
	    
	    //add student frame
		addstudents = new JFrame("Grading System");
		addstudents.setSize(400,400);
		addstudents.setLayout(null);
		addstudents.setVisible(false);
		addstudents.setResizable(false);
		addstudents.setLocationRelativeTo(null);
		
		astitle = new JLabel("ADD RECORD");
		astitle.setFont(new Font("Arial",Font.BOLD,30));
		astitle.setBounds(90,10,250,40);
		addstudents.add(astitle);
		
		asID = new JLabel("StudentID");
      	asID.setBounds(50,100,100,30);
      	addstudents.add(asID);
      		
	    asname = new JLabel("Student NAME");
      	asname.setBounds(50,150,120,30);
		addstudents.add(asname);
		
		asidnumber = new JTextField("");
	    asidnumber.setBounds(170,100,100,30);
	    asidnumber.setEditable(false);
	    addstudents.add(asidnumber);
	    
	    asstudentname = new JTextField("");
	    asstudentname.setBounds(170,150,100,30);
	    addstudents.add(asstudentname);
	    
	    assubmit = new JButton("SUBMIT");
	    assubmit.setBounds(45, 250,100,30);
	    addstudents.add(assubmit);
	    assubmit.addActionListener(this);
	    
	    //ascancel = new JButton("CANCEL");
	    //ascancel.setBounds(230, 250,100,30);
	    //addstudents.add(ascancel);
	    //ascancel.addActionListener(this);
	      	
	    ascover = new JLabel (Pic1);
		ascover.setBounds(0,0,400,400);
		addstudents.add(ascover);
	    
	    
    }
    
    public void addstudent(){
    	String studentname = asstudentname.getText();
 
    	if(studentname.equals("")){
    		JOptionPane.showMessageDialog(null,"Input Name");
    	}
    	else{
    		data.addstudent(data.passidnum(),studentname);
    		JOptionPane.showMessageDialog(null,"You have successfully added "+studentname+"");
    		asidnumber.setText(Integer.toString(data.idnum));
    		asstudentname.setText("");
    			
    		}
    	}
    
    
    public void searchstudent(){
    	String x = data.searchstudent(searchbar.getText());
    	if(x.equals("")){
    		JOptionPane.showMessageDialog(null,"Student Doesnt Exist");
    	}
    	else{
    		data.viewstudent(x);
    	}
    }
    
    public void addrecord(){
    	String x = data.searchstudent(searchbar.getText());
    	if(x.equals("")){
    		JOptionPane.showMessageDialog(null,"Student Doesnt Exist");
    	}
    	else{
    		arid.setText(data.records[Integer.parseInt(x)][0]);
    		arname.setText(data.records[Integer.parseInt(x)][1]);
    		arecord.setVisible(true);
    		setrecord.setVisible(false);
    		arsubmit.setVisible(true);
    		arlblTitle.setText("Add Record");
    		arid.setVisible(true);
    		arname.setVisible(true);
    		arlblname.setVisible(true);
    		arlblID.setVisible(true);
    		arlblQ1.setText("Q1/"+data.q1+"");
    		arlblQ2.setText("Q2/"+data.q2+"");
    		arlblQ3.setText("Q3/"+data.q3+"");
    		arlblexam.setText("EXAM/"+data.e+"");
    		arlblIp.setText("IPT/"+data.ipt+"");
    		arlblcs.setText("CS/"+data.cs+"");
    		
    	}
    }
    
    public void setitems(){
    	arecord.setVisible(true);
    	setrecord.setVisible(true);
    	arsubmit.setVisible(false);
    	arlblTitle.setText("Set Record");
    	arid.setVisible(false);
    	arname.setVisible(false);
    	arlblname.setVisible(false);
    	arlblID.setVisible(false);
    	arlblQ1.setText("Q1");
    	arlblQ2.setText("Q2");
    	arlblQ3.setText("Q3");
    	arlblexam.setText("EXAM");
    	arlblIp.setText("IPT");
    	arlblcs.setText("CS");
    }
    
    public void setrecord(){
    
    	data.setrecords(arq1.getText(),arq2.getText(),arq3.getText(),arexam.getText(),arip.getText(),arcs.getText());
    	JOptionPane.showMessageDialog(null,"successfully set record");
    	arecord.setVisible(false);
    	arq1.setText("");
    	arq2.setText("");
    	arq3.setText("");
    	arexam.setText("");
    	arip.setText("");
    	arcs.setText("");
    	
    }
    
    public void submitrecord(){
    	String x = data.searchstudent(searchbar.getText());
    	if(x.equals("")){
    		JOptionPane.showMessageDialog(null,"Student Doesnt Exist");
    	}
    	else{
    		data.addrecord(x,arq1.getText(),arq2.getText(),arq3.getText(),arexam.getText(),arip.getText(),arcs.getText());
    		arq1.setText("");
    		arq2.setText("");
    		arq3.setText("");
    		arexam.setText("");
    		arip.setText("");
    		arcs.setText("");
    		
    	}
    	
    }
    
    public void actionPerformed(ActionEvent evt){
    		if (evt.getSource()==loginbutton){

    			String output;
    			output = data.checkuser(username.getText(),new String(password.getPassword()));
    			if(output.equals("WELCOME BACK!"+" "+username.getText())){
  					admin.setVisible(true);
  					login.setVisible(false);
    			}
    			JOptionPane.showMessageDialog(null,output);
    			
    			username.setText("");
    			password.setText("");
  		
    		}
    		
    		if (evt.getSource()==addstudent){
    			addstudents.setVisible(true);
    			asidnumber.setText(Integer.toString(data.idnum));
    		}
    		
    		if(evt.getSource()==assubmit){
    			addstudent();
    		}
    			
    		if (evt.getSource()==logout){
    			admin.setVisible(false);
    			login.setVisible(true);
    		}
    		
    		if (evt.getSource()==viewrecord){
    			data.viewrecords();
    		}
    		
    		if (evt.getSource()==searchstudent){
    			search.setVisible(true);
    			searchtitle.setText("Search Student");
    			searchbutton.setVisible(true);
    			addrecordbutton.setVisible(false);
    		}
    	
    		if(evt.getSource()==searchbutton){
    			searchstudent();
    		}
    		
    		if (evt.getSource()==addrecord){
    			if(data.q1 != 0 && data.q2 !=0 && data.q3 !=0 && data.e != 0 && data.ipt != 0 && data.cs != 0 ){
    				search.setVisible(true);
    				searchtitle.setText("Add Record");
    				addrecordbutton.setVisible(true);
    				searchbutton.setVisible(false);	
    			}
    			else{
    				JOptionPane.showMessageDialog(null,"set record first");
    			}	
    		}
    		
    		if (evt.getSource()==arsubmit){
    			submitrecord();
    			JOptionPane.showMessageDialog(null,"successfully added record");
    			arecord.setVisible(false);
 				search.setVisible(true);		
    		}
    		
    		
    		if(evt.getSource()==addrecordbutton){
    			addrecord();
    		}
    		
    		if(evt.getSource()==arcancel){
    			arecord.setVisible(false);
    			arq1.setText("");
    			arq2.setText("");
    			arq3.setText("");
    			arexam.setText("");
    			arip.setText("");
    			arcs.setText("");
    		}
    		
    		if(evt.getSource()==setitems){
    			setitems();
    		}
    		
    		if(evt.getSource()==setrecord){
    			setrecord();	
    		}			
    }
}