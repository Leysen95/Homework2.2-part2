package model;

public abstract class Transport {

    protected String modelName;

    protected int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void check(){
        for (int i = 0; i < wheelsCount; i++){
            updateTyre();
        }
    }

    private void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public final String getModelName() {
        return modelName;
    }

    public final int getWheelsCount() {
        return wheelsCount;
    }
}
