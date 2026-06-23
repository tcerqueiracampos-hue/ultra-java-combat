
public class Personagens {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria;
    private int derrota;
    private int empate;

    // Construtor
    public Personagens(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        // Usamos o setPeso aqui para que a categoria seja calculada automaticamente na criação do personagem
        this.setPeso(pe); 
        this.vitoria = vi;
        this.derrota = de;
        this.empate = em;
    }

    public void apresentar() {
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Chegou a hora de apresentar o lutador! " + this.getNome());
        System.out.println("Nascido em " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos, medindo " + this.getAltura() + "m");
        System.out.println("Pesando " + this.getPeso() + "Kg");
        System.out.println(this.getVitoria() + " vitorias");
        System.out.println(this.getDerrota() + " derrotas");
        System.out.println(this.getEmpate() + " empates");
    }

    public void status() {
        System.out.println("------------------------------------------------------------------------");
        System.out.println(this.getNome() + " é peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitoria() + " vezes");
        System.out.println("Perdeu " + this.getDerrota() + " vezes");
        System.out.println("Empatou " + this.getEmpate() + " vezes");
    }

    public void ganharLuta() {
        this.setVitoria(this.getVitoria() + 1);
    }

    public void perderLuta() {
        this.setDerrota(this.getDerrota() + 1);
    }

    public void empatar() {
        this.setEmpate(this.getEmpate() + 1);
    }

    // Getters e Setters corrigidos
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() { // Corrigido para float
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() { // Corrigido para float
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria(); // Sempre que altera o peso, atualiza a categoria
    }

    public String getCategoria() {
        return this.categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Invalida";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Medio";
        } else if (this.peso <= 120.2) { // Ajustado para fazer sentido com a categoria peso pesado
            this.categoria = "Pesado";
        } else {
            this.categoria = "Invalida";
        }
    }

    public int getVitoria() {
        return this.vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrota() {
        return this.derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpate() {
        return this.empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }
}

