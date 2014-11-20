import java.util.*;
public class collapse{

    public static void swap(ArrayList<Integer> array, int index1, int index2){
	int val = array.get(index1);
	array.set(index1,array.get(index2));
	array.set(index2,val);
    }

    public static void randomize(ArrayList<Integer> array){
	Random seed = new Random();
	for(int i=0;i<array.size();i++){
	    swap(array,i,seed.nextInt(array.size()));
	}
    }
    
    public static void collapse(ArrayList<Integer> array){
	int previous = array.get(0);
	int sizeof = array.size();
	int current=1;
	for(int i=1;i<sizeof;i++){
	    if(array.get(current)==previous){
		array.remove(current);
	    } else {
		previous = array.get(current);
		current++;
	    }
	}
    }
    public static void main(String[]args){
	ArrayList<Integer> list;
	list = new ArrayList<Integer>();
	list.add(1);
	list.add(1);
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(4);
	list.add(4);
	list.add(5);
	list.add(1);
	System.out.println(list);
	collapse(list);
	randomize(list);
	System.out.println(list);
    }
}