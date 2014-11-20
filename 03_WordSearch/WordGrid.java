public class WordGrid{
    private char[][] grid;
    
    public void clear(){
	for(int i=0;i<grid.length;i++){
	    for(int t;t<grid[i].length;t++){
		grid[i][t] = ' ';
	    }
	}
    }

    public string toString(){

	for(int i=0;i<grid.length;i++){
	    String thisline;	    
	    for(int t;t<grid[i].length;t++){
		thisline+=grid[i][t]
	    }
	    return thisline;
	}
    }	

    public WordGrid(int width, int height){
	grid = new char[height][width];
	grid.clear();
    }
    
    public static void main(String[]args){
	wordgrid = new WordGrid(3,3);
	System.out.println(wordgrid);
    }
}
