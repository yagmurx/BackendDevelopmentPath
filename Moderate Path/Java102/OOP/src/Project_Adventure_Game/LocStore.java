package Project_Adventure_Game;

public class LocStore extends SafeLocation {
    public LocStore(Player p) {
        super(p, "Store");
    }

    @Override
    public boolean atLocation() {
        System.out.println("====================================================");
        System.out.println("Welcome to " + this.getName());
        boolean showMenu = true;
        while(showMenu) {
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
                        buyArmor();
                        break;
                    case 3:
                        System.out.println("See you again!");
                        showMenu = false;
                        break;
                }
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
        System.out.println("0 - Exit");
    }
    public void buyWeapon() {
        int selectWeaponID = 0;
        do {
            System.out.print("Select a Weapon: ");
            selectWeaponID = input.nextInt();
        }
        while (!(selectWeaponID <= Weapon.weapons().length && selectWeaponID >= 0));
        if(selectWeaponID != 0) {
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

    }
    public void showArmor() {
       System.out.println("\nArmors:");
       for(Armor a: Armor.armors()) {
           System.out.println(a.getName() +
                              "\tID: " + a.getId() +
                              "\tDefence: " + a.getDefence() +
                              "\tPrice: " + a.getPrice());
       }
        System.out.println("0 - Exit");
    }

    public void buyArmor() {
        int selectArmorID = 0;
        do {
            System.out.print("Select an Armor: ");
            selectArmorID = input.nextInt();
        }
        while (!(selectArmorID <= Armor.armors().length && selectArmorID >= 0));
        if(selectArmorID != 0) {
            Armor selectedArmor = Armor.getArmorByID(selectArmorID);

            if(selectedArmor != null) {
                if(selectedArmor.getPrice() > this.getPlayer().getMoney())
                    System.out.println("Not enough money");
                else {
                    System.out.println("You bought a " + selectedArmor.getName() + " Armor");
                    this.getPlayer().setMoney(this.getPlayer().getMoney() - selectedArmor.getPrice());
                    System.out.println("Your last budget: " + this.getPlayer().getMoney());
                    System.out.println("Your last armor: " + this.getPlayer().getInventory().getArmor().getName());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("Your new armor: " + this.getPlayer().getInventory().getArmor().getName());
                }
            }
        }

    }
}
