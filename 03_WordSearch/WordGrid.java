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
    
    public boolean checkspace(int x, int y, String word, int d){

	for(int i=0;i<word.length();i++){
	    if(grid[y][x]!=' ' && grid[y][x] != word.charAt(i)){
		return false;
	    }
	       
	    if(d==0){
		y--;
	    }else if(d==1){
		y--;x++;
	    }else if(d==2){
		x++;
	    }else if(d==3){
		y++;x++;
	    }else if(d==4){
		y++;
	    }else if(d==5){
		y++;x--;
	    }else if(d==6){
		x--;
	    }else if(d==7){
		x--;y--;
	    }
	    
	}
	return true;
    }
    public boolean addWordHorizontal(int x, int y, String word, int d){
	if(checkspace(x,y,word,d)){
	    for(int i=0; i<word.length();i++){
		grid[y][x] = word.charAt(i);
		
		if(d==0){
		    y--;
		}else if(d==1){
		    y--;x++;
		}else if(d==2){
		    x++;
		}else if(d==3){
		    y++;x++;
		}else if(d==4){
		    y++;
		}else if(d==5){
		    y++;x--;
		}else if(d==6){
		    x--;
		}else if(d==7){
		    x--;y--;
		}	
	    }
	    return true;
	}
	return false;
    }
    public static void main(String[]args){
	WordGrid wordgrid = new WordGrid(5,5);
	/*	for(int i=0;i<8;i++){
	    wordgrid.clear();
	    wordgrid.addWordHorizontal(2,2,"123",i);


	}
	*/
	wordgrid.addWordHorizontal(0,1,"123",2);
	wordgrid.addWordHorizontal(0,0,"123",4);
	//	wordgrid.addWordHorizontal(1,0,"123",4);
	System.out.println(wordgrid);
	//	wordgrid.addWordHorizontal(0,0,"123",2);
    }
}
