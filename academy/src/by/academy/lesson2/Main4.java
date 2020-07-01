package by.academy.lesson2;

public class Main4 {

	  public static void main(String[] args) {
	    int s = 40553455;
	    int sec;
	    int m;
	    int min, h, hrs, d, days, w;
	    sec = s % 60;
	    m = (s - sec) / 60;
	    min = m % 60;
	    h = (m - min) / 60;
	    hrs = h%24;
	    d = (h-hrs)/24;
	    days = d%7;
	    w = (d-days)/7;
	    
	    System.out.println(w + " недель " + days + " дней " + hrs + " часов " + min + " минут " + sec + " секунд");
	  }
	}
