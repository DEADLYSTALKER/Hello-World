import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("> ");
		String s = console.nextLine();
		while (!s.equalsIgnoreCase("������") ) {
			System.out.println("� ���� �� �����. ������� ��� ���");
			System.out.print("> ");
			s = console.nextLine();
		}
		System.out.println("������, ���!");

		System.out.print("> ");
		String b = console.nextLine();
		if (b.equalsIgnoreCase("��� ����?")) {
			System.out.println("���������");
		} else {
			System.out.println("������, � ���� �������, ������ ����������?");
		}

		System.out.print("> ");
		String c = console.nextLine();
		if (c.equalsIgnoreCase("��")) {
			System.out.println("��, ����� ����� ��������. ����� ������ ����� ");
			System.out.print("> ");
			int v = console.nextInt();
			System.out.println(" ����� ������ ����� ");
			System.out.print("> ");
			int d = console.nextInt();
			d = v * d;
			System.out.println(d);

		} else {
			System.out.println("��, ��� ������. ��� ��� ���...");
		}

	}
}
