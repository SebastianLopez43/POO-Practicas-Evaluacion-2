package eva2_3_heredity_3;

/**
 * @author José Sebastian López Ibarra
 * Tuesday March 22 2022
 */

public class EVA2_3_HEREDITY_3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.move();
        Vertebrate vertebrate = new Vertebrate();
        vertebrate.hasASkeleton();
        Mammals mammal = new Mammals();
        mammal.hasHair();
        Primates primate = new Primates();
        primate.grabObjects();
        Humans human = new Humans();
        human.reasoning();
    }
    
}

class Humans extends Primates{
    public Humans() {
        super();
        System.out.println("  - Human");
    }
    
    public void reasoning(){
        System.out.println("Human: Reasoning.");
    }
}

class Primates extends Mammals{
    public Primates() {
        super();
        System.out.println("  - Primates");
    }
    
    public void grabObjects() {
        System.out.println("Primates: Grab objects.");
    }
}

class Mammals extends Vertebrate{
    public Mammals() {
        super();
        System.out.println("  - Mammals");
    }
    
    public void hasHair() {
        System.out.println("Mammals: Has hair.");
    }
}

class Vertebrate extends Animal {
    public Vertebrate() {
        super();
        System.out.println("  - Vertebrate");
    }
    
    public void hasASkeleton() {
        System.out.println("Vertebrate: Has a skeleton,");
    }
}

class Animal {    
    public Animal() {
        System.out.println("    \n- Animal");
    }
    
    public void move() {
        System.out.println("Animal: Movement.");
    }
}