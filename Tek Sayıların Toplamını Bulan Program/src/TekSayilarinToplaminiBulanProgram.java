import java.util.Scanner;
public class TekSayilarinToplaminiBulanProgram {

	public static void main(String[] args) {
		 int m , toplam = 0;
	        do {
	            Scanner input = new Scanner(System.in);
	            System.out.println(" sayi Gir : " );
	            m = input.nextInt();
	            if (m % 4 == 0 ){
	            	
	            		toplam +=m;
	            	
	            }
	            
	        } while (m % 2 == 0);
	        System.out.println(" toplam =   " + toplam);
			
	}	
}




