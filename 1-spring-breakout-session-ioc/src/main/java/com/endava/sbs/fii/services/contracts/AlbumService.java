package com.endava.sbs.fii.services.contracts;

import com.endava.sbs.fii.commons.domain.Album;

public interface AlbumService {

	/**
	 * <p>Read an album from an outside source.</p>
	 * 
	 * @return
	 */
	public Album readAlbum();
}
