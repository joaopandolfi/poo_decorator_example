package com.decorador;

import org.junit.Before;
import org.junit.Test;

import com.model.AbstractVehicle;
import com.model.Engine;
import com.model.Vehicle;
import com.vehicles.AlloyWheeledVehicle;
import com.vehicles.ArconditionedVehicle;

import junit.framework.Assert;

public class AppTest{
	Vehicle veiculo;
	@Before
	public void Before(){
		Engine engine = new Engine();
		veiculo = new AbstractVehicle(engine);
	}
	
	@Test
	public void testArCondicionado(){
		veiculo = new ArconditionedVehicle(veiculo);
		Assert.assertEquals(1600, veiculo.getPrice());
	}
	
	@Test
	public void testRodas(){
		veiculo = new AlloyWheeledVehicle(veiculo);
		Assert.assertEquals(1250, veiculo.getPrice());
	}
	
	
	@Test
	public void testDoisParametrosSeguidos(){
		veiculo = new ArconditionedVehicle(veiculo);
		veiculo = new AlloyWheeledVehicle(veiculo);
		Assert.assertEquals(1850, veiculo.getPrice());
	}

}
