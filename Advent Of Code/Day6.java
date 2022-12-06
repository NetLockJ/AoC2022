import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.io.*;
import java.util.HashSet;
import java.util.List;

public class Day6 {

    static ArrayList<String> letters = new ArrayList<String>();

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Day6.txt");
        Scanner input = new Scanner(file);
        int count = 0;

        while (input.hasNextLine()) {
            String line = input.nextLine();

            for (int i = 0; i < line.length(); i++) {
                letters.add(line.substring(i, i + 1));
            }
        }

        for (int i = 0; i < letters.size() - 3; i++) {
            count += compare(i);

        }

        System.out.println(count + 4);

    }

    public static int compare(int idx) {
        List<String> s = new ArrayList<String>();
        for(int i = idx; i < idx + 4; i++) {
            s.add(letters.get(i));
        }
        Set<String> uniques = new HashSet<String>(s);
        if(uniques.size() == 3) {
            return 1;
        } else {
            return 0;
        }

    }
}
