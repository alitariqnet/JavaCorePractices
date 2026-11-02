package Java.DesignPatterns;

public class AbstractFactoryPattern {

    public interface ElectricVehicle {
        void build();
    }

    public abstract class Corporation {
        public abstract MotorVehicle createMotorVehicle();
        public abstract ElectricVehicle createElectricVehicle();
    }

    public class FutureVehicleMotorcycle implements MotorVehicle {
        @Override
        public void build() {
            System.out.println("Future Vehicle Motorcycle");
        }
    }

    public class FutureVehicleElectricCar implements ElectricVehicle {
        @Override
        public void build() {
            System.out.println("Future Vehicle Electric Car");
        }
    }

    public class NextGenMotorcycle implements MotorVehicle {
        @Override
        public void build() {
            System.out.println("NextGen Motorcycle");
        }
    }

    public class NextGenElectricCar implements ElectricVehicle {
        @Override
        public void build() {
            System.out.println("NextGen Electric Car");
        }
    }

    public class FutureVehicleCorporation extends Corporation {
        @Override
        public MotorVehicle createMotorVehicle() {
            return new FutureVehicleMotorcycle();
        }
        @Override
        public ElectricVehicle createElectricVehicle() {
            return new FutureVehicleElectricCar();
        }
    }

    public class NextGenCorporation extends Corporation {
        @Override
        public MotorVehicle createMotorVehicle() {
            return new NextGenMotorcycle();
        }
        @Override
        public ElectricVehicle createElectricVehicle() {
            return new NextGenElectricCar();
        }
    }

}
