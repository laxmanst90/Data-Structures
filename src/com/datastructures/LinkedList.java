package com.datastructures;

import java.util.Collections;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.LinkedList<Integer> objLinkedList = new java.util.LinkedList<Integer>();
		objLinkedList.add(15);
		objLinkedList.add(2);
		objLinkedList.add(1);
		java.util.LinkedList<Integer> objLinkedList1 = new java.util.LinkedList<Integer>();
		objLinkedList1.add(105);
		objLinkedList1.add(20);
		objLinkedList1.add(11);
		java.util.LinkedList<Integer> objLinkedList2 = new java.util.LinkedList<Integer>();
		//objLinkedList2.addAll(objLinkedList);
		//objLinkedList2.addAll(objLinkedList1);
		for(int i=0;i<objLinkedList.size();i++){
			for(int j=i;j<objLinkedList2.size();j++){
			if(objLinkedList.get(j) < objLinkedList1.get(j)){
				objLinkedList2.add(objLinkedList.get(j));
			}
			}
			
		}
		System.out.println(objLinkedList2);
		
	}

}
