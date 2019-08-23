public class Main {

    public static void main(String[] args) {
        Shape unknown = new Shape (4);
        //unknown.setNumSides(4);
        unknown.setName(unknown.findNameFromSides());

        System.out.println(unknown.toString());
    }
}
