public class quizsuperhero2{
  public static void main(String[] args){
    SuperHero sh = new SuperHero();
    Batman bm1 = new Batman("Batman", "I am Rich");
    Superman sm1 = new Superman();
    Superman sm2 = new Superman ("Super Man", "I can fly");
    Spiderman sd1 = new Spiderman();
    Spiderman sd2 = new Spiderman("Spiderman", 20, "I can shoot spider web");
    
    System.out.println(sh);  
    System.out.println(bm1);
    System.out.println(sm1); 
    System.out.println(sm2);
    System.out.println(sd1);
    System.out.println(sd2);
  }
}

class SuperHero{
  private String heroName;
  
  public SuperHero(){
    this.heroName = "I am Super Hero. I have special power.";
  }
  public SuperHero(String n){
    this.heroName = "I am "+n;
  }
  public void setHeroName(String n){
    this.heroName = n;
  }
  public String toString(){
    return this.heroName;
  }
}

class Superman extends SuperHero{
  private String power;
  
  public Superman(){
    super("Super Hero");
    this.power = "I can fly";
  }
  public Superman(String n, String power){
    super(n);
    this.power = power;
  }
  public String toString(){
    return super.toString()+". "+power+".";
  }
}
class Spiderman extends SuperHero{
  private int age;
  private String power;
  
  public Spiderman(){
    super("Super Hero");
    this.age = 18;
    this.power = "I am Student";
  }
  public Spiderman(String n, int age, String power){
    super(n);
    this.age = age;
    this.power = power;
  }
  public String toString(){
    return super.toString()+". I am "+age+" years old. "+power+".";
  }
}

class Batman extends SuperHero{
  private String power;
  
  public Batman(){
    super("Batman");
    this.power = "I am rich";
  }
  public Batman(String n, String power){
    super(n);
    this.power = power;
  }
  public String toString(){
    return super.toString()+". "+power+".";
  }
}