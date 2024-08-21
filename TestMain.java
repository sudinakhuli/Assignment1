class TestMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        
        System.out.println("Addition:");
        System.out.println("2 + 3 = " + calc.addition(2, 3));
        System.out.println("1 + 2 + 3 = " + calc.addition(1, 2, 3));
        System.out.println("1 + 2 + 3 + 4 = " + calc.addition(1, 2, 3, 4));

  
        System.out.println("\nMultiplication:");
        System.out.println("2 * 3 = " + calc.multiplication(2, 3));
        System.out.println("1 * 2 * 3 = " + calc.multiplication(1, 2, 3));
        System.out.println("1 * 2 * 3 * 4 = " + calc.multiplication(1, 2,3,4));
    }
}
