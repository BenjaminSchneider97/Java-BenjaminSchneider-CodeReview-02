//Bonus
public class IntervalWorkout {
    private Exercise[] intervalExercises;
    private int repetitions;
    private int breaktime;

    IntervalWorkout(Exercise[] intervalExercises, int repetitions, int breaktime) {
        this.intervalExercises = intervalExercises;
        this.repetitions = repetitions;
        this.breaktime = breaktime;
    }

    public void printIntervalWorkout() {
        System.out.println(
                "*****************************\n" +
                "Interval Workout STARTS !!!!\n" +
                "*****************************"
        );
        for (int i = 1; i <= this.repetitions; i++) {
            System.out.println(
                    "=============================\n" +
                    "ROUND " + i + ":"
            );
            for(int j = 0; j < intervalExercises.length; j++) {
                System.out.println(intervalExercises[j].getName());
            }
            if (i < this.repetitions) {
                System.out.println(
                        "=============================\n" +
                        "DO THE BREAK (" + this.breaktime + " SECONDS)"
                );
            }
        }
        System.out.println(
                "*****************************\n" +
                "CONGRATS - YOU ARE DONE !!!\n" +
                "*****************************"
        );
    }
}
