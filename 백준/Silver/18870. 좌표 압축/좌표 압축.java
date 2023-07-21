import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            treeSet.add(arr[i]);
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int key = 0;
        for (int i : treeSet) {
            hashMap.put(i, key++);
        }

        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(hashMap.get(i)).append(" ");
        }

        System.out.println(sb);
    }
}