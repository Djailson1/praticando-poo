package praticandoPoo;

import java.util.ArrayList;
import java.util.List;

public class Carro {
	
	private String marca;
	private String cor;
	private String placa;
	private int ano;
	
	private List<Passageiros> listaPassageiros = new ArrayList<Passageiros>();
	//um carro para muitos passageiros
	
	public List<Passageiros> getListaPassageiros(){
		return listaPassageiros;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", cor=" + cor + ", placa=" + placa + ", ano=" + ano + ", listaPassageiros="
				+ listaPassageiros + "]";
	}
	
	

}
