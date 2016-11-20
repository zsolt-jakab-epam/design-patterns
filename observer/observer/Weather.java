package observer;

public class Weather {

	private int humidity;
	
	private int pressure;
	
	private int temperature;
	
	public Weather() {
	}

	public Weather(int humidity, int pressure, int temperature) {
		this.humidity = humidity;
		this.pressure = pressure;
		this.temperature = temperature;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public int getPressure() {
		return pressure;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "Weather [humidity=" + humidity + ", pressure=" + pressure + ", temperature=" + temperature + "]";
	}
	
}