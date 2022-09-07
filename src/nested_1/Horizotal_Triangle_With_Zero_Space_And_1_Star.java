package nested_1;

public class Horizotal_Triangle_With_Zero_Space_And_1_Star {
public static void main(String[] args) {
	
	int space=0;
	int star=1;
	for(int i=1;i<=7;i++) {
		for(int j=1;j<=star;j++) {
			System.out.print("*");
		}
		System.out.println();
		if(i<=3) {
			star++;
		}
		else {
			star--;
		}
	}
}
}
