

public class Main  {

	private Map map;
	private SearchBar search;
	
	
	
	
	public static void main(String[] args) {

	       Main main = new Main();
	        main.initialize();
	        main.UserInterface();

		
	}

		public void initialize() {
			map = new Map();
			search = new SearchBar();
		}
		
		public void UserInterface() {
			search.showSearchBar();
			
		}
		
		public void Search() {
			
		}
		
}
