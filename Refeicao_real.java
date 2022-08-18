import java.util.Calendar;
import java.io.File;  
import java.io.IOException;
import java.io.FileWriter; 


public class Refeicao_real{
	private Calendar dataDarefeicao;
	private double valor2;
	private float avaliacao;
	private String local;


	// ***** GETTERS
	public Calendar getDataDarefeicao(){
		return dataDarefeicao;
	}
	
	public double getValor2(){
		return valor2;
	}

	public float getAvaliacao(){
		return avaliacao;
	}

	public String getLocal(){
		return local;
	}

	// ***** SETTERS
	public void setDataDarefeicao(Calendar dataDarefeicao){
		this.dataDarefeicao = dataDarefeicao;
	}
	
	public void setValor2(double valor2){
		this.valor2 = valor2;
	}

	public void setAvaliacao(float avaliacao){
		this.avaliacao = avaliacao;
	}

	public void setLocal(String local){
		this.local = local;
	}


	// ***** MÉTODO
	public void historico(Calendar dataDarefeicao, double valor2, String local){
		public static void main(String[] args) {
    		try {
      			FileWriter historico = new FileWriter("historico.txt");
      			historico.write(dataDarefeicao);
      			historico.write(valor2);
      			historico.write(local);
      			historico.close();
    		}catch (IOException e) {
      			e.printStackTrace();
    		}
  		}
	}
}
