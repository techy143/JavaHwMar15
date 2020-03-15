package techy.java.hw.one;

public class HwEncapsulation {


    // private can be access different class if we used set and get......

        private String name;
        private int age;

        public void setName(String newName) {
            name = newName;
        }

        public String getName() {
            return name;
        }

        public void setAge(int newAge){
            age = newAge;
        }

        public int getAge(){
            return age;
        }

    }
