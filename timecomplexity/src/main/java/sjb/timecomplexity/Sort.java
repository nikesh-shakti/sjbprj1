package sjb.timecomplexity;

public class Sort {
	public int[] Selectionsort(int[] arr) {
		int n=arr.length-1;
		for(int i=0;i<=
					n-1;i++) {
			
			int minindex=i;
			for(int j=i+1;j<=n;j++) {
				
				if(arr[j]<arr[minindex])
					minindex=j;
			}
			int temp=arr[i];
			arr[i]=arr[minindex];
			arr[minindex]=temp;
			
					
			
		}
		return arr;
	}
}
