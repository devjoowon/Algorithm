import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {

            HashMap<String, Integer> hashMap = new HashMap<>();
            int n = Integer.parseInt(br.readLine());

            while (n-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                st.nextToken();
                String clothesType = st.nextToken();

                if(hashMap.containsKey(clothesType)) {
                    hashMap.put(clothesType, hashMap.get(clothesType) + 1);
                }else{
                    hashMap.put(clothesType, 1);
                }
            }

            int result = 1;

            for(int val : hashMap.values()) {
                result = result * (val + 1);
            }

            sb.append(result - 1).append('\n');
        }
        System.out.println(sb);
    }
}