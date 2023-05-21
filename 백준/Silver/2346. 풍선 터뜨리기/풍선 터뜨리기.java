import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Deque<int[]> dq = new ArrayDeque<>();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        StringBuilder sb = new StringBuilder();
        sb.append("1 ");
        int in = arr[0];

        for (int i = 1; i < n; i++) {
            dq.add(new int[]{(i + 1), arr[i]});
        }

        while (!dq.isEmpty()) {
            // 양수
            if (in > 0) {
                for (int i = 1; i < in; i++) {
                    dq.add(dq.poll());
                }

                int[] next = dq.poll();
                in = next[1];
                sb.append(next[0]).append(" ");
            }

            //음수
            else {
                for (int i = 1; i < -in; i++) {
                    dq.addFirst(dq.pollLast());
                }

                int[] next = dq.pollLast();
                in = next[1];
                sb.append(next[0]).append(" ");
            }
        }

        System.out.println(sb);
    }

}
