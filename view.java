package mvs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class view {
	 public void displaytasks(List<model> modellist)
	  {  
		  for(model m:modellist)
		  {
		  System.out.println(m.getTitle());
		  System.out.println(m.getCompletionstatus());
		  System.out.println(m.getDescription());
		  System.out.println(m.getPrioritylevel());
		  }
		  
			  
	  }
	  /*public model createtask() {
		  Scanner sc = new Scanner(System.in);
		  
		return model;
		  
	  }*/
	 Scanner sc = new Scanner(System.in);

	public void updatetasks(String s1, ArrayList<model> modellist) {
		// TODO Auto-generated method stub
		System.out.println("It enters into view class");
		for(model m:modellist)
		{
			if(m.getTitle().equals(s1)) {
				System.out.println("Enter new title");
				 String newTitle = sc.nextLine();
		            System.out.println("Enter new description:");
		            String newDescription = sc.nextLine();
		            System.out.println("Enter new priority level:");
		            int newPriorityLevel = sc.nextInt();
		            sc.nextLine(); // consume newline character
		            System.out.println("Enter new completion status:");
		            String newCompletionStatus = sc.nextLine();
		            m.setTitle(newTitle);
		            m.setDescription(newDescription);
		            m.setPrioritylevel(newPriorityLevel);
		            m.setCompletionstatus(newCompletionStatus);
		            break;
			}
			

		}
		System.out.println("above method is not working");
		view view = new view();
		view.displaytasks(modellist);
	}
}
