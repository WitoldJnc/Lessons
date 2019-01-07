package t6innerClasses;

public class Submarine {

    private Engine engine;
    private boolean engineWorkStatus;

    private class Engine {
        public void engineStart() {
            engineWorkStatus = true;
        }

        public void engineStop() {
            engineWorkStatus = false;
        }
    }

    public String egineStart() {
        engine = new Engine();
        engine.engineStart();
        return "Submarine is started";
    }

}
