package p1;

public class Monster {

    static double weight;
  

    public Monster(int weight) {
        Monster.weight = weight;
    }

    public double eat() {

        weight = weight + 1;
        return weight;
    }
    
    
}
