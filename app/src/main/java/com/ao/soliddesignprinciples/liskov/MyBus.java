package com.ao.soliddesignprinciples.liskov;

import com.ao.soliddesignprinciples.openclosed.MyCar;

public class MyBus extends Bus {
	public MyBus(int speed, String color) {
		super(speed, color);
	}
}
