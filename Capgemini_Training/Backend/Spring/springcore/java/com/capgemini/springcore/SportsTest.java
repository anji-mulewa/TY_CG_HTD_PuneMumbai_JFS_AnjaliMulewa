package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.Sports;

public class SportsTest {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("sportsConfig.xml");
	Sports sport = context.getBean("sports", Sports.class);
	
	System.out.println("Sport name = "+sport.getName());
	System.out.println("Total players = "+sport.getNoOfPlayers());
	System.out.println("Team Info = "+sport.getTeamInfo());
}
}
