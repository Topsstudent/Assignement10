package module1;

public class Array {
public static void main(String[] args) {
	int [] array= {16,8,9,20,130};
	int max= array[0];
	int min= array[0];
	for(int i=0;i<array.length;i++) {
		System.out.println(array[i]);
		if(array[i]>max) {
			max=array[i];
			
		}if(array[i]<min) {
			min=array[i];
		}
	}
	System.out.println("maximum array is"+max);
	System.out.println("minimum array is"+min);
}
}
