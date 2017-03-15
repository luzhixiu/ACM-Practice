import java.util.*;

public class WhatDoesTheFoxSay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int c = 0; c < n; c++) {
            String line = sc.nextLine();
            String list[] = line.split(" ");
            Set set = new HashSet();
            while (sc.hasNext()) {
                sc.next();
                String goes = sc.next();
                String sound = sc.next();
                if (goes.equals("does")) {
                    sc.nextLine();
                    break;
                }
                set.add(sound);
            }
            for (int i = 0; i < list.length; i++) {
                if (!set.contains(list[i])) {
                    System.out.print(list[i] + " ");
                }
            }
            System.out.println("");
        }
    }
}