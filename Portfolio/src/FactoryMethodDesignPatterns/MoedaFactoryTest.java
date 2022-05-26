package FactoryMethodDesignPatterns;

public class MoedaFactoryTest {
	public static void main(String[] args) {
		Moeda moeda = MoedaFactory.criarMoeda(Pais.EUA);
		System.out.println("Simbolo: " + moeda.getSimbolo());
	}
}
