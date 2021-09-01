package interview;

public interface Interfaces {
    void fruits();
    void fruitsColour();

    class Banana implements Interfaces {

        @Override
        public void fruits() {
            System.out.println("Fruits are good and healthy for the body");
        }

        @Override
        public void fruitsColour() {
            System.out.println("The colour of banana is Yellow");
        }
    }

    public static void main(String[] args) {
        Interfaces interfaces = new Banana();
        //Banana banana = new Banana();
        interfaces.fruits();
        interfaces.fruitsColour();

    }
}
