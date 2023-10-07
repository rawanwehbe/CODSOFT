
public class Main {
    public static void main(String[] args) {
        CurrencySelector selector = new CurrencySelector();
        CurrencyRate rate = new CurrencyRate(selector);
        CurrencyConverter currencyConverter = new CurrencyConverter(rate);

        selector.setBaseCurrency(AvailableCurrencies.USD);
        selector.setTargetCurrency(AvailableCurrencies.LBP);

        System.out.println(currencyConverter.convert(10));

        selector.setBaseCurrency(AvailableCurrencies.AUD);
        selector.setTargetCurrency(AvailableCurrencies.USD);

        System.out.println(currencyConverter.convert(20));
    }
}