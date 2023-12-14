package br.com.vainaweb.desafiofinal;

import java.util.List;

public class LibMatematica {
	
	public static double somar(List<Double> numeros) {
		double soma = 0;
		for(Double numero : numeros) {
			soma += numero;
		}
		
		return soma;
	}
	
	public static double subtrair(List<Double> numeros) {
		double subtrair = 0;
		int contadorSubtracao = 1;
		
		for(Double numero : numeros) {
			if(contadorSubtracao == 1) {
				subtrair = numero;
				contadorSubtracao ++;
			} else {
				subtrair -= numero;
			}
		}
		
		return subtrair;
	}
	
	public static double multiplicar(List<Double> numeros) {
		double multiplicacao = 1;
		for(Double numero : numeros) {
			multiplicacao *= numero;
		}		
		return multiplicacao;
	}
	
	public static double dividir(List<Double> numeros) {
		int contadorDivisao = 1;
		double divisao = 1;
		
		for(Double numero : numeros) {
			if(contadorDivisao == 1) {
				divisao = numero;
				contadorDivisao ++;
			} else {
				divisao /= numero;
			}
		}
		
		return divisao;
	}
	
	public static double calcularAreaTriangulo(double altura, double base) {
		double areaTriangulo = (altura * base) / 2;
		return areaTriangulo;
	}
	
	public static double calcularAreaRetangulo(double altura, double base) {
		double areaRetangulo = altura * base;
		return areaRetangulo;
	}
	
	public static double calcularAreaQuadrado(double lado) {
		double areaRetangulo = lado * 2;
		return areaRetangulo;
	}
	
	public static double calcularAreaCirculo(double raio) {
		double areaCirculo = 3.14 * (raio * raio);
		return areaCirculo;
	}
	
	public static double calcularAreaParalelogramo(double altura, double base) {
		double areaParalelogramo = altura * base;
		return areaParalelogramo;
	}
	
	public static double calcularAreaTrapezio(double altura, double baseMaior, double baseMenor) {
		double areaTrapezio = altura * (baseMaior + baseMenor) / 2;
		return areaTrapezio;
	}
	
	public static double calcularAreaLosango(double diagonalMenor, double diagonalMaior) {
		double areaLosango = (diagonalMaior + diagonalMenor) / 2;
		return areaLosango;
	}
	
	public static double calcularPerimetroTriangulo(double faceA, double faceB, double faceC) {
		double perimetroTriangulo = faceA + faceB + faceC;
		return perimetroTriangulo;
	}
	
	public static double calcularPerimetroRetangulo(double base, double altura) {
		double perimetroRetangulo = 2 * (base + altura);
		return perimetroRetangulo;
	}
	
	public static double calcularPerimetroQuadrado(double lado) {
		double perimetroQuadrado = 4 * lado;
		return perimetroQuadrado;
	}
	
	public static double calcularPerimetroCirculo(double raio) {
		double perimetroCirculo = (2 * 3.14) * raio;
		return perimetroCirculo;
	}
	
	public static double calcularPerimetroTrapezio(double baseMaior, double baseMenor, double lado1, double lado2) {
		double perimetroTrapezio = baseMaior + baseMenor + lado1 + lado2;
		return perimetroTrapezio;
	}
	
	public static double calcularPerimetroLosango(double lado) {
		double perimetroLosango = 4 * lado;
		return perimetroLosango;
	}
	
	public static double calcularVolumeCubo(double lado) {
		double volumeCubo = Math.pow(lado, 3);
		return volumeCubo;
	}
	
	public static double calcularVolumeParalelepipedo(double base, double altura, double largura) {
		double volumeParalelepipedo = base * altura * largura;
		return volumeParalelepipedo;
	}
	
	public static double calcularVolumePiramide(double areaBase, double altura) {
		double volumePiramide = (areaBase * altura) / 3;
		return volumePiramide;
	}
	
	public static double calcularVolumeCone(double raio, double altura) {
		double volumeCone = (3.14 * raio * altura) / 3;
		return volumeCone;
	}
	
	public static double calcularVolumeCilindro(double raio, double altura) {
		double volumeCilindro = 3.14 * Math.pow(raio, 2) * altura;
		return volumeCilindro;
	}
	
	public static double calcularVolumeEsfera(double raio) {
		double volumeEsfera = (4 * 3.14 * Math.pow(raio, 3))/ 3;
		return volumeEsfera;
	}
	
	public static double calcularJurosSimples(double capital, double taxaAnual, double tempoMensal) {
		double jurosSimples = capital * (taxaAnual / 100) * tempoMensal;
		return jurosSimples;
	}
	
	public static double calcularJurosCompostos(double capital, double taxaAnual, double tempoMensal) {
		double jurosSimples = capital * Math.pow(( 1 +(taxaAnual / 100) ), tempoMensal);
		return jurosSimples;
	}
}
