package t7annotations;

@SubmarineInformation(weight = 12345, color = "blue", sanctify = true)
public class Submarine {

    private Engine engine;
    private boolean engineWorkStatus;

    private class Engine {
        @WorkStatus(engineWorkStatus = true)
        public void engineStart() {
            engineWorkStatus = true;
        }

        @WorkStatus(engineWorkStatus = false)
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

