package com.wangxm.bean;

public interface ParkingArea {
	// ���
	int getWidth();

	// ����
	int getLength();

	/**
	 * ��ߵ��Ƿ���ͣ������
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	boolean isInParck(int x, int y);

	// ���
	long getArea();

}
