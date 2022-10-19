package project29_Swapping;
import java.util.*;
class swap{
	int x,y;
	int swap(int x,int y) {
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x);
		System.out.println(y);
		return 1;
	}
}

public class project29_Swapping {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		int num_1=a.nextInt();
		int num_2=a.nextInt();
		swap b=new swap();
		b.swap(num_1, num_2);
		

	}

}
