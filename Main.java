import javax.lang.model.element.Element;
import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class Main {

    public static <T> void main(String[] args) {
        System.out.println("Tower Of Hanoi Implementation");
        System.out.println();
        System.out.println("implement via ");
        int disks;
        Scanner in = new Scanner(System.in);
        String decider;
        do {
            System.out.print("Recursive / Iterative? (r/i): ");
            decider = in.nextLine().toLowerCase();
        }while(!(decider.equals("i") || decider.equals("r")));
        if(decider.equals("r")) {
            TowerOfHanoiRecursive t = new TowerOfHanoiRecursive();
            System.out.print("Number of disks: ");
            disks = in.nextInt();
            t.TOH(disks);
        }
        else if(decider.equals("i")) {
            System.out.print("Number of disks: ");
            disks = in.nextInt();
            TowerOfHanoiIterative t = new TowerOfHanoiIterative();
            t.TOH(disks);
        }
    }
}
