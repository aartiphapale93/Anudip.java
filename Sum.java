public class Sum {

	static int sum=0;
	public static void main(String[] args) {
		 AddNumber(1000);
		System.out.println(sum);
	}

	private static int AddNumber(int n) {
	for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		return sum;
		
	}

}
