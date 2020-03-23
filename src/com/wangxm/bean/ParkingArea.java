package com.wangxm.bean;

public interface ParkingArea {
	// 宽度
	int getWidth();

	// 长度
	int getLength();

	/**
	 * 左边点是否在停车场内
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	boolean isInParck(int x, int y);

	// 面积
	long getArea();

}
