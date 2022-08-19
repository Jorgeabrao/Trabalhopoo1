import java.util.List;

public class Cardapio {
private  List <Alimento> cardapio;
private String nome;
private  double valor;

// ***** Construtor
public Cardapio(List<Alimento> cardapio, String nome, double valor) {
	this.cardapio = cardapio;
	this.nome = nome;
	this.valor = valor;
}
// ***** GETTERS
public List<Alimento> getCardapio() {
	return cardapio;
}
public double getValor() {
	return valor;
}
public String getNome() {
	return nome;
}
// ***** SETTERS
public void setCardapio(List<Alimento> cardapio) {
	this.cardapio = cardapio;
}
public void setNome(String nome) {
	this.nome = nome;
}
public void setValor(double valor) {
	this.valor = valor;
}




}