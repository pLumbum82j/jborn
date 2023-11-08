package s5;

public class Addition extends Operation{

    @Override
    public int calculate(int leftOperand, int rightOperand) {
        return result = leftOperand + rightOperand;
    }

    @Override
    int returnPrevious() {
        return result;
    }
}
