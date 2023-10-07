public class CurrencyConverter {
    private CurrencyRate rate;

    public CurrencyConverter(CurrencyRate rate) {
        this.rate = rate;
    }

    public double convert(double amount){
        return amount * rate.fetchRate();
    }
}
