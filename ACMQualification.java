import java.util.Scanner;

public class ACMQualification {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int c = 0; c < n; c++) {
            String line = sc.nextLine();
            String list[] = line.split(" ");
            String name = list[0];
            String schoolDate = list[1];
            String birthDate = list[2];
            int courses = Integer.parseInt(list[3]);
             if (getYear(schoolDate) >= 2010) {
                System.out.println(name + " eligible");
                continue;
            }
            if (getYear(birthDate) >= 1991) {
                System.out.println(name + " eligible");
                continue;
            }
            if (courses >= 41) {
                System.out.println(name + " ineligible");
                continue;
            }
            System.out.println(name + " coach petitions");
        }
    }

    public static int getYear(String s) {
        String list[] = s.split("/");
        return Integer.parseInt(list[0]);

    }

}