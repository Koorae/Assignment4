package A4;

// class cooperator
public class Cooperator extends Organism {
  
  //constructor
  public Cooperator() {
    super();
    this.type = "Cooperator";
    this.CooperationProbability = 1.0;
  } 
  
  @Override
  public String getType() {
    return this.type;
  } //getType()
  
  @Override
  public Cooperator reproduce() {
    Cooperator offspring = new Cooperator();
    return offspring;
  } //reproduce()
  
  @Override
  public double getCooperationProbability(){
    return CooperationProbability;
  } //getCooperationProbability
  
  @Override
  public boolean cooperates() {
    return true;
  } //cooperates()
  
}
