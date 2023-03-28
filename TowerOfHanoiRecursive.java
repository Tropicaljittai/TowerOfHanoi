import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.Vector;
import java.util.*;
public class TowerOfHanoiRecursive {

        ArrayList<Integer>[] t = new ArrayList[3];
        int max;
        char u = '\u00AF';
        public void TOH(int disks){
            for (int i = 0; i < 3; i++){
                t[i] = new ArrayList<Integer>();
            }
            for(int i = disks; i > 0; i--){
                t[0].add(i);
            }
            this.max = disks;
            illustrate();
            move(disks, 0, 2, 1);
            illustrate();
        }

        public void illustrate(){
            for (int j = max-1; j >= 0; j--){
                for (int i = 0; i < 3; i++){
                    if (t[i].size() <= j) System.out.print(" ");
                    else System.out.print(t[i].get(j)); System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println(u+" "+u+" "+u);
        }

        public void move(int n, int source, int dest, int temp){
            if (n == 1){
                t[dest].add(t[source].remove(t[source].size()-1));
                return;
            }

            move(n-1, source, temp, dest);
            illustrate();
            t[dest].add(t[source].remove(t[source].size()-1));
            illustrate();
            move(n-1, temp, dest, source);
        }
}




