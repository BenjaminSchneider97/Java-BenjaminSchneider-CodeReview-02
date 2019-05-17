//1
public class Exercise {
    private String name;
    private String description;
    private int duration;
    private String position;

    Exercise(String name, String description, int duration, String position){
        this.name = name;
        this.description = description;
        this.duration = duration;
        this.position = position;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    //3
    public String printExercise(){
        return
            this.name + "\t\tDURATION: " + this.duration + " seconds.\n" +
            "--------------------------------------------------\n" +
            "DESCRIPTION: " + this.description + "\n";
    }
}
