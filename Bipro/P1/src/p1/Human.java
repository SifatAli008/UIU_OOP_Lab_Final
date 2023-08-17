package p1;

public  class Human implements Animal {

    String name;
    int height;
    double weight;
    String intelligence;
    String bravery;

    public  Human(String name, int height, String intelligence, String bravery) {
        this.name = name;
        this.height = height;
        this.intelligence = intelligence;
        this.bravery = bravery;
    }

    @Override
    public boolean isIntelligent() {
        boolean value;
        if (this.intelligence.equals("high")) {
            value = true;
        } else {
            value = false;
        }
        return value;
    }
    
    public boolean bravery(){
    boolean value;
        if (this.intelligence.equals("brave")) {
            value = true;
        } else {
            value = false;
        }
        return value;
    }

    @Override
    public void expectedHight() {
        weight=(height*0.5);
    }
    
}
