package Java.DesignPatterns;

public class FactoryMethodPattern {

    public interface MotorVehicle {
        void build();
    }

    public class Motorcycle implements MotorVehicle {
        @Override
        public void build() {
            System.out.println("Build Motorcycle");
        }
    }

    public class Car implements MotorVehicle {
        @Override
        public void build() {
            System.out.println("Build Car");
        }
    }

    public abstract class MotorVehicleFactory {
        public MotorVehicle create() {
            MotorVehicle vehicle = createMotorVehicle();
            vehicle.build();
            return vehicle;
        }
        protected abstract MotorVehicle createMotorVehicle();
    }

    public class MotorcycleFactory extends MotorVehicleFactory {
        @Override
        protected MotorVehicle createMotorVehicle() {
            return new Motorcycle();
        }
    }

    public class CarFactory extends MotorVehicleFactory {
        @Override
        protected MotorVehicle createMotorVehicle() {
            return new Car();
        }
    }

    public static void main(String[] args) {
        // Object creation using factory method pattern
        Motorcycle mc1 = new MotorcycleFactory().createMotorVehicle();
        mc1.build();
        // Object creation without factory method pattern
        Motorcycle mc2 = new Motorcycle();
        mc2.build();
    }
}

