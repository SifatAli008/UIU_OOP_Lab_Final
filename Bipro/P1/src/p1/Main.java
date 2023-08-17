package p1;

public class Main {

    public static void main(String[] args) {
        Human human1 = new Human("Jon", 70, "medium", "brave");
        Human human2 = new Human("Sam", 100, "high", "not brave");

        CookieMonster coo = new CookieMonster(100);
        coo.scare(human1);
        coo.scare(human2);
        coo.eat();
        System.out.println(coo);

        ScaryMonster doggo = new ScaryMonster(500);
        doggo.eat(human1);
        doggo.eat(human2);
        System.out.println(doggo);
    }

}
