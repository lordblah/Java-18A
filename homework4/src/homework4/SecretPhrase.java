package fsadf;

import java.util.Scanner;
public class SecretPhrase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//game state
		boolean innerGame = true;
		
		//messages
		StringBuilder secrectPharse = new StringBuilder("aperture science");
		StringBuilder codedPhase = new StringBuilder("aper*ure sc*ence");
	
		
		//display welcoming message
		System.out.println("\r\n" + 
				"                                    __           .__                                \r\n" + 
				"  ______ ____   ___________   _____/  |_  ______ |  |______________    ______ ____  \r\n" + 
				" /  ___// __ \\_/ ___\\_  __ \\_/ __ \\   __\\ \\____ \\|  |  \\_  __ \\__  \\  /  ___// __ \\ \r\n" + 
				" \\___ \\\\  ___/\\  \\___|  | \\/\\  ___/|  |   |  |_> >   Y  \\  | \\// __ \\_\\___ \\\\  ___/ \r\n" + 
				"/____  >\\___  >\\___  >__|    \\___  >__|   |   __/|___|  /__|  (____  /____  >\\___  >\r\n" + 
				"     \\/     \\/     \\/            \\/       |__|        \\/           \\/     \\/     \\/ \r\n" + 
				"");
		
		System.out.println("THe goal of this game is to figure out the coded phase.");
		System.out.println("THe Phase is " + codedPhase);
		
		do {
		//input 
		Scanner input = new Scanner(System.in);
	    System.out.print("Please enter a letter, that you think is missing.");
	    char userInput = input.next().charAt(0);
	    
	    char testChar = secrectPharse.charAt(4);
	    switch(userInput) {
	    	case 't':
	    		System.out.println("That was a correct guess");
		    	codedPhase.setCharAt(4,'t');
	    		break;
	    	case 'i':
	    		System.out.println("That was a correct guess");
		    	codedPhase.setCharAt(11,'i');
	    		break;
	    	default:
	    		System.out.println("Sorry that was a wrong guess");
	    if((codedPhase.equals(secrectPharse))) 
	    	{
	    	innerGame = false;
	    	}
	    
	    }
	    System.out.println(codedPhase.length() + "   " + secrectPharse.length());
	    //print out phase
	    System.out.println("\n\n\n" +"THe Phase is " + codedPhase);
	    
	    //winnging statement
		}while(innerGame);
		 //winnging statement
	    System.out.println("__/\\\\\\________/\\\\\\_____________________________________________________________________________________        \r\n" + 
	    		" _\\///\\\\\\____/\\\\\\/______________________________________________________________________________________       \r\n" + 
	    		"  ___\\///\\\\\\/\\\\\\/________________________________________________________________________________________      \r\n" + 
	    		"   _____\\///\\\\\\/__________/\\\\\\\\\\_____/\\\\\\____/\\\\\\____________/\\\\____/\\\\___/\\\\_____/\\\\\\\\\\_____/\\\\/\\\\\\\\\\\\___     \r\n" + 
	    		"    _______\\/\\\\\\_________/\\\\\\///\\\\\\__\\/\\\\\\___\\/\\\\\\___________\\/\\\\\\__/\\\\\\\\_/\\\\\\___/\\\\\\///\\\\\\__\\/\\\\\\////\\\\\\__    \r\n" + 
	    		"     _______\\/\\\\\\________/\\\\\\__\\//\\\\\\_\\/\\\\\\___\\/\\\\\\___________\\//\\\\\\/\\\\\\\\\\/\\\\\\___/\\\\\\__\\//\\\\\\_\\/\\\\\\__\\//\\\\\\_   \r\n" + 
	    		"      _______\\/\\\\\\_______\\//\\\\\\__/\\\\\\__\\/\\\\\\___\\/\\\\\\____________\\//\\\\\\\\\\/\\\\\\\\\\___\\//\\\\\\__/\\\\\\__\\/\\\\\\___\\/\\\\\\_  \r\n" + 
	    		"       _______\\/\\\\\\________\\///\\\\\\\\\\/___\\//\\\\\\\\\\\\\\\\\\______________\\//\\\\\\\\//\\\\\\_____\\///\\\\\\\\\\/___\\/\\\\\\___\\/\\\\\\_ \r\n" + 
	    		"        _______\\///___________\\/////______\\/////////________________\\///__\\///________\\/////_____\\///____\\///__");

	}

}
