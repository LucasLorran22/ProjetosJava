public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numeroAvaliacoes;

    void exibeFichaTecnica(){
        System.out.println(String.format("""
                           Título da música: %s
                           Artista: %s 
                           Ano de lançamento: %d
                           """, titulo, artista,anoLancamento));
    }
}
