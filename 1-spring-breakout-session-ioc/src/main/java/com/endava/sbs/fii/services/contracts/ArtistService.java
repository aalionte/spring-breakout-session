package com.endava.sbs.fii.services.contracts;

import com.endava.sbs.fii.commons.domain.Artist;

public interface ArtistService {

	/**
	 * <p>Reads an artist from an outside source.</p>
	 * 
	 * @return
	 */
	public Artist readArtist();
	
	/**
	 * <p>Display an artist.</p>
	 * 
	 * @param artist
	 */
	public void showArtist(Artist artist);
}
