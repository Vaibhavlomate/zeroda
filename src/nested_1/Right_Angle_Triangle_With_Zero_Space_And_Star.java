package nested_1;

public class Right_Angle_Triangle_With_Zero_Space_And_Star {
public static void main(String[] args) {
	
	int star=5;
	int space=0;
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=star;j++) {
			System.out.print("*");
		}
		for(int j=1;j<=space;j++) {
			System.out.print(" ");
		}
		System.out.println();
		star--;
		space++;
	}
}
}
