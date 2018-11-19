package iki;

public class main{
  public static void main(String arg[]){
    bisiklet my_bycle = new bisiklet();
    my_bycle.current_gear=1;
    my_bycle.current_speed=20;

    System.out.println("suan ki vites=" + my_bycle.current_gear);
    System.out.println("suan ki hiz=" + my_bycle.current_speed);

    my_bycle.change_gear(2);
    my_bycle.change_speed(40);

    System.out.println("suan ki vites=" + my_bycle.current_gear);
    System.out.println("suan ki hiz=" + my_bycle.current_speed);
    
  }
}