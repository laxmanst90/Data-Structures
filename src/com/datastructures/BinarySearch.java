package com.datastructures;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Find the number 15 from the array
		int[] arr={1,3,4,5,7,9,13,15,16,17,19};
		int[] left;
		int[] right = null;
		int[] leftleft;
		int[]rightright;
		boolean even=false;
		int n=arr.length;
		if (n%2 == 0){
			even = true;
		}
		if (!even){
			for (int i=0;i<n;i++){
				if(15 < arr[n/2 +1]){
					left = new int [n/2 + 1];
					System.out.println("Its in the left array!");
					left[i]=arr[i];
				}else{
					right = new int [n-(n/2+1)];
					System.out.println("Its in the right Array!");
					right[i-n/2]=arr[i];
				}
			}
			for (int j=0;j<right.length;j++){
				if(15 < right[j/2]){
					leftleft = new int[j/2];
					for(int k=0;k<leftleft.length;k++){
						if(15 == leftleft[k]){
							System.out.println("Great Found it!!!!"+leftleft[k]);
						}
					}
				}else{
					rightright=new int[j/2];
				}
			}
			
		}
		

	}

}
