package queueinter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class detailspanel {
	public static Queue<Candidate> candiates=new LinkedList<>();
	static ArrayList<Integer> mark1=new ArrayList<>();
	public static Queue<Candidate> interviewer2=new LinkedList<>();
	static ArrayList<Integer> mark2=new ArrayList<>();
	static int count=0;
	public static void main(String[] args) {
		 int choice;
		do {
		 Scanner sc=new Scanner(System.in);		
		    System.out.println("1.Enter candidate detail:");
		    System.out.println("2.view all Candidate marks");
		    System.out.println("3.High score Candidate:");
		     choice=sc.nextInt();	
		     sc.nextLine();
          switch(choice)
          {
          case 1:
        	  detailsadd();
        	  break;
          case 2:
        	  viewmarks();
        	  break;
          case 3:
        	  int i;        	 
        	  int[] add=new int[count];
        	  for(i=0;i<count;i++) {
        	  add[i]=mark1.get(i)+mark2.get(i);       	 
        	  }
        	  Arrays.sort(add);
  	        System.out.println("Interview process completed.\n Results:");
  	      for (int k=0;k<count;k++) {
  	        if (mark1.get(k) + mark2.get(k) == add[add.length-1]) {
  	            System.out.println("Candidate Name: " + ((LinkedList<Candidate>)interviewer2).get(k).getName());
  	            break; 
  	        }
  	    }
  	        System.out.println("Candidate with the highest total score: " + add[add.length-1]);
        	  break;
          }
		}while(choice!=0);        
	}
	public static void detailsadd() {		
		 Scanner sc=new Scanner(System.in);			 
		System.out.println("Enter Interviwer Id 141 or 142:");
		 int id=sc.nextInt();
		 sc.nextLine();
		 if(id==141) {		
			 for(int n=1;n<=5;n++) {
			 System.out.println("Enter "+n+" canditate name");			
			 candiates.add(new Candidate(sc.nextLine()));
			 System.out.println("Enter "+n+" canditate Mark");			
			 mark1.add(sc.nextInt());
			 count++;
			 sc.nextLine();
			 System.out.println("Successfully updated candidate mark.");
			 System.out.println("1.you want to updated more candidate mark. \n 2.Exit");
			 int nextstep=sc.nextInt();
			 sc.nextLine();
			 if(nextstep==2) {				
				 break;
			 }
			 }			
		 }
		 else if(id==142) {		
			 for(int n=1;n<=5;n++) {
				 System.out.println("Enter "+n+" canditate name");			 			
			 interviewer2.add(new Candidate(sc.nextLine()));
			 System.out.println("Enter "+n+" canditate Mark");
			 mark2.add(sc.nextInt());			 
			 sc.nextLine();
			 System.out.println("Successfully updated candidate mark.");
			 System.out.println("1.you want to updated more candidate mark. \n 2.Exit");
			 int nextstep=sc.nextInt();
			 sc.nextLine();
			 if(nextstep==2) {				
				 break;
			 }
			 }		 
		 }
		 else {
			 System.out.println("Enter valid interviwer Id");
		 }
	}
	public static void viewmarks() {
		System.out.println("Interviwer 141 reviews:");
		int i=0;
		 for (Candidate candidate : candiates) {	              
             System.out.println("Candidate Name:"+candidate.getName());          
            	 System.out.println(mark1.get(i));
             i++;       
             if(i==5) {
            	break; 
             }
		  }		 
		 System.out.println("Interviwer 142 reviews:");
		 int j=0;
		 for (Candidate candidate : interviewer2) {	              
             System.out.println("Candidate Name:"+candidate.getName());           
            	 System.out.println(mark2.get(j));
            	 j++;     
            	  if(j==5) {
                  	break; 
                   }
		  }
	}	
}
