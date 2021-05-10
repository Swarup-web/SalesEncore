import java.util.*;
import java.sql.*;
import java.io.*;
class Methods{
	Connection con=null;
	Methods() {
		try{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/copy";
		String username="root";
		String password="Swarup@2000";
		con=DriverManager.getConnection(url,username,password);
}
		catch(Exception e){
		System.out.println("error"+e);
}
}
	public void showAll() throws Exception{
		String query="select * from customer";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		System.out.println("ID         Name            Address         Hotness	   Model           Color           Date	           Salesman	           Mobile");	
		while(rs.next()){
			System.out.printf("%-10s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %n",rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
}
}
	public void showHotness() throws Exception{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the category of Hotness:");
	System.out.println("1.Warm");
	System.out.println("2.Hot");
	System.out.println("3.Cold");
	int ch=Integer.parseInt(sc.nextLine());
		switch(ch){
			case 1:{
		String query="select * from customer where hotness='warm'";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next()){
			System.out.printf("%-10s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %n",rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
}
			break;
}
			case 2:{
		String query="select * from customer where hotness='hot'";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next()){
			System.out.printf("%-10s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %n",rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
}
			break;
}
			case 3:{
		String query="select * from customer where hotness='cold'";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next()){
			System.out.printf("%-10s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %n",rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
}
			break;
}
			default:{System.out.println("...............MISMATCH CATEGORY OF HOTNESS............");}
}
}
	public void showModel() throws Exception{
	Scanner sc = new Scanner(System.in);
	System.out.println("Please Select the Model:");
	System.out.println("1. Activa 125");
	System.out.println("2. Aviator");
	System.out.println("3. Activa 6g");
	System.out.println("4. Honda Dio");
	System.out.println("5. Grazia");
	System.out.println("6. Honda Froza");
	

	int ch=Integer.parseInt(sc.nextLine());
		switch(ch){
			case 1:{
		String query="select * from customer where model='Activa 125'";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next()){
			System.out.printf("%-10s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %n",rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
}
			break;
}
			case 2:{
		String query="select * from customer where model='Aviator'";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next()){
			System.out.printf("%-10s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %n",rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
}
			break;
}
			case 3:{
		String query="select * from customer where model='Activa 6g'";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next()){
			System.out.printf("%-10s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %n",rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
}
			break;
}
			case 4:{
		String query="select * from customer where model='Honda Dio'";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next()){
			System.out.printf("%-10s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %n",rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
}
			break;
}

			case 5:{
		String query="select * from customer where model='Grazia'";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next()){
			System.out.printf("%-10s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %n",rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
}
			break;
}

			case 6:{
		String query="select * from customer where model='Honda Froza'";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next()){
			System.out.printf("%-10s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %n",rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
}
			break;
}
			default:{System.out.println("Wrong");}
}	
}
	public void showDate() throws Exception{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Date:");
	String date=sc.nextLine();
	String query="select * from customer where Date='"+date+"'";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		boolean status=false;
		while(rs.next()){
			if(rs.getString(7).equals(date)){status=true;
			System.out.printf("%-10s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %n",rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
}
}
			if(status==false){
				System.out.println("Not Found");
}
}
	public void showSalePerson() throws Exception{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Name of the Staff: ");
	String n=sc.nextLine();
	String query="select * from customer where Salesman='"+n+"'";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		boolean status=false;
		while(rs.next()){
			status=true;
			System.out.printf("%-10s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %n",rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
}
		if(status==false){
			System.out.println("!!!!!!!!!!!!Entered Wrong Name!!!!!!!!!!!!!!");}			
}
	public void addSalePerson() throws Exception {

		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Id:");
		int id=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Name:");
		String name=sc.nextLine();
		System.out.print("Enter Phone:");
		String phone=sc.nextLine();
		System.out.print("Enter Email:");
		String email=sc.nextLine();
		System.out.print("Enter Address:");
		String address=sc.nextLine();
		System.out.print("Enter Status:");
		String status=sc.nextLine();
		System.out.print("Enter Password:");
		String pass=sc.nextLine();
		String query="insert into agent values("+id+",'"+name+"','"+phone+"','"+email+"','"+address+"','"+status+"','"+pass+"')";
		PreparedStatement pst=con.prepareStatement(query);
		Statement st=con.createStatement();
		int res=st.executeUpdate(query);
		if(res>0){
			System.out.println("Added Successfully");
	}
		else{	
			System.out.println("Failed");
}
}
	public void status() throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Id :");
		int id=Integer.parseInt(sc.nextLine());
		System.out.println("Please Select - 1.Activate   2.Deactivate   3.exit");
		int ch=Integer.parseInt(sc.nextLine());
		switch(ch){
	case 1:{ 
		String query="update agent set Active='Y' where ID="+id+"";
		Statement st=con.createStatement();
		int res=st.executeUpdate(query);
		if(res>0){
			System.out.println("Agent Activated");
	}
		else{	
			System.out.println("Failed");
}
	break;
}
	case 2:{ 
		String query="update agent set Active='N' where ID="+id+"";
		Statement st=con.createStatement();
		int res=st.executeUpdate(query);
		if(res>0){
			System.out.println("Agent Deactivated");
	}
		else{	
			System.out.println("Failed");
}
	break;
}
	case 3:{return;}
}
}
	public void deleteUser() throws Exception {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter ID :");
		int id=Integer.parseInt(sc.nextLine());
		String query="delete from customer where ID="+id;
		Statement st=con.createStatement();
		int res=st.executeUpdate(query);
		if(res>0){
			System.out.println("Deleted");
	}
		else{	
			System.out.println("Failed");
}
}
	public void change(String e,String p) throws Exception{
		Scanner sc2 = new Scanner(System.in);
		String query="select * from admin";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		boolean status=false;
		while(rs.next()){
			if(rs.getString(3).equals(e) && rs.getString(4).equals(p)){
				status=true;
}
}
	if(status==true){
	System.out.println("New Password:");
	String pass=sc2.nextLine();
	String query1="update admin set Password='"+pass+"' where ID=1";
	int res=st.executeUpdate(query1);
		if(res>0){
			System.out.println("Data Updated");
	}
}
	else{
	System.out.println("Wrong Email or Password");
}
}
	public void filter() throws Exception{
		System.out.println("Type of Filter");
		System.out.println("1.By Hotness");
		System.out.println("2.By Model");
		System.out.println("3.By Date");
		System.out.println("4.By Employee");
		System.out.println("5.Exit");
		Scanner scc=new Scanner(System.in);
		int ch=Integer.parseInt(scc.nextLine());
	switch(ch){
		case 1: showHotness();
		break;
		case 2: showModel();
		break;
		case 3: showDate();
		break;
		case 4: showSalePerson();
		break;
		case 5: return;
}
}

	public void admin() throws Exception{
	while(true){
		System.out.println("******************ADMIN*****************");
		System.out.println("1.Show Records of Customers");
		System.out.println("2.Show By Filter");
		System.out.println("3.Add Employee");
		System.out.println("4.Deactivate/Activate Account");
		System.out.println("5.Delete Customer Details");
		System.out.println("6.Change Password");
		System.out.println("7.Exit");
		Scanner cc=new Scanner(System.in);
		int ch=Integer.parseInt(cc.nextLine());
		switch(ch){
	case 1:showAll();
	break;
	case 2:filter();
	break;
	case 3:addSalePerson();
	break;
	case 4:status();
	break;
	case 5:deleteUser();
	break;
	case 6:{System.out.print("Enter Email:");
		String email=cc.nextLine();
		System.out.print("Enter Password:");
		String pass=cc.nextLine();
		change(email,pass);
		}
	case 7:return;
}
	if(ch==7)
	break;
}		
}
public void updateUser() throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Id:");
		int id=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Name:");
		String name=sc.nextLine();
		System.out.print("Enter Phone:");
		String phone=sc.nextLine();
		System.out.print("Enter Hotness:");
		String hotness=sc.nextLine();
		System.out.print("Enter Address:");
		String address=sc.nextLine();
		System.out.print("Enter Model:");
		String model=sc.nextLine();
		System.out.print("Enter Color:");
		String color=sc.nextLine();
		System.out.print("Enter Date:");
		String date=sc.nextLine();
		System.out.print("Sell By:");
		String by=sc.nextLine();
		String query="insert into customer values("+id+",'"+name+"','"+address+"','"+hotness+"','"+model+"','"+color+"','"+date+"','"+by+"','"+phone+"')";
		PreparedStatement pst=con.prepareStatement(query);
		Statement st=con.createStatement();
		int res=st.executeUpdate(query);
		if(res>0){
			System.out.println("Added Successfully");
	}
		else{	
			System.out.println("Failed");
}
	}
		
public void updateCustomerHotness() throws Exception{

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter customer ID:" );
		int id=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Hotness:" );
		String hotness=sc.nextLine();
		
		String query="update customer set Hotness='"+hotness+"' where ID='"+id+"'";
		Statement st=con.createStatement();
		int result=st.executeUpdate(query);
		if(result>0){
			System.out.println("Update Successful");}
		else{
			System.out.println("Update Fail");}
	}
public void updateCustomerModel() throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter customer ID:" );
		int id=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Model:" );
		String model=sc.nextLine();

	String query="update customer set Model='"+model+"' where ID='"+id+"'";
		Statement st=con.createStatement();
		int result=st.executeUpdate(query);
		if(result>0){
			System.out.println("Update Successful");}
		else{
			System.out.println("Update Fail");}
		
}
public void updateCustomerColor() throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter customer ID:" );
		int id=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Color:" );
		String color=sc.nextLine();

	String query="update user set Color='"+color+"' where ID='"+id+"'";
		Statement st=con.createStatement();
		int result=st.executeUpdate(query);
		if(result>0){
			System.out.println("Update Successful");}
		else{
			System.out.println("Update Fail");}
}
public void updateCustomerPhone() throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter customer ID:" );
		int id=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Phone:" );
		String phone=sc.nextLine();

	String query="update customer set Mobile='"+phone+"' where ID='"+id+"'";
		Statement st=con.createStatement();
		int result=st.executeUpdate(query);
		if(result>0){
			System.out.println("Update Successful");}
		else{
			System.out.println("Update Fail");}
}

public void updateAgentPassword() throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter agent ID:" );
		int id=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Password:" );
		String pass=sc.nextLine();

	String query="update agent set Password='"+pass+"' where ID='"+id+"'";
		Statement st=con.createStatement();
		int result=st.executeUpdate(query);
		if(result>0){
			System.out.println("Update Successful");}
		else{
			System.out.println("Update Fail");}
}

public void updateAgentPhone() throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter agent ID:" );
		int id=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Phone:" );
		String phone=sc.nextLine();

	String query="update agent set Phone='"+phone+"' where ID='"+id+"'";
		Statement st=con.createStatement();
		int result=st.executeUpdate(query);
		if(result>0){
			System.out.println("Update Successful");}
		else{
			System.out.println("Update Fail");}
}
public void updater() throws Exception{
		System.out.println("Type of Update");
		System.out.println("1.Update Hotness");
		System.out.println("2.Update Model");
		System.out.println("3.Update Color");
		System.out.println("4.Update Mobile");
		System.out.println("5.Exit");
		Scanner scc=new Scanner(System.in);
		int ch=Integer.parseInt(scc.nextLine());
	switch(ch){
		case 1: updateCustomerHotness();
		break;
		case 2: updateCustomerModel();
		break;
		case 3: updateCustomerColor();
		break;
		case 4: updateCustomerPhone();
		break;
		case 5: return;
}
}

public void agent() throws Exception{
	while(true){
		System.out.println("______________Select from Menu__________");
		System.out.println("1.Add Customer Details");
		System.out.println("2.Update Customer Data");
		System.out.println("3.Show Records for Customer");			
		System.out.println("4.Change Password");
		System.out.println("5.Change Mobile");
		System.out.println("6.Exit");
		Scanner sc=new Scanner(System.in);
		int ch=Integer.parseInt(sc.nextLine());	
		switch(ch){
	case 1:updateUser();
	break;
	case 2:updater();
	break;
	case 3:showAll();
	break;
	case 4:updateAgentPassword();
	break;
	case 5:updateAgentPhone();
	break;
	case 6:return;
}
	if(ch==6)
	break;
}		
}
void register() throws Exception {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Select the Type of Registration");
		System.out.println("1.Register Agents 	2.Register Admin");
		int ch=Integer.parseInt(sc.nextLine());
		switch(ch){
		
	case 1:{ 
		System.out.print("Enter Id:");
		int id=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Name:");
		String name=sc.nextLine();
		System.out.print("Enter Phone:");
		String phone=sc.nextLine();
		System.out.print("Enter Email:");
		String email=sc.nextLine();
		System.out.print("Enter Address:");
		String address=sc.nextLine();
		System.out.print("Enter Status:");
		String status=sc.nextLine();
		System.out.print("Enter Password:");
		String pass=sc.nextLine();
		String query="insert into agent values("+id+",'"+name+"','"+phone+"','"+email+"','"+address+"','"+status+"','"+pass+"')";
		PreparedStatement pst=con.prepareStatement(query);
		Statement st=con.createStatement();
		int res=st.executeUpdate(query);
		if(res>0){
			System.out.println("Added Successfully");
	}
		else{	
			System.out.println("Failed");
}
	break;
}
	case 2:{ System.out.println("Enter Id:");
		 int id=Integer.parseInt(sc.nextLine());
		 System.out.println("Enter Name:");
		 String name=sc.nextLine();
		 System.out.println("Enter Email:");
		 String email=sc.nextLine();
		 System.out.println("Enter Password:");
		 String pass=sc.nextLine();	
		 String query="insert into admin values("+id+",'"+name+"','"+email+"','"+pass+"')";
		 PreparedStatement pst=con.prepareStatement(query);
		 Statement st=con.createStatement();
		 int res=st.executeUpdate(query);
		 if(res>0){
			System.out.println("Added Successfully");
	}
		 else{	
			System.out.println("Failed");
}
	break;
}
	default:System.out.println("Wrong Selection");
}
}

void login() throws Exception{
		System.out.println("Please Login");
		System.out.print("Email:");		
		Scanner sc = new Scanner(System.in);
		String email=sc.nextLine();
		System.out.print("Password:"); 
		String pass=sc.nextLine(); 
		String query="select * from agent";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		boolean status=false;
		String query1="select * from admin";
		Statement st1=con.createStatement();
		ResultSet rs1=st1.executeQuery(query1);
		boolean status1=false;
		while(rs.next()){
			if(rs.getString(4).equals(email) && rs.getString(7).equals(pass)){
				status=true;
}
}
		while(rs1.next()){
			if(rs1.getString(3).equals(email) && rs1.getString(4).equals(pass)){
				status1=true;
}
}	
	if(status==true){
	System.out.println("Logged IN");
	agent();
	
}
	if(status1==true){
	System.out.println("Logged IN");
	admin();
}
	else if(status==false && status1==false){ System.out.println("Not Found");
}
}
}
class Start{
	public static void main(String[] args)throws Exception{
	System.out.println("Welcome To HONDA ");
	Methods o = new Methods();
	Scanner sc=new Scanner(System.in);
	System.out.println("\t1.Press 1 to Login	2.Pess 2 for Registration");
	int c=Integer.parseInt(sc.nextLine());
	switch(c){
	
	case 1:o.login();
	break;
	case 2:o.register();
	break;
	default:System.out.println("Wrong Selection");
}
	}
}
