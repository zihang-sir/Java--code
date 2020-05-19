package cn.dianzi.middle;

public class ArrayMiddle {
	private int []arr1;
	private int []arr2;
	
	public ArrayMiddle(int []arr1,int []arr2) {
		this.arr1=arr1;
		this.arr2=arr2;
	}
	
	public int getUpMedian() {
		if(arr1==null||arr2==null) {
			return -1;
		}
		int l1=0;
		int r1=arr1.length-1;
		int l2=0;
		int r2=arr2.length-1;
		int mid1=0;
		int mid2=0;
		int offset=0;
		//迭代
		while(l1<r1) {
			mid1=l1+(r1-l1)/2;
			mid2=l2+(r2-l2)/2;
			offset=((r1-l1+1)&1)^1;//奇数取0，偶数取1
			if(arr1[mid1]<arr2[mid2]) {
				l1=mid1+offset;
				r2=mid2;
			}else if(arr1[mid1]>arr2[mid2]){
				r1=mid1;
				l2=mid2+offset;
			}else {
				return arr1[mid1];
			}
		}
		return Math.min(arr1[l1], arr2[l2]);
	}
}
