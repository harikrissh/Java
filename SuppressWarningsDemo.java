package AnnotationsDemo;

import java.util.*;
class SuppressWarningsDemo{
	@SuppressWarnings({"unchecked", "rawtypes"})// remove this line to see warnings
	public static void main(String[] args){
		List list=new ArrayList();
		list.add("100");
		list.add(500.0);
		list.add('A');
		for(Object obj:list){
			System.out.println(obj);
		}
	}
}