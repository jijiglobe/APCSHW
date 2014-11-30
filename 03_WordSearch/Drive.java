import java.util.*;
import java.io.*;
public class Drive{
    public static void main(String[]args) throws FileNotFoundException{
	File input = new File("input.txt");
	Scanner scanner = new Scanner(input);
	WordGrid puzzle = new WordGrid(30,30);
	ArrayList<String> list = new ArrayList<String>();
	while(scanner.hasNextLine()){
	    list.add(scanner.nextLine());
	    //	    System.out.println(scanner.nextLine());
	}
	ArrayList<String> items = puzzle.fill(list);
	puzzle.fillInBlanks();
	System.out.println(puzzle);
    }    
}