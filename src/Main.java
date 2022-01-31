import com.sun.jdi.request.WatchpointRequest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player(new Weapon[]{new PistolGun(), new MachineGun(), new RPG(), new WaterGun(), new SlingshotGun()});
        System.out.format("У игрока %d слотов с оружием, введите номер, что бы выстрелить, чтобы выйти -1 %n", player.getSlotsCount());
        int slot;
        //ya Kirill
        while (true) {
            slot = scanner.nextInt();
            if(slot==-1){
                break;
            }
            player.shotWithWeapon(slot-1);
        }
    }
}
