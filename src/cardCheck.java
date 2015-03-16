import java.util.Scanner;

public class cardCheck {
	
	static long card;

	public static int getSize() {
		long temp;
		temp = card;
		int size = 0;
		while (temp > 0) {
			temp = temp / 10;
			size ++;
		}
		return size;
	}
	
	public static String check() {
		int sum = 0;
		int separateDigits = 0;
		long temp = 0;
		boolean everyOtherNumber = true;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter credit card numer.");
		card = input.nextLong();
		input.close();
		getSize();
		for (int i = 0; i < getSize();){
			if (everyOtherNumber == true) {
				 temp = ((card % 10) * 2);
				 if (temp > 9) {
					 while (temp > 0) {
						    separateDigits += (temp % 10);
						    temp = temp / 10;
					 }
					 sum += (int)separateDigits;
					 separateDigits = 0;
				 }
				 i++;
				 everyOtherNumber = false;
				 card = (card / 10);
			 }
			 else {
				 temp = (int) (card % 10);
				 sum += temp;
				 i++;
				 everyOtherNumber = true;
				 card = (card / 10);
			 }
		 }
		 sum = sum * 9;
		 int x = sum / 10;
		 if (x % 10 == 0){
			 return ("This credit card is valid.");
		 }
		 else {
			 return ("This credit card is invalid.");
		 	}
		}
		public static void main(String[] args) {
		System.out.println(check());
	}
}

	

		
		