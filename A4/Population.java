package A4;
import java.util.Random;

// class Population
public class Population {
  
  //Initialize an array of Organism
  Organism[] Population;
  
  //Initialize an array of three pairs for input
  @SuppressWarnings("unchecked")
  Pair<String, Integer>[] orgs = (Pair<String, Integer>[])(new Pair [3]);

  //Constructor
  public Population(Pair<String, Integer>[] counts){
    // Initializes orgs variable as input
    orgs = counts;
    // Initializes the size of Population to the total space all Organisms take over in the beginning
    Population = new Organism[counts[0].right + counts[1].right + counts[2].right];
    
    //ticks is a counter used to fill in the array, Population
    int ticks = 0;
    
    //Loops through the array of pairs 
    for (int i = 0; i < counts.length; i++) {
      
      //Loops through the number of Organisms of that type to fill in the Population array.
      for (int k = 0; k < counts[i].right; k++) {
        
        //returns error if not mentioned in mapping
        if (counts[i].left != "Cooperator" && counts[i].left != "Defector" && counts[i].left != "PartialCooperator") {
          throw new IllegalArgumentException("Organism type not part of mapping.");
        }
        
        //if statements that initializes the element to organism of that type
        if (counts[i].left == "Cooperator") {
          Population[ticks] = new Cooperator();
        }
        else if (counts[i].left == "Defector") {
          Population[ticks] = new Defector();
        }
        else if (counts[i].left == "PartialCooperator") {
          Population[ticks] = new PartialCooperator();
        }
        
        //increments ticks to move to next space on the array.
        ticks++;
      }
    }
  }

  //Updates all Organisms in the array and checks whether they cooperate or reproduce.
  //If they do cooperate or reproduce, then cooperate or reproduce. 
  public void update() {
    Random rand = new Random();
    for (int i = 0; i < Population.length; i++) { // outer for loop iterates through population array, updating
      Population[i].update();
      if (Population[i].cooperates()) { //take 1 energy from organism that cooperates
        Population[i].decrementEnergy();
        for (int j = 0; j < 8; j++) { 
          //rearrange array to randomly swap first 8 organisms in array, to facilitate random energy distribution
          int k = rand.nextInt(Population.length);
          Organism temp = Population[j];
          Population[j] = Population[k];
          Population[k] = temp;
        } 
        for (int v = 0; v < 8; v++) { //gives first 8 random organisms each one energy
          Population[v].incrementEnergy();
        }
      }
      if (Population[i].getEnergy() >= 10) { //reproduce organism if ready
        Population[i].energy -= 10;
        int m = rand.nextInt(Population.length);
        Population[m] = Population[i].reproduce();
      }
    }
  }
  
  
  public double calculateCooperationMean() {
    double sum = 0;
    double mean;
    for (int i = 0; i < Population.length; i++) { //sums cooperation probability
      sum += Population[i].getCooperationProbability();
    }
    mean = sum/Population.length; //divide sum by number of organisms to get mean
    return mean;
  } //calculateCooperationMean()
  
  public Pair<String, Integer>[] getPopulationCounts(){
    // initialize variables to keep track of organism type/amount
    int coops = 0;
    int defect = 0;
    int partcoops = 0;
    for (int i = 0; i < Population.length; i++) { //iterates through organism array, counting types
      if (Population[i].type == "Cooperator")
        coops++;
      else if (Population[i].type == "Defector")
        defect++;
      else if (Population[i].type == "PartialCooperator")
        partcoops++;
    }
    // creating the pairs for use in ALifeSim
    orgs[0] = new Pair<String, Integer> ("Cooperator", coops);
    orgs[1] = new Pair<String, Integer> ("Defector", defect);
    orgs[2] = new Pair<String, Integer> ("PartialCooperator", partcoops);
    return orgs;
  }
}
