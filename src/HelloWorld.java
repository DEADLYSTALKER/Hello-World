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
		System.out.println("Привет!");

		System.out.print("> ");
		String b = console.nextLine();
		if (b.equalsIgnoreCase("Как дела?")) {
			int a = (int)(1+Math.floor(Math.random()* 3 ));

			switch(a) {
			    case 1:
			        System.out.println("Отлично!");
			        break;
			    case 2:
			    	System.out.println("Нормально.");
			        break;
			    case 3:
			    	System.out.println("Плохо...");
			        break;
			    default:
			        System.out.println("По-тихоньку, по-маленьку.");
			}
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
		System.out.print("> ");
		String p = console.nextLine();
		if (p.equalsIgnoreCase("Скинешь дискорд?")) {
			System.out.println("Конечно, держи! --> DEADLYSTALKER#2150 ");
		} else {
			System.out.println("Хм...");
		}
		
		System.out.println("Я кое-что знаю. Хочешь знать?"); 
		System.out.print("> ");
		String t = console.nextLine();
		if (t.equalsIgnoreCase("Да")) {
				System.out.println(" Скоро выйдет новая серия покинутого космоса! ");
		} else {
			System.out.println("Твое дело.");
		
		}
		console.close();
	}
}
