package com.company;

public class Warrior extends Hero{
    @Override
    public void applySuperAbility() {
        setDamage(190);
        setHealth(270);
        setSuperAbilityType("CRITICAL DAMAGE");
        System.out.println("Warrior "+getHealth()+"hp "+getDamage()+"dd суперспособность "+getSuperAbilityType());
    }
}