public class Game {

	private int computerChoice;
	private String userChoice, shoot, result;

	public void setComputerChoice(int computerChoice){

		this.computerChoice = computerChoice = (int) (Math.random() * 3) + 1;

		}

	public void setUserChoice(String userChoice){

		this.userChoice = userChoice;

		}

	public void compute(){

		switch(computerChoice){

			case 1:
				shoot = "Rock";
				if (userChoice.equalsIgnoreCase("Rock")){
					result = "It's a tie!";
				}else if (userChoice.equalsIgnoreCase("Paper")){
					result = "You won!";
				}else if(userChoice.equalsIgnoreCase("Scissors")){
					result = "You lost...";
				}
				break;

			case 2:
				shoot = "Paper";
				if (userChoice.equalsIgnoreCase("Paper")){
					result = "It's a tie!";
				}else if (userChoice.equalsIgnoreCase("Scissors")){
					result = "You won!";
				}else if(userChoice.equalsIgnoreCase("Rock")){
					result = "You lost...";
				}
				break;

			case 3:
				shoot = "Scissors";
				if (userChoice.equalsIgnoreCase("Scissors")){
					result = "It's a tie!";
				}else if (userChoice.equalsIgnoreCase("Rock")){
					result = "You won!";
				}else if(userChoice.equalsIgnoreCase("Paper")){
					result = "You lost...";
				}
				break;

	}

	}

	public String getShoot(){

		return shoot;

		}

	public String getResult(){

		return result;

		}

}