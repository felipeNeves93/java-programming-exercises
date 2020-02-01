package exercises.codesignal.arrayconsecutive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayConsecutive {
    public int makeArrayConsecutive(int[] statues) {
        Arrays.sort(statues);
        List<Integer> newStatues = new ArrayList<>();

        for (int index = 0; index < statues.length -1; index++) {
            int newStatue = -1;
            int currentStatue = statues[index];
            int nextStatue = statues[index + 1];

            while (newStatue != 0) {
                newStatue = createStatueIfNeeded(currentStatue, nextStatue);

                if (newStatue > 0) {
                    currentStatue = newStatue;
                    newStatues.add(newStatue);
                } else {
                    currentStatue = 0;
                }
            }
        }
        return newStatues.size();
    }

    private int createStatueIfNeeded(int currentStatue, int secondStatue) {
        final int NO_STATUE_NEEDED = 0;
        if ((secondStatue - currentStatue) > 1) {
            return currentStatue + 1;
        }
        return NO_STATUE_NEEDED;
    }
}
