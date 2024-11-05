/*
Carrier
    Create a class that represents an aircraft-carrier

    The carrier should be able to store aircrafts
    Each carrier should have a store of ammo represented by a number
    The initial ammo should be given as a constructor parameter
    The carrier also has a health point which is also given as a constructor parameter
Methods
    add()
        It should take a new aircraft and add it to its storage
    fill()
        It should fill all the aircrafts with ammo and subtract the taken ammo from the ammo storage
        If there is not enough ammo it should start to fill the aircrafts that are priority first
        It should throw an exception if there is no ammo when this method is called
    fight()
        It should take another carrier as a reference parameter and
        fire all the ammo from the aircrafts to it
        subtract all the damage from the other carrier's health points
    getStatus()
        It should return a string describing its, and all of its aircrafts' statuses in the following format:

    HP: 5000, Aircraft count: 5, Ammo Storage: 2300, Total damage: 2280
    Aircrafts:
    Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
    Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
    Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
    Type F16, Ammo: 8, Base Damage: 30, All Damage: 240
    Type F16, Ammo: 8, Base Damage: 30, All Damage: 240

    If the health points are 0 then it should return: It's dead Jim :(
 */
package aircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

    List<Aircrafts> aircrafts;
    int ammoStorage;
    int healthPoint;

    public Carrier() {
        this.aircrafts = new ArrayList<>();
        this.ammoStorage = 0;
        this.healthPoint = 0;
    }

    public Carrier(int ammo, int healthPoint) {
        this.aircrafts = new ArrayList<>();
        this.ammoStorage = ammo;
        this.healthPoint = healthPoint;
    }

    public void add(Aircrafts plane) {
        this.aircrafts.add(plane);
    }

    public void fill() {
        if (this.ammoStorage == 0)
            throw new NullPointerException();
        else {
            int needAmmo = 0;
            for (Aircrafts plane: this.aircrafts) {
                needAmmo += plane.maxAmmo - plane.ammoAmount;
            }
            if (this.ammoStorage < needAmmo) {
                for (Aircrafts plane: this.aircrafts) {
                    if (plane.isPriority() && plane.ammoAmount < plane.maxAmmo)
                        this.ammoStorage = plane.refillAmmo(this.ammoStorage);
                    if (this.ammoStorage == 0)
                        break;
                }
            }
            for (Aircrafts plane: this.aircrafts) {
                if (this.ammoStorage == 0)
                    break;
                if (plane.ammoAmount < plane.maxAmmo)
                    this.ammoStorage = plane.refillAmmo(this.ammoStorage);
            }
        }
    }

    public void fight(Carrier carrier) {
        for (Aircrafts plane: this.aircrafts) {
            carrier.healthPoint -= (plane.ammoAmount * plane.baseDamage);
            plane.ammoAmount = 0;
            if (carrier.healthPoint <= 0) {
                carrier.healthPoint = 0;
                break;
            }
        }
    }

    public void getStatus() {
        System.out.println("--------------------------------------------------------------------");
        if (this.healthPoint == 0)
            System.out.println("It's dead Jim :(");
        else {
            String result = "Aircrafts:\n";
            int totalDamage = 0;
            for (Aircrafts plane: this.aircrafts) {
                totalDamage += plane.ammoAmount * plane.baseDamage;
                result += plane.getStatus();
            }
            System.out.printf("HP: %d, Aircraft count: %d, Ammo Storage: %d, Total damage: %d\n", this.healthPoint, this.aircrafts.size(), this.ammoStorage, totalDamage);
            System.out.print(result);
        }
    }
}
