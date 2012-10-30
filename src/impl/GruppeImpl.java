package impl;

import interfaces.Gruppe;
import interfaces.Tageszeit;

public class GruppeImpl implements Gruppe{

	private String name;
	private Integer id;
	private Integer stunden;
	private Tageszeit tageszeit;

	public GruppeImpl(String name, int id, Tageszeit tageszeit, int stunden) {
		this.name = name;
		this.id = id;
		this.tageszeit = tageszeit;
		this.stunden = stunden;
	}
	
	public GruppeImpl( int id) {
	
		this.id = id;
	}
	@Override
	public String getName() {
		return name;
	}

	@Override
	public Integer getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return name;
	}
	@Override
	public Tageszeit getZeit() {
		return tageszeit;
	}

	@Override
	public int getStunden() {
		return stunden;
	}

}
