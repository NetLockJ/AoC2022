import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day2 {
    static int points = 0;

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner input = new Scanner(file);
        ArrayList<String> list = new ArrayList<String>();

        while (input.hasNextLine()) {
            list.add(input.nextLine());
        }

        for (int i = 0; i < list.size(); i++) {
            String elfPlay = list.get(i).substring(0, 1);
            String humPlay = list.get(i).substring(2);
            compare(elfPlay, humPlay);

        }

        System.out.println(points);

    }

    public static void compare(String elf, String hum) {
        if (hum.equals("Y")) {
            if (elf.equals("A")) {
                points += 4;
            } else if (elf.equals("B")) {
                points += 5;
            } else {
                points += 6;
            }
        } else if(hum.equals("X")) {
            if(elf.equals("A")) {
                points += 3;
            } else if (elf.equals("B")) {
                points += 1;
            } else {
                points += 2;
            }
        } else {
            if(elf.equals("A")) {
                points += 8;
            } else if (elf.equals("B")) {
                points += 9;
            } else {
                points += 7;
            }
        }


    }

}
