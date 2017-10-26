package com.datastructures;

public class MergeSort {
	public static void main(String[] args){
		int[] arr={10,34,2,56,7,67,88,42};
		int[] result=mergeSorting(arr);
		System.out.println(result);
	}
	
	public static int[] mergeSorting(int[] arr){
		//int[] arr={10,34,2,56,7,67,88,42};
		int[] left;
		int[] right;
		int n= arr.length;
		if(n%2 == 0){
			left = new int[n/2];
			right = new int[n/2];
		}else{
			left = new int[n/2];
			right= new int[n/2 +1];
		}
		
		//lets populate left and right splitted arrays
		for (int i=0;i<n;i++){
			if(i < n/2){
				left[i] = arr[i];
			}else{
				right[i-n/2]=arr[i];
			}
		}
		
		int leftSize=left.length;
		int rightSize=right.length;
		
		
		
		left = mergeSorting(left);
		right = mergeSorting(right);
		
		return merge(left,right);
	}

	private static int[] merge(int[] left, int[] right) {
		// TODO Auto-generated method stub
		
		int result[] = new int[left.length+right.length];
		int i=0;
		int j=0;
		int index=0;
while(i < left.length && j < right.length){
	if(left[i] < right[i]){
		result[index]=left[i];
		index=index+1;
		i=i+1;
	}
	else{
		result[index]=right[i];
		index=index+1;
		i=i+1;
	}
}
// add every leftover element from left and right
while(i < left.length){
	result[index]=left[i];
	index=index+1;
	i=i+1;
}
while(i < right.length){
	result[index]=right[i];
	index=index+1;
	i=i+1;
}
		
		return result;
	}
}
