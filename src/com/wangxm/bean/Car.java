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
	 * ��һ�������ƶ�һ����λ����
	 * 
	 * @param orientation
	 */
	void moveOneStep(Orientation orientation);

	/**
	 * ��һ�������ƶ�һ������
	 * 
	 * @param orientation������
	 * @param distance������
	 * @throws TransboundaryException
	 */
	void moveAnyStep(Orientation orientation, int distance);

	/**
	 * ˳ʱ����ת
	 * 
	 * @param orientation
	 */
	void moveclockwise(Orientation orientation);

	/**
	 * ����ָ���б��ƶ�
	 * 
	 * @param moveList
	 */
	void moveList(LinkedHashMap<MoveTypeEnum, Integer> moveList);

}
