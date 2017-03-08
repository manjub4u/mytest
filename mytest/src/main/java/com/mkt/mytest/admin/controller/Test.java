package com.mkt.mytest.admin.controller;

import java.util.Scanner;

public class Test {

 public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  int n;
  char[] ch;
  int i=0,count=0,temp=0,tempStar, j=0;
  int tests=in.nextInt();
  boolean test;
  char[] a;
  for(int t=0;t<tests;t++){
   n=in.nextInt();
   a=in.next().toCharArray();
  i=0;count=0;temp=0;tempStar=n+1;j=0;
   test=true;
   boolean found=false,fistloc=true;
   int firstLocation=0;
  while(i<n){
   j=i;
   test=true;
   temp=0;
   found=false;
   while(j<n && test==true){    
    if(isVowel(a[j])){
     if(temp==0){
      if(fistloc){
       firstLocation=j;
       fistloc=false;
      }
      tempStar=j;
     }
     temp++;
     if(temp==3){
      temp=j+1;
      while(temp<n&& !isVowel(a[temp])){
       temp++;
       count++;
      }
      temp=0;
      count++;
      test=false;
      found=true;
     }
   }
    j++;
   }
   if(!found==true){
    tempStar=n+1;
   }
   i=tempStar+1;
  }
 System.out.println(count+firstLocation);
  }
 }
 
 
 public static boolean isVowel(char ch){
       if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
           return true;
       }
       return false;
     }
}