/**
 * 
 * @author Emersson Cardim Mota
 */
public class LivrariaFactoryG2 implements LivrariaFactoryAbstract {
	
	/**
	 * Metodo respons�vel por criar livraria da Cultura 
	 * @return Cultura
	 */
	@Override
	public Livraria criarLivraria() {
		// TODO Auto-generated method stub
		return new Cultura();
	}
	
	/**
	 * Metodo respons�vel por criar livro digital da Cultura 
	 * @return Kobo
	 */
	@Override
	public LivroDigital criarLivroDigital() {
		// TODO Auto-generated method stub
		return new Kobo();
	}

}
