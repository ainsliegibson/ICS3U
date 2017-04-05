package fORBES;


/**
 * HelloConsole.java
 * This program 
 * February 24, 2017
 * @author Ainslie Forbes
 */
import hsa_new.Console;
public class HelloConsole {

	public static void main(String[] args) {
		Console c = new Console();
		String name; 
		c.println("Please entre your name."); 
		name = c.readString();
		c.println("Wow! " + name + " is such a nice name.");

	}

}
