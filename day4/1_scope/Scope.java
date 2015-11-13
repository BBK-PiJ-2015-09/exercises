
import java.util.Scanner;

public class Scope { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        UnitMatrix unitMatrix = new UnitMatrix();
        unitMatrix.setSize(10);
        unitMatrix.print();
    }
    static class UnitMatrix {
        int size;
        void setSize(int newSize) {
            this.size = newSize;
        }
        void print() {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (i == j) {
                        System.out.println("1 ");
                    } else {
                        System.out.println("0 ");
                    }
                }
                System.out.println("");
            }
        }
    }
}