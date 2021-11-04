public class Animal{
  private String nombre;
  private String lugarOrigen;
  private String color;

  public Animal(){}

  public void hacerSonido(String sonido){
    System.out.println("Estoy haciendo un sonido "+sonido);
  }

  public void comer(){
    System.out.println("Estoy comiendo");
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  public String getNombre(){
    return nombre;
  }
}