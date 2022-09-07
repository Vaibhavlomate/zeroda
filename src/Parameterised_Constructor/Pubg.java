package Parameterised_Constructor;

public class Pubg {
	public static void main(String[] args) {
		
		 Guns g=new  Guns ("ak47",2);
		 g.shoot();
		 System.out.println("killed");
		 
		 
		 Guns g1=new  Guns ("pistol",1);
		 g1.shoot();
		 System.out.println("another kill for u");
		 
		 Guns g2=new  Guns ("shotgun",2);
		 g2.shoot();
		 System.out.println("3rd kill for u");
		 
		 Guns g3=new  Guns ("AWM",1);
		 g3.shoot();
		 System.out.println("wow 4th kill for u by AWM");
		 
		 
	}

}
