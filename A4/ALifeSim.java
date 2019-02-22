package A4;
import java.io.PrintWriter;

/*
 * @author Ryuta Kure, Milo Reynolds
 */

public class ALifeSim {
  
  //main for running experiments
  public static void main(String[] args) throws Exception{
    PrintWriter pen = new PrintWriter(System.out, true);
    @SuppressWarnings("unchecked")
    Pair<String, Integer>[] p = (Pair<String, Integer>[])(new Pair [3]);
    // initialize variable to receive input
    int iter;
    int coop;
    int defect;
    int partcoop;
    
    // turn input into int and set to corresponding variable 
    iter = Integer.parseInt(args[0]);
    coop = Integer.parseInt(args[1]);
    defect = Integer.parseInt(args[2]);
    partcoop = Integer.parseInt(args[3]);
    
    // used to make new array of pairs
    p[0] = new Pair<String, Integer> ("Cooperator", coop);
    p[1] = new Pair<String, Integer> ("Defector", defect);
    p[2] = new Pair<String, Integer> ("PartialCooperator", partcoop);
    // initialize new population
    Population Popu = new Population(p);
    for (int i = 0; i < iter; i++) { // call update for specified number of iterations
      Popu.update();
    }
    
    // print results
    pen.println("After " + iter + " ticks:");
    pen.println("Cooperators = " + Popu.getPopulationCounts()[0].right);
    pen.println("Defectors = " + Popu.getPopulationCounts()[1].right);
    pen.println("Partial = " + Popu.getPopulationCounts()[2].right);
    pen.println("Mean Cooperation Probability = " + Popu.calculateCooperationMean());
  }
}
