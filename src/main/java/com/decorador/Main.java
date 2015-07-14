package com.decorador;

import com.model.AbstractVehicle;
import com.model.Engine;
import com.model.Vehicle;
import com.vehicles.ArconditionedVehicle;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        Vehicle veiculo;
        Engine motor = new Engine();
        veiculo = new AbstractVehicle(motor);
        veiculo = new ArconditionedVehicle(veiculo);
        System.out.println(veiculo.getPrice());
    }
}
