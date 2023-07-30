import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> minPq = new PriorityQueue<>();

        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            if(maxPq.size() == minPq.size()) {
                maxPq.add(num);

                if(!minPq.isEmpty() && maxPq.peek() > minPq.peek()) {
                    minPq.add(maxPq.poll());
                    maxPq.add(minPq.poll());
                }
            }else {
                minPq.add(num);

                if(maxPq.peek() > minPq.peek()) {
                    minPq.add(maxPq.poll());
                    maxPq.add(minPq.poll());
                }
            }
            bw.write(maxPq.peek()+"\n");
        }
        bw.flush();
    }
}