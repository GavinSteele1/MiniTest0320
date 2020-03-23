package com.wangxm.bean;

public class RectangleParkingArea implements ParkingArea {

	private int width;

	private int length;

	public RectangleParkingArea(int width, int length) {
		this.width = width;
		this.length = length;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public int getWidth() {
		return this.width;
	}

	@Override
	public int getLength() {
		return this.length;
	}

	@Override
	public boolean isInParck(int x, int y) {
		if (x < 1 || y < 1) {
			return false;
		}
		if (x > width || y > length) {
			return false;
		}
		return true;
	}

	@Override
	public long getArea() {
		return width * length;
	}

}
