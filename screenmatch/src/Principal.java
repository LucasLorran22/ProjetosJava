public class Principal {
    public static void main(String[] args) {
       Filme meuFilme = new Filme();

       meuFilme.nome = "O podereso chefão";
       meuFilme.anoDeLancamento = 1970;
       meuFilme.duracaoEmMinutos = 180;

       meuFilme.exibeFichaTecnica();
    }
}