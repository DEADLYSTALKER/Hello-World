import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("> ");
		String s = console.nextLine();
		while (!s.equalsIgnoreCase("привет") ) {
			System.out.println("Я тебя не понял. Повтори еще раз");
			System.out.print("> ");
			s = console.nextLine();
		}
		System.out.println("Привет, мир!");

		System.out.print("> ");
		String b = console.nextLine();
		if (b.equalsIgnoreCase("Как дела?")) {
			System.out.println("Нормально");
		} else {
			System.out.println("Кстати, я умею считать, хочешь опробовать?");
		}

		System.out.print("> ");
		String c = console.nextLine();
		if (c.equalsIgnoreCase("Да")) {
			System.out.println("Ну, тогда будем умножать. Введи первое число ");
			System.out.print("> ");
			int v = console.nextInt();
			System.out.println(" Введи второе число ");
			System.out.print("> ");
			int d = console.nextInt();
			d = v * d;
			System.out.println(d);

		} else {
			System.out.println("Ну, как хочешь. Нет так нет...");
		}
		console.close();
	}
}
