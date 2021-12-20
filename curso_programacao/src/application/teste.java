package application;

public class teste {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 101; i == 199; i++) {
			
			int a1 = i;
			sum += (a1 - (i+1));
		}
		System.out.println("Valor é: " + sum);
	}

}
