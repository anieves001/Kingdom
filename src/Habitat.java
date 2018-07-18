import java.util.Random;

public class Habitat {

    public static void setField(char field[][]){  //sets 30x30 field with Random Plants, Herbivores and Carnivores
        Plant myPlant = new Plant();
        Carnivore myCarnivore = new Carnivore();
        Herbivore myHerbivore = new Herbivore();

        for(int i = 0;i < field.length;i++){
            for(int j = 0;j < field.length;j++){
                Random num = new Random();      //Random number generator
                int m = num.nextInt(30);
                int n = num.nextInt(30);
                int p = num.nextInt(30);
                int q = num.nextInt(30);
                if((i==n||j==m||i==p||i==q)){    //Random placement based on condition
                    field[i][j] = myPlant.populate();
                }
                else if(j==p){
                    field[i][j] = myHerbivore.populate();
                }
                else if(j==q){
                    field[i][j] = myCarnivore.populate();
                }
                else{
                    field[i][j] = myPlant.depop();
                }


            }

        }

    }



    public static void printHabitat(char field[][]){

        for (int i = 0;i < field.length;i++) {      //Nested loop prints 30x30 matrix
            for(int j = 0;j < field.length;j++) {
                   System.out.print(field[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        for(int k = 0;k < field.length;k++) {   //Separates iterations
            System.out.print("--");
        }
        System.out.println();
    }

    public static void main(String args[]) {

        Carnivore myCarn = new Carnivore();
        Herbivore myHerb = new Herbivore();

        char array[][] = new char[30][30];
        setField(array);
        for(int i = 0;i < 30;i++) {

            printHabitat(array);
            myHerb.findFood(array);
            myCarn.findFood(array);

        }

    }
}
