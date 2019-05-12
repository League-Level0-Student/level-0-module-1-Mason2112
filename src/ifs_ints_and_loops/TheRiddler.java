package ifs_ints_and_loops;

import java.nio.channels.ShutdownChannelGroupException;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer=JOptionPane.showInputDialog("Who makes it, has no need of it.\r\n" + 
		"Who buys it, has no use for it. \r\n" + 
		"Who uses it can neither see nor feel it. \r\n" + 
		"What is it?");

		


// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (answer.equals("coffin")) {
	JOptionPane.showMessageDialog(null, "correct");
 score++;
}
		// 5. Otherwise, say "wrong" and tell them the answer

	
 else {
JOptionPane.showMessageDialog(null, "wrong");
JOptionPane.showMessageDialog(null, "coffin");

;
}
		// 6. Add some more riddles
String answer2=JOptionPane.showInputDialog(null, "I'm tall when I'm young and I'm short when I'm old. What am I?");
if (answer.equals("a candle")) {
	JOptionPane.showMessageDialog(null, "correct");
	score++;
	
} 
else {
	JOptionPane.showMessageDialog(null, "wrong");
	JOptionPane.showMessageDialog(null, "a candle");
}


		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, score);
}
}	
	

