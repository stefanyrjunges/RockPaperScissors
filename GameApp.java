import javax.swing.*;

public class GameApp{

	public static void main (String args[]){

		String userChoice;
		int computerChoice, choice;

		Game myGame = new Game();

		do {

		computerChoice = (int) (Math.random() * 3) + 1;

		userChoice = JOptionPane.showInputDialog(null, "Rock, paper or scissors?");

		myGame.setComputerChoice(computerChoice);
		myGame.setUserChoice(userChoice);
		myGame.compute();

		String[] options = { "Yes", "No"};
		choice = JOptionPane.showOptionDialog(null, "The computer chose " + myGame.getShoot() + "\n" + myGame.getResult() + "\n" + "Would you like to play again?", "Play Again", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

		} while (choice == JOptionPane.YES_OPTION);

		}

	}