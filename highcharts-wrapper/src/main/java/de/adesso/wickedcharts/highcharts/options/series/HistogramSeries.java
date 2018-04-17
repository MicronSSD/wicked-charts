package de.adesso.wickedcharts.highcharts.options.series;

public class HistogramSeries extends Series{
	private static final long serialVersionUID = 1L;

	private int baseSeries;
	private int binsNumber;
	private int binWidth;

	public int getBaseSeries() {
		return baseSeries;
	}

	public void setBaseSeries(int baseSeries) {
		this.baseSeries = baseSeries;
	}

	public int getBinsNumber() {
		return binsNumber;
	}

	public void setBinsNumber(int binsNumber) {
		this.binsNumber = binsNumber;
	}

	public int getBinWidth() {
		return binWidth;
	}

	public void setBinWidth(int binWidth) {
		this.binWidth = binWidth;
	}
}
