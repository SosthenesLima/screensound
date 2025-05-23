/*
  By Sósthenes Oliveira Lima

 */

package br.com.lima.screensound.repository;

import br.com.lima.screensound.model.Artista;
import br.com.lima.screensound.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ArtistaRepository extends JpaRepository<Artista, Long>  {

    Optional<Artista> findByNomeContainingIgnoreCase(String nome);

    @Query("SELECT m FROM  Artista  a JOIN a.musicas m WHERE  a.nome ILIKE  %:nome%")
    List<Musica> buscarMusicasPorAritista(String nome);
}
