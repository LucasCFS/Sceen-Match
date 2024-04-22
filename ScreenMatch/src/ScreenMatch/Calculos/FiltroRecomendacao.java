package ScreenMatch.Calculos;
public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            recomendacao = "Está entre os preferidos do momento";
        } else if (classificavel.getClassificacao() >= 2) {
            recomendacao = "Muito bem avaliado no momento!";
        } else {
            recomendacao = "Coloque na sua lista para assistir depois";
        }
        System.out.println(recomendacao);
    }
}
