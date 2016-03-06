package masebenix.Imp;

import masebenix.*;
import masebenix.Impl.DivisionServiceImp;
import masebenix.impl.AdditionServiceImp;

/**
 * Created by codet on 2016/03/06.
 */
public class CalculatorModuleImpl implements Calculator {
    private AdditionService additionService = new AdditionServiceImp();
    private DivisionService divisionService = new DivisionServiceImp();
    private MultiplyService multiplyService = new MultiplyServiceImp();
    private MinusService minusService = new MinusServiceImp();

    public int add(int a, int b) {
        return additionService.add(a, b);
    }

    public int minus(int a, int b) {
        return minusService.minus(a, b);
    }
    public float divide(float a, float b) {
        return divisionService.divide(a,b);
    }

    public int multiply(int a, int b) {
        return multiplyService.multiply(a,b);
    }
}
