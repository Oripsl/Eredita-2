public class Polimorfismo {

    public static void main(String[] args) {
        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo(2, 5);

        System.out.println(rettangolo.calcolaArea());

        Triangolo triangolo = new Triangolo(5 , 9);

        System.out.println(triangolo.calcolaArea());

    }
}



