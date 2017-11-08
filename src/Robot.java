public class Robot {
    // Текущая координата Х
    private double x=0;
    // Текущая координата Y
    private double y=0;
    // Текущий курс (в градусах)
    private double course=0;

    // Печать координат робота
    public void printCoordinates() {

        System.out.println(x + "," + y);
    }

    // Передвижение на дистанцию distance
    public void  forward (int distance) {
        // Обращение к полю объекта Х
        x = x + distance * Math.cos(course / 180 * Math.PI);
        // Обращение к полю объекта Y
        y = y + distance * Math.sin(course / 180 * Math.PI);
    }

        public double getX(){
            return x;
        }
        public double getY(){
            return y;
        }
        public double getCourse(){
            return course;
        }
        public void setCourse(double course){
            this.course=course;
        }


}
