public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 5000;
        int miles = service.calculate(price);
        System.out.println("Количество бонусных миль к начислению: " + miles);
    }
}