package my.game;

public class WizzardAdapter implements Fighter {

    private Wizzard wizzard;

    public WizzardAdapter() {
        this.wizzard = new Wizzard();
    }

    @Override
    public void attack() {
        wizzard.castDestructionSpell();
    }

    @Override
    public void defend() {
        wizzard.shield();
    }

    @Override
    public void escape() {
        wizzard.portal();
    }
}
