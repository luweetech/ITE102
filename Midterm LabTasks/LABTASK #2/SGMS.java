import java.util.Scanner;
public class SGMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][][] grades = new double[2][3][3];
        String[] subjects = {"Java", "Database", "Networking"};

        for (int section = 0; section < 2; section++) {
            System.out.println("\nSECTION " + (section + 1));
            for (int student = 0; student < 3; student++) {
                System.out.println("\nStudent " + (student + 1));
                for (int subject = 0; subject < 3; subject++) {
                    System.out.print(subjects[subject] + " Grade: ");
                    grades[section][student][subject] = sc.nextDouble();
                }
            }
        }

        for (int section = 0; section < 2; section++) {
            System.out.println("------------------------");
            System.out.println("\nSECTION " + (section + 1));
            double sectionTotal = 0;
            for (int student = 0; student < 3; student++) {
                double studentTotal = 0;
                System.out.println("\nStudent " + (student + 1));
                for (int subject = 0; subject < 3; subject++) {
                    System.out.println(subjects[subject] + ": "+ grades[section][student][subject]);
                studentTotal += grades[section][student][subject];
                }
                double studentAvg = studentTotal / 3;
                sectionTotal += studentAvg;
                System.out.printf("Student Average: %.2f%n", studentAvg);
                System.out.println("------------------------");

            }
            double sectionAvg = sectionTotal / 3;
            System.out.printf("\nSection Average: %.2f%n", sectionAvg);
        }
        sc.close();
    }
}