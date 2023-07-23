import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<String, String> hashMap = new HashMap<>();

        for(int i = 0; i < n; i++) {
            String name = sc.next();
            String status = sc.next();

            if(hashMap.containsKey(name)) {
                hashMap.remove(name);
            }else{
                hashMap.put(name, status);
            }
        }
        ArrayList<String> arrayList = new ArrayList<>(hashMap.keySet());
        Collections.sort(arrayList, Collections.reverseOrder());

        for(var list : arrayList) {
            System.out.println(list + " ");
        }
    }
}