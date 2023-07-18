package mvs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class controller {
	Scanner sc = new Scanner(System.in);
	view view = new view();
	public void displaytask(ArrayList<model> modellist) {
		view.displaytasks(modellist);
	}
	public void createtask(ArrayList<model> modellist) {
		System.out.println("Enter new task");
		String s = sc.nextLine();
		String d = sc.nextLine();
		int p = sc.nextInt();
		sc.nextLine();
		String e =sc.nextLine();
		modellist.add(new model(s,d,p,e));
		view.displaytasks(modellist);
		}
	public void updatetask(ArrayList<model> modellist) {
		// TODO Auto-generated method stub
		System.out.println("Enter update task details");
		String s1=sc.nextLine();
		view.updatetasks(s1,modellist);

	}
}
