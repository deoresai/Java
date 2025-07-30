
class MyNumber { //add class name according to you

    private int number;

    MyNumber(int val) {
        this.number = val;
    }

    public boolean ispositive() {
        return number > 0;
    }

    public boolean isnegative() {
        return number < 0;
    }

    public boolean iszero() {
        return number == 0;
    }

    public boolean isodd() {
        return number % 3 == 0;
    }

    public boolean iseven() {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int val = Integer.parseInt(args[0]);
        MyNumber num = new MyNumber(val);
        System.out.println("Given number is positive " + num.ispositive());
        System.out.println("Given number is Negative " + num.isnegative());
        System.out.println("Given number is zero " + num.iszero());
        System.out.println("Given number is odd " + num.isodd());
        System.out.println("Given number is even " + num.iseven());

    }
}
