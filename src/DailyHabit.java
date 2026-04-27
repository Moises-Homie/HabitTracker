// DailyHabit is a specific type of Habit.
// This shows inheritance because it extends the Habit class.
public class DailyHabit extends Habit {

    public DailyHabit(String name, String category) {
        super(name, category); // Call the Habit constructor
    }

    @Override
    public void calculateProgress() {
        // TODO: Daily habit progress logic will go here
        // For example: check if user completed it today
    }
}
