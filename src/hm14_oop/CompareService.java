package hm14_oop;

public class CompareService {
    void compareGryffindorStrudents(Gryffindor student1, Gryffindor student2) {
        int points1 = student1.getBravery() + student1.getNobility() + student1.getHonor();
        int points2 = student2.getBravery() + student2.getNobility() + student2.getHonor();
        if (points1 > points2) {
            System.out.println("Студент " + student1.getName() + " (" + points1 + ") лучше, чем " + student2.getName() + " (" + points2 + ")");
        } else if (points1 < points2) {
            System.out.println("Студент " + student2.getName() + " (" + points2 + ") лучше, чем " + student1.getName() + " (" +points1 + ")");
        } else {
            System.out.println("Студенты " + student1.getName() + " (" + points1 + ") и "
                    + student2.getName() + " (" +points1 + ") имеют одинаковое количество баллов");
        }
    }
    void compareHufflepuffStrudents(Hufflepuff student1, Hufflepuff student2) {
        int points1 = student1.getHonesty() + student1.getLoyalty() + student1.getIndustriousness();
        int points2 = student2.getHonesty() + student2.getLoyalty() + student2.getIndustriousness();
        if (points1 > points2) {
            System.out.println("Студент " + student1.getName() + " (" + points1 + ") лучше, чем " + student2.getName() + " (" + points2 + ")");
        } else if (points1 < points2) {
            System.out.println("Студент " + student2.getName() + " (" + points2 + ") лучше, чем " + student1.getName() + " (" +points1 + ")");
        } else {
            System.out.println("Студенты " + student1.getName() + " (" + points1 + ") и "
                    + student2.getName() + " (" +points1 + ") имеют одинаковое количество баллов");
        }
    }
    void compareRavenclawStrudents(Ravenclaw student1, Ravenclaw student2) {
        int points1 = student1.getCreation() + student1.getIntellect() + student1.getWisdom() + student1.getWittiness();
        int points2 = student2.getCreation() + student2.getIntellect() + student2.getWisdom() + student2.getWittiness();
        if (points1 > points2) {
            System.out.println("Студент " + student1.getName() + " (" + points1 + ") лучше, чем " + student2.getName() + " (" + points2 + ")");
        } else if (points1 < points2) {
            System.out.println("Студент " + student2.getName() + " (" + points2 + ") лучше, чем " + student1.getName() + " (" +points1 + ")");
        } else {
            System.out.println("Студенты " + student1.getName() + " (" + points1 + ") и "
                    + student2.getName() + " (" +points1 + ") имеют одинаковое количество баллов");
        }
    }
    void compareSlytherinStrudents(Slytherin student1, Slytherin student2) {
        int points1 = student1.getCunning() + student1.getDetermination() + student1.getResourcefulness() + student1.getLustForPower();
        int points2 = student2.getCunning() + student2.getDetermination() + student2.getResourcefulness() + student2.getLustForPower();
        if (points1 > points2) {
            System.out.println("Студент " + student1.getName() + " (" + points1 + ") лучше, чем " + student2.getName() + " (" + points2 + ")");
        } else if (points1 < points2) {
            System.out.println("Студент " + student2.getName() + " (" + points2 + ") лучше, чем " + student1.getName() + " (" +points1 + ")");
        } else {
            System.out.println("Студенты " + student1.getName() + " (" + points1 + ") и "
                    + student2.getName() + " (" +points1 + ") имеют одинаковое количество баллов");
        }
    }

    void compareAnyStrudents(HogwartsStudents student1, HogwartsStudents student2) {
        int points1 = student1.getMagic() + student1.getTransgression();
        int points2 = student2.getMagic() + student2.getTransgression();
        if (points1 > points2) {
            System.out.println("Студент " + student1.getName() + " (" + points1 + ") лучше, чем " + student2.getName() + " (" + points2 + ")");
        } else if (points1 < points2) {
            System.out.println("Студент " + student2.getName() + " (" + points2 + ") лучше, чем " + student1.getName() + " (" +points1 + ")");
        } else {
            System.out.println("Студенты " + student1.getName() + " (" + points1 + ") и "
                    + student2.getName() + " (" +points1 + ") имеют одинаковое количество баллов");
        }
    }
}
