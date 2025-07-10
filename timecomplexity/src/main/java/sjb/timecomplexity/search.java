package sjb.timecomplexity;

public class search {
	public int linearsearch(int[] array,int element) {
		for(int i=0;i<array.length;i++) {
			if(array[i]==element) {
				return i;
		}
	}
		return -1;

}
}



