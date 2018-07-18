
public class Plant extends LivingBeing {
    final private char symbol = 'P';

    Plant(){

        super(5,2);
    }

    @Override
    protected char populate() {

        return symbol;
    }


}
