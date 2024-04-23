package LAB04.LAB04_Ex03;

class Distance {
        private final int x;
        private final int y;
        public Distance() {
            this.x = 0;
            this.y = 0;
        }
        public Distance(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public double calculateDistance(int x, int y) {
            return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
        }
        public double calculateDistanceUsingObject(Distance anotherPoint) {
            return Math.sqrt(Math.pow(anotherPoint.x - this.x, 2) + Math.pow(anotherPoint.y - this.y, 2));
        }
    }
