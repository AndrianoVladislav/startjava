public class JaegerTest{
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setName("Atlas Destroyer");
        jaegerOne.setModel("Mark-3");
        jaegerOne.setEquipment("Conn-Pod Chambe");
        jaegerOne.setLaunched(2017);
        jaegerOne.setKaijuKilled(8);
        System.out.println("Название " + jaegerOne.getName());
        System.out.println("Модель " + jaegerOne.getModel());
        System.out.println("Оружие " + jaegerOne.getEquipment());
        System.out.println("Год выпуска " + jaegerOne.getLaunched());
        System.out.println("Количество убитых монстров " + jaegerOne.getKaijuKilled());
        jaegerOne.launch(true);
        jaegerOne.go(true);
        jaegerOne.run(false);
        jaegerOne.kill(true);
        System.out.println("");

        Jaeger jaegerTwo = new Jaeger("Gipsy Avenger", "Mark-6", "Dual Vortex turbine", 2034, 1);
        System.out.println(jaegerTwo);
        jaegerTwo.launch(true);
        jaegerTwo.go(true);
        jaegerTwo.run(true);
        jaegerTwo.kill(false);
    }
}