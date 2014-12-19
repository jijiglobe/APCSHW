import java.util.*;
public class Sorts{
    public static void selection(int[] array){
	for(int i=0;i<array.length;i++){
	    int least = i;
	    int t=i;
	    for(;t<array.length;t++){
		if(array[t]<array[least]){
		    least = t;
		}
	    }
	    int copy= array[i];
	    array[i] = array[least];
	    array[least] = copy;
	}
    }

    
    public static void shifto(int[] array,int index2){
	int copy = array[index2];
	while(index2>0&&copy<array[index2-1]){
	    change(array,index2,array[index2-1]);
	    index2--;
	} 
	change(array,index2,copy);

    }

    public static int change(int[] array, int index, int value){
	int returnval = array[index];
	array[index] = value;
	return returnval;
    }

    
    public static void insertion(int[]array){	
	for(int i=0;i<array.length;i++){
	    if(array[i]<array[i+1]){
		shifto(array,i+1);
	    }
	}

    }

    public static void bubble(int[]array){
	int sortedTo = array.length - 1;
	boolean switched = true;
	while(switched&&sortedTo>0){
	    switched = false;
	    for(int i=0;i<sortedTo;i++){//iterates through unsorted section of array
		if(array[i]>array[i+1]){//checks if the values are out of order
		    int copy = array[i+1];//switches the two values in the wrong order
		    array[i+1] = array[i];
		    array[i] = copy;
		    switched = true; //marks that switches have happened
		}
	    }
       	    sortedTo--;
	}
	
    }


    public static void radix(int[] array){
	int madesorts = 0;
	int digit = 10;
	ArrayList<ArrayList<Integer>> bucket = new ArrayList<ArrayList<Integer>>(20);
	for(int i=0;i<10;i++){
	    bucket.add(new ArrayList<Integer>());
	}
	while(madesorts< 3){
	    //bucket.clear();
	    for(int i=0;i<array.length;i++){
		bucket.get((array[i]%digit)/(digit/10)).add(array[i]);//adds the current value to the end of the corresponding bucket
	    }
	    digit++;
	    if(bucket.get(0).size() == array.length){ //checks if the array is already sorted
		madesorts++;
	    }
	    int index = 0;
	    for(ArrayList<Integer> i : bucket){ // reads the elements from the bucket and adds them back to array 
		for(int t : i){
		    array[index] = t;
		    index++;
		}
	    }
	    for(int i=0;i<bucket.size();i++){
		bucket.get(i).clear();
	    }
	    digit*=10;
	}
    }

    public static void main(String[]args){
	Random rand = new Random();
	int[] myarray = new int[10];
	for(int i=0;i<myarray.length;i++){
	    myarray[i] = rand.nextInt(1000);
	}
	String mystring = "";
	for(int i=0;i<myarray.length;i++){
	    mystring+=myarray[i];
	}
	System.out.println(mystring);
	radix(myarray);
	mystring= "";
	for(int i=0;i<myarray.length;i++){
	    mystring+=myarray[i]+",";
	}
	System.out.println(mystring);
	
	/*
	int flag = Integer.parseInt(args[0]);
	int flag2 = Integer.parseInt(args[1]);
	System.out.println(flag%flag2/(flag2/10));
	*/ 
   }

}