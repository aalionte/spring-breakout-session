package com.endava.sbs.fii.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.endava.sbs.fii.commons.builders.ArtefactBuilder;
import com.endava.sbs.fii.commons.domain.Artist;
import com.endava.sbs.fii.main.ConsoleApplication;
import com.endava.sbs.fii.services.contracts.AlbumService;
import com.endava.sbs.fii.services.contracts.ArtistService;

@Service
public class LoggerArtistService implements ArtistService {

	@Autowired
	@Qualifier("loggerAlbumService")
	AlbumService albumService;
	
	@Override
	public Artist readArtist() {
		return ArtefactBuilder.anArtist();
	}

	@Override
	public void showArtist(Artist artist) {
		ConsoleApplication.logger.info("The artist we read: " + readArtist().getName());
		ConsoleApplication.logger.info("The album we read from an injected service: " + albumService.readAlbum().getTitle());
	}

}
