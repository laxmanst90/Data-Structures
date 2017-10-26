package com.datastructures;

public class SelectiveSorting {
	public static int[] selectiveSorting(int [] arr){
		for (int j=0;j<arr.length -1;j++){
			int index=j;
			for (int k=j+1;k<arr.length;k++){
				if(arr[k] < arr[index])
				index=k;
			}
			int smallestNumber=arr[index];
			arr[index]=arr[j];
			arr[j]=smallestNumber;
			
		}
		return arr;
	}
	public static void main(String[] args){
		int [] arr1={10,34,2,56,7,67,88,42};
		int [] arr2=selectiveSorting(arr1);
		for(int i:arr2){
		System.out.print(i);
		System.out.print(", ");
		}
	}
}
