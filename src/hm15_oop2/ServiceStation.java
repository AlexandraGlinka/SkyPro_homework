package hm15_oop2;

public class ServiceStation implements CheckVehicle{
    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.modelName);
            for (int i = 0; i < car.wheelsCount; i++) {
                updateTyre();
            }
            checkEngine();
        } else if (truck != null) {
            System.out.println("Обслуживаем " + truck.modelName);
            for (int i = 0; i < truck.wheelsCount; i++) {
                updateTyre();
            }
            checkEngine();
            checkTrailer();
        } else if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.modelName);
            for (int i = 0; i < bicycle.wheelsCount; i++) {
                updateTyre();
            }
        }
    }

    private static void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    private static void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    private static void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
