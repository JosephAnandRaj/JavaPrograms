package JavaPrograms;

public class Second_Largest_Number {


   // 	 int[] Marks = {90,100};
    	 int[] Marks = {90,95,98,96,99,75,74,93,94,25,97,100};
    		
	     int firstLargest = Marks[0];
	     int secondLargest = Marks[0]; 

	     

	   
	    public void largest() 
	    {
	    	if(Marks.length<3) {
	    		
	    	  System.out.println("Given Number is less than 3");
	    	  return;
	    		
	    	}
	    		
	    	
	        for(int i=0;i<Marks.length;i++){
	            if(Marks[i]>firstLargest){
	             secondLargest = firstLargest;
	             firstLargest = Marks[i];
	             }
	            
	            else if(Marks[i]!=firstLargest && Marks[i]>secondLargest) {
  	            	 secondLargest = Marks[i];
	            }

	        
	      }	
	    
	        System.out.println("The High Mark is:"+firstLargest);
	        System.out.println("The Second High Mark is:"+secondLargest);

	       }
	       
	    public void smallest(){
	    	
	    	int smallest = Marks[0];
	    	
	        for(int i =1;i<Marks.length;i++){
	            if(Marks[i]<smallest){
	            	smallest = Marks[i];
	            }
	        }
	        System.out.println("The Low Mark is:"+smallest);
	    }
	   

	    
	    public static void main(String[] args) {
	    	Second_Largest_Number m = new Second_Largest_Number();
	        m.largest();
	        m.smallest();
	    }
	}