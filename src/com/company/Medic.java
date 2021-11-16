package com.company;

public class Medic extends Hero{
    @Override
    public void applySuperAbility() {
        setDamage(0);
        setHealth(400);
        setSuperAbilityType("HILL");

        System.out.println("Medic "+getHealth()+"hp "+getDamage()+"dd  суперспособность "+getSuperAbilityType());
    }
}