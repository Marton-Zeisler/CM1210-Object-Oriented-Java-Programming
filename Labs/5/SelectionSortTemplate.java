import java.util.List;
import java.util.ArrayList;

class SelectionSortTemplate {
	
	public static void runSort(List<String> list, int n) {
		
		for (int i = 0; i < n-1; i++) {
			int min = i;
			for(int j = i+1; j < n; j++){
				System.out.println("comparison");
				if (list.get(j).compareTo(list.get(min)) < 0) {
					min = j;
				}
			}
			
			if(i != min){
				String temp = list.get(i);
				list.set(i, list.get(min));
				list.set(min, temp);
				System.out.println("swap");
			}
		}
		
	}

	public static void main(String args[]) {

		// Create an ArrayList to store words
		List<String> list = new ArrayList<String>();

		// We have a string, and can split this string to get the individual words
		String test = "this is a test string best";
		String[] splitTest = test.split("\\s+");

		// We add the individual words to the ArrayList
		for (String a : splitTest)
			list.add(a);

		System.out.println(list);

		// Run the sort
		SelectionSortTemplate.runSort(list, list.size());
		System.out.println(list);
	}

}