package tp4;

public class Colegio {

    public static void main(String[] args) {
        Materia web2 = new Materia(1,"Web 2",2007);
        Materia mate = new Materia(2,"Matematicas",2008);
        Materia lab1 = new Materia(3,"Laboratorio 1",2009);
        
        Alumno alum1 = new Alumno(1001,"Lopez","Martin");
        Alumno alum2 = new Alumno(1002,"Martinez","Brenda");
        
        alum1.agregarMateria(web2);
        alum1.agregarMateria(mate);
        alum1.agregarMateria(lab1);
        
        alum2.agregarMateria(web2);
        alum2.agregarMateria(mate);
        alum2.agregarMateria(lab1);
        alum2.agregarMateria(lab1);
    }
    
}
