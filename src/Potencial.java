class Potencial extends Thread {

    private final int number;

    Potencial(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            double potencials = Math.pow(number,i);
            System.out.printf("%s: %d ^ %d = %.0f\n", getName(), number, i, potencials); //Pongo %.0f para que no me muestre los decimales.
        }
    }


}
