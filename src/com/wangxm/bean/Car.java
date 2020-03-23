package com.wangxm.bean;

import java.util.LinkedHashMap;

import com.wangxm.exception.TransboundaryException;

public interface Car {
	void setPositionX(int positionX);

	void setPositionY(int positionY);

	int getPositionX();

	int getPositionY();

	void setOrientation(Orientation orientation);

	Orientation getOrientation();

	/**
	 * 向一个方向移动一个单位距离
	 * 
	 * @param orientation
	 */
	void moveOneStep(Orientation orientation);

	/**
	 * 向一个方向移动一定距离
	 * 
	 * @param orientation：方向
	 * @param distance：距离
	 * @throws TransboundaryException
	 */
	void moveAnyStep(Orientation orientation, int distance);

	/**
	 * 顺时针旋转
	 * 
	 * @param orientation
	 */
	void moveclockwise(Orientation orientation);

	/**
	 * 按照指令列表移动
	 * 
	 * @param moveList
	 */
	void moveList(LinkedHashMap<MoveTypeEnum, Integer> moveList);

}
