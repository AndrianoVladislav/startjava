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
        Jaeger jaegerTwo = new Jaeger();
        jaegerTwo.setName("Gipsy Avenger");
        jaegerTwo.setModel("Mark-6");
        jaegerTwo.setEquipment("Dual Vortex turbine");
        jaegerTwo.setLaunched(2034);
        jaegerTwo.setKaijuKilled(1);
        System.out.println("Название " + jaegerTwo.getName());
        System.out.println("Модель " + jaegerTwo.getModel());
        System.out.println("Оружие " + jaegerTwo.getEquipment());
        System.out.println("Год выпуска " + jaegerTwo.getLaunched());
        System.out.println("Количество убитых монстров " + jaegerTwo.getKaijuKilled());
        jaegerTwo.launch(true);
        jaegerTwo.go(true);
        jaegerTwo.run(true);
        jaegerTwo.kill(false);
    }
}