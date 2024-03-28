package LAB04.LAB04_Ex03;

public class LAB04_Ex03_ClassPoint {
        private final int x;
        private final int y;
        public LAB04_Ex03_ClassPoint() {
            this.x = 0;
            this.y = 0;
        }
        public LAB04_Ex03_ClassPoint(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public double calculateDistance(int x, int y) {
            return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
        }
        public double calculateDistanceUsingObject(LAB04_Ex03_ClassPoint anotherPoint) {
            return Math.sqrt(Math.pow(anotherPoint.x - this.x, 2) + Math.pow(anotherPoint.y - this.y, 2));
        }
    }
