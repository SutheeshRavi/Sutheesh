public class Method {


        public void fullThrottle() {
            System.out.println("The car is going as fast as it can!");
        }


        public void speed(int maxSpeed) {
            System.out.println("Max speed is: " + maxSpeed);
        }

        public static void main(String[] args) {
            Method myCar = new Method();
            myCar.speed(200);
            myCar.fullThrottle();
        }
    }






