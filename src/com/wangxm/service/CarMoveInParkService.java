package com.wangxm.service;

import java.util.LinkedHashMap;

import com.wangxm.bean.Car;
import com.wangxm.bean.MoveTypeEnum;
import com.wangxm.bean.ParkingArea;
import com.wangxm.exception.TransboundaryException;

public interface CarMoveInParkService {
	void setCar(Car car);

	Car getCar();

	void setParkingArea(ParkingArea parkingArea);

	ParkingArea getParkingArea();

	void moveOneStep() throws TransboundaryException;

	void moveAnyStep(int distance);

	void moveclockwise();

	void moveList(LinkedHashMap<MoveTypeEnum, Integer> moveList);

}
