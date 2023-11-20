import java.util.ArrayList;

public class Backstage3 extends State{
private Model model;
	
	public Backstage3(Model model) {
		this.model = model;
	}

	@Override
	public String getDescription() {
		String description = "It is now opening night of the Musical one week later. You and the other girls are watching the show play out backstage. You see that your friend is alone. You and her have not seen eachother since you rejected her. You also see that the Club President is also alone and this could be your chance to talk to her. Who would you like to talk to?";
		return description;
	}

	@Override
	public ArrayList<String> getOptions() {
		ArrayList<String>getOptions = new ArrayList<String>();
		getOptions.add("Type 1 for the Club President");
		getOptions.add("Type 2 for your friend");
		return getOptions;
	}

	@Override
	public void processChoice(int choice) {
		if(choice == 1) {
			model.setCurrentState(StateType.GoodEnding3);
		}
		if(choice == 2) {
			model.setCurrentState(StateType.GoodEnding4);
		}
		
	}

}
