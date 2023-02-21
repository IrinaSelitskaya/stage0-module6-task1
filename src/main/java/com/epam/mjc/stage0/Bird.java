package com.epam.mjc.stage0;

public class Bird extends Animal{
 public Bird(){
  super("blue",2,false);
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
}
