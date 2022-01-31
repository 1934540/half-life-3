import java.util.Scanner;

public class Player {
    private Weapon[] weaponSlots;

    public Player(Weapon[] weaponSlots) {
        this.weaponSlots = weaponSlots;
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        weaponSlots[slot].shot();
    }



}
