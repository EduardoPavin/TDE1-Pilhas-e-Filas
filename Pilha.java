public class Pilha {
    private int capacidade;
    private int topo;
    private int[] dados;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.topo = -1;
        this.dados = new int[capacidade];
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getTopo() {
        return topo;
    }

    public int[] getDados() {
        return dados;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setDados(int[] dados) {
        this.dados = dados;
    }

    public void setTopo(int topo) {
        this.topo = topo;
    }

    public String insere(int valor) {
        if (topo >= capacidade - 1) {
            return "Pilha cheia. Não é possível inserir o elemento.";
        } else {
            dados[++topo] = valor;
            return "Elemento " + valor + " inserido na pilha.";
        }
    }

    public String cheia() {
        if (topo >= capacidade - 1) {
            return "Pilha está cheia.";
        } else {
            return "Pilha não está cheia.";
        }
    }

    public String vazia() {
        if (topo == -1) {
            return "Pilha está vazia.";
        } else {
            return "Pilha não está vazia.";
        }
    }

    public String remove() {
        if (topo == -1) {
            return "Pilha está vazia. Não é possível remover o elemento.";
        } else {
            int valorRemovido = dados[topo--];
            return "Elemento " + valorRemovido + " removido da pilha.";
        }
    }

    public String imprime() {
        if (topo == -1) {
            return "Pilha está vazia.";
        } else {
            StringBuilder elementos = new StringBuilder("Elementos na pilha:\n");
            for (int i = topo; i >= 0; i--) {
                elementos.append(dados[i]).append("\n");
            }
            return elementos.toString();
        }
    }
}
