public class WordGrid{
    private char[][] grid;
    
    public void clear(){
	for(int i=0;i<grid.length;i++){
	    for(int t=0;t<grid[i].length;t++){
		grid[i][t] = ' ';
	    }
	}
    }

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

    public WordGrid(int width, int height){
	grid = new char[height][width];
	clear();
    }
    
    public void addWordHorizontal(int x, int y, String word){
	for(int i=0; i<word.length();i++){
	    grid[y][x+i] = word.charAt(i);
	}
    }
    public static void main(String[]args){
	WordGrid wordgrid = new WordGrid(3,3);
	wordgrid.addWordHorizontal(0,1,"hi");
	wordgrid.addWordHorizontal(1,0,"hi");

	System.out.println(wordgrid);
    }
}
