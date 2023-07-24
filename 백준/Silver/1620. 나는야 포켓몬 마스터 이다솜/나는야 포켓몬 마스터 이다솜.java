import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> hashMapInt = new HashMap<>();
        HashMap<String, Integer> hashMapStr = new HashMap<>();

        for(int i = 0; i < n; i++) {
            String name = br.readLine();
            hashMapInt.put(i + 1, name);
            hashMapStr.put(name, i + 1);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m; i++) {
            String input = br.readLine();
            if(49 <= input.charAt(0) && input.charAt(0) <= 57) {
                sb.append(hashMapInt.get(Integer.parseInt(input))).append('\n');
            }else {
                sb.append(hashMapStr.get(input)).append('\n');
            }
        }
        
        System.out.println(sb);
    }
}