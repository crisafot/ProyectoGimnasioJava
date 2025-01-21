public class Gimnasio {
    private String nombre;
    private String ciudad;
    private String[] actividades = {"Yoga", "Boxeo", "Funcional"};

    public Gimnasio(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public void mostrarActividades() {
        System.out.println("Actividades disponibles en el gimnasio " + nombre + " en " + ciudad + ":");
        for (String actividad : actividades) {
            System.out.println("- " + actividad);
        }
    }

    public void registrarUsuario(String usuario) {
        System.out.println("Usuario " + usuario + " registrado en el gimnasio " + nombre + " en " + ciudad + ".");
    }

    public static void main(String[] args) {
        Gimnasio miGimnasio = new Gimnasio("FitLife Gym", "Santa Cruz de Tenerife");
        miGimnasio.mostrarActividades();
        miGimnasio.registrarUsuario("Juan Perez");
    }
}
