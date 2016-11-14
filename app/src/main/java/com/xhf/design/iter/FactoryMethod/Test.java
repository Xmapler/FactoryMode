package com.xhf.design.iter.FactoryMethod;

public class Test {
	public static void main(String[] args){
        MobileFactory mbf = new NokiaFactory();
        Mobile mb=mbf.produceMobile();
        mb.call();
        mbf= new MotorolaFactory();
        mb=mbf.produceMobile();
        mb.call();
 }
}
