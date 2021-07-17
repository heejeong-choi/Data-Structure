package HaspMap;

import java.util.HashMap;
import java.util.Scanner;

public class idPw {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("user01", "0001");
        hashMap.put("user02", "0002");
        hashMap.put("user03", "0003");

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Please, enter your id and password");
            System.out.println("Id: ");
            String id = sc.nextLine().trim();

            System.out.println("Password: ");
            String pw = sc.nextLine().trim();

            if(!hashMap.containsKey(id)) {
                System.out.println("there is no the id, please check again.");
                continue;
            }

            if(!(hashMap.get(id)).equals(pw)) {
                System.out.println("your password is wrong.");
            } else {
                System.out.println("Success!");
                break;
            }
        }
    }
}
