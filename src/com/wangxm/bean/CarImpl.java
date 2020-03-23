package com.wangxm.bean;

import java.util.LinkedHashMap;

public class CarImpl implements Car {
	int positionX = 0;
	int positionY = 0;
	Orientation orientation;

	@Override
	public void moveOneStep(Orientation orientation) {
		if (orientation.getOrientationName() != null) {
			switch (orientation.getOrientationName()) {
			case "EAST":
				this.positionX++;
				break;
			case "NORTH":
				this.positionY++;
				break;
			case "WEST":
				this.positionX--;
				break;
			case "SOUTH":
				this.positionY--;
				break;
			}
		} else {
			/// 不同其他角度的计算方法
		}
	}

	@Override
	public void moveAnyStep(Orientation orientation, int distance) {
		if (orientation.getOrientationName() != null) {
			switch (orientation.getOrientationName()) {
			case "EAST":
				this.positionX += distance;
				break;
			case "NORTH":
				this.positionY += distance;
				break;
			case "WEST":
				this.positionX -= distance;
				break;
			case "SOUTH":
				this.positionY -= distance;
				break;
			}
		} else {
			/// 不同其他角度的计算方法
		}
	}

	@Override
	public void moveclockwise(Orientation orientation) {
		if (orientation.getOrientationName() != null) {
			switch (orientation.getOrientationName()) {
			case "EAST":
				orientation.setOrientationName(OrientationEnum.SOUTH);
				break;
			case "SOUTH":
				orientation.setOrientationName(OrientationEnum.WEST);
				break;
			case "WEST":
				orientation.setOrientationName(OrientationEnum.NORTH);
				break;
			case "NORTH":
				orientation.setOrientationName(OrientationEnum.EAST);
				break;
			}
		} else {
			/// 不同其他角度的计算方法
		}
	}

	@Override
	public void moveList(LinkedHashMap<MoveTypeEnum, Integer> moveList) {

	}

	@Override
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	@Override
	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	@Override
	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}

	@Override
	public int getPositionX() {
		return positionX;
	}

	@Override
	public int getPositionY() {
		return positionY;
	}

	@Override
	public Orientation getOrientation() {
		return orientation;
	}

	@Override
	public String toString() {
		return "Car{" + "positionX=" + positionX + ", positionY=" + positionY + ", orientation='"
				+ orientation.getOrientationName() + '\'' + '}';
	}

}
