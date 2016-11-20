package observer;

import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable {
	
	private Weather weather;
	
	public WeatherData(Weather weather) {
		this.weather = weather;
	}

	public Weather getWeather() {
		return weather;
	}

	public void setWeather(Weather weather) {
		this.weather = weather;
		this.setChanged();
		this.notifyObservers();
	}
	
	public int getHumidity() {
		return weather.getHumidity();
	}

	public void setHumidity(int humidity) {
		weather.setHumidity(humidity);
	}

	public int getPressure() {
		return weather.getPressure();
	}

	public void setPressure(int pressure) {
		weather.setPressure(pressure);
	}

	public int getTemperature() {
		return weather.getTemperature();
	}

	public void setTemperature(int temperature) {
		weather.setTemperature(temperature);
	}

}
