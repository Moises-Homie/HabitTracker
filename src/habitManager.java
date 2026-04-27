import java.util.ArrayList;

// This class manages all the habits in the app.
// It stores them, adds new ones, and returns the list when needed.
public class HabitManager {
    private ArrayList<Habit> habits = new ArrayList<>();

    // Add a new habit to the list
    public void addHabit(Habit habit) {
        habits.add(habit);
    }

    // Return all habits (used by UI later)
    public ArrayList<Habit> getHabits() {
        return habits;
    }
}
