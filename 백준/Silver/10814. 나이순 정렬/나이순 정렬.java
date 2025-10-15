import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		Member[] members = new Member[n];

		for(int i = 0; i < n; i++) {
			int age = scanner.nextInt();
			String name = scanner.next();
			members[i] = new Member(age, name);
		}
		Arrays.sort(members, Comparator.comparingInt(m -> m.age));

		for( Member m : members) {
			System.out.println(m.age + " " + m.name);
		}
	}
}

class Member {
	int age;
	String name;

	public Member(int age, String name) {
		this.age = age;
		this.name = name;
	}

}