import java.util.*;
import java.io.*;
public class Drive{
    public static void main(String[]args) throws FileNotFoundException{
	File input = new File("input.txt");
	Scanner scanner = new Scanner(input);
	WordGrid puzzle;
        if(args.length == 2){
	    puzzle = new WordGrid(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
	} else if(args.length==3||args.length==4){
	    puzzle = new WordGrid(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
	    //	    puzzle = new WordGrid(args[0],args[1],args[2]);
	}else{
	    puzzle = new WordGrid(18,12);
	} 
	ArrayList<String> list = new ArrayList<String>();
	while(scanner.hasNextLine()){
	    list.add(scanner.nextLine());
	    //	    System.out.println(scanner.nextLine());
	}
	ArrayList<String> items = puzzle.fill(list);
	puzzle.fillInBlanks();
	if(!(args.length ==4 && args[3].equals("1"))){
	    puzzle.fillBlanksWithChars();
	}
	System.out.println("Find these words:");
	String intro = new String();
	for(int i=0;i<items.size();i++){
	    if(i%4 == 0){
		intro+="\n";
	    }
	    intro+=items.get(i)+"      ";
	}
	System.out.println(intro+"\n");
	System.out.println(puzzle);
    }    
}