package com.LJX.国庆作业.calculator;

public abstract class Operation {
    private double param1;
    private double param2;

     Operation(){}

    /**
     * 具体的实现交给子类
     * @return 运算结果
     */
    public abstract double getResult();

    public double getParam1() {
        return param1;
    }

    public Operation setParam1(double param1) {
        this.param1 = param1;
        return this;
    }

    public double getParam2() {
        return param2;
    }

    public Operation setParam2(double param2) {
        this.param2 = param2;
        return this;
    }
}

class add extends Operation{
    @Override
    public double getResult() {
        return getParam1() + getParam2();
    }
}
class minus extends Operation{
    @Override
    public double getResult() {
        if(getParam2() == 0){
            throw new RuntimeException("除数不能为0");
        }

        return getParam1() / getParam2();
    }
}
class subtract extends Operation{
    @Override
    public double getResult() {
        return getParam1() - getParam2();
    }
}
class mult extends Operation{
    @Override
    public double getResult() {
        return getParam1() * getParam2();
    }
}

