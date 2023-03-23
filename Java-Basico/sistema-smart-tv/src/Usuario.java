public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("SmartTv ligada? "+ smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("volume: " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Novo Status: canal: " + smartTv.canal);
    }
}
