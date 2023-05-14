package hm15_oop2;

public class ServiceStation implements CheckVehicle{
    @Override
    public void check(Bicycle bicycle) {
        bicycle.toString();
        System.out.println("Обслуживаем " + bicycle.modelName);
        System.out.println("Информация о ТС: " + bicycle.toString());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            updateTyre();
        }
    }
    @Override
    public void check(Car car) {
        car.toString();
        System.out.println("Обслуживаем " + car.modelName);
        System.out.println("Информация о ТС: " + car.toString());
        for (int i = 0; i < car.getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }
    @Override
    public void check(Truck truck) {
        System.out.println("Обслуживаем " + truck.modelName);
        System.out.println("Информация о ТС: " + truck.toString());
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
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
