package impl;

import interfaces.Tageszeit;

public class TageszeitImpl implements Tageszeit {

	private int id;
	private String bezeichnung;
	public TageszeitImpl(int id, String bezeichnung) {
		super();
		this.id = id;
		this.bezeichnung = bezeichnung;
	}
	/* (non-Javadoc)
	 * @see impl.Tageszeit#getId()
	 */
	@Override
	public int getId() {
		return id;
	}
	/* (non-Javadoc)
	 * @see impl.Tageszeit#getBezeichnung()
	 */
	@Override
	public String getBezeichnung() {
		return bezeichnung;
	}
	
}
