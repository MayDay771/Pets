import java.util.Scanner;
public class Pets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        String type;
        int age;
        int mumbers[] = new int[2];
        mumbers[0] = 123;
        mumbers[1] = 543;

        System.out.print("Какое у вас животное?:");
        type = sc.nextLine();

        System.out.print("Ввести имя животного:");
        name = sc.nextLine();

        System.out.print("Ввести возраст животного:");
        age = sc.nextInt();

        System.out.println("Имя: " + name);
        System.out.println("Возраст" + type + " " + age);
        System.out.println("ЭТО ЛОСОСЬ " + mumbers[0] + " " + mumbers[1]);

    }
}