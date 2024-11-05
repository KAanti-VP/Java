/*
Aircrafts
    Create a class that represents an aircraft
    There are 2 types of aircrafts: F16 and F35
    Both aircrafts should keep track of their ammunition
F16
    Max ammo: 8
    Base damage: 30
F35
    Max ammo: 12
    Base damage: 50
All aircrafts should be created with an empty ammo storage

Methods
    fight()
        It should use all the ammo (set it to 0) and it should return the damage it causes
        damage is calculated by multiplying the base damage by the ammunition
    refillAmmo()
        It should take a number as parameter that represents the ammunition coming from a station
        Increase the ammo of the aircraft by the right amount
        It can't have more ammo than the parameter value or the max ammo of the aircraft
        It should return the remaining (unused) ammo
        Eg. Filling an empty F35 with 300 would completely fill the storage of the aircraft and would return the remaining 288
    getType()
        It should return the type of the aircraft as a string
    getStatus()
        It should return a string like: Type F35, Ammo: 10, Base Damage: 50, All Damage: 500
    isPriority()
        It should return if the aircraft is priority in the ammo fill queue. It's true for F35 and false for F16
 */
package aircraftCarrier;

public class Aircrafts {

    int maxAmmo;
    int baseDamage;
    int ammoAmount;
    String type;
    boolean priority;

    public int fight() {
        int damage = this.ammoAmount * this.baseDamage;
        this.ammoAmount = 0;
        return damage;
    }

    public int refillAmmo(int ammo) {
        int needs = this.maxAmmo - this.ammoAmount;
        this.ammoAmount += Math.min(ammo, needs);
        return Math.max(ammo - needs, 0);
    }

    public String getType() {
        return this.type;
    }

    public String getStatus() {
        return String.format("Type %s, Ammo: %d, Base Damage: %d, All Damage: %d\n", this.type, this.ammoAmount, this.baseDamage, this.ammoAmount * this.baseDamage);
    }

    public boolean isPriority() {
        return this.priority;
    }
}
