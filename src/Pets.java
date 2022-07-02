import java.util.Scanner;
public class Pets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        int d[] = new int[2];
        d[0] = 123;
        d[1] = 543;

        System.out.print("Ввести имя животного:");
        name = sc.nextLine();

        System.out.print("Ввести возраст животного:");
        age = sc.nextInt();

        System.out.println("Имя: " + name);
        System.out.println("Возраст Пса: " + age);
        System.out.println("ЭТО ЛОСОСЬ1231231231" + d[0] + " " + d[1]);
    }
}