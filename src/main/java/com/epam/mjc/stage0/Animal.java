package com.epam.mjc.stage0;

public class Animal {
 private String color;
 private int numberOfPaws;
 private boolean hasFur;
 public Animal(String color,int numberOfPaws,boolean hasFur){
  this.color=color;
  this.numberOfPaws=numberOfPaws;
  this.hasFur=hasFur;} 
 public String getDescription(){
  String x;
  String y;
  if(numberOfPaws==1){
   x="paw";
  }else{
   x="paws";} 
  if(hasFur==true){
   y="a";
  }else{
   y="no";} 
  String description="This animal is mostly "+color+". It has "+numberOfPaws+" "+x+" and "+y+" fur."; 
  return description;
 } 
}
