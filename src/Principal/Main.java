package Principal;

import Modelos.Audio;
import Modelos.MinhasPreferidas;
import Modelos.Musica;
import Modelos.Podcasts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Musica whip = new Musica();
        whip.setTitulo("Whip");
        whip.getTotalDeReproducoes();
        whip.getClassificacao();
        whip.getCurtidas();
        whip.getClassificacao();
        whip.setCantor("Mr.Kitty");
        whip.setAlbum("Ephemeral");
        whip.setGenero("Pop");

        for (int i = 0; i < 0 ; i++) {
            whip.curtir();
        }
        for (int i = 0; i < 50; i++) {
            whip.curtir();
        }
       //Scanner scanner = new Scanner(System.in);

//        System.out.println("Tocando agora: " + whip.getTitulo());
//        System.out.println(whip.getTotalDeReproducoes() + " pessoas Já ouviram essa música!");
//        System.out.println("Classificação: " + whip.getClassificacao());
//        System.out.println(whip.getCurtidas() + " curtiram esse som");
//        System.out.println("Duração: " + whip.getDuracao());

        Podcasts meuPodcast = new Podcasts();
        meuPodcast.setTitulo("O início");
        meuPodcast.setDescricao("primeiro episódio do nosso Podcast, aproveitem! ");
        meuPodcast.setHost("Victoria Lima");
        for (int i = 0; i < 5000; i++) {
        meuPodcast.reproduzir();
        }
        for (int i = 0; i < 1000; i++) {
        meuPodcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(whip);
    }
}