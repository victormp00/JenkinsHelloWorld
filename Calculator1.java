package practice;

public class Calculator1 {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int resultado = calc.calcula(87,56);
		System.out.println("la suma da " + resultado);
		
	}
	public int calcula(int a, int b) {
		return a+b;
	}
}
