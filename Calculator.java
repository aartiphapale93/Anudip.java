
public class Calculator {

	public class calculator{
		public double add(int n1,double...n2) {
			double a=0;
			System.out.println("The addition of given numbers are...");
			for(int i=0;i<n2.length;i++)
			{
				a+=n2[i];
			}
			return(a+n1);
		}
		public double sub(int n1,double...n2) {
			double a=0;
			System.out.println("The Subtraction of given numbers are...");
			for(int i=0;i<n2.length;i++)
			{
				a=n2[i]-a;
			}
			return(a-n1);
		}
		public double Mult(int n1,double...n2) {
			double a=0;
			System.out.println("The multiplication of given numbers are...");
			for(int i=0;i<n2.length;i++)
			{
				a=n2[i]*a;
			}
			return(a*n1);
		}
		public double div(int n1,double...n2) {
			double a=0;
			System.out.println("The division of given numbers are...");
			for(int i=0;i<n2.length;i++)
			{
				a=n2[i]/a;
			}
			return(a/n1);
		}
	
	}
}
