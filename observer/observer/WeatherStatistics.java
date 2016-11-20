package observer;

import java.util.Observable;
import java.util.Observer;

public class WeatherStatistics implements Observer, DisplayElement {

	private Weather min = new Weather();
	
	private Weather max = new Weather();
	
	private Observable observable;
	
	public WeatherStatistics(Observable observable) {
		this.observable = observable;
		observable	.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)o;
			if (max.getTemperature() < weatherData.getTemperature()) {
				max = weatherData.getWeather();
			}
			if (weatherData.getTemperature() < min.getTemperature()) {
				min = weatherData.getWeather();
			}
			display();		
		}	
	}

	@Override
	public void display() {
		System.out.println("Min weather conditions: " + min);	
		System.out.println("Max weather conditions: " + max);
		System.out.println();
	}


}
