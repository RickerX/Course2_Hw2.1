import Transport.Autosport.Bus;
import Transport.Autosport.PassengerCars;
import Transport.Autosport.Trucks;
import Transport.Drivers.Driver;

public class Main {
    public static void separation() {
        System.out.println("=============================");
    }
    public static void main(String[] args) {
        Bus volvoBus = new Bus("", "", 0);
        Bus audiBus = new Bus("Ауди", "А2", 6);
        Bus bmwBus = new Bus("БМВ", "А3", 7);
        Bus mersedesBus = new Bus("Мерседес", "А4", 5);
        PassengerCars volvo = new PassengerCars("Вольво", "S 90", 2.5);
        PassengerCars audi = new PassengerCars("Ауди", "RS 6", 4.0);
        PassengerCars bmw = new PassengerCars("БМВ", "M5 CS", 4.4);
        PassengerCars mersedes = new PassengerCars("Мерседес", "С 63 AMG", 6.3);
        Trucks volvoTruck = new Trucks("Вольво", "Б1", 10);
        Trucks audiTruck = new Trucks("Ауди", "Б2", 12);
        Trucks bmwTruck = new Trucks("БМВ", "Б3", 11);
        Trucks mersedesTruck = new Trucks("Мерседес", "Б4", 15);
        separation();
        System.out.println(volvoBus);
        System.out.println(audiBus);
        System.out.println(bmwBus);
        System.out.println(mersedesBus);
        separation();
        System.out.println(volvoTruck);
        System.out.println(audiTruck);
        System.out.println(bmwTruck);
        System.out.println(mersedesTruck);
        separation();
        System.out.println(volvo);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(mersedes);
        separation();
        System.out.println(mersedesBus + " лучший круг: " + mersedesBus.bestLapTime() +
                " максимальная скорость: " + mersedesBus.maxSpeed() + " " + mersedesBus.pitStop());
        System.out.println(mersedes + " лучший круг: " + mersedes.bestLapTime() +
                " максимальная скорость: " + mersedes.maxSpeed() + " " + mersedes.pitStop());
        System.out.println(mersedesTruck + " лучший круг: " + mersedesTruck.bestLapTime() +
                " максимальная скорость: " + mersedesTruck.maxSpeed() + " " + mersedesTruck.pitStop());
        separation();
        Driver<PassengerCars> artem = new Driver<>("Артем", "5", "права категории В");
        artem.driveCar(mersedes);
        Driver<Trucks> ivan = new Driver<>("Иван", "10", "права категории С");
        ivan.driveCar(volvoTruck);
        Driver<Bus> oleg = new Driver<>("Олег", "15", "права категории D");
        oleg.driveCar(mersedesBus);




    }
}