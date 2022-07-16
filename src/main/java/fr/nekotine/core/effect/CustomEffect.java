package fr.nekotine.core.effect;

public abstract class CustomEffect {
	
	private double _expireTimeSpan;
	
	public void setExpireTimeSpan(double expireTimeSpan) {
		_expireTimeSpan = expireTimeSpan;
	}
	
	public double getExpireTimeSpan() {
		return _expireTimeSpan;
	}

	public abstract void onApply();
	
	public abstract void onUnapply();
	
}