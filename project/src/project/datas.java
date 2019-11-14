package project;
import javax.swing.*;


public class datas extends JFrame{
	public String[][] users = {{"admin","12345"}};
	//record values
	public int q1=0,q2=0,q3=0;//inputs
	public int tq = q1 + q2 + q3;
	public int quiz = 30,exam = 40,iptp = 20,csp = 10;//percentage
	public int e = 0, ipt = 0 , cs = 0;//inputs
	
	//records	
	String[] header = {"ID Number","Student Name","Q1/"+q1+"","Q2/"+q2+"","Q3/"+q3+"","TTL/"+tq+"",
	""+quiz+"%","EXAM/"+e+"",""+exam+"%","IPT/"+ipt+"",""+iptp+"%","Class Standing/"+cs+"",""+csp+"%","Grade","Remarks"};
	
	public int idnum = 2019000;
	public String[][] records = new String[40][15];
	public int numberofstudents = 0;
	
	public String[][] viewstudents = new String[1][15];
	//view records
	public JFrame record;
	public JTable table;

   	
   
    public datas() {
    }
    
    public void setrecords(String x1,String x2,String x3,String x4,String x5,String x6){
   		q1 = Integer.parseInt(x1);
   		q2 = Integer.parseInt(x2);
   		q3 = Integer.parseInt(x3);
   		e = Integer.parseInt(x4);
   		ipt = Integer.parseInt(x5);
   		cs = Integer.parseInt(x6);
   		tq = q1 + q2 + q3;
   		
    	
    }
    
    public String checkuser(String username,String password){
    	String output = "";
    	
    		for(int i=0;i<users.length;i++){
    			if(username.equals(users[i][0])){
    				if(password.equals(users[i][1])){
    					output = "WELCOME BACK!"+" "+username;
    					
    				}
    				else{
    					output = "Password Incorrect";
    				}
    				break;
    			}
    			else if(i == users.length - 1){
    				output = "User Does Not Exist";	
    			}
    		}
    	return output;
    		
    }
    public void addstudent(int idnumber,String name){
    	records[numberofstudents][0] = Integer.toString(idnumber);
    	records[numberofstudents][1] = name;
    	numberofstudents++;
    	idnum++;
    	
    }
    
    public int passidnum(){
    	return idnum;
    }
    
    public void viewrecords(){
    	record=new JFrame("Records");
    	
    	String[] header = {"ID Number","Student Name","Q1/"+q1+"","Q2/"+q2+"","Q3/"+q3+"","TTL/"+tq+"",
		""+quiz+"%","EXAM/"+e+"",""+exam+"%","IPT/"+ipt+"",""+iptp+"%","Class Standing/"+cs+"",""+csp+"%","Grade","Remarks"};
		
   		table = new JTable(records,header);
   		record.add(table);
   		
   		record.getContentPane().add(new JScrollPane(table));
   		record.setSize(1500,500); 
    	  
   		record.setVisible(true);
    }
    
    public String searchstudent(String idnumber){
    	String output = "";
    	for(int i = 0;i<=numberofstudents;i++){
    		if(idnumber.equals(records[i][0])){
    			output = Integer.toString(i);
    			break;
    		}
    	}
    	return output;
    }
    
    public void viewstudent(String x){
    	int y = Integer.parseInt(x);
    	for(int i = 0;i<viewstudents[0].length;i++){
    		viewstudents[0][i] = records[y][i];
    	}
    	 
    	record=new JFrame("Grading System");
    	
   		table = new JTable(viewstudents,header);
   		record.add(table);
   		
   		record.getContentPane().add(new JScrollPane(table));
   		record.setSize(1500,100); 
    	  
   		record.setVisible(true);
    	
    }
    
    
    public void addrecord(String x,String x1,String x2,String x3,String x4,String x5,String x6){
    	int y = Integer.parseInt(x);//index for row
    	int qq1,qq2,qq3,ee,iipt,css;
    	double quizp,examp,cssp,grade,iiptp;
    	
    	qq1 = Integer.parseInt(x1);
    	qq2 = Integer.parseInt(x2);
    	qq3 = Integer.parseInt(x3);
    	ee =  Integer.parseInt(x4);
    	iipt = Integer.parseInt(x5);
    	css = Integer.parseInt(x6);
    	
    	
    	quizp = ((((double)qq1+(double)qq2+(double)qq3)/(double)tq)*0.3) * 100;
    	examp = ((double)ee/(double)e*0.4) * 100;
    	cssp = ((double)css/(double)cs*0.1) * 100;
    	iiptp = (((double)iipt/(double)ipt)*0.2)*100;
    	grade = quizp + examp + cssp + iiptp;
    	
    	//quiz
    	if(qq1<q1){
    		records[y][2] = Integer.toString(qq1);
    	}
    	else{
    		JOptionPane.showMessageDialog(null,"invalid input");
    	}
    	
    	records[y][3] = Integer.toString(qq2);
    	records[y][4] = Integer.toString(qq3);
    	records[y][5] = Integer.toString(qq1+qq2+qq3);
    	records[y][6] = String.format("%.2f",quizp);
    					
    	//exam
    	records[y][7] = Integer.toString(ee);
    	records[y][8] = String.format("%.2f",examp);
    	//ipt
    	records[y][9] = Integer.toString(iipt);
    	records[y][10] = String.format("%.2f",iiptp);
    	//class Standing
    	records[y][11] = Integer.toString(css);
    	records[y][12] = String.format("%.2f",cssp);
    	//grade
    	records[y][13] = String.format("%.2f",grade);
    	if(grade>=75){
    		records[y][14] = "Passed";
    	}
    	else{
    		records[y][14] = "Failed";
    	}	
    }
}