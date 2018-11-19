package iki;

public class bisiklet{

  //bisiklet nesnesinin stateleri
  int current_gear;
  int current_speed;

  //bisiklet nesnesinin behaviorlari
  void change_gear(int value){
    current_gear=value;
  }

  void change_speed(int value){
    current_speed=value;
  }

  void brake(){
    current_speed=0;
  }
  
}