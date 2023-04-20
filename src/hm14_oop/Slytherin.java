package hm14_oop;

public class Slytherin extends GeneralQualities{
    private int cunning; // хитрость
    private int determination; // решительность
    private int resourcefulness; // находчивость
    private int lustForPower; // жажда власти

    public Slytherin(String name, int magic, int transgression, int cunning, int determination, int resourcefulness, int lustForPower) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "name=" + getName() +
                ", magic=" + getMagic() +
                ", transgression=" + getTransgression() +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                '}';
    }
}

//Всем ученикам Слизерина присущи хитрость, решительность, амбициозность, находчивость и жажда власти.
