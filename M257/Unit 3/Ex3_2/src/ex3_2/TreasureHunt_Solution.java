package ex3_2;

/**
 * Title: Exercise 3.2 Class TreasureHunt - sample solution
 * Description: Main class which uses the methods of CarTracker
 * to locate hidden treasure
 *
 * Copyright:    Copyright (c) 2004, 2006
 * Company:      The Open University
 * @author M257 Course Team
 * @version 1.1 July 2010
 */
public class TreasureHunt_Solution
{

    public static void main(String[] args)
    {
        // First compare the distances from A with the given values.
        // A is at (11,5)
        CarTracker journey1 = new CarTracker(11, 5, 8, 33);    //A to Spyglass
        CarTracker journey2 = new CarTracker(11, 5, 6, 18);    //A to Smuggler's Cove
        CarTracker journey3 = new CarTracker(11, 5, 15, 25);   //A to Parrot Point

        //Three things must be true for A to be the place where the treasure is
        System.out.println(journey1.greaterThan(5));      //Is A more than 5k from Spyglass?
        System.out.println(!journey2.greaterThan(11));    //Is A not more than 11k from Smuggler's Cove?
        System.out.println(journey3.greaterThan(10));     //Is A more than 10k from Parrot Point?

        // You could also write an if statement like the following
        if (journey1.greaterThan(5) && !journey2.greaterThan(11)
                && journey3.greaterThan(10))
        {
            System.out.println("The treasure is at A");
        }

        // Next compare the distances from B with the given values.
        CarTracker journey4 = new CarTracker(1, 9, 8, 33);
        CarTracker journey5 = new CarTracker(1, 9, 6, 18);
        CarTracker journey6 = new CarTracker(1, 9, 15, 25);

        //And ask the same questions of B's position
        System.out.println(journey4.greaterThan(5));
        System.out.println(!journey5.greaterThan(11));
        System.out.println(journey6.greaterThan(10));

        // You could also write an if statement like the following
        if (journey4.greaterThan(5) && !journey5.greaterThan(11)
                && journey6.greaterThan(10))
        {
            System.out.println("The treasure is at B");
        }

        // Running the program at this stage revealed that the treasure
        // lies at point B.  We then added the statements to calculate
        // the travel distance from Spyglass Hill to the Ship Inn,
        // via the treasure location
        CarTracker stage1 = new CarTracker(8, 33, 1, 9);    //from Spyglass to B
        CarTracker stage2 = new CarTracker(1, 9, 15, 15);   //from B to Ship Inn

        System.out.print(
                "the distance from Spyglass to Ship Inn via the treasure is ");
        System.out.print(stage1.journeyDistance() + stage2.journeyDistance());
        System.out.println(" km");
    }
}
