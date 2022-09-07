package Parameterised_Constructor;

public class Guns {
	String gunName;
	int noOffBullets;
	public Guns (String gunName , int noOffBullets) {
		this.gunName=gunName;
		this.noOffBullets=noOffBullets;
	    }
	public void shoot () {
		for (int i=1; i<=noOffBullets; i++) {
			System.out.println("deshkew");
		}
	}
	

}
