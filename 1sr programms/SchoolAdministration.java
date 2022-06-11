class Person {
    
    private String name;
    private String last_name;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String txt) {
        name = txt;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String txt) {
        last_name = txt;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int n) {
        age = n;
    }

    public String getGender() {
        String s;

        s = "Woman";

        if (gender == 'M') {
            s = "Man";
        }

        if (gender == 'W') {
            s = "Woman";
        }

        if ((gender != 'M') && (gender != 'W')) {
            s = "Unknown";
        }
        
        return s;
    }

    public void setGender(char s) {
        gender = s;
    }
}

class SchoolAdministration {
    public static void main(String[] args) {
        Person a = new Person();

        // Giving the variables a value
        a.setName("Miguel");
        a.setLast_name("Perez");
        a.setAge(23);
        a.setGender('M');

        // Let's show it on the screen, and look if everything is ok
        System.out.println("Nombre: " + a.getName() + " " + a.getLast_name());
        System.out.println("Age: " + a.getAge());
        System.out.println("Gender: " + a.getGender());

    }
}