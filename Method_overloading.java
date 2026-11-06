class calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public double add(double a, double b){
        return a + b;
    }
    }
    class Claculator_mathod{
    public static void main(String[] args){

        calculator cal = new calculator();
        System.out.println(cal.add(10,20));
        System.out.println(cal.add(10,20,30));
        System.out.println(cal.add(15.5,20.5));
    }

    }