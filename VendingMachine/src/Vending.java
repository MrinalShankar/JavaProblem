import java.io.*;
public class Vending {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Input no of products");
		int n=Integer.parseInt(br.readLine());
		String[] pd = new String[n]; 
		int[] price = new int[n];
		
		System.out.println("Input products name");
		for(int i=0;i<n;i++)
			pd[i]=br.readLine();
		System.out.println("Input price in order");
		for(int i=0;i<n;i++)
			price[i]=Integer.parseInt(br.readLine());
		
		System.out.println("Input no of 1 cent coins");
		int c1=Integer.parseInt(br.readLine());
		System.out.println("Input no of 5 cent coins");
		int c2=Integer.parseInt(br.readLine());
		System.out.println("Input no of 10 cent coins");
		int c3=Integer.parseInt(br.readLine());
		System.out.println("Input no of 25 cent coins");
		int c4=Integer.parseInt(br.readLine());
		int tot;
		tot=c1+c2*5+c3*10+c4*25;
		char ch;
		int c;
		do
		{System.out.println("Enter product code 1-First item 2-Second item and so on");
		 c=Integer.parseInt(br.readLine());
		
		if(tot<price[c-1])
			System.out.println("Insufficient balance");
			
			 
		else
		{tot=tot-price[c-1];
		System.out.println("Selected product:"+pd[c-1]);
		System.out.println("Price:"+price[c-1]);
		System.out.println("Balance Amount:"+tot);
		
		}
		System.out.println("Do you wish to continue? Y/N");
		 ch=(char)br.read();}
		while(ch=='Y'|| ch=='y');
		
		
		

	}

}


