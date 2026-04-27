// Base class for all habits in the app.
// This class uses abstraction because we don't know how each habit calculates progress yet.
public abstract class Habit {
    protected String name;       // Name of the habit (ex: Drink Water)
    protected String category;   // Category (ex: Health, Study)
    protected int streak;        // How many days in a row the habit was completed

    // Constructor to set up basic habit information
    public Habit(String name, String category) {
        this.name = name;
        this.category = category;
        this.streak = 0;
    }

    // Each habit type will calculate progress differently (polymorphism)
    public abstract void calculateProgress();

    // Encapsulation: getters to access private/protected fields
    public String getName() { return name; }
    public String getCategory() { return category; }
    public int getStreak() { return streak; }

    // Method to increase streak when user completes the habit
    public void incrementStreak() {
        streak++;
    }
}
