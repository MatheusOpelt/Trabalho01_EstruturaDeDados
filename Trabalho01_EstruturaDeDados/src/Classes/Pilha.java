package Classes;

public class Pilha {
    private Aluno[] elementos;
    private int topo;

    public Pilha() {
        elementos = new Aluno[20];
        topo = -1;
    }

    public void push(Aluno a) {
        if (!isFull()) {
            topo++;
            elementos[topo] = a;
        } else {
            System.out.println("Pilha cheia! Não é possível empilhar mais elementos.");
        }
    }

    public Aluno pop() {
        if (!isEmpty()) {
            Aluno a = elementos[topo];
            topo--;
            return a;
        } else {
            System.out.println("Pilha vazia! Não é possível desempilhar elementos.");
            return null;
        }
    }

    public boolean isEmpty() {
        return (topo == -1);
    }

    public boolean isFull() {
        return (topo == 19);
    }

    public Aluno top() {
        if (!isEmpty()) {
            return elementos[topo];
        } else {
            return null;
        }
    }

    public void destroy() {
        elementos = null;
        topo = -1;
    }
}

