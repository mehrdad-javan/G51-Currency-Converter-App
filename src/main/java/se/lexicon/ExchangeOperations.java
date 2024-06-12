package se.lexicon;

public class ExchangeOperations {

    public static double convertSekToUsd(double sekAmount) {
        return sekAmount * ExchangeRates.SEK_TO_USD_RATE;
    }

    public static double convertUsdToSek(double usdAmount) {
        return usdAmount * ExchangeRates.USD_TO_SEK_RATE;
    }

    public static double convertSekToEuro(double sekAmount) {
        return sekAmount * ExchangeRates.SEK_TO_EURO_RATE;
    }

    public static double convertEuroToSek(double euroAmount) {
        return euroAmount * ExchangeRates.EURO_TO_SEK_RATE;
    }

}
