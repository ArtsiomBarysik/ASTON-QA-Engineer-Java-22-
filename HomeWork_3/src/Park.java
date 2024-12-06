/**
 * Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах,
 * времени их работы и стоимости
 */
public class Park {
    private String parkName;
    private String city;
    private ParkAttraction attraction;

    public Park(String parkName, String city, String name, String time, double cost) {
        this.parkName = parkName;
        this.city = city;
        this.attraction = new ParkAttraction(name, time, cost);
    }
    public class ParkAttraction {
        private String name;
        private String time;
        private double cost;
        public ParkAttraction(String name, String time, double cost) {
            this.name = name;
            this.time = time;
            this.cost = cost;
        }
        // Набор геттеров для внутреннего класса
        public String getName(){
            return name;
        }
        public String getTime(){
            return time;
        }
        public double getCost(){
            return cost;
        }
        //Набор сеттеров для внутреннего класса
        public void setName(String name){
            this.name = name;
        }
        public void setTime(String time){
            this.time = time;
        }
        public void setCost(double cost){
            this.cost = cost;
        }
    }
    //Набор геттеров для внутреннего класса
    public String getParkName(){
        return parkName;
    }
    public String getCity(){
        return city;
    }
    public ParkAttraction getAttraction(){
        return attraction;
    }
    //Набор сеттеров для внутреннего класса
    public void setParkName(String parkName){
        this.parkName = parkName;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setAttraction(ParkAttraction attraction){
        this.attraction = attraction;
    }
    public void printPark() {
        System.out.println("Название парка: " + getParkName());
        System.out.println("Город в котором находится: " + getCity());
        System.out.println("Аттракцион в парке: " + getAttraction().getName());
        System.out.println("Время работы: " + getAttraction().getTime());
        System.out.println("Стоимость: " + getAttraction().getCost());
    }
}

