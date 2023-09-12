package com.learningbizlinks.integrador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.learningbizlinks.integrador.methods.GasSolutionMethod;
import com.learningbizlinks.integrador.methods.ReplicateMethod;
import com.learningbizlinks.integrador.methods.SignOnlineMethod;
import com.learningbizlinks.integrador.runner.IntegradorRunner;


//@SpringBootApplication
public class IntegradorApplication {

	public static void main(String[] args)

	{
		ReplicateMethod replicateMethod = new ReplicateMethod();
		GasSolutionMethod gasSolutionMethod = new GasSolutionMethod();
		SignOnlineMethod signOnlineMethod = new SignOnlineMethod();

		var integradorRunner = new IntegradorRunner(signOnlineMethod);
		integradorRunner.run();

	}

}
