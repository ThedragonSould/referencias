package model;

import java.sql.Connection;
import java.sql.SQLException;
import java.security.PublicKey;
import org.apache.commons.dbcp2.BasicDataSource;
import com.mysql.jdbc.StringUtils;

public class Person {
    private int id;
    private int id_numb;
    private int id_type;
    private String namen;
    private String last_namen;
    private String Dia_de_nacimiento;
    private String email;   
    private String telefono;

    public Person(){

    /**
     * @param id
     * @param id_numb
     * @param id_type
     * @param namen
     * @param last_namen
     * @param Dia_de_nacimiento
     * @param email
     * @param telefString
     * @return
     */
    Public Person(ind id, int id_numb,ind id_type, string namen, string last_namen,string Dia_de_nacimiento,
    string email,String telefString)

    this.id=    id;
    this.id=    id_numb;
    this.id =   id_type;
    this.id =   namen;
    this.id =   last_namen;
    this.id =   Dia_de_nacimiento;
    this.id =   email;
    this.id =   telefono;


}

public int Getid(){
    return this.id;
}
public void Setld(int id){
    this.id=id 
}
public int GetIdnumb(){
    return this.id_numb;
}
public void Setldnumb( int id_numb){
    this.id_numb = id_numb; 
}
public String getid_type(){
    return this.id_type;
}
public void Setid_type(string id_type){
    this.id_type = id_type;
}
public String getnameString(){
    return this.namen;
}
public void setNamen(String namen){
    this.namen =namen;
}
public String getlast_namen(){
    return this.last_namen;
}
public void setlast_namen(String last_namen){
    this.last_namen = last_namen;
}
public String getdia_de_nacimiento(){
    return this.Dia_de_nacimiento;
}
public void setDia_de_nacimiento(String Dia_de_nacimiento){
    this.Dia_de_nacimiento = Dia_de_nacimiento;
}
public String getemail(){
    return this.email;
}
public void Setemail(String email){
    this.email = email;
}
public String gettelefono(){
    return this.telefono;
}
public void settelefono(string telefono){
    this.telefono = telefono;
}

}
