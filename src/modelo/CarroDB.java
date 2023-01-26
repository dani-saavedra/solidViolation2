package modelo;

import bd.DatabaseMysql;

public class CarroDB {

    void guardarCocheDB(Carro carro) {
        DatabaseMysql db = new DatabaseMysql();
        db.guardar();
    }
}
