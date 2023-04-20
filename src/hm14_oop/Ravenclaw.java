package hm14_oop;

public class Ravenclaw extends GeneralQualities{
    private int intellect; // ум
    private int wisdom; // мудрость
    private int wittiness; // остроумие
    private int creation; // творчество
    public Ravenclaw(String name, int magic, int transgression, int intellect, int wisdom, int wittiness, int creation) {
        super(name, magic, transgression);
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creation = creation;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWittiness() {
        return wittiness;
    }

    public void setWittiness(int wittiness) {
        this.wittiness = wittiness;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "name=" + getName() +
                ", magic=" + getMagic() +
                ", transgression=" + getTransgression() +
                ", intellect=" + intellect +
                ", wisdom=" + wisdom +
                ", wittiness=" + wittiness +
                ", creation=" + creation +
                '}';
    }
}
//Когтевранцы умны, мудры, остроумны и полны творчества.