package GestorEstudiantes;

import java.util.ArrayList;

public class GestorEstudiantes {

    ArrayList<Estudiante> ListaEstudiantes;

    public GestorEstudiantes(){
        ListaEstudiantes = new ArrayList<>();
    }

    public boolean registrarEstudiante(Estudiante est){
        return ListaEstudiantes.add(est);
    }

    public Estudiante buscarEstudiante(String id){
        for(Estudiante est : ListaEstudiantes){
            if(est.getId().equals(id)){
                return est;
            }
        }
        return null;
    }

    public boolean actualizarEstudiante(Estudiante datosNuevos){
        for (int i = 0; i < ListaEstudiantes.size(); i++) {
            if(ListaEstudiantes.get(i).getId().equals(datosNuevos.getId())){
                ListaEstudiantes.set(i, datosNuevos);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarEstudiante(String id){
        for (int i = 0; i < ListaEstudiantes.size() ; i++) {

            if(ListaEstudiantes.get(i).getId().equals(id)){
                ListaEstudiantes.remove(i);
                return true;
            }

        }

        return false;
    }



}
