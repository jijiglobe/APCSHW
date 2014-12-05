public class superArray{
    private String[] thisArray;
    private int length,start;
    public superArray(int newlength){
	thisArray = new String[length + 10];
	start = 0;
	length = 0;
    }
    
    private void isValid(int testindex){
	if(testindex>=start){
	    throw new IndexOutOfBoundsException("Your index("+testindex+") was out of bounds");	
	}
    }
    
    public String get(int index){
	isValid(index);
	return thisArray[index];
    }

    public String set(int index, String value){
	isValid(index);
	String returnval = thisArray[index];
	thisArray[index] = value;
	return returnval;
    }
    public String change(int index, String value){
	isValid(index);
	String returnval = thisArray[index];
	thisArray[index] = value;
	return returnval;
    }
    
    public void clear(){
	thisArray = new String[10];
    }

public void badInsertionSort(){
        OrderedSuperArray c = new OrderedSuperArray();
        while( this.size() > 0){ 
            c.add(this.remove(0));
        }
        while(c.size() > 0){
            this.add(c.remove(0));
        }
}

    public superArray(){
	this(10);
    }
    
    public String toString(){
	if(size()>0){
	    String ans = "["+thisArray[0];
	    for(int i=1;i<length;i++){
		ans += " "+thisArray[i];
	    }
	    ans +="]";
	    return ans;
	}else{
	    return "[]";
	}
    }
    
    public void add(String thingy){
	if(thisArray.length == start){
	    String[] copy =  new String[thisArray.length];
	    copy = thisArray;
	    thisArray = new String[thisArray.length*2];
	    for(int i=0;i<copy.length;i++){
		thisArray[i] = copy[i];
	    }
	    start += 1;
	    length += 1;
	    thisArray[copy.length] = thingy;
	}else{
	    thisArray[start] = thingy;
	    start += 1;
	    length += 1;
	}
	
    }
    public void plus(String thingy){
	if(thisArray.length == start){
	    String[] copy =  new String[thisArray.length];
	    copy = thisArray;
	    thisArray = new String[thisArray.length*2];
	    for(int i=0;i<copy.length;i++){
		thisArray[i] = copy[i];
	    }
	    start += 1;
	    length += 1;
	    thisArray[copy.length] = thingy;
	}else{
	    thisArray[start] = thingy;
	    start += 1;
	    length += 1;
	}
	
    }
    
    public void add(String thingy, int index){
	isValid(index);	    
	plus(thisArray[length-1]);
	for(int i=start-2;i>index;i--){
	    thisArray[i] = thisArray[i-1];
	}
	thisArray[index] = thingy;
    }
	

    public int size(){
	return length;
    }

    public int find(String target){
	for(int i=0;i<size();i++){
	    if(get(i).equals(target)){
		return i;
	    }
	}
	return -1;
    }

    public void resize(int newlength){
	String[] copy = new String[start];
	for(int i=0;i<start;i++){
	    copy[i] = thisArray[i];
	}
	thisArray = new String[newlength];
	for(int i=0;i<start;i++){
	    thisArray[i] = copy[i];
	}
    }
    
    public void shifto(int index2){
	String copy = get(index2);
	while(index2>0&&copy.compareTo(get(index2-1))<=0){
	    change(index2,get(index2-1));
	    index2--;
	} 
	change(index2,copy);

    }
    public void remove(int index){
	length -=1;
	start -=1;
	for(int i=index;i<length;i++){
	    thisArray[i] = thisArray[i+1];
	}
	if(start<=thisArray.length/4){
	    resize(start/2);
	}
    }


    public void insertionSort(){
	
	for(int i=0;i<size()-1;i++){
	    if(get(i).compareTo(get(i+1))>0){
		shifto(i+1);
	    }
	}

    }

    public static void main(String[]args){
	superArray test = new superArray(0);
	//	test.set(6,new Integer(1));
	//	System.out.println(test);
	/*test.add("abc");
	test.add("abd");
	test.add("bdc");
	test.add("zzzz");
	test.add("abb");
	test.add("bbb");
	test.add("remkl");
	test.add("FIRST");
	test.add("SECOND");
	test.add("abc");
	test.add("abc");
	System.out.println(test);
	test.insertionSort();
	//	test.add(new Integer(7),6);
	System.out.println(test);*/
    }
}
