public class superArray{
    private Object[] thisArray;
    private int length,start;
    public superArray(int newlength){
	thisArray = new Object[length + 10];
	start = 0;
	length = newlength;
    }
    
    public superArray(){
	this(10);
    }
    
    public String toString(){
	String ans = "["+thisArray[0];
	for(int i=1;i<length;i++){
	    ans += " "+thisArray[i];
	}
	ans +="]";
	return ans;
    }
    
    public void add(Object thingy){
	if(thisArray.length == start){
	    
	    Object[] copy =  new Object[thisArray.length];
	    copy = thisArray;
	    thisArray = new Object[thisArray.length+10];
	    for(int i=0;i<copy.length;i++){
		thisArray[i] = copy[i];
	    }
	    thisArray[copy.length] = thingy;
	}else{
	    thisArray[start] = thingy;
	    start += 1;
	    length += 1;
	}
	
    }
    
    public int size(){
	return length;
    }

    public void resize(int newlength){
	Object[] copy = new Object[start];
	for(int i=0;i<start;i++){
	    copy[i] = thisArray[i];
	}
	thisArray = new Object[newlength];
	for(int i=0;i<start;i++){
	    thisArray[i] = copy[i];
	}
    }

    public static void main(String[]args){
	superArray test = new superArray(0);
	test.add(new Integer(1));
	test.add(new Integer(2));
	test.add(new Integer(3));
	test.add(new Integer(4));
	test.add(new Integer(5));
	test.add(new Integer(6));
	test.resize(20);
	test.resize(30);
	System.out.println(test);
    }
}