package com.wangxm.test;

import com.wangxm.bean.Car;
import com.wangxm.bean.CarImpl;
import com.wangxm.bean.Orientation;
import com.wangxm.bean.OrientationEnum;
import com.wangxm.bean.ParkingArea;
import com.wangxm.bean.RectangleParkingArea;
import com.wangxm.exception.TransboundaryException;
import com.wangxm.service.CarMoveInParkService;
import com.wangxm.service.CarMoveInParkServiceImpl;

public class DriverlessCarTest {

	CarMoveInParkService carMoveInParkService;

	public static void main(String ars[]) {
		DriverlessCarTest test = new DriverlessCarTest();
		test.init();
		test.test1();
		test.test2();
		test.test3();
		test.test4();
		test.test5();

	}

	private void init() {
		carMoveInParkService = new CarMoveInParkServiceImpl();
		Car car = new CarImpl();
		Orientation Orientation = new Orientation(OrientationEnum.NORTH);
		car.setOrientation(Orientation);
		car.setPositionX(1);
		car.setPositionY(1);
		ParkingArea parkingArea = new RectangleParkingArea(5, 5);
		carMoveInParkService.setCar(car);
		carMoveInParkService.setParkingArea(parkingArea);
	}

	/**
	 * 顺时针旋转
	 */
	public void test1() {
		carMoveInParkService.getCar().setOrientation(new Orientation(OrientationEnum.NORTH));
		carMoveInParkService.getCar().setPositionX(1);
		carMoveInParkService.getCar().setPositionY(1);
		carMoveInParkService.moveclockwise();
		System.out.println("测试1：" + carMoveInParkService.getCar());
	}

	/**
	 * 向北移动1
	 */
	public void test2() {
		carMoveInParkService.getCar().setOrientation(new Orientation(OrientationEnum.NORTH));
		carMoveInParkService.getCar().setPositionX(1);
		carMoveInParkService.getCar().setPositionY(1);
		try {
			carMoveInParkService.moveOneStep();
		} catch (TransboundaryException e) {
			System.out.println("测试2异常：" + e.getMessage());
		}
		System.out.println("测试2：" + carMoveInParkService.getCar());
	}

	/**
	 * 向东移动1
	 */
	public void test3() {
		carMoveInParkService.getCar().setOrientation(new Orientation(OrientationEnum.EAST));
		carMoveInParkService.getCar().setPositionX(1);
		carMoveInParkService.getCar().setPositionY(1);
		try {
			carMoveInParkService.moveOneStep();
		} catch (TransboundaryException e) {
			System.out.println("测试3异常：" + e.getMessage());
		}
		System.out.println("测试3：" + carMoveInParkService.getCar());
	}

	/**
	 * 向西移动，抛出异常
	 */
	public void test4() {
		carMoveInParkService.getCar().setOrientation(new Orientation(OrientationEnum.WEST));
		carMoveInParkService.getCar().setPositionX(1);
		carMoveInParkService.getCar().setPositionY(1);
		try {
			carMoveInParkService.moveOneStep();
		} catch (TransboundaryException e) {
			System.out.println("测试4异常：" + e.getMessage());
		}
		System.out.println("测试4：" + carMoveInParkService.getCar());
	}

	/**
	 * 向东移动2
	 */
	public void test5() {
		carMoveInParkService.getCar().setOrientation(new Orientation(OrientationEnum.EAST));
		carMoveInParkService.getCar().setPositionX(1);
		carMoveInParkService.getCar().setPositionY(1);
		carMoveInParkService.moveAnyStep(2);
		System.out.println("测试5：" + carMoveInParkService.getCar());
	}

}
