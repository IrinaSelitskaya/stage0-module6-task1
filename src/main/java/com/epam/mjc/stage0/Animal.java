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
  String description;
  if(hasFur==true){
   description="This animal is mostly "+color+". It has "+numberOfPaws+" paws and a fur.";
  }else{
   description="This animal is mostly "+color+". It has "+numberOfPaws+" paws and no fur.";} 
  return description;
 } 
}
