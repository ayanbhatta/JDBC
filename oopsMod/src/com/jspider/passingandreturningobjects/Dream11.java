package com.jspider.passingandreturningobjects;

import java.util.Scanner;

public class Dream11 {
	static void displayPlayerDetails(Player p) {
		System.out.println("Player Jersey Number " + p.jerseyNumber);
		System.out.println("Player name " + p.name);
	}
	static Player createPlayer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter jersey number ");
		int jerseyNumber = sc.nextInt();
		System.out.println("Enter Player Name ");
		String name = sc.next();
		Player p = new Player(jerseyNumber, name);
		return p;
	}
}
