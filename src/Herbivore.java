import java.util.Random;
public class Herbivore extends LivingBeing {
    final private char symbol = 'H';
    protected Plant food;

    Herbivore(){

        super(8,4);
    }

    @Override
    protected char populate() {

        return symbol;
    }
    protected void findFood(char field[][]){

        for(int i = 0;i<field.length;i++){
            for(int j = 0;j<field.length;j++){//go through field
                food = new Plant();

                if(field[i][j]==symbol) {      //check if there are any plants and eat them

                    if ((j+1)<30&&field[i][j + 1] == food.populate()) {
                        field[i][j + 1] = symbol;
                        field[i][j] = food.depop();
                    } else if ((j-1)>0&&field[i][j - 1] == food.populate()) {
                        field[i][j - 1] = symbol;
                        field[i][j] = food.depop();
                    } else if ((i+1<30)&&field[i + 1][j] == food.populate()) {
                        field[i + 1][j] = symbol;
                        field[i][j] = food.depop();
                    } else if ((i-1>0)&&field[i - 1][j] == food.populate()) {
                        field[i - 1][j] = symbol;
                        field[i][j] = food.depop();
                    } else {
                        Random num = new Random();
                        int look = num.nextInt(4);
                        if ((look == 0)&&(j+1<30)) {
                            field[i][j + 1] = symbol;
                            field[i][j] = food.depop();
                        } else if ((look == 1)&&(j-1>0)) {
                            field[i][j - 1] = symbol;
                            field[i][j] = food.depop();
                        } else if ((look == 2)&&(i+1<30)) {
                            field[i + 1][j] = symbol;
                            field[i][j] = food.depop();
                        } else if ((look == 3)&&(i-1>0)) {
                            field[i - 1][j] = symbol;
                            field[i][j] = food.depop();
                        }
                    }

                }

            }
        }
    }

}
