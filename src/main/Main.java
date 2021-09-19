package src.main;

public class Main {
    public static void main(String[] args) {
        User user = new User("khoi");
        // user.name = "khoi";
        System.out.println(user.name);
        ITaxCalculator cal = getCal();
        System.out.println(cal.calculateTax());
    }

    public static ITaxCalculator getCal() {
        return new TaxCalculator2019();
    }
}
