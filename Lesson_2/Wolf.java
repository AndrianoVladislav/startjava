public class Wolf {

    private String gender;
    private String name;
    private float height;
    private int age;
    private String color;

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    void setName(String name){
        this.name = name;
    }

    public float getHeight(){
        return height;
    }

    void setHeight(float height){
        this.height = height;
    }

    public int getAge(){
        return age;
    }

    void setAge(int age){
        if(age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor(){
        return color;
    }

    void setColor(String color){
        this.color = color;
    }

    public void go() {
        System.out.println("Идёт");
    }

    public void sit() {
        System.out.println("Сидит");
    }

    public void run() {
        System.out.println("Бежит");
    }

    public void howls() {
        System.out.println("Воет");
    }

    public void hunt() {
        System.out.println("Охотиться");
    }
}