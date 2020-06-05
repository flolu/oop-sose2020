public class App {
    public static void main(String[] args) throws Exception {
        Leibeigener le = new Leibeigener();
        le.setEinkommen(22);
        System.err.println("Steuer Leibeigener: " + le.steuer());

        Koenig k = new Koenig();
        k.setEinkommen(10000);
        System.err.println("Steuer Koenig: " + k.steuer());

        Adel a = new Adel();
        a.setEinkommen(1000);
        System.err.println("Steuer Adeliger: " + a.steuer());
    }
}
