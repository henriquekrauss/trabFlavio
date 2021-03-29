public class calculator{
    
    private int nmro1;
    private int nmro2;

    public calculator(int nmro1, int nmro2){
        setNmro1(nmro1);
        setNmro2(nmro2);
    }

    public int getNmro1() {
        return nmro1;
    }

    public int getNmro2() {
        return nmro2;
    }

    public void setNmro1(int nmro1) {
        this.nmro1 = nmro1;
    }
    public void setNmro2(int nmro2) {
        this.nmro2 = nmro2;
    }

    public int Soma() {
        return nmro1 + nmro2;
    }

    public int Subtracao() {
        return nmro1 - nmro2;
    }

    public int Multiplicacao() {
        return nmro1 * nmro2;
    }

    public int Divisao() {
        return nmro1 / nmro2;
    }
}