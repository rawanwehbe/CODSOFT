import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CurrencyRate {

    public static final String CURRENCY_RATE_URL = "https://v6.exchangerate-api.com/v6/1984df6e395e23a00d29b342/pair/";
    private CurrencySelector selector;
    private ObjectMapper objectMapper;

    public CurrencyRate(CurrencySelector selector) {
        this.selector = selector;
        objectMapper = new ObjectMapper();
    }

    public double fetchRate() {
        try {
            String url = getUrl();
            HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
            String response = new BufferedReader(new InputStreamReader(con.getInputStream())).readLine();

            Double currencyRateResponse = parsingConversionRateFromResponse(response);
            if (currencyRateResponse != null) return currencyRateResponse;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0.0;
    }

    private Double parsingConversionRateFromResponse(String response) {
        try {
            CurrencyRateResponse currencyRateResponse = objectMapper.readValue(response, CurrencyRateResponse.class);
            return currencyRateResponse.getConversionRate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private String getUrl() {
        return CURRENCY_RATE_URL + selector.getBaseCurrency() + "/" + selector.getTargetCurrency();
    }
}
