package mvs;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
				ArrayList<model> obj = new ArrayList<>();
				obj.add(new model("work","studying",1,"halfcompleted"));
				obj.add(new model("work1","playing",2,"fullcompleted"));
				controller c1 = new controller();
				System.out.println("DIsplaying current tasks");
				c1.displaytask(obj);
				while(true) {
				int s = sc.nextInt();
				if(s==1)
				{
					c1.createtask(obj);
				}
				else if(s==2)
				{
					c1.updatetask(obj);
				}
				}
				
	}

	

}
