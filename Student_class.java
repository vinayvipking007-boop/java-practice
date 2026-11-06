
    class Main{}
     static Student_class{
        int roll_number;
        String name;
        int course;
        int section;
        public student(){
            roll_number = 0;
            name = "Unknown";
            course = 0;
            section = 0;
        }
    }
        public static void main(String[] args){
            student s1 = new student();
            s1.roll_number = 1;
            s1.name = "priyanka";
            s1.course = 101;
            s1.section = 5;

            System.out.println("Roll Number = " + s1.roll_number);
            System.out.println("Name = " + s1.name);
            System.out.println("Course = " + s1.course);
            System.out.println("Section = " + s1.section);
        }
        }