// WeeklyHabit is another type of Habit.
// Also uses inheritance and will override the progress calculation.
public class WeeklyHabit extends Habit {

    public WeeklyHabit(String name, String category) {
        super(name, category);
    }

    @Override
    public void calculateProgress() {
        // TODO: Weekly habit progress logic will go here
        // For example: track how many days in the week it was completed
    }
}
