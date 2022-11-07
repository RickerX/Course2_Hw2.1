package Transport.Autosport;

import Transport.Car;

public class PassengerCars extends Car {

    public PassengerCars(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public enum BodyType {
        SEDAN("Седан"),
        HATCHBEK("Хэтчбек"),
        COUPE("Купэ"),
        STATION_WAGON("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP_TRUCK("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивен");
        private String BodyType;

        public String getBodyType() {
            return BodyType;
        }

        public void setBodyType(String bodyType) {
            BodyType = bodyType;
        }

        BodyType(String bodyType) {
            BodyType = bodyType;

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
        return "1 минуты 25 секунд";
    }

    @Override
    public String maxSpeed() {
        return "160 км/ч";
    }

}
