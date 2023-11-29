public class Heroi<T> {
    private String nome;
    private int idade;
    private T tipo;

    public Heroi(String nome, int idade, T tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }
    public void atacar() {
        String ataque = "";

        if (tipo instanceof String) {
            String tipoHeroi = (String) tipo;
            switch (tipoHeroi.toLowerCase()) {
                case "mago":
                    ataque = "usou magia";
                    break;
                case "guerreiro":
                    ataque = "usou espada";
                    break;
                case "monge":
                    ataque = "usou artes marciais";
                    break;
                case "ninja":
                    ataque = "usou shuriken";
                    break;
                default:
                    ataque = "usou um ataque indefinido";
            }
        }
        System.out.println("O " + tipo + " atacou usando " + ataque);
    }
}
