# Assignment4
Ryuta Kure, Milo Reynolds

Description:
This is a program that simulates the population of bacterias of different types in a limited space. It will run a certain amount 
of rounds, in each instance the values of each different bacteria type will change. Types determine how generous the organism
is in sharing energy with other bacteria.

Sources:
https://www.javatpoint.com/java-char-to-int

https://stackoverflow.com/questions/28854207/default-constructor-cannot-handle-exception-type-ioexception-thrown-by-implicit/28855378

http://www.java2novice.com/junit-examples/assert-equals/


Experiments:
We ran 60 trails. 6 different starting conditions, each ran 10 times.

  Exp. 1: Population size 10. 1 Cooperator. Rest Defector.
  
  Prediction: For this experiment, we predict that after 100 ticks, the population will be completely taken over by the defectors
  because the only 1 Cooperator is sharing energy with the defectors, but it would not benefit its own kind to reproduce. We predict
  that the Cooperation mean for each trial should be zero or very small value. 
  
  Trial 1:
  Mean Cooperation Probability = 0.0
  Trial 2:
  Mean Cooperation Probability = 0.0
  Trial 3:
  Mean Cooperation Probability = 0.0
  Trial 4:
  Mean Cooperation Probability = 0.0
  Trial 5:
  Mean Cooperation Probability = 0.0
  Trial 6:
  Mean Cooperation Probability = 0.0
  Trial 7:
  Mean Cooperation Probability = 0.0
  Trial 8:
  Mean Cooperation Probability = 0.0
  Trial 9:
  Mean Cooperation Probability = 0.0
  Trial 10:
  Mean Cooperation Probability = 0.0
  
  Average CP: 0.0
  
  Conclusion: Our results support the prediction because for every trial, the Mean Cooperation Probability was 0. 
  
  Exp 2: Population size 10. 1 Defector. Rest Cooperator.
  
  Prediction: 
  We predict that the cooperators will take over the Population from reproducing since it starts with a more dominant amount.
  
  Trial1:
  Mean Cooperation Probability = 0.0
  Trial 2:
  Mean Cooperation Probability = 0.0
  Trial 3:
  Mean Cooperation Probability = 1.0
  Trial 4:
  Mean Cooperation Probability = 0.0
  Trial 5:
  Mean Cooperation Probability = 1.0
  Trial 6:
  Mean Cooperation Probability = 1.0
  Trial 7:
  Mean Cooperation Probability = 1.0
  Trial 8:
  Mean Cooperation Probability = 1.0
  Trial 9:
  Mean Cooperation Probability = 0.0
  Trial 10:
  Mean Cooperation Probability = 1.0
 
  Average CP: 0.6
  
  Result:
  Our prediction was not supported by the trials because we initially predicted that the reproduction of cooperators may win 
  over the defectors. However, the result, although showing cooperators still won majority of the time, the defectors still 
  have a fairly large chance to take over. 
  
  Exp 3: Population size 10. 3 Defector. 3 cooperator. 4 PartialCooperator
  
  Prediction:
  We predict that the defector will win majority of the time. Cooperators will likely die out for every trial, and Partial Cooperator
  may have some chance of taking over. 
  
  Trial1:
  Mean Cooperation Probability = 0.0
  Trial 2:
  Mean Cooperation Probability = 0.0
  Trial 3:
  Mean Cooperation Probability = 0.25
  Trial 4:
  Mean Cooperation Probability = 0.0
  Trial 5:
  Mean Cooperation Probability = 0.05
  Trial 6:
  Mean Cooperation Probability = 0.45
  Trial 7:
  Mean Cooperation Probability = 0.5
  Trial 8:
  Mean Cooperation Probability = 0.25
  Trial 9:
  Mean Cooperation Probability = 0.5
  Trial 10:
  Mean Cooperation Probability = 0.2
  
  Average CP: 0.22
  
  Result:
  Our results displayed some very interesting results. Although our predictions were matched in the fact that cooperators never won,
  we were surprised by the dominance established by the partial cooperators. In a few trials, they either completely took over the population, 
  beating out the defectors, or it survived from the attacks of the defectors. 
  
  Exp 4: Population size 100. 1 Cooperator, Rest Defector
  
  Prediction:
  Milo:"There is absolutely no way cooperators will win any time."
  #Approved
  
  Trial 1:
  Mean Cooperation Probability = 0.0
  Trial 2:
  Mean Cooperation Probability = 0.0
  Trial 3:
  Mean Cooperation Probability = 0.0
  Trial 4:
  Mean Cooperation Probability = 0.0
  Trial 5:
  Mean Cooperation Probability = 0.0
  Trial 6:
  Mean Cooperation Probability = 0.0
  Trial 7:
  Mean Cooperation Probability = 0.0
  Trial 8:
  Mean Cooperation Probability = 0.0
  Trial 9:
  Mean Cooperation Probability = 0.0
  Trial 10:
  Mean Cooperation Probability = 0.0
  
  Average CP: 0.0
  
  Result:
  Every single one of our trials supported our prediction. 
  
  Exp 5: Population size 100. 1 Defector. Rest Cooperator
  
  Prediction:
  There will be a chance which Defectors will takeover. However, majority of the time, Cooperators should show dominance. 
  
  Trial 1:
  Mean Cooperation Probability = 0.04
  Trial 2:
  Mean Cooperation Probability = 1.0
  Trial 3:
  Mean Cooperation Probability = 1.0
  Trial 4:
  Mean Cooperation Probability = 1.0
  Trial 5:
  Mean Cooperation Probability = 1.0
  Trial 6:
  Mean Cooperation Probability = 1.0
  Trial 7:
  Mean Cooperation Probability = 1.0
  Trial 8:
  Mean Cooperation Probability = 1.0
  Trial 9:
  Mean Cooperation Probability = 1.0
  Trial 10:
  Mean Cooperation Probability = 0.43
  
  Average CP: 0.85
  
  Result: 
  Like the predictions, the results showed that majority of the time, cooperators won. However, there are times when defectors tookover
  
  Exp 6: Population size 100. 33 Cooperators 33 Defectors 34 Partial Cooperators
  
  Prediction:
  We predict that the results will be similar to the 3rd experiment. However, there will be surviving Cooperators occasionally. 
  
  Trial 1:
  Mean Cooperation Probability = 0.275
  Trial 2:
  Mean Cooperation Probability = 0.225
  Trial 3:
  Mean Cooperation Probability = 0.305
  Trial 4:
  Mean Cooperation Probability = 0.245
  Trial 5:
  Mean Cooperation Probability = 0.29
  Trial 6:
  Mean Cooperation Probability = 0.375
  Trial 7:
  Mean Cooperation Probability = 0.205
  Trial 8:
  Mean Cooperation Probability = 0.07
  Trial 9:
  Mean Cooperation Probability = 0.275
  Trial 10:
  Mean Cooperation Probability = 0.36
  
  Average CP: 0.26
  
  Results:
  Our results showed that interestingly the Defectors and Partial Cooperators were very evenly matched. Some occassions, Defectors
  dominated and other occassions, Partial Cooperators dominated. Cooperators rarely survived. (For one of the additional trials
  ran, there was 1 cooperator that survived.)
  
