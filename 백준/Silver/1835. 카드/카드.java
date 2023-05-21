import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> dq = new ArrayDeque<>();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            dq.addLast(i + 1);
        }
        for (int i = 1; i < n; i++) {
            int cnt = i % dq.size();
            while (cnt-- > 0) {
                dq.addLast(dq.pollFirst());
            }
            arr[dq.pollFirst() - 1] = i;
        }
        arr[dq.pollFirst() - 1] = n;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}
