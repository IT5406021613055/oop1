import java.util.Scanner;

public class Kornislav {

	public static void main(String[] args) {
		int num1, num2, num3, num4, temp;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input Number 1 : ");
		num1 = scan.nextInt();
		System.out.print("Input Number 2 : ");
		num2 = scan.nextInt();
		System.out.print("Input Number 3 : ");
		num3 = scan.nextInt();
		System.out.print("Input Number 4 : ");
		num4 = scan.nextInt();
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if (num1 > num3) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if (num1 > num4) {
			temp = num1;
			num1 = num4;
			num4 = temp;
		}
		if (num2 > num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		if (num2 > num4) {
			temp = num2;
			num2 = num4;
			num4 = temp;
		}
		if (num3 > num4) {
			temp = num3;
			num3 = num4;
			num4 = temp;
		}
		System.out.print("\nRectangle Area = : " + "" + num3 + "" + " * " + num1 + " = " + num3 * num1);
	}
}