
public class TestaEBook {
	public static void main(String[] args) {
		EBook ebk1 = new EBook();
		ebk1.setTitulo("Mindset: A nova psicologia do sucesso");
		ebk1.setAutor("Carol S. Dweck");
		ebk1.setCategoria("Psicologia");
		ebk1.setValor(42.80);
		
		ebk1.aplicarDesconto();
		
		System.out.println(String.format("Valor do ebook com desconto: %.2f", ebk1.valor));
	}
}
