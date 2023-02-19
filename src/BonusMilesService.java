public class BonusMilesService {

    public int calculate(int cost) {
        int costMiles = 20; // количество рублей для 1 бонусной мили
        int miles = cost / costMiles;
        return miles;
    }
}
