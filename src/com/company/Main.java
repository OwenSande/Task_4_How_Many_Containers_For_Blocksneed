package com.company;

public class Main {

    public static void main(String[] args) {
	    int amountOfBricks = 69;
        int containerCapacity = 8;

        //DIVIDING TO GET NUMBER OF FULL CONTAINERS
        System.out.println("We have "+amountOfBricks/containerCapacity+" full containers of blocks");

        //GETTING THE NUMBER OF CONTAINERS WE HAVE BOTH FULL AND NOT FULL
        int totalNumOfContainers=0;
        if(amountOfBricks % containerCapacity>0){totalNumOfContainers=(amountOfBricks/containerCapacity)+1;}
        System.out.println("The number of containers both full and not full is "+totalNumOfContainers);

        //CALCULATING THE REMAINDER TO GET THE REMAINING BLOCK
        System.out.println("There are "+ amountOfBricks % containerCapacity +" blocks in the container that is not full");
    }
}
