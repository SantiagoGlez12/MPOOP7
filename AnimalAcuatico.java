public class AnimalAcuatico extends Animal{
  private int aletas;

  public AnimalAcuatico(){}

  public void nadar(){
    System.out.println("estoy nadando");
  }

  @Override

  public void comer(){
    System.out.println("Estoy comiendo peces");
  }
}