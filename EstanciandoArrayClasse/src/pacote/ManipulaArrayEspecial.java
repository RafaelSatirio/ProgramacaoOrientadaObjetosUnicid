package pacote;

public class ManipulaArrayEspecial {

	public static void main(String[] args) {
		Integer array1[] = new Integer[3];
		
		array1[0] = 10;
		array1[1] = 20;
		array1[2] = 30;
		System.out.println("Valor na 2° ocorrência  do array númerico: " + array1[1] + "\n");
		
		String produtos[] = new String[3];
		produtos[0] = "Impressora 3D";
		produtos[1] = "Microfone USB";
		produtos[2] = "WebCam 2.0";
		
		for(int i = 0; i < produtos.length; i++) {
			System.out.println((i + 1) + " - Produto: " + produtos[i]);
		}

	}

}
