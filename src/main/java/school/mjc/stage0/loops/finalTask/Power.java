package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int num = 1;
        for (int i = 1; i <= power; i++) {
            num = num * numberToPrint;
        }
        System.out.println(num);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
