
package p1;

import static p1.Monster.weight;

public class CookieMonster extends Monster{
      static int scarecount;
    
    public CookieMonster(int weight) {
        super(weight);
    }
    
   public void scare(Human h){
     boolean value = h.bravery();
    if (value) {
       
    } else {
          eat();
          scarecount++;
          System.out.println(" Scream ");
    }
   }
   
  @Override
        public String toString(){
         return " ScaryMonster " +" Weight : "+weight+" Scare : "+scarecount;
        }
   
  
  
    
}
