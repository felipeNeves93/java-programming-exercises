package exercises.codesignal.almostincreasingsequence;

public class AlmostIncreasingSequence {
    public boolean isAlmostIncreasingSequence(int[] sequence) {
        int counter1 = 0;
        int counter2 = 0;

        for(int i = 0 ; i < sequence.length-1 ; i++){
            if(sequence[i] >= sequence[i+1]) {
                counter1++;
            }
        }

        for(int i = 0 ; i < sequence.length-2 ; i++){
            if(sequence[i] >= sequence[i+2]){
                counter2++;
            }
        }
        return (counter1 <=1) && (counter2 <= 1);
    }
}
