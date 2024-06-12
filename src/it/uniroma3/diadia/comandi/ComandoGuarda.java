package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.Partita;

public class ComandoGuarda extends AbstractComando{

	private final static String NOME = "guarda";
	
	@Override
	public void esegui(Partita partita) {
		this.getIo().mostraMessaggio(partita.getStanzaCorrente().getDescrizione());
		this.getIo().mostraMessaggio("Hai ancora: " + partita.getGiocatore().getCfu() + "CFU");
		this.getIo().mostraMessaggio(partita.getGiocatore().getBorsa().toString());

	}

	@Override
	public String getNome() {
		return NOME;
	}
}
