
public class Ders17devam {

	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int number=27;
		int total=0;
		int i=0;
		
		for (i=1;i<number;i++) {
				if (number % i==0) {
					total=total+i;
					
				}
		}
		
		
		
		if(total==number) {
			System.out.println("m�kemmel say�d�r");
			
		}
		else{
			System.out.println("M�kemmel say� de�ildir");
		}
		
		
		
		
		
	}

}
