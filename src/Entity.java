public abstract class Entity {
    private Stats myStats;
    Weapon wieldedWeapon;

    abstract public void move();

    public Stats getMyStats() {
        return myStats;
    }

    public void setMyStats(Stats myStats) {
        this.myStats = myStats;
    }

    public Weapon getWieldedWeapon() {
        return wieldedWeapon;
    }

    public void setWieldedWeapon(Weapon wieldedWeapon) {
        this.wieldedWeapon = wieldedWeapon;
    }
}