import java.io.*;
public class Registration {
	public static void main(String[] args)throws IOException {
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		  System.out.println("Input current Regstration Number and value of n.Input in capitals");
		  String reg=br.readLine();
		  int n=Integer.parseInt(br.readLine());
		  String newreg="";
		  String[] parts = reg.split(" ");
		  String part1 = parts[0];
		  String part2 = parts[1];
		  char c1=part2.charAt(0);
		  char c2=part2.charAt(1);
		  int part3 =Integer.parseInt(parts[2]);
		  int newpart3;
		  newpart3=part3+n;
		  if(newpart3>9999)
			  {newpart3=newpart3-10000;
			  if(c1=='Z'&&c2=='Z')
			  {System.out.println("Invalid Number");
			  newpart3=9999;}
			  else if(c2=='Z')
			  {c2='A';
			  c1+=1;
			  }
			  else
				  c2+=1;}
		  String newp3;
		  if(newpart3<10)
			  newp3="000"+newpart3;
		  else if(newpart3<100)
			  newp3="00"+newpart3;
		  else
			  newp3="0"+newpart3;
		  newreg=parts[0]+" "+c1+c2+" "+newp3;
		  System.out.println("New registration number is "+newreg);
			}}
		  

