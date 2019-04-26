import java.util.Scanner;

public class MainClass {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        TowerOfHanoi tower = new TowerOfHanoi();

        System.out.print("Enter number of disks: ");
        int noOfDisks = scanner.nextInt();

        tower.towerOfHanoi(noOfDisks, 'A', 'C', 'B');  
    }
}
