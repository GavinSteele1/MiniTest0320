package com.wangxm.bean;

/**
 * 方向，采用角度制计数
 * 
 * @author wangxm
 *
 */
public class Orientation {
	private int angle;// 角度制计数
	private String orientationName;

	Orientation(int angle) {
		this.angle = angle;
	}

	public Orientation(String angle) {
		switch (angle) {
		case "EAST":
			this.angle = 0;
			break;
		case "NORTH":
			this.angle = 90;
			break;
		case "WEST":
			this.angle = 180;
			break;
		case "SOUTH":
			this.angle = 270;
			break;
		}
	}

	public Orientation(OrientationEnum angle) {
		switch (angle) {
		case EAST:
			this.angle = 0;
			this.orientationName = "EAST";
			break;
		case NORTH:
			this.angle = 90;
			this.orientationName = "NORTH";
			break;
		case WEST:
			this.angle = 180;
			this.orientationName = "WEST";
			break;
		case SOUTH:
			this.angle = 270;
			this.orientationName = "SOUTH";
			break;
		}
	}

	public String getOrientationName() {
		return orientationName;
	}

	public void setAngle(int angle) {
		this.angle = angle;
	}

	public void setOrientationName(String orientationName) {
		this.orientationName = orientationName;
	}

	public void setOrientationName(OrientationEnum orientationEnum) {
		switch (orientationEnum) {
		case EAST:
			this.angle = 0;
			this.orientationName = "EAST";
			break;
		case NORTH:
			this.angle = 90;
			this.orientationName = "NORTH";
			break;
		case WEST:
			this.angle = 180;
			this.orientationName = "WEST";
			break;
		case SOUTH:
			this.angle = 270;
			this.orientationName = "SOUTH";
			break;
		}
	}

	public int getAngle() {
		return angle;
	}

}
