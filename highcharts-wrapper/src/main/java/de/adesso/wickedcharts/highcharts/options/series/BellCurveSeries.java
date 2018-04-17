package de.adesso.wickedcharts.highcharts.options.series;

public class BellCurveSeries extends Series {
	private static final long serialVersionUID = 1L;

	private int baseSeries;
	private int intervals;
	private int pointsInInterval;

	public int getBaseSeries() {
		return baseSeries;
	}

	public void setBaseSeries(int baseSeries) {
		this.baseSeries = baseSeries;
	}

	public int getIntervals() {
		return intervals;
	}

	public void setIntervals(int intervals) {
		this.intervals = intervals;
	}

	public int getPointsInInterval() {
		return pointsInInterval;
	}

	public void setPointsInInterval(int pointsInInterval) {
		this.pointsInInterval = pointsInInterval;
	}
}
