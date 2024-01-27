class Rettangolo extends Forma {


    private int altezza;
    private int base;

    public Rettangolo(int base, int altezza) {
     this.base = base;
     this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        return base * altezza;
    }
}