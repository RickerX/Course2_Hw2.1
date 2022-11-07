package Transport.Autosport;


import Transport.Car;

public class Bus extends Car {

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public enum Capacity{
        ESPECIALLY_SMALL("особо малая ", "до 10 мест" ),
        SMALL("малая ", "до 25 мест"),
        AVERAGE("средняя", " от 40 до 50 мест"),
        BIG("большая ", " от 60 до 80 мест"),
        VERY_BIG("особо большая ", " от 100 до 120 мест");
        private String Capacity;
        private String Capacity1;

        public static Bus.Capacity ESPECIALLY_SMALL() {
            return ESPECIALLY_SMALL;
        }

        public String getCapacity1() {
            return Capacity1;
        }
        public void setCapacity1(String capacity1) {
            Capacity1 = capacity1;
        }


        Capacity(String capacity, String capacity1) {

            Capacity = capacity;
            Capacity1 =capacity1;
        }

        public String getCapacity() {
            return Capacity;
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
        return "еду на пит-стоп";
    }

    @Override
    public String bestLapTime() {
        return "2 минуты 36 секунд";
    }

    @Override
    public String maxSpeed() {
        return "120 км/ч";
    }

}
