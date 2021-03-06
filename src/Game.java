/**
 * Created by k1763840 on 30/10/17.
 */

import java.util.Scanner;

public class Game {

    Scanner scanner = new Scanner(System.in);

    Creature creature;

    boolean userQuits = false;

    public void run(){
        boolean userQuits = false;
        
        startTutorial();

        while(userQuits){
            interact();
            print(this.creature.checkStatus());

        }

        print("time to put this creature to sleep.");
    }

    private void startTutorial() {
        print("Hi ");
        print("Whats the name of ur creature?");

        String name = scanner.nextLine();

        this.creature = new Creature(name);

        print("Great you can now meet your new friend: " + this.creature.getName() +" .");
    }

    private void interact(){
        print("What would you like to do?");

        print("1. Play");
        print("2. Eat");
        print("3. Sleep");
        print("4. Quit");

        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                creature.play();
                break;
            case 2:
                creature.eat();
                break;
            case 3:
                creature.sleep();
                break;
            case 4:
                userQuits = true;
                break;
            default:
                print("Woops, u have to pick a number between 1 and 4.");
                break;

        }
    }


    public void print(String s){
        System.out.println(s);
    }

}
