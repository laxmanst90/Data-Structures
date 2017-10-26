package com.datastructures;

import java.util.Arrays;

public class BubleSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]={4,9,7,1,3,6,5};
int n=arr.length;
boolean swapped;
do{
	swapped=false;
	for (int i=0;i<n-1;i++){
		if(arr[i] > arr[i+1]){
			int tmp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=tmp;
			swapped=true;
		}
	}
}while (swapped == true);
	System.out.println(Arrays.toString(arr));
	}

}
