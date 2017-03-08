package com.mkt.mytest.admin.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TestClass {
	static  Map<Long,Long> map=new HashMap();
	public static void main(String[] args) {
		String line="10 20 30";
		String[] ss=line.split(" ");
		long[] a=new long[ss.length];
		for(int i=0;i<ss.length;i++){
			a[i]=Long.parseLong(ss[i]);
		}
		
		 Map map=createValueMap(a);
		 ArrayList<ArrayList<Long>>out=new TestClass().subsets(a);
		 long count=0;
		 for(ArrayList<Long> o:out){
		  long value=getMax(o, map);
		  count=count+value;
		 }
		  
		 long v= 1000000000+7;
		System.out.println(1%v);
		System.out.println(v);
		 System.out.println(count);
		}

		static long getMax(ArrayList<Long> a,Map map){
		 long max=0;
		 if(a.size()>0){
		   max=(Long)map.get(a.get(0));
		  for(int i=1;i<a.size();i++){
		   long newValue=(Long)map.get(a.get(i));
		   if(max<newValue){
		    max=newValue;
		   }
		  }
		 }
		 return max;
		}

		static Map createValueMap(long[] a){
		
			long sum = 0;
			long input=0;
		 for(int i=0;i<a.length;i++){
		   sum = 0;
		   input=a[i];
		  while (input != 0) {
			  long lastdigit = input % 10;
		   sum += lastdigit;
		   input /= 10; }
		  
		  map.put(a[i],sum);
		 }
		 return map;
		}

		public ArrayList<ArrayList<Long>> subsets(long[] S) {
		 if (S == null)
		  return null;
		 
		 Arrays.sort(S);
		 
		 ArrayList<ArrayList<Long>> result = new ArrayList<ArrayList<Long>>();
		 
		 for (int i = 0; i < S.length; i++) {
		  ArrayList<ArrayList<Long>> temp = new ArrayList<ArrayList<Long>>();
		  //get sets that are already in result
		  for (ArrayList<Long> a : result) {
		   temp.add(new ArrayList<Long>(a));
		  }
		  //add S[i] to existing sets
		  for (ArrayList<Long> a : temp) {
		   a.add(S[i]);
		  }
		  //add S[i] only as a set
		  ArrayList<Long> single = new ArrayList<Long>();
		  single.add(S[i]);
		  temp.add(single);
		 
		  result.addAll(temp);
		 }
		 //add empty set
		 result.add(new ArrayList<Long>());
		 
		 return result;
		}
}
