import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static int[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb =  new StringBuilder();
        for(int i = 0; i < M; i++) {
            int t = Integer.parseInt(st.nextToken());
            sb.append(upperIdx(t, N) - lowerIdx(t, N)).append(' ');
        }
        System.out.println(sb);
    }

    public static int lowerIdx(int target, int len) {
        int st = 0;
        int en = len;
        while(st < en) {
            int mid = (st + en) / 2;
            if(arr[mid] >= target) {
                en = mid;
            }else{
                st = mid + 1;
            }
        }
        return st;
    }

    public static int upperIdx(int target, int len) {
        int st = 0;
        int en = len;
        while(st < en) {
            int mid = (st + en) / 2;
            if(arr[mid] > target) {
                en = mid;
            }else{
                st = mid + 1;
            }
        }
        return st;
    }
}