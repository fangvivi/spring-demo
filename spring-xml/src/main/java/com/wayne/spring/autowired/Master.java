package com.wayne.spring.autowired;

/**
 * @author wayne
 */
public class Master {
    private Pet pet;

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    @Override
    public String toString() {
        return "Master{" +
                "pet=" + pet +
                '}';
    }
}
