package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.personaggi.AbstractPersonaggio;

public class ComandoInteragisci extends AbstractComando {
	
	private static final String MESSAGGIO_CON_CHI = 
			"Con chi dovrei interagire?...";
	private String messaggio;
	
	@Override
	public void esegui(Partita partita) {
		AbstractPersonaggio personaggio;
		personaggio = partita.getStanzaCorrente().getPersonaggio();
		if (personaggio!=null) {
			this.getIo().mostraMessaggio(partita.getStanzaCorrente().getPersonaggio().getNome() + ": ");
			this.messaggio = personaggio.agisci(partita);
			this.getIo().mostraMessaggio(this.messaggio);
		} else this.getIo().mostraMessaggio(MESSAGGIO_CON_CHI);
	}
	
	public String getMessaggio() {
		return this.messaggio;
	}
	
	@Override
	public void setParametro(String parametro) {}
	
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}
}
