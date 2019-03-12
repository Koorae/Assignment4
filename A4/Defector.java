package A4;

// class Defector
public class Defector extends Organism { 
  
  //Constructor
  public Defector() {
    super();
    this.type = "Defector";
    this.CooperationProbability = 0.0;
  }
  
  @Override
  public String getType() {
    return this.type;
  } //getType()
  
  @Override
  public Defector reproduce() {
    Defector offspring = new Defector();
    return offspring;
  } //reproduce()
  
  @Override
  public double getCooperationProbability(){
    return CooperationProbability;
  } //getCooperationProbability()
  
  @Override
  public boolean cooperates() {
    return false;
  } //cooperates()
}
