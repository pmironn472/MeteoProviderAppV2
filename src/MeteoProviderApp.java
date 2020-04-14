import java.util.Random;




public class MeteoProviderApp {
    public static void main(String[] args) {


        OpenMeteoProvider.getCurrentTemperature(016);
        PrivateMeteoProvider.getCurrentTemperature(PrivateMeteoProvider.getCurrentHumidity(012));

        OpenMeteoProvider.getCurrentTemperature(011);
        PrivateMeteoProvider.getCurrentHumidity(011);
    }
}

class OpenMeteoProvider {
    static double getCurrentTemperature(int countryCode) {
        Random random = new Random();
        int rand = 0;
        while (true) {
            rand = random.nextInt(50);
            if (rand != 0) break;
        }
        String[] trueFalse = {"+", "-"};
        String random1 = (trueFalse[new Random().nextInt(trueFalse.length)]);
        switch (countryCode) {
            case 004:
                System.out.println("The temeperture in Afghanistan is  " + random1 + (double) rand);
                break;
            case 010:
                System.out.println("The temeperture in Antarctica is  " + random1 + (double) rand);
                break;
            case 012:
                System.out.println("The temeperture in Algeria is  " + random1 + (double) rand);
                break;
            case 016:
                System.out.println("The temeperture in American Samoa is  " + random1 + (double) rand);
                break;
            case 020:
                System.out.println("The temeperture in Andorra is  " + random1 + (double) rand);
                break;
            default:
                System.err.println("Can't provide data for this country!");

        }


        return countryCode;
    }


}

class PrivateMeteoProvider extends OpenMeteoProvider  {

    static byte getCurrentHumidity(int countryCode)  {


        Random random = new Random();
        int rand = 0;
        while (true) {
            rand = random.nextInt(100);
            if (rand != 0) break;
        }

        switch (countryCode) {
            case 004:
                System.out.println("The air humidity in Afghanistan is  " + (byte) rand + "%");
                break;
            case 010:
                System.out.println("The air humidity in Antarctica is " + (byte) rand + "%");
                break;
            case 012:
                System.out.println("The air humidity in Algeria is  " + (byte) rand + "%");
                break;
            case 016:
                System.out.println("The air humidity in American Samoa is  " + (byte) rand + "%");
                break;
            case 020:
                System.out.println("The air humidity in Andorra is  "+ (byte) rand + "5");
                break;
            default:
                System.err.println("Can't provide data for this country!");
        }

        return (byte)countryCode;
    }
}



