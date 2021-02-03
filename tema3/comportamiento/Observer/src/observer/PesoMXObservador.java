package observer;

public class PesoMXObservador extends Observador {

	private double valorCambio = 23.83;
	
	public PesoMXObservador(SubjectCasa sujeto) {
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}
	
	@Override
	public void actualizar() {		
		System.out.println("MX: " + (sujeto.getMonto() * valorCambio));
	}
}
