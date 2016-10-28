class Calculator {


    public float add(float a, float b) {
        return a + b;
    }


    public float divide(int a, int b) {
        if(b != 0) {
            return a / b;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public float multiply(int a, int b) {
        return a * b;
    }
}