package com.wayne.spring.autowire;

/**
 * @author wayne
 */
public class Pet {
    private String petName;

    public void setPetName(String petName) {
        this.petName = petName;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petName='" + petName + '\'' +
                '}';
    }
}
