class BoolDemo {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("Значние b: " + b);
        b = true;
        System.out.println("Значние b: " + b);

        if(b) System.out.println("Эта инструкция выполняется");

        b = false;
        if(b) System.out.println("Эта инструкция не выполняется");

        System.out.println("Результат сравенния 10 > 9: " + (10 > 9));

        System.out.println();
    }
}
