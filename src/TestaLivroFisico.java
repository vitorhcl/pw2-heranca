
public class TestaLivroFisico {
	public static void main(String[] args) {
		LivroFisico livFis1 = new LivroFisico();
		livFis1.setTitulo("O Corti�o");
		livFis1.setAutor("Alu�sio de Azevedo");
		livFis1.setCategoria("Romance");
		livFis1.setValor(40.20);
		
		livFis1.aplicarDesconto();
		
		System.out.println(String.format("Valor do livro com desconto: %.2f", livFis1.valor));
	}
}
