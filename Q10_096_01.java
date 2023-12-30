public class Q10_096_01{
public static void main(String[] args) {
      Fruit fruit = new Fruit();
      Banana banana = new Banana();
      Orange orange = new Orange();
      Coconut coconut = new Coconut();
      Frog frog = new Frog();
      Penguin penguin = new Penguin();
      Pig pig = new Pig();
      System.out.println(banana.howToEat());
      System.out.println(orange.howToEat());
      System.out.println(coconut.howToEat());
      System.out.println(frog.howToSleep());
      System.out.println(penguin.howToSleep());
      System.out.println(pig.howToSleep());
      System.out.println(penguin.howToSwim());
      System.out.println(frog.howToSwim());
      System.out.println(pig.howToEat());
      System.out.println(fruit.howToEat());
      System.out.println(penguin.sound());
      System.out.println(frog.sound());
      System.out.println(pig.sound());
    } 
}

abstract class Animal {
    public abstract String sound();

    public String howToSleep() {
        return "";
    }
}

interface Edible {
    public String howToEat();
}

interface Swimmable {
    public String howToSwim();
}

class Fruit implements Edible {
    public String howToEat() {
        return "Fruit is healthy food";
    }
}

class Banana extends Fruit {
    public String howToEat() {
        return "Banana: Make Healthy Banana Smoothie";
    }
}

class Orange extends Fruit {
    public String howToEat() {
        return "Orange: Make Orange Juice";
    }
}

class Coconut extends Fruit {
    public String howToEat() {
        return "Coconut: Refreshing with ice coconut water";
    }
}

class Frog extends Animal implements Swimmable {
    public String howToSleep() {
        return "Frog: May rest more throughout the day when the sun is hot";
    }

    public String sound() {
        return "Frog: Ribbit-Ribbit";
    }

    public String howToSwim() {
        return "Frog: Swim with their powerful hind legs, and flattened, streamlined body";
    }
}

class Penguin extends Animal implements Swimmable {
    public String howToSleep() {
        return "Penguin: Can sleep while floating in the water and standing up on the rocks";
    }

    public String sound() {
        return "Penguin: Honk-Honk";
    }

    public String howToSwim() {
        return "Penguin: Swim by using them wings that paddle-like flippers";
    }
}

class Pig extends Animal implements Edible {
    public String howToSleep() {
        return "Pig: Like to sleep snuggled up together in their nest";
    }

    public String sound() {
        return "Pig: Oink-Oink";
    }

    public String howToEat() {
        return "Pig: Grill or Fry it";
    }
}