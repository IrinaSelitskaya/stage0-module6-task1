package com.epam.mjc.stage0;

public class Bird extends Animal{
 private String color;
 private int numberOfPaws;
 private boolean hasFur;
 public Bird(){
  super("",0,false);
  color="blue";
  numberOfPaws=2;
  hasFur=false;
 }
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
  String description="This animal is mostly "+color+". It has "+numberOfPaws+" "+x+" and "+y+" fur. Moreover, it has 2 wings and can fly."; 
  return description;
 } 
 public static void main(String[] args){
  Bird bird=new Bird();
  System.out.println(bird.getDescription());
 }
} 
