package br.com.casadocodigo.logging.impl;

import java.lang.System.Logger;
import java.lang.System.LoggerFinder;
import java.lang.System.Logger.Level;

public class CustomLoggerFinder extends LoggerFinder {
	
	@Override	
	public Logger getLogger(String name, Module module){
		System.out.println("CustomLoggerFinder: [name=" + name+ ", module=" + module.getName() + "]");
		return new CustomLogger(Level.ALL);
	}
}

