public class Car extends Transport implements Wheels, Engine {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkWheels() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }

    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у машины");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель у машины");

    }

    @Override
    public void service() {
        System.out.println("Обслуживаем машину " + getModelName());
        checkWheels();
        checkEngine();
    }


}
