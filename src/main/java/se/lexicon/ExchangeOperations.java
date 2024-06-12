package se.lexicon;

public class ExchangeOperations {

    public static double convertSekToUsd(double sekAmount) {
        return sekAmount * ExchangeRates.setToUsdRate;
    }

    public static double convertUsdToSek(double usdAmount){
        return usdAmount * ExchangeRates.usdToSekRate;
    }

    public static double convertSekToEuro(double sekAmount){
        return sekAmount * ExchangeRates.setToEuroRate;
    }

    public static double convertEuroToSek(double euroAmount){
        return euroAmount * ExchangeRates.euroToSekRate;
    }

}
