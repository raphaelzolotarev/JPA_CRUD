package be.intecbrussel.notebooks.jpa;
public class App {
    public static void main(String[] args) {
        CRUDOperations crudOperations = new CRUDOperations();
        crudOperations.insertEntity();
        crudOperations.findEntity();
        crudOperations.updateEntity();
        crudOperations.removeEntity();
    }
}