package Transport.Autosport;

import Transport.Car;

public class Trucks extends Car {

    public Trucks(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public enum LoadCapacity{
        N1("с полной массой до 3,5 тонн"),
        N2("с полной массой свыше 3,5 до 12 тонн"),
        N3("с полной массой свыше 12 тонн");
        private String LoadCapacity;

        public String getLoadCapacity() {
            return LoadCapacity;
        }
        public void setLoadCapacity(String loadCapacity) {
            LoadCapacity = loadCapacity;
        }
        LoadCapacity(String loadCapacity) {
            LoadCapacity = loadCapacity;
        }
    }

    @Override
    public void startMoving() {

    }

    @Override
    public void stopMoving() {

    }

    @Override
    public String pitStop() {
        return "Еду на пит-стоп";
    }

    @Override
    public String bestLapTime() {
        return "3 минуты 56 секунд";
    }

    @Override
    public String maxSpeed() {
        return "100 км/ч";
    }
}
