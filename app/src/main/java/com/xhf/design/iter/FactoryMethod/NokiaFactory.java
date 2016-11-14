package com.xhf.design.iter.FactoryMethod;

public class NokiaFactory implements MobileFactory {
	public Mobile produceMobile() {
		return new Nokia();
	}
}
