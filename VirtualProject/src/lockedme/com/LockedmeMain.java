package lockedme.com;

public class LockedmeMain {

	public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		Fileoperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("LockedMe", "Abhishek");
		
		Handleoptions.handleWelcomeScreenInput();
	}

	
}

