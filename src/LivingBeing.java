
public abstract class LivingBeing {

    private int lifespan;
    private int reproductionAge;
    private char symbol;

    LivingBeing(int years,int age){

        this.lifespan = years;
        this.reproductionAge = age;

    }

    protected void giveBirth(int age){

        if(age == reproductionAge){     //Determines if object has reached reproduction age
            populate();
        }
    }
    protected char populate() {       //method to populate field

        return symbol;
    }
    protected char depop(){           //method to depopulate field
        char death = '_';
        return death;
    }
    protected void reproduce(int n){      //method to check iteration
        if(n == lifespan){
            depop();
        }
        else if(n==reproductionAge){
            populate();
        }
    }

}
