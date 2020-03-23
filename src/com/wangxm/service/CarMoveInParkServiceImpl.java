package com.wangxm.service;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import com.wangxm.bean.Car;
import com.wangxm.bean.MoveTypeEnum;
import com.wangxm.bean.Orientation;
import com.wangxm.bean.ParkingArea;
import com.wangxm.exception.TransboundaryException;

public class CarMoveInParkServiceImpl implements CarMoveInParkService {
	private Car car;
	private ParkingArea parkingArea;

	@Override
	public Car getCar() {
		return car;
	}

	@Override
	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public ParkingArea getParkingArea() {
		return parkingArea;
	}

	@Override
	public void setParkingArea(ParkingArea parkingArea) {
		this.parkingArea = parkingArea;
	}

	@Override
	public void moveOneStep() throws TransboundaryException {
		Orientation orientation = car.getOrientation();
		if (orientation.getOrientationName() != null) {
			switch (orientation.getOrientationName()) {
			case "EAST":
				car.setPositionX(car.getPositionX() + 1);
				break;
			case "NORTH":
				car.setPositionY(car.getPositionY() + 1);
				break;
			case "WEST":
				car.setPositionX(car.getPositionX() - 1);
				break;
			case "SOUTH":
				car.setPositionY(car.getPositionY() - 1);
				break;
			}
		} else {
			/// 不同其他角度的计算方法
		}
		if (!parkingArea.isInParck(car.getPositionX(), car.getPositionY())) {
			throw new TransboundaryException("超出" + orientation.getOrientationName() + "边界！");
		}
	}

	@Override
	public void moveAnyStep(int distance) {
		try {
			for (int i = 0; i < distance; i++) {
				moveOneStep();
			}
		} catch (TransboundaryException e) {
			System.out.println("异常：" + e.getMessage());
		}
	}

	@Override
	public void moveclockwise() {
		car.moveclockwise(car.getOrientation());
	}

	@Override
	public void moveList(LinkedHashMap<MoveTypeEnum, Integer> moveList) {
		Iterator<Entry<MoveTypeEnum, Integer>> it = moveList.entrySet().iterator();
		while (it.hasNext()) {
			Entry<MoveTypeEnum, Integer> entry = it.next();
			if (entry.getKey().equals(MoveTypeEnum.FORWARD)) {
				moveAnyStep(entry.getValue());
			} else if (entry.getKey().equals(MoveTypeEnum.CLOCKWISE)) {
				moveclockwise();
			}
		}
	}

}
