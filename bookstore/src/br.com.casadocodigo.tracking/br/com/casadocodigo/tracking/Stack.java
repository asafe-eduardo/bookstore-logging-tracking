package br.com.casadocodigo.tracking;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

import java.util.stream.*;

public class Stack {

	public static void logDebugTrace(){
		Logger logger = System.getLogger("CustomLogger");

		StackTraceElement[] stacks = new Throwable().getStackTrace();

		StackWalker.getInstance()
		.walk(stream -> stream.skip(1)
		.peek(element ->
		logger.log(Level.TRACE,
		" linha "
		+ element.getLineNumber()
		+ " do método "
		+ element.getMethodName()
		+ " na classe "
		+ element.getClassName()
		))
		.collect(Collectors.toList()));
	}

}
