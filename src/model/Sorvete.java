package model;

import java.util.Scanner;

public class Sorvete {

	private String sabor;
	private String tipo;
	private double valor;
	private int peso;

	static Scanner scan = new Scanner(System.in);

	Sorvete adicionar() {

		Sorvete sorvete = new Sorvete(sabor, tipo, valor, peso);
		// limpaTela();
		System.err.println("\n\nDigite o SABOR do Sorvete: ");
		sabor = scan.nextLine();
		sabor = scan.nextLine();

		System.err.println("\nDigite o TIPO do Sorvete: ");
		tipo = scan.nextLine();
		System.err.println("\nDigite o PREÇO do Sorvete R$: ");
		valor = scan.nextDouble();
		System.err.println("\nDigite o PESO(gramas) do Sorvete: ");
		peso = scan.nextInt();

		return sorvete;

	}

	public static int removerOpcao() {

		System.err.println("\n\nDigite o CÓDIGO do Sorvete que será removido: ");
		int opcao = scan.nextInt();

		return opcao;
	}

	public static int selecionarOpcao() {

		System.err.println(
				"\n\nSelecione uma opção:\n\n[1] Adicionar Sorvete\n[2] Remover Sorvete\n[3] Encerrar o Programa");
		int opcao = scan.nextInt();

		return opcao;
	}

	static void limpaTela() {

		for (int i = 0; i < 25; i++) {
			System.err.println("");
		}

	}

	@Override
	public boolean equals(Object obj) {

		Sorvete sorveteIn = (Sorvete) obj;

		if ((sorveteIn.getSabor().equals(this.sabor)) && (sorveteIn.getTipo().equals(this.tipo))) {

			return true;
		}

		return false;
	}

	@Override
	public String toString() {
		return "\nSabor: " + sabor + "   Tipo: " + tipo + "   R$: " + valor + "0   Peso: " + peso + "g";
	}

	public Sorvete(String sabor, String tipo, double valor, int peso) {
		super();
		this.sabor = sabor;
		this.tipo = tipo;
		this.valor = valor;
		this.peso = peso;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

}
