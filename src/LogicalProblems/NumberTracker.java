package LogicalProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberTracker {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print(" N = ");
        int n = s.nextInt();
        System.out.print(" INPUT -> ");
        List<Integer> inputs = new ArrayList<>();
        List<Integer> tracker = new ArrayList<>();

        for(int i = 0; i < n; i++){
            inputs.add(s.nextInt());
        }
        
        for (int i = 0; i < inputs.size()-1; i++) {
            if(inputs.get(i).equals(inputs.get(i+1))){
                tracker.add(inputs.get(i));
            }else {
                tracker.add(inputs.get(i));
                System.out.print(tracker);
                tracker = new ArrayList<>();
            }
        }
        tracker.add(inputs.get(inputs.size()-1));
        System.out.print(tracker);
    }
}
