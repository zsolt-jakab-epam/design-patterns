package observer;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class App {
	
	public static final Random random = new Random();

	public static void main(String[] args) throws InterruptedException {
		WeatherData weatherData = new WeatherData(new Weather(0, 0, 0));
		Observer currentConditions = new CurrentConditions(weatherData);
		Observer forcast = new Forcast(weatherData);
		Observer weatherStatistics = new WeatherStatistics(weatherData);
		

		while (true) {
			Weather weather = new Weather(getNextValue(), getNextValue(), getNextValue());
			weatherData.setWeather(weather);	
			TimeUnit.SECONDS.sleep(2);
		}
		
	}

	private static int getNextValue() {
		return random.nextInt(100) - 50;
	}

}
