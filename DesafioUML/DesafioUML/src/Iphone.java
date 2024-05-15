public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    public static void main(String[] args) throws Exception {
        Iphone iphone1 = new Iphone();
        iphone1.adicionarNovaAba();
    }

    @Override
    public void tocarMusica() {
        System.out.println("Play na música :)");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando a música... :(");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando a música...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Página exibida!!!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba ;)");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("A página foi atualizada");
    }

    @Override
    public void ligar() {
        System.out.println("BII BII BII ligando...");
    }

    @Override
    public void atender() {
        System.out.println("TRIM TRIM TRIM atender...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Você está no correio voz.");
    }
}
