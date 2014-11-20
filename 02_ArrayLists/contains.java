public class contains{
    public boolean contains(int value, int[] c){
	for(int i=0;i<c.length;i++){
	    if(c[i] == value){
		return true;
	    }
	}
	return false;
    }

    public boolean contains(int value, int[][] c){
	for(int i=0;i<c.length;i++){
	    if(contains(value,c[i])){
		return true;
	    }
	}
	return false;
    }
}