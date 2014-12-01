import java.util.*;
import java.io.*;

public class WordGrid{
    private char[][] grid;
    private Random seed;
    /**
     * clears out the grid and replaces every value with a '&nbsp' character
     */
    public void clear(){
	for(int i=0;i<grid.length;i++){
	    for(int t=0;t<grid[i].length;t++){
		grid[i][t] = ' ';
	    }
	}
    }
    public void fillInBlanks(){
	for(int i=0;i<grid.length;i++){
	    for(int t=0;t<grid[i].length;t++){
		if(grid[i][t]==' '){
		    grid[i][t] = '-';
		}
	    }
	}
    }

    public void fillBlanksWithChars(){
	for(int i=0;i<grid.length;i++){
	    for(int t=0;t<grid[i].length;t++){
		if(grid[i][t]==' '||grid[i][t]=='-'){
		    grid[i][t] = (char)(seed.nextInt(26)+'a');
		}
	    }
	}
    }	

    public ArrayList<String> fill(ArrayList<String> words){
	ArrayList<String> ans = new ArrayList<String>();
	for(int t=0;t<words.size();t++){
	    for(int i=0;i<100;i++){
		if(addWord(seed.nextInt(grid[0].length),seed.nextInt(grid.length),words.get(t),seed.nextInt(8))){
		    ans.add(words.get(t));
		    break;
		}
	    }
	}
	return ans;
    }
    /**
     * returns a String formatted version of the grid for use as output to terminal
     *@return returns a String in the way of output
     */
    public String toString(){
	String ans="";
	for(int i=0;i<grid.length;i++){
	    String thisline = "";	    
	    for(int t=0;t<grid[i].length;t++){
		thisline+=grid[i][t];
	    }
	    ans+=thisline+"\n";
	}
	return ans;
    }	
    /**
     *creates a new WordGrid of a specific width and height
     *@param width determines width of a single row of the grid
     *@param height determines the amount of rows in the grid
     */
    public WordGrid(int width, int height){
	grid = new char[height][width];
	seed = new Random(10);
	clear();
    }
    
    public WordGrid(int width, int height, int newseed){
	this(width,height);
	seed = new Random(newseed);
    }
    /** determines if there is space in the grid to put a specific word in a specific direction
     *@param x x-location of the first letter
     *@param y y-location of the first letter
     *@param word The word to be checked for
     *@param d determines the direction the word will write in 0 is up and 1 is up-right etc...
     */    
    public boolean checkspace(int x, int y, String word, int d){
	int dx =0;
	int dy =0;
	if(d==0){
	    dy--;
	}else if(d==1){
	    dy--;dx++;
	}else if(d==2){
	    dx++;
	}else if(d==3){
	    dy++;dx++;
	}else if(d==4){
	    dy++;
	}else if(d==5){
	    dy++;dx--;
	}else if(d==6){
	    dx--;
	}else if(d==7){
	    dx--;dy--;
	}	

	for(int i=0;i<word.length();i++){
	    try{
		if(grid[y][x]!=' ' && grid[y][x] != word.charAt(i)){
		    return false;
		}	
	    } catch(IndexOutOfBoundsException checking){
		return false;
	    }
	    y+=dy;
	    x+=dx;
	}
   
	return true;
    }
    /**
     *adds a word to the WordGrid
     *@param x x-location of the first letter
     *@param y y-location of the first letter
     *@param word the word to be added to the grid
     *@param d determines the direction the word will write in 0 is up and 1 is up-right etc...
     *@return true if the operation was a success, false otherwise
     */
    public boolean addWord(int x, int y, String word, int d){
	if(checkspace(x,y,word,d)){
	    int dx = 0;int dy = 0;
	    if(d==0){
		dy--;
	    }else if(d==1){
		dy--;dx++;
	    }else if(d==2){
		dx++;
	    }else if(d==3){
		dy++;dx++;
	    }else if(d==4){
		dy++;
	    }else if(d==5){
		dy++;dx--;
	    }else if(d==6){
		dx--;
	    }else if(d==7){
		dx--;dy--;
	    }	
	    for(int i=0; i<word.length();i++){
		grid[y][x] = word.charAt(i);
		x+=dx;
		y+=dy;
	    }
	    return true;
	}
	return false;
    }
    public static void main(String[]args){
       	WordGrid wordgrid = new WordGrid(10,10);
	/*	for(int i=0;i<8;i++){
	    wordgrid.clear();
	    wordgrid.addWordHorizontal(2,2,"123",i);
	    
	    
	    }*/

	ArrayList<String> list = new ArrayList<String>();
	list.add("word");
	list.add("hello");
	list.add("goodbye");
	list.add("syzygy");
	list.add("character");
	list.add("add");
	list.add("minus");
	list.add("plus");
	list.add("pikachu");
	list.add("wordagain");
	
	System.out.println(wordgrid.fill(list));
	wordgrid.fillInBlanks();
	wordgrid.fillBlanksWithChars();
	//	wordgrid.addWordHorizontal(1,0,"123",4);
	System.out.println(wordgrid);
	//	wordgrid.addWordHorizontal(0,0,"123",2);*/
    }
}
