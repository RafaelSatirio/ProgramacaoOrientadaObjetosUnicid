package pacote;


public class ArrayDeObjetos {

	public static void main(String[] args) {
		produto produto[] = new produto[2];
		
		produto[0] = new produto();
		produto[0].codigo = 5000;
		produto[0].descricao = "Retentor do Volante";
		produto[0].valor = 45.75;
		
		produto[1] = new produto();
		produto[1].codigo = 7000;
		produto[1].descricao = "Velas de Ignição";
		produto[1].valor = 98.35;
		
		System.out.println("Relação de produtos - Total: " + produto.length);
		for(int i = 0; i < produto.length; i++) {
			System.out.println("Produto: " + (i + 1));
			System.out.println("\t Código: " + produto[i].codigo);
			System.out.println("\t Descrição: " + produto[i].descricao);
			System.out.println("\t Valor: " + produto[i].valor);
			if(i == 0) {
				System.out.println("\n");
			}
		}
	}

}
