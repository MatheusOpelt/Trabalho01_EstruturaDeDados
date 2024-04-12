package Classes;

public class Main {
    public static void main(String[] args) {
        Pilha pilhaFeminina = new Pilha();
        Pilha pilhaMasculina = new Pilha();

        int totalAlunos = 20;
        int alunosFemininos = 0;
        int alunosMasculinos = 0;

        while (alunosFemininos + alunosMasculinos < totalAlunos) {
            char sexo = Math.random() < 0.5 ? 'F' : 'M';
            Aluno aluno = new Aluno("Aluno" + (alunosFemininos + alunosMasculinos + 1), 1500 + alunosFemininos + alunosMasculinos + 1, sexo);

            if (sexo == 'F' && alunosFemininos < 10) {
                pilhaFeminina.push(aluno);
                alunosFemininos++;
            } else if (sexo == 'M' && alunosMasculinos < 10) {
                pilhaMasculina.push(aluno);
                alunosMasculinos++;
            }
        }

        System.out.println("Alunos do sexo feminino:");
        while (!pilhaFeminina.isEmpty()) {
            Aluno aluno = pilhaFeminina.pop();
            System.out.println(aluno);
        }

        System.out.println("\nAlunos do sexo masculino:");
        while (!pilhaMasculina.isEmpty()) {
            Aluno aluno = pilhaMasculina.pop();
            System.out.println(aluno);
        }

        pilhaFeminina.destroy();
        pilhaMasculina.destroy();
    }
}

