package A4;
import java.util.Random;

// class Organism
public class Organism {
  double CooperationProbability;
  int energy;
  String type;

  public Organism() {
    this.energy = 0;
  } // constructor

  public int getEnergy() {
    return this.energy;
  } // getEnergy()

  public void update() {
    this.incrementEnergy();
  } //update()

  public void incrementEnergy() {
    this.energy += 1;
  } //incrementEnergy()

  public void decrementEnergy() {
    if (this.energy >= 0)
      this.energy -= 1;
  } //decrementEnergy()

  public String getType() {
    return this.type;
  } //getType()

  public Organism reproduce() {
    Organism offspring = new Organism();
    return offspring;
  } //reproduce()

  public double getCooperationProbability() {
    return this.CooperationProbability;
  } //getCooperationProbability

  public boolean cooperates(){
    Random rand = new Random();
    int n = rand.nextInt(1);
    if (this.CooperationProbability == 0)
      return false;
    else if (this.CooperationProbability == 1)
      return true;
    else {
      if (n > 0)
      return true;
    else 
      return false;
          }
  } //cooperates()
}
