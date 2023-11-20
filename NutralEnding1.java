import java.util.ArrayList;

public class NutralEnding1 extends State{
private Model model;
	
	public NutralEnding1(Model model) {
		this.model = model;
	}
		
	@Override
	public String getDescription() {
		String description = "You choose to stay at home. You walk back to your house and go inside. Ending 1 of 9. Would you like to start a new game?";
		return description;
	}

	@Override
	public ArrayList<String> getOptions() {
		ArrayList<String>getOptions = new ArrayList<String>();
		getOptions.add("Type 1 for yes");
		getOptions.add("Type 2 for no");
		return getOptions;
	}

	@Override
	public void processChoice(int choice) {
		if(choice == 1) {
			model.setCurrentState(StateType.StreetOutsideHouse);
		}
		if(choice == 2) {
			model.setCurrentState(StateType.EndOfGame);
		}
		
	}
	
}