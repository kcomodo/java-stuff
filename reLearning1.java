//importing GUI using JOptionPane
import javax.swing.JOptionPane;
// import array list
import java.util.ArrayList;
import java.util.List;
public class reLearning1 {
	public static void main(String[] args) {
		/*
		 * Multiple line comments
		 */
		// single line comments
		// prints out "Hello world" 
		System.out.print("Hello world \n");
		/*
		 * \n is to make extra line
		 * created a loop using while
		 * needs bracket after while loop
		 */
		int numberThingy = 5;
		int i = 1;
		while(i <= numberThingy) {
			System.out.println("Line: "+i);
			i++;
		}
		// GUI with JOptionPane with string
		//Add inputs into a array list
		String userInput = JOptionPane.showInputDialog("Input a word");
		ArrayList<String> userList = new ArrayList<String>();
		userList.add(userInput);
		System.out.println(userList);
		//List by elements are being added
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("Quang");
		aList.add("Justin");
		aList.add("Andre");
		System.out.println(aList);
		//List created already
		List<String> createdList = List.of("Bob","Jim","Phil");
		System.out.println(createdList);
	}

}
