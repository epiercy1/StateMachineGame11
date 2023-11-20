import java.util.ArrayList;

public class LivingRoom1 extends State{
private Model model;
	
	public LivingRoom1(Model model) {
		this.model = model;
	}

	@Override
	public String getDescription() {
		String description = "Your friend tells you that she wants to walk home alone today and so you walk home alone as well. The next day you and the shy girl are in your living room. You are working on the set design for the musical. She asks you if you want to work outside instead. Would you like to work outside?";
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
			model.setCurrentState(StateType.FrontLawn1);
		}
		if(choice == 2) {
			model.setCurrentState(StateType.Backstage1);
		}
	}
}
