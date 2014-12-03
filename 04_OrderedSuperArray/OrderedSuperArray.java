public class OrderedSuperArray extends superArray{
    //    pubic void sort(){
	
    public void add(String word){
	/*	this.resize(size()+1);
	int i=size();
	System.out.println(i);
	while(i>0&&word.compareTo(get(i-1))<=0){
	    System.out.println(i);
	    super.set(i,get(i-1));
	}
	this.set(i,word);*/
	super.add(word);
	shifto(size()-1);
	
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
	OrderedSuperArray test = new OrderedSuperArray();
	System.out.println(test);

	test.add("abc");
	test.add("abd");
	test.add("abb");
	test.add("zzz");
	test.add("FRIST");
	test.add("SECKINT");
	test.add("Zzzz");
	test.add("abcde");
	test.add("hello");
	test.add("goodbye");
	test.add("abc");

	System.out.println(test);

	test.insertionSort();
	test.add("IMFIRST");
	test.add("NOIAM");
	test.add("aba");

	System.out.println(test);
    }
}