package uz.moshup;

public class Operation {

    public double add(double a, double b){
        return a+b;
    }

    public double sub(double a, double b){
        return sub(a, b, false);
    }

    public double sub(double a, double b, boolean reverse){
        if(!reverse)
        return b-a;
        else return a-b;
    }

    public double mul(double a, double b){
        return a*b;
    }

    public double div(double a, double b){
        return a/b;
    }

    public double average(double ... a){
        double result=0;
        for(double x:a){
            result += x;
        }
        return result;
    }
}
