package Classes;

public class Aluno {
    private String nome;
    private int matricula;
    private char sexo;

    public Aluno(String nome, int matricula, char sexo){
        this.nome = nome;
        this.matricula = matricula;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString(){
        return "Nome: " + getNome() + "; Matrícula: " + getMatricula() + "; Sexo: " + getSexo();
    }

    public void destroy() {
        nome = null;
        matricula = 0;
        sexo = '\0';
    }
}
