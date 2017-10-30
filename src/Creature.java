/**
 * Created by k1763840 on 30/10/17.
 */
public class Creature {
    int energy, fullness, happiness;
    String name;

    public Creature(String name){
        energy = 15;
        fullness = 15;
        happiness = 15;

        this.name = name;

    }

    public String getName(){
        return name;
    }

    public void eat(){
        if(fullness >= 12){
            print("Woops" + this.getName() + " is already full.");
        }
        else{
            fullness += 8;
            happiness -=6;
            energy -= 4;
            if(fullness > 15){fullness = 15;}
            print("Yummy....");
        }
    }

    public void sleep(){
        if(energy >= 12){
            print("Woops" + this.getName() + " is not that sleepy.");
        }
        else{
            energy += 8;
            happiness -=5;
            fullness -= 5;
            if(energy > 15){energy = 15;}
            print("Yay feeling better");
        }
    }

    public void play(){

            happiness += 8;
            fullness -= 4;
            energy -= 6;
            if(happiness > 15){happiness = 15;}
            print("Hehe I love to play");

    }

    public String checkStatus(){
        String status = "";

        if (happiness<= 6){
            status += "Oh, " + this.getName() + " is feeling sad\n";
        }
        if (energy <= 6){
            status+= "Hmm, " + this.getName() + " is feeling tired\n";
        }
        if (fullness <= 6){
            status += "Woops" + this.getName() + "is super hungry\n";
        }

        return status;
    }

    public void print(String s){
        System.out.println(s);
    }



}
