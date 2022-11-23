import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> listA = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя: ");
            String name = scanner.nextLine();
            System.out.println(" Вы ввели имя: " + name);
            listA.add(name);
        }
        System.out.println(listA);

        ArrayList<String> listB = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя: ");
            String name = scanner.nextLine();
            System.out.println(" Вы ввели имя: " + name);
            listB.add(name);
        }

        System.out.println(listB);
        Collections.reverse(listB);

        ArrayList<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(i));

        }

        System.out.println(listC);



}
}