package advent.day1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Day1 {
    private static final String FILE_NAME = "src/advent/day1/day1.txt";

    public void partOne() {
        try {
            Integer sum = Files.readAllLines(Paths.get(FILE_NAME))
                    .stream()
                    .mapToInt(val -> Integer.parseInt(val) / 3 - 2)
                    .sum();
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void partTwo() {
        try {
            Integer sum = Files.readAllLines(Paths.get(FILE_NAME))
                    .stream()
                    .mapToInt(val -> calculateAdditionalFuel(Integer.parseInt(val) / 3 - 2))
                    .sum();
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int calculateAdditionalFuel(int val) {
        int fuelSum = 0;

        while (val > 0) {
            fuelSum += val;
            val = (val / 3) - 2;
        }
        return fuelSum;
    }
}
