public class Problem2 {
    public static class Person {
        public String SSN;
        public String name;
        public Character gender;

        private Person spouse;

        public Person(String SSN, String name, Character gender) {
            this.SSN = SSN;
            this.name = name;
            this.gender = gender;
        }

        public void display(){
            System.out.println("This Person SSN is:" + this.SSN);
            System.out.println("This Person Name is:" + this.name);
            System.out.println("This Person gender is:" + this.gender);
        }

        public void marry(Person aPerson){
            if (this.spouse == null && aPerson.spouse == null
                    && this != aPerson && this.gender != aPerson.gender) {
                aPerson.spouse = this;
                this.spouse = aPerson;
            }
        }

        public void divorce() {
            if (this.spouse != null) {
                Person temp = this.spouse;
                this.spouse = null;
                temp.spouse = null;
            }
        }

        public void displaySpouse(){
            if (this.spouse == null) {
                System.out.println("There is no spouse");
                return;
            }
            this.spouse.display();
        }


    }
    public static void main(String[] args) {
        Person X = new Person("05", "Alice", 'F');
        Person Y = new Person("39", "Bob", 'M');
        Person Z = new Person("55", "Carol", 'F');

//        X.marry(Z);
//        X.displaySpouse();

//        X.marry(Y);
//        Y.displaySpouse();

        X.marry(Y);
        Y.divorce();
        Y.marry(Z);
        Z.displaySpouse();



    }
}
