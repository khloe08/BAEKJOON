import java.util.*;

public class Main{
	
	public static void main(String[] args){
		
	Scanner a = new Scanner(System.in);
	int[] array = new int[6];
	array[0] = a.nextInt();
	array[1] = a.nextInt();
	array[2] = a.nextInt();
	array[3] = a.nextInt();
	array[4] = a.nextInt();
	array[5] = a.nextInt();
	
	int[] piece = {1,1,2,2,2,8};
	int[] answer = new int[6];
	
	 for (int i = 0; i < array.length; i++) {
		answer[i] = piece[i] - array[i];
		System.out.println(answer[i]);
	 } 
	 
	
	}
		
	}		
	
