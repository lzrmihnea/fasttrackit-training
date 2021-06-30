package org.fasttrackit.course6.inheritance;

class Grandfather {
    String familyRecipe;
    public String getFamilyRecipe() { return familyRecipe; }
    public void setFamilyRecipe(String familyRecipe) { this.familyRecipe = familyRecipe; }
}

class Father extends Grandfather {

}

class Child extends Father {

}


public class FamilyTree {
    public static void main(String[] args) {
        Child child1 = new Child();
        child1.getFamilyRecipe();
    }
}
