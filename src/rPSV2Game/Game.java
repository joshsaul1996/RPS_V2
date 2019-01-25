package rPSV2Game;

import java.util.Random;
import java.util.Scanner;

public class Game implements Comparator{
	
	public static void main(String[] args){
		int p1h;
		do {
		p1h=human();
		
		int c1h=computer();
		 
		System.out.print(playerChoice(p1h,c1h));
		}while (p1h < 4);
		System.out.println("Thanks");
	}
		
		

	public static int human(){
		int h;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 1 for paper, 2 for scissors and1 3 for rock or 4 to exit");
		h = sc.nextInt();
		sc.close();
		return h;}
		
		
	public static int computer() {
		Random rnd = new Random();
		int cm = rnd.nextInt (3)+1;
		return cm;
		}
	
	public int result(p1h,c1h) {
		
	}
	

}
