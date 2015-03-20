package com.endava.sbs.fii.services.impl;

import org.springframework.stereotype.Service;

import com.endava.sbs.fii.commons.domain.Album;
import com.endava.sbs.fii.services.contracts.AlbumService;

@Service("consoleAlbumService")
public class ConsoleAlbumService implements AlbumService{

	@Override
	public Album readAlbum() {
		return null;
	}

}
