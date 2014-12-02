public class OrderedSuperArray extends superArray{
    //    pubic void sort(){
	
    public void add(String word){
	this.resize(this.size()+1);
	int i=this.size();
	while(word.compareTo(this.get(i-1))<=0){
	    this.set(i,this.get(i-1));
	}
	this.set(i,word);
    }

    public String set(int index, String Word){
	int i=0;
	while(i<size() && Word.compareTo(get(i))<=0){
	}
	super.add(Word,i);
	return Word;
    }
	    
    public void add(int index, String word){
	add(word);
    }

    public static void main(String[]args){
	
    }
}