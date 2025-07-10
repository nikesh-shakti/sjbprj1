package sjb.timecomplexity;

public class Sortmain {

	public static void main(String[] args) {
		Sort s=new Sort();
		int[]arr= {5,15,10,25,20};
		int[] a=s.Selectionsort(arr);
		for(int i :a) {
			System.out.println(i);
		}
		 
		
	}

}
