package com.mvc.demo.Controllers;

import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("albums")
public class AlbumController {
    private AlbumRepository albumRepository;
    private SongRepository songRepository;

    public AlbumController (AlbumRepository albumRepository, SongRepository songRepository) {
        this.albumRepository = albumRepository;
        this.songRepository = songRepository;
    }

    @GetMapping("")
    public Collection<Album> retrieveAlbums() {
        return (Collection<Album>) albumRepository.findAll();
    }
    @GetMapping("/{id}")
    public Album displaySingleAlbum(@PathVariable long id) {
        return albumRepository.findById(id).get();
    }

    @DeleteMapping("/{id}")
    public Album deleteAlbum(@PathVariable long id) {
        Album albumToDelete = albumRepository.findById(id).get();

        albumRepository.delete(albumToDelete);

        return albumToDelete.getArtist();

        for (Song songToDelete : albumToDelete.getSongs()) {
            songRepository.delete(songToDelete)
        }
    }

    @PostMapping("")
    public Album createAlbum(@RequestBody Album albumToAdd) {
        return albumRepository.save(albumToAdd)
    }

    public Album updateAlbum(@RequestBody Song requestBodySong, @PathVariable long id) {
        Album albumToUpdate = albumRepository.findById(id).get();
        Song songToAdd = new Song(requestBodySong.getTitle(), requestBodySong.getDuration(), albumToUpdate);
        songRepository.save(songToAdd);
        return albumRepository.save(albumToUpdate);
    }
}
