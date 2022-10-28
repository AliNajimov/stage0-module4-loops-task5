package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i + j < num - 1 && i > j || i + j > num - 1 && i < j) {
                    System.out.print(" ");
                } else {
                    System.out.print("8");
                }
            }
            System.out.println();
        }
    }
}
