package praticandoPoo;

public class Passageiros {
	private int quantPassageiros;
	private String destino;
	private double valorKmPercorrido;
	
	
	public int getQuantPassageiros() {
		return quantPassageiros;
	}
	public void setQuantPassageiros(int quantPassageiros) {
		this.quantPassageiros = quantPassageiros;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public double getValorKmPercorrido() {
		return valorKmPercorrido;
	}
	public void setValorKmPercorrido(double valorKmPercorrido) {
		this.valorKmPercorrido = valorKmPercorrido;
	}
	@Override
	public String toString() {
		return "Passageiros [quantPassageiros=" + quantPassageiros + ", destino=" + destino + ", valorKmPercorrido="
				+ valorKmPercorrido + "]";
	}
	
	

	
}
