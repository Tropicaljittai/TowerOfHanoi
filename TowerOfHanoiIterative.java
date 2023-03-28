import java.util.*;

public class TowerOfHanoiIterative {

    char u = '\u00AF';
    List<Integer>[] t = new List[3];
    int max;

    public void TOH(int disks) {
        this.max = disks;
        for (int i = 0; i < 3; i++){
            t[i] = new ArrayList<Integer>();
        }
        for (int i = disks; i > 0; i--){
            t[0].add(i);
        }
        illustrate();
        loop();
    }


    public void illustrate() {
        for (int j = max-1; j >= 0; j--){
            for (int i = 0; i < 3; i++){
                if (t[i].size() <= j) System.out.print(" ");
                else System.out.print(t[i].get(j)); System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println(u+" "+u+" "+u);
    }

    public void loop() {
        while (true) {
            if (max % 2 == 0) {
                if (canMove(0, 1) || canMove(0, 2) || canMove(1, 2))
                    break;
            } else {
                if (canMove(0, 2) || canMove(0, 1) || canMove(1, 2))
                    break;
            }
        }
    }

    public boolean canMove(int t1, int t2) {
        if (t[t1].size() == 0) move(t2, t1);
        else if (t[t2].size() == 0) move(t1, t2);
        else if (t[t1].get(t[t1].size() - 1) < t[t2].get(t[t2].size() - 1)) move(t1, t2);
        else move(t2, t1);

        return t[2].size() == max;
    }

    public void move(int source, int dest) {
        int disk = t[source].get(t[source].size() - 1);
        t[dest].add(disk);
        t[source].remove(t[source].size() - 1);
        illustrate();
    }
}

