import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.serie;

public class Principal {

    public static void main(String[] args) {

        Movie meuMovie = new Movie();
            meuMovie.setNome("Deadpool");
            meuMovie.setAnoDeLancamento( 2027);
            meuMovie.setDuracaoEmMinutos( 210);



            meuMovie.exibeFichaTecnica();
            meuMovie.avalia(8);
            meuMovie.avalia(5);
            meuMovie.avalia(10);
            //System.out.println(meufilme.somaDasAvaliacoes);
            System.out.println("total de avaliações: "+ meuMovie.getTotalDeAvaliacao());
            System.out.println(meuMovie.pegaMedia());


            serie lost = new serie();
            lost.setNome("lost");
            lost.setAnoDeLancamento(2000);
            lost.exibeFichaTecnica();
            lost.setEpPorTemporda(9);
            lost.setTemporadas(4);
        }
    }
