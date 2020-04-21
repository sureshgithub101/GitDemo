package controlstatement;
// if block within another if block.. the inner IF bloc condition is exe only when outer IF block condition is true
public class NestedIfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 20;
		int weight =50;
		if(age>=20) {
			if(weight>=50) {
				System.out.println("eligible to donate blood");
				
			}
				
			
		}

	}

}
