public class superArray{
    private Object[] thisArray;
    private int length,start;
    public superArray(int newlength){
	thisArray = new Object[length + 10];
	start = 0;
	length = newlength;
    }
    
    private void isValid(int testindex){
	if(testindex>=start){
	    throw new IndexOutOfBoundsException("Your index was out of bounds");	
	}
    }
    
    public Object get(int index){
	isValid(index);
	return thisArray[index];
    }

    public Object set(int index, Object value){
	isValid(index);
	Object returnval = thisArray[index];
	thisArray[index] = value;
	return returnval;
    }
    
    public void clear(){
	thisArray = new Object[10];
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
	    thisArray = new Object[thisArray.length*2];
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
    
    public void add(Object thingy, int index){
	isValid(index);	    
	add(thisArray[length-1]);
	for(int i=start-2;i>index;i--){
	    thisArray[i] = thisArray[i-1];
	}
	thisArray[index] = thingy;
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
    public static void main(String[]args){
	superArray test = new superArray(0);
	test.add(new Integer(1));
	test.add(new Integer(2));
	test.add(new Integer(3));
	test.add(new Integer(4));
	test.add(new Integer(5));
	test.add(new Integer(6));
      	test.get(5);
	//	test.set(6,new Integer(1));
	System.out.println(test);
	
	//	test.add(new Integer(7),6);
	
	test.remove(5);
	test.resize(20);
	test.resize(30);
    }
}