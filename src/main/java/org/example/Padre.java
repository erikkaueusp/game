package org.example;

import lombok.Data;

@Data
public class Padre extends Heroi implements Vilao {

    private int cura = 10;

    @Override
    void bonusClasse() {
        setDefesaMagica(this.getDefesaMagica() + 2);
        setHp(this.getHp() + 20);
        setCura(this.getCura() + 20);
        setMp(this.getMp() + 10);
    }

    public void curar() {
        this.setHpAtual(cura + this.getHpAtual());
    }

    @Override
    public int roubaXp() {
        return 20;
    }
}
