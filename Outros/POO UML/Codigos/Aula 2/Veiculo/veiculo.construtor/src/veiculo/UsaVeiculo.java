package veiculo;

import java.util.Iterator;

public class UsaVeiculo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Veiculo v1 = new Veiculo(0);
		v1.nome = "Gol";
		
		for (int i = 0; i < 50; i++) {
			v1.acelera();
		}
		
		System.out.println("Velocidade = " + v1.getVelocidade());
		
		for (int i = 0; i < 25; i++) {
			v1.frea();
		}
		
		System.out.println("Velocidade = " + v1.getVelocidade());
		
	}

}
