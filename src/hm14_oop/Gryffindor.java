package hm14_oop;

public class Gryffindor extends HogwartsStudents {
    private int nobility; // благородство
    private int honor; // честь
    private int bravery; // храбрость

    public Gryffindor(String name, int magic, int transgression, int nobility, int honor, int bravery) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "name=" + getName() +
                ", magic=" + getMagic() +
                ", transgression=" + getTransgression() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}
//Всем Гриффиндорцам присущи благородство, честь и храбрость.

