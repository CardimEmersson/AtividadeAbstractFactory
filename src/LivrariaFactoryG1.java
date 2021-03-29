/**
 * 
 * @author Emersson Cardim Mota
 */
public class LivrariaFactoryG1 implements LivrariaFactoryAbstract{
	
	/**
	 * Metodo responsável por criar livraria da Amazon 
	 * @return Amazon
	 */
	@Override
	public Livraria criarLivraria() {
		// TODO Auto-generated method stub
		return new Amazon();
	}
	
	/**
	 * Metodo responsável por criar livro digital da Amazon 
	 * @return Kindle
	 */
	@Override
	public LivroDigital criarLivroDigital() {
		// TODO Auto-generated method stub
		return new Kindle();
	}

}
