
    public static void main(String[] args) {
       Persona persona1 = new Persona();
       Persona persona2 = new Persona();

       persona1.nombre = "Franco";
       persona1.edad = 20;

       persona2.nombre = "Lola";
        persona2.edad = 19;

       System.out.println("Persona 1:");
        System.out.println("Nombre: " + persona1.nombre);
        System.out.println("Edad: " + persona1.edad);

        System.out.println();

        System.out.println("Persona 2:");
        System.out.println("Nombre: " + persona2.nombre);
        System.out.println("Edad: " + persona2.edad);
    }
