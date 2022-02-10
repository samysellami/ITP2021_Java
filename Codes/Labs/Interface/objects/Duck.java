package ru.makhmutov.task3.objects;

import ru.makhmutov.task3.interfaces.Flyable;
import ru.makhmutov.task3.interfaces.Living;
import ru.makhmutov.task3.interfaces.Swimmable;

public class Duck implements Living, Swimmable, Flyable {
    boolean isSwimming = false;
    boolean isFlying = false;

    @Override
    public void swim() {
        if (!isSwimming) {
            System.out.println("The " + this.getClass().getSimpleName() +
                    " is swimming in the river");
        }
    }

    @Override
    public void stopSwimming() {
        if (isSwimming) {
            System.out.println("The " + this.getClass().getSimpleName() +
                    " stopped swimming in the river");
            isSwimming = false;
        }
    }

    @Override
    public void fly() {
        if (!isFlying) {
            System.out.println("The " + this.getClass().getSimpleName() +
                    " is flying in the air");
        }
    }

    @Override
    public void stopFlying() {
        if (isFlying) {
            System.out.println("The " + this.getClass().getSimpleName() +
                    " stopped flying in the air");
        }
    }
}
