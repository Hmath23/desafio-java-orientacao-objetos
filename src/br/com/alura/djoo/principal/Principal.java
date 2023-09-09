package br.com.alura.djoo.principal;

import br.com.alura.djoo.modelos.MinhasPreferidas;
import br.com.alura.djoo.modelos.Musica;
import br.com.alura.djoo.modelos.Podcasts;

public class Principal {
    public static void main(String[] args) {
        Musica musicaUm = new Musica();
        musicaUm.setTitulo("Tudo vai dar certo");
        musicaUm.setArtista("Natiruts");
        musicaUm.setAlbum("Tudo vai dar certo");
        musicaUm.setGenero("Reggae");

        for (int i = 0; i < 1000; i++) {
            musicaUm.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            musicaUm.curte();
        }

        Podcasts podcastUm = new Podcasts();
        podcastUm.setTitulo("Music");
        podcastUm.setHost("Matheus");

        for (int i = 0; i < 350; i++) {
            podcastUm.reproduz();
        }
        for (int i = 0; i < 100; i++) {
            podcastUm.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(musicaUm);
        preferidas.inclui(podcastUm);

    }
}
