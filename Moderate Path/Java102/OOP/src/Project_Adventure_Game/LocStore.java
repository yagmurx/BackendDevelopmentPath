package Project_Adventure_Game;

public class LocStore extends SafeLocation {
    public LocStore(Player p) {
        super(p, "Store");
    }

    @Override
    public boolean atLocation() {
        System.out.println("====================================================");
        System.out.println("Welcome to " + this.getName());
        System.out.println("1 - Look Weapons" +
                "\n2 - Look Armors" +
                "\n3 - Exit");
        int selectAct = 0;
        do {
            System.out.print("Select what do you want to do: ");
            selectAct = Location.input.nextInt();
        } while (!(selectAct < 4 && selectAct > 0));

            switch (selectAct) {
                case 1:
                    showWeapon();
                    buyWeapon();
                    break;
                case 2:
                    showArmor();
                    break;
                case 3:
                    System.out.println("See you again!");
                    break;
            }

        return true;
    }
    public void showWeapon() {
        System.out.println("\nWeapons:");
        for(Weapon w: Weapon.weapons()) {
            System.out.println(w.getName() +
                                "\tID: " + w.getId() +
                                "\tDamage: " + w.getDamage() +
                                "\tPrice: " + w.getPrice());
        }
    }
    public void buyWeapon() {
        int selectWeaponID = 0;
        do {
            System.out.print("Select a Weapon: ");
            selectWeaponID = input.nextInt();
        }
        while (!(selectWeaponID <= Weapon.weapons().length && selectWeaponID > 0));
        Weapon selectedWeapon = Weapon.getWeaponByID(selectWeaponID);

        if(selectedWeapon != null) {
            if(selectedWeapon.getPrice() > this.getPlayer().getMoney())
                System.out.println("Not enough money");
            else {
                System.out.println("You bought a " + selectedWeapon.getName());
                this.getPlayer().setMoney(this.getPlayer().getMoney() - selectedWeapon.getPrice());
                System.out.println("Your last budget: " + this.getPlayer().getMoney());
                System.out.println("Your last weapon: " + this.getPlayer().getInventory().getWeapon().getName());
                this.getPlayer().getInventory().setWeapon(selectedWeapon);
                System.out.println("Your new weapon: " + this.getPlayer().getInventory().getWeapon().getName());
            }
        }
    }
        public void showArmor() {
        System.out.println("\nArmors: ");
    }
}
