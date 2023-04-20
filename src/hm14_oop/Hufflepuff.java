package hm14_oop;

public class Hufflepuff extends GeneralQualities{
    private int industriousness; // трудолюбие
    private int loyalty; // верность
    private int honesty; // честность

    public Hufflepuff(String name, int magic, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, magic, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "name=" + getName() +
                ", magic=" + getMagic() +
                ", transgression=" + getTransgression() +
                ", industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
}
//Студенты Пуффендуя трудолюбивы, верны, честны.