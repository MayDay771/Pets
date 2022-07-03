import java.util.Scanner;
public class Pets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        String type;
        int age[] = new int[2];
        age[0] = 111;
        age[1] = 222;

        System.out.print("Какое у вас животное?:");
        type = sc.nextLine();

        System.out.print("Ввести имя животного:");
        name = sc.nextLine();

        System.out.print("Ввести возраст животного:");
        age[0] = sc.nextInt();

        System.out.println("Имя: " + name);
        System.out.println("Возраст " + type + " " + age[0]);
        System.out.println("ЭТО ЛОСОСЬ " + age[0]);

    }
}