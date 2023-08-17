package p1;


import static p1.Monster.weight;

public class ScaryMonster extends Monster {
  static int scarecount;

    public ScaryMonster(int weight) {
        super(weight);
    }

    public void eat(Human h) {
        boolean value = h.isIntelligent();
        if (value) {

        } else {
            weight=weight+1;
            scarecount++;
        }
    }
    @Override
        public String toString(){
          return " ScaryMonster " +" Weight : "+weight+" Scare : "+scarecount;
        }

}
