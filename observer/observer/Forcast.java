package observer;

import java.util.Observable;
import java.util.Observer;

public class Forcast implements Observer, DisplayElement {

	private Weather weather;
	
	private Observable observable;
	
	public Forcast(Observable observable) {
		this.observable = observable;
		observable	.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)o;
			weather = weatherData.getWeather();
			display();		
		}		
	}
	
	@Override
	public void display() {
		System.out.println("Forcast weather conditions: " + weather);
		System.out.println();	
	}

}
