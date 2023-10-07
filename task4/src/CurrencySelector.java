public class CurrencySelector {

    private AvailableCurrencies baseCurrency;
    private AvailableCurrencies targetCurrency;

    public AvailableCurrencies getBaseCurrency() {
        return baseCurrency;
    }

    public AvailableCurrencies getTargetCurrency() {
        return targetCurrency;
    }

    public void setBaseCurrency(AvailableCurrencies baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public void setTargetCurrency(AvailableCurrencies targetCurrency) {
        this.targetCurrency = targetCurrency;
    }
}
