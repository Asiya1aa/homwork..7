package com.company;

public class Magic extends Hero{
    @Override
    public void applySuperAbility() {
        setDamage(50);
        setHealth(200);
        setSuperAbilityType("water ball");
        System.out.println("Magic "+getHealth()+"hp "+getDamage()+"dd  суперспособность "+getSuperAbilityType());
    }
}
