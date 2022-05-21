public class Jaeger {

    private String name;
    private String model;
    private String equipment;
    private int launched;
    private int kaijuKilled;

    public Jaeger(){}

    public Jaeger(final String name, String model, String equipment, int launched, int kaijuKilled) {
        this.name = name;
        this.model = model;
        this.equipment = equipment;
        this.launched = launched;
        this.kaijuKilled = kaijuKilled;
    }

    public String toString() {
        return String.format("Название %s \nМодель %s \nОружие %s \nГод выпуска %s \nКоличество убитых монстров %s",
                name, model, equipment, launched, kaijuKilled);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public int getLaunched() {
        return launched;
    }

    public void setLaunched(int launched) {
        this.launched = launched;
    }

    public int getKaijuKilled() {
        return kaijuKilled;
    }

    public void setKaijuKilled(int kaijuKilled) {
        this.kaijuKilled = kaijuKilled;
    }

    public void go(boolean question) {
        if (question == true) {
            System.out.println("Движется");
        } else {
            System.out.println("Ползёт");
        }
    }

    public void launch(boolean question) {
        if (question == true) {
            System.out.println("Запуск");
        } else {
            System.out.println("Выключение");
        }
    }

    public void run(boolean question) {
        if (question == true) {
            System.out.println("Бежит");
        } else {
            System.out.println("Стоит");
        }
    }

    public void kill(boolean question) {
        if (question == true) {
            System.out.println("Поиск цели");
        } else {
            System.out.println("Атака");
        }
    }
}