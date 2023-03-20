package com.ejerciciopoo;

public interface CocheCRUD {
    public void save();
    public void findAll();
    public void delete();
}
class CocheCRUDImpl implements CocheCRUD{

    @Override
    public void save() {
        System.out.println("Guardar un coche");

    }

    @Override
    public void findAll() {
        System.out.println("Buscar un coche");

    }

    @Override
    public void delete() {
        System.out.println("Borrar un coche");

    }

    public static void main(String[] args) {
        CocheCRUD cocheCRUD = new CocheCRUDImpl();
        cocheCRUD.save();
        cocheCRUD.delete();
        cocheCRUD.findAll();
    }
}
