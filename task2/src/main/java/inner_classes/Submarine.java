package inner_classes;

public class Submarine {

    private Engine engine;
    private boolean engineWorkStatus;

    private class Engine {
        public void engineStart() {
            engineWorkStatus = true;
        }

    }

    public String egineStart() {
        engine = new Engine();
        engine.engineStart();
        return "Submarine is started";
    }

}
