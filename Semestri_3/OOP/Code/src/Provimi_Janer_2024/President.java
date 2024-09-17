package Provimi_Janer_2024;

public class President extends Person{
    public int experience_years;
    public String title;

    public President(String name, int age, int experience_years, String title) {
        super(name, age);
        this.experience_years = experience_years;
        this.title = title;
    }

    public int getExperience_years() {
        return experience_years;
    }

    public void setExperience_years(int experience_years) {
        this.experience_years = experience_years;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
