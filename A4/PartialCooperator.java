package A4;

import java.util.Random;

// class PartialCooperator
public class PartialCooperator extends Organism {

  //Constructor
  public PartialCooperator() {
    super();
    this.type = "PartialCooperator";
    this.CooperationProbability = 0.5;
  }

  @Override
  public String getType() {
    return this.type;
  } //getType()

  @Override
  public PartialCooperator reproduce() {
    PartialCooperator offspring = new PartialCooperator();
    return offspring;
  } //reproduce()

  @Override
  public double getCooperationProbability() {
    return CooperationProbability;
  } //getCooperationProbability()

  @Override
  public boolean cooperates() {
    Random rand = new Random();
    int n = rand.nextInt(1);
    
    // A random number generated between one and zero(50/50 probability)
    //if random number generated is one, then return true.
    if (n > 0)
      return true;
    //if random number generated is zero, return false
    else
      return false;
  } //cooperates()
}
