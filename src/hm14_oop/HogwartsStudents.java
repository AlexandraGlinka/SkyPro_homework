package hm14_oop;

public abstract class HogwartsStudents {
    private String name;
    private int magic; // владение магией
    private int transgression; // способность трансгрессировать
   // public int id; // id студента
   // protected static int countStudents; // счетчик студентов

    public HogwartsStudents(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }
}
// для всех - магия и трансгрессия