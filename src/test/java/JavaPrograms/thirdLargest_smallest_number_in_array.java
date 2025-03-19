package JavaPrograms;

public class thirdLargest_smallest_number_in_array {


   // 	 int[] Marks = {90,100};
    	 int[] Marks = {90,95,98,96,99,75,74,93,94,25,97,100};
    		
	     int firstLargest = Marks[0];
	     int secondLargest = Marks[0]; 
	     int thirdLargest = Marks[0]; 

	     

	   
	    public void largest() 
	    {
	    	if(Marks.length<3) {
	    		
	    	  System.out.println("Given Number is less than 3");
	    	  return;
	    		
	    	}
	    		
	    	
	        for(int i=0;i<Marks.length;i++){
	            if(Marks[i]>firstLargest){
	             thirdLargest = secondLargest;
	             secondLargest = firstLargest;
	             firstLargest = Marks[i];
	             }
	            
	            else if(Marks[i]!=firstLargest && Marks[i]>secondLargest) {
		             thirdLargest = secondLargest;
  	            	 secondLargest = Marks[i];
	            }
	            else if(Marks[i]!=firstLargest && Marks[i]!=secondLargest &&
	            		Marks[i]>thirdLargest) {
	            thirdLargest = Marks[i];
	        }
	      }	
	    
	        System.out.println("The High Mark is:"+firstLargest);
	        System.out.println("The Second High Mark is:"+secondLargest);
	        System.out.println("The Third High Mark is:"+thirdLargest);

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
	    	thirdLargest_smallest_number_in_array m = new thirdLargest_smallest_number_in_array();
	        m.largest();
	        m.smallest();
	    }
	}