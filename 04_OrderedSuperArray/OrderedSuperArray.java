public class OrderedSuperArray extends superArray{

    public void add(String word){
	this.resize(this.size()+1);
	int i=this.size();
	while(word.compareTo(this.get(i-1))<=0){
	    this.set(i,this.get(i-1));
	}
	this.set(i,word);
    }

    public void add(int index, String word){
	add(word);
    }

    public static void main(String[]args){
	
    }
}