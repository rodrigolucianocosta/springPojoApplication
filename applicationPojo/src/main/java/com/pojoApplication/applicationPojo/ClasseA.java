package com.pojoApplication.applicationPojo;

public class ClasseA {
	private InterfaceB interfaceB;
	
	//criando o método executar
	public void executar() {
		interfaceB = new ClasseX(); //criando um objeto do tipo classe X
		interfaceB.metodoInterfaceB(); //invocando o método da interfaceB
	}
	
}
