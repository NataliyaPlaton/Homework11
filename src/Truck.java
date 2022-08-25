public class Truck extends Transport implements Wheels, Engine, Trailer {
    public Truck(String modelName, int wheelsCount) {
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
        System.out.println("Меняем покрышку у грузовой машины");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель у грузовой машины");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп у грузовой машины");
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем грузовую машину " + getModelName());
        checkWheels();
        checkEngine();
        checkTrailer();
    }
}
