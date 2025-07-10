package sjb.timecomplexity;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	search s=new search();
//    	int[]arr= {10,20,30,40,50};
//    	System.out.println(s.linearsearch(arr,30));
    	
    	Bsearch b=new Bsearch();
    	int[] array= {10,20,30,40,50,60,70,80};
    	int ele=80;
    	
    	System.out.println(b.binarysearch(array, ele));
    	
    }
}
