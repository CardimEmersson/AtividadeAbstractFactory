/**
 * 
 * @author Emersson Cardim Mota
 */
public class AtividadeAbstractFactory {

	public static void main(String[] args) {
		// Factory Amazon
		LivrariaFactoryG1 g1 = new LivrariaFactoryG1();

		g1.criarLivraria();
		g1.criarLivroDigital();

		// Factory Cultura
		LivrariaFactoryG2 g2 = new LivrariaFactoryG2();

		g2.criarLivraria();
		g2.criarLivroDigital();

	}

}
