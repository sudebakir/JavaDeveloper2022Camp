
public class Ders15devam {

	public static void main(String[] args) {
		
		//bug
		int number=2;
		int remainder =number %2;
		System.out.println(remainder);
		
		boolean isPrime= true;
		if(number==1) {
			System.out.println("say� asal de�ildir");
			return;
		}
		
		if(number<1) {
			System.out.println("ge�ersiz say�");
		}
		
		for (int i=2; i<number;i++) {
			if(number %i==0) {
				isPrime=false;
				
			}
		}
		
		if(isPrime ) {
			System.out.println("Say� asald�r");
		}
		
		else {
			System.out.println("say� asal de�ildir");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
