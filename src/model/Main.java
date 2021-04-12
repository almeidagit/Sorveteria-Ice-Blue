package model;

import java.util.ArrayList;
import java.util.List;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		List<Sorvete> listaSorvetes = new ArrayList<Sorvete>();

		Sorvete s1 = new Sorvete("milho", "picolé", 2.50, 70);
		Sorvete s2 = new Sorvete("creme", "picolé", 2.50, 70);
		Sorvete s3 = new Sorvete("limão", "picolé", 2.50, 70);
		Sorvete s4 = new Sorvete("milho", "massa", 5.50, 170);
		Sorvete s5 = new Sorvete("creme", "massa", 5.50, 170);
		Sorvete s6 = new Sorvete("limão", "massa", 5.50, 170);

		listaSorvetes.add(s1);
		listaSorvetes.add(s2);
		listaSorvetes.add(s3);
		listaSorvetes.add(s4);
		listaSorvetes.add(s5);
		listaSorvetes.add(s6);

		int opcaoMenu = 0;
		while (opcaoMenu < 3) {

			System.err.println("\n-------------  SORVETERIA ICE BLUE  --------------\n\n");
			for (Sorvete sorvete : listaSorvetes) {

				System.err.println("Código: " + listaSorvetes.indexOf(sorvete) + "  Sabor: " + sorvete.getSabor()
						+ "  Tipo: " + sorvete.getTipo() + "  R$:  " + sorvete.getValor() + "0  Peso: "
						+ sorvete.getPeso() + "g");
			}

			opcaoMenu = Sorvete.selecionarOpcao();

			if (opcaoMenu == 1) {
				Sorvete novoSorvete = new Sorvete(null, null, 0, 0);
				novoSorvete.adicionar();

				int cod = 0;
				boolean adicionar = false;
				for (Sorvete sorvete : listaSorvetes) {

					adicionar = novoSorvete.equals(sorvete);

					if (adicionar) {
						cod = listaSorvetes.indexOf(sorvete);
						break;
					}

				}

				if (adicionar) {
					Sorvete.limpaTela();
					System.err.println("\nItem já existe na posição: [" + cod + "]. Favor adicionar outro sabor.");

				} else {
					Sorvete.limpaTela();
					System.err.println("\nNovo Sorvete adicionado com SUCESSO!");

					listaSorvetes.add(novoSorvete);

				}

			}
			if (opcaoMenu == 2) {

				int opcao = Sorvete.removerOpcao();

				listaSorvetes.remove(opcao);
				Sorvete.limpaTela();
				System.err.println("\nSorvete removido com SUCESSO!");

			}

		}
		System.err.println("\nPrograma encerrado, até mais!");
	}

}
