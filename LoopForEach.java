public class LoopForEach {
    public static void main(String args[]) {
        String[] names = { "Alejandro", "Maria", "Luisa", "Juan", "Narcisa", "Luis" };

        // Showing all the names into the array with a For Loop
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        
        System.out.println("\n\n Some other names: \n");
        
        String[] names2 = { "Alejandro", "Maria", "Luisa", "Juan", "Narcisa", "Luis", "Ruben", "Jorge", "Natialia" };
        
        // Using the For Each Loop
        for(String i:names2){
            System.out.println("* " + i);
        }
    }
    
}
